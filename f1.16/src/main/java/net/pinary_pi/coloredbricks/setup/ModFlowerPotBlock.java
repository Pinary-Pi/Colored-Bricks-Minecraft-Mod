package net.pinary_pi.coloredbricks.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.HashMap;
import java.util.Map;

public class ModFlowerPotBlock extends Block {
    private static final Map<Block, Map<DyeColor, Block>> CONTENT_TO_DYED_POTTED = new HashMap<>();
    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

    private final Block content;
    private final DyeColor color;

    public ModFlowerPotBlock(Block content, AbstractBlock.Settings settings, DyeColor color) {
        super(settings);
        this.content = content;
        this.color = color;
        CONTENT_TO_DYED_POTTED
            .computeIfAbsent(content, k -> new HashMap<>())
            .put(color, this);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public Block getContent() {
        return this.content;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        BlockState blockState = (item instanceof BlockItem blockItem)
            ? ((Block) CONTENT_TO_DYED_POTTED.getOrDefault(blockItem.getBlock(), new HashMap<>())
                .getOrDefault(this.color, Blocks.AIR)).getDefaultState()
            : Blocks.AIR.getDefaultState();

        boolean isAirBlock = blockState.isOf(Blocks.AIR);
        boolean isPotEmpty = this.isEmpty();

        if (isAirBlock != isPotEmpty) {
            if (isPotEmpty) {
                // Placing new content in the pot
                world.setBlockState(pos, blockState, 3);
                player.incrementStat(Stats.POT_FLOWER);
                if (!player.abilities.creativeMode) {
                    itemStack.decrement(1);
                }
            } else {
                // Removing the content from the pot
                ItemStack itemStack2 = new ItemStack(this.content);
                if (itemStack.isEmpty()) {
                    player.setStackInHand(hand, itemStack2);
                } else if (!player.giveItemStack(itemStack2)) {
                    player.dropItem(itemStack2, false);
                }
                Block emptyPotBlock = CONTENT_TO_DYED_POTTED.get(Blocks.AIR).get(this.color);

                world.setBlockState(pos, emptyPotBlock.getDefaultState(), 3);
            }
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.CONSUME;
        }
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return this.isEmpty() ? super.getPickStack(world, pos, state) : new ItemStack(this.content);
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(
        BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos)
            ? Blocks.AIR.getDefaultState()
            : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}