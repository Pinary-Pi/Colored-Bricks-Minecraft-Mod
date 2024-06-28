package net.pinary_pi.coloredbricks.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

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
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

    public Block getContent() {
        return this.content;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Block contentBlock = (stack.getItem() instanceof BlockItem blockItem) 
            ? blockItem.getBlock()
            : Blocks.AIR;

        Map<DyeColor, Block> colorMap = CONTENT_TO_DYED_POTTED.get(contentBlock);
        if (colorMap == null) {
            colorMap = new HashMap<>();
            CONTENT_TO_DYED_POTTED.put(contentBlock, colorMap);
        }
        
        Block coloredPotBlock = colorMap.getOrDefault(this.color, Blocks.AIR);

        if (coloredPotBlock == Blocks.AIR) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        BlockState newState = coloredPotBlock.getDefaultState();

        if (newState.isAir()) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else if (!this.isEmpty()) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else {
            world.setBlockState(pos, newState, Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.POT_FLOWER);
            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }
            return ItemActionResult.success(world.isClient);
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (!player.isSneaking()) {
            return ActionResult.CONSUME;
        }

        if (stack.isEmpty()) {
            return handleEmptyHandInteraction(world, pos, player);
        } else {
            return handleItemInteraction(stack, state, world, pos, player, Hand.MAIN_HAND, hit);
        }
    }

    private ActionResult handleEmptyHandInteraction(World world, BlockPos pos, PlayerEntity player) {
        if (this.isEmpty()) {
            return ActionResult.PASS;
        } else {
            ItemStack itemStack = new ItemStack(this.content);
            if (!player.giveItemStack(itemStack)) {
                player.dropItem(itemStack, false);
            }

            world.setBlockState(pos, Blocks.FLOWER_POT.getDefaultState(), Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.success(world.isClient);
        }
    }

    private ActionResult handleItemInteraction(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Block contentBlock = (stack.getItem() instanceof BlockItem blockItem) 
            ? blockItem.getBlock()
            : Blocks.AIR;

        Map<DyeColor, Block> colorMap = CONTENT_TO_DYED_POTTED.get(contentBlock);
        if (colorMap == null) {
            colorMap = new HashMap<>();
            CONTENT_TO_DYED_POTTED.put(contentBlock, colorMap);
        }
        
        Block coloredPotBlock = colorMap.getOrDefault(this.color, Blocks.AIR);

        if (coloredPotBlock == Blocks.AIR) {
            return ActionResult.PASS;
        }

        BlockState newState = coloredPotBlock.getDefaultState();

        if (newState.isAir()) {
            return ActionResult.PASS;
        } else if (!this.isEmpty()) {
            return ActionResult.PASS;
        } else {
            world.setBlockState(pos, newState, Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.POT_FLOWER);
            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }
            return ActionResult.success(world.isClient);
        }
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }

    @Override
	public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
		return this.isEmpty() ? super.getPickStack(world, pos, state) : new ItemStack(this.content);
	}

    @Override
	protected BlockState getStateForNeighborUpdate(
		BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
	) {
		return direction == Direction.DOWN && !state.canPlaceAt(world, pos)
			? Blocks.AIR.getDefaultState()
			: super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}

    @Override
	protected boolean canPathfindThrough(BlockState state, NavigationType type) {
		return false;
	}
}
