package net.Pinary_Pi.coloredbricks.data.loot;

import java.util.stream.Collectors;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTables extends BlockLootTables {
    
    @Override
    protected void addTables() {
        registerDropSelfLootTable(ModBlocks.WHITE_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.ORANGE_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PINK_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.YELLOW_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIME_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GREEN_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_BLUE_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.CYAN_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLUE_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.MAGENTA_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PURPLE_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BROWN_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_GRAY_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GRAY_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLACK_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.RED_BRICKS.get());
        registerLootTable(ModBlocks.WHITE_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.ORANGE_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.PINK_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.YELLOW_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.LIME_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.GREEN_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.CYAN_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.BLUE_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.MAGENTA_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.PURPLE_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.BROWN_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.GRAY_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.BLACK_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerLootTable(ModBlocks.RED_BRICK_SLAB.get(), BlockLootTables::droppingSlab);
        registerDropSelfLootTable(ModBlocks.WHITE_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.ORANGE_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.PINK_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.YELLOW_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.LIME_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.GREEN_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.CYAN_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.BLUE_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.MAGENTA_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.PURPLE_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.BROWN_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.GRAY_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.BLACK_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.RED_BRICK_STAIRS.get());
        registerDropSelfLootTable(ModBlocks.WHITE_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.ORANGE_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.PINK_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.YELLOW_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.LIME_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.GREEN_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.CYAN_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.BLUE_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.MAGENTA_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.PURPLE_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.BROWN_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.GRAY_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.BLACK_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.RED_BRICK_WALL.get());
        registerDropSelfLootTable(ModBlocks.WHITE_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.ORANGE_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PINK_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.YELLOW_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIME_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GREEN_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.CYAN_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLUE_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.MAGENTA_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PURPLE_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BROWN_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GRAY_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLACK_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.RED_CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.CHISELED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.WHITE_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.ORANGE_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PINK_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.YELLOW_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIME_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GREEN_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.CYAN_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLUE_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.MAGENTA_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.PURPLE_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BROWN_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.GRAY_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.BLACK_CRACKED_BRICKS.get());
        registerDropSelfLootTable(ModBlocks.RED_CRACKED_BRICKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> coloredbricks.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
}
