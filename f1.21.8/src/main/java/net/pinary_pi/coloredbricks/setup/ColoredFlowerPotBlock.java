package net.pinary_pi.coloredbricks.setup;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Blocks;
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
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.HashMap;
import java.util.Map;

public class ColoredFlowerPotBlock extends FlowerPotBlock {
    // Mapping: content → (color → potted block)
    private static final Map<Block, Map<DyeColor, Block>> CONTENT_TO_DYED_POTTED = new HashMap<>();

    private final DyeColor color;
    private final Block content;

    public ColoredFlowerPotBlock(Block content, Settings settings, DyeColor color) {
        super(content, settings);
        this.color = color;
        this.content = content;

        CONTENT_TO_DYED_POTTED
            .computeIfAbsent(content, k -> new HashMap<>())
            .put(color, this);
    }

    public DyeColor getColor() {
        return color;
    }

    public static Block getPottedVariant(Block content, DyeColor color) {
        return CONTENT_TO_DYED_POTTED.getOrDefault(content, Map.of()).getOrDefault(color, Blocks.AIR);
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Item item = stack.getItem();
        Block targetBlock;

        if (item instanceof BlockItem blockItem) {
            // Look up the *colored* potted variant for this content & pot color
            targetBlock = CONTENT_TO_DYED_POTTED
                    .getOrDefault(blockItem.getBlock(), Map.of())
                    .getOrDefault(this.color, Blocks.AIR);
        } else {
            targetBlock = Blocks.AIR;
        }

        // If we don't have a colored potted variant, defer to vanilla
        if (targetBlock == Blocks.AIR) {
            return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
        }

        // Don't allow putting into a non-empty pot
        if (!this.isEmpty()) {
            return ActionResult.CONSUME;
        }

        // Place the plant
        world.setBlockState(pos, targetBlock.getDefaultState(), 3);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        player.incrementStat(Stats.POT_FLOWER);
        stack.decrementUnlessCreative(1, player);

        return ActionResult.SUCCESS;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        // If empty, let vanilla handle (just consumes the click)
        if (this.isEmpty()) {
            return ActionResult.CONSUME;
        }

        // Give the player the plant
        ItemStack plantStack = new ItemStack(this.content);
        if (!player.giveItemStack(plantStack)) {
            player.dropItem(plantStack, false);
        }

        // Replace with *empty* colored pot
        Block emptyPot = CONTENT_TO_DYED_POTTED
                .getOrDefault(Blocks.AIR, Map.of())
                .getOrDefault(this.color, Blocks.AIR);

        world.setBlockState(pos, emptyPot.getDefaultState(), 3);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);

        return ActionResult.SUCCESS;
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // same shape as vanilla
        return super.getOutlineShape(state, world, pos, context);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}