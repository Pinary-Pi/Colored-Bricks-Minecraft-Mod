package net.pinary_pi.coloredbricks.setup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;

public class ModBlocks {
    private static final AbstractBlock.Settings BRICK_SETTINGS = AbstractBlock.Settings.copy(Blocks.BRICKS);

    // Normal Brick Blocks
    public static final Block WHITE_BRICKS = registerBrickBlock("white_bricks", new Block(BRICK_SETTINGS));
    public static final Block ORANGE_BRICKS = registerBrickBlock("orange_bricks", new Block(BRICK_SETTINGS));
    public static final Block PINK_BRICKS = registerBrickBlock("pink_bricks", new Block(BRICK_SETTINGS));
    public static final Block YELLOW_BRICKS = registerBrickBlock("yellow_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIME_BRICKS = registerBrickBlock("lime_bricks", new Block(BRICK_SETTINGS));
    public static final Block GREEN_BRICKS = registerBrickBlock("green_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_BRICKS = registerBrickBlock("light_blue_bricks", new Block(BRICK_SETTINGS));
    public static final Block CYAN_BRICKS = registerBrickBlock("cyan_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLUE_BRICKS = registerBrickBlock("blue_bricks", new Block(BRICK_SETTINGS));
    public static final Block MAGENTA_BRICKS = registerBrickBlock("magenta_bricks", new Block(BRICK_SETTINGS));
    public static final Block PURPLE_BRICKS = registerBrickBlock("purple_bricks", new Block(BRICK_SETTINGS));
    public static final Block BROWN_BRICKS = registerBrickBlock("brown_bricks", new Block(BRICK_SETTINGS));
    public static final Block GRAY_BRICKS = registerBrickBlock("gray_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_BRICKS = registerBrickBlock("light_gray_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLACK_BRICKS = registerBrickBlock("black_bricks", new Block(BRICK_SETTINGS));
    public static final Block RED_BRICKS = registerBrickBlock("red_bricks", new Block(BRICK_SETTINGS));

    // Normal Brick SLabs

    public static final Block WHITE_BRICK_SLAB = registerBrickBlock("white_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block ORANGE_BRICK_SLAB = registerBrickBlock("orange_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block PINK_BRICK_SLAB = registerBrickBlock("pink_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block YELLOW_BRICK_SLAB = registerBrickBlock("yellow_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIME_BRICK_SLAB = registerBrickBlock("lime_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block GREEN_BRICK_SLAB = registerBrickBlock("green_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBrickBlock("light_blue_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block CYAN_BRICK_SLAB = registerBrickBlock("cyan_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BLUE_BRICK_SLAB = registerBrickBlock("blue_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block MAGENTA_BRICK_SLAB = registerBrickBlock("magenta_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block PURPLE_BRICK_SLAB = registerBrickBlock("purple_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BROWN_BRICK_SLAB = registerBrickBlock("brown_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBrickBlock("light_gray_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block GRAY_BRICK_SLAB = registerBrickBlock("gray_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BLACK_BRICK_SLAB = registerBrickBlock("black_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block RED_BRICK_SLAB = registerBrickBlock("red_brick_slab", new SlabBlock(BRICK_SETTINGS));

    // Normal Brick Stairs

    public static final Block WHITE_BRICK_STAIRS = registerBrickBlock("white_brick_stairs", new StairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block ORANGE_BRICK_STAIRS = registerBrickBlock("orange_brick_stairs", new StairsBlock(ModBlocks.ORANGE_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block PINK_BRICK_STAIRS = registerBrickBlock("pink_brick_stairs", new StairsBlock(ModBlocks.PINK_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block YELLOW_BRICK_STAIRS = registerBrickBlock("yellow_brick_stairs", new StairsBlock(ModBlocks.YELLOW_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIME_BRICK_STAIRS = registerBrickBlock("lime_brick_stairs", new StairsBlock(ModBlocks.LIME_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block GREEN_BRICK_STAIRS = registerBrickBlock("green_brick_stairs", new StairsBlock(ModBlocks.GREEN_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBrickBlock("light_blue_brick_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block CYAN_BRICK_STAIRS = registerBrickBlock("cyan_brick_stairs", new StairsBlock(ModBlocks.CYAN_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BLUE_BRICK_STAIRS = registerBrickBlock("blue_brick_stairs", new StairsBlock(ModBlocks.BLUE_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block MAGENTA_BRICK_STAIRS = registerBrickBlock("magenta_brick_stairs", new StairsBlock(ModBlocks.MAGENTA_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block PURPLE_BRICK_STAIRS = registerBrickBlock("purple_brick_stairs", new StairsBlock(ModBlocks.PURPLE_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BROWN_BRICK_STAIRS = registerBrickBlock("brown_brick_stairs", new StairsBlock(ModBlocks.BROWN_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBrickBlock("light_gray_brick_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block GRAY_BRICK_STAIRS = registerBrickBlock("gray_brick_stairs", new StairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BLACK_BRICK_STAIRS = registerBrickBlock("black_brick_stairs", new StairsBlock(ModBlocks.BLACK_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block RED_BRICK_STAIRS = registerBrickBlock("red_brick_stairs", new StairsBlock(ModBlocks.RED_BRICKS.getDefaultState(), BRICK_SETTINGS));

    // Normal Brick Walls

    public static final Block WHITE_BRICK_WALL = registerBrickBlock("white_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block ORANGE_BRICK_WALL = registerBrickBlock("orange_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block PINK_BRICK_WALL = registerBrickBlock("pink_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block YELLOW_BRICK_WALL = registerBrickBlock("yellow_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIME_BRICK_WALL = registerBrickBlock("lime_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block GREEN_BRICK_WALL = registerBrickBlock("green_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBrickBlock("light_blue_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block CYAN_BRICK_WALL = registerBrickBlock("cyan_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BLUE_BRICK_WALL = registerBrickBlock("blue_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block MAGENTA_BRICK_WALL = registerBrickBlock("magenta_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block PURPLE_BRICK_WALL = registerBrickBlock("purple_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BROWN_BRICK_WALL = registerBrickBlock("brown_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block GRAY_BRICK_WALL = registerBrickBlock("gray_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBrickBlock("light_gray_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BLACK_BRICK_WALL = registerBrickBlock("black_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block RED_BRICK_WALL = registerBrickBlock("red_bricks", new WallBlock(BRICK_SETTINGS));

    // Cracked Bricks

    public static final Block CRACKED_BRICKS = registerBrickBlock("cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block WHITE_CRACKED_BRICKS = registerBrickBlock("white_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block ORANGE_CRACKED_BRICKS = registerBrickBlock("orange_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block PINK_CRACKED_BRICKS = registerBrickBlock("pink_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block YELLOW_CRACKED_BRICKS = registerBrickBlock("yellow_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIME_CRACKED_BRICKS = registerBrickBlock("lime_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block GREEN_CRACKED_BRICKS = registerBrickBlock("green_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_CRACKED_BRICKS = registerBrickBlock("light_blue_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block CYAN_CRACKED_BRICKS = registerBrickBlock("cyan_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLUE_CRACKED_BRICKS = registerBrickBlock("blue_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block MAGENTA_CRACKED_BRICKS = registerBrickBlock("magenta_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block PURPLE_CRACKED_BRICKS = registerBrickBlock("purple_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block BROWN_CRACKED_BRICKS = registerBrickBlock("brown_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block GRAY_CRACKED_BRICKS = registerBrickBlock("gray_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_CRACKED_BRICKS = registerBrickBlock("light_gray_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLACK_CRACKED_BRICKS = registerBrickBlock("black_cracked_bricks", new Block(BRICK_SETTINGS));
    public static final Block RED_CRACKED_BRICKS = registerBrickBlock("red_cracked_bricks", new Block(BRICK_SETTINGS));

    // Cracked Slabs

    public static final Block CRACKED_BRICK_SLAB = registerBrickBlock("cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block WHITE_CRACKED_BRICK_SLAB = registerBrickBlock("white_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block ORANGE_CRACKED_BRICK_SLAB = registerBrickBlock("orange_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block PINK_CRACKED_BRICK_SLAB = registerBrickBlock("pink_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block YELLOW_CRACKED_BRICK_SLAB = registerBrickBlock("yellow_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIME_CRACKED_BRICK_SLAB = registerBrickBlock("lime_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block GREEN_CRACKED_BRICK_SLAB = registerBrickBlock("green_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_CRACKED_BRICK_SLAB = registerBrickBlock("light_blue_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block CYAN_CRACKED_BRICK_SLAB = registerBrickBlock("cyan_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BLUE_CRACKED_BRICK_SLAB = registerBrickBlock("blue_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block MAGENTA_CRACKED_BRICK_SLAB = registerBrickBlock("magenta_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block PURPLE_CRACKED_BRICK_SLAB = registerBrickBlock("purple_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BROWN_CRACKED_BRICK_SLAB = registerBrickBlock("brown_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_CRACKED_BRICK_SLAB = registerBrickBlock("light_gray_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block GRAY_CRACKED_BRICK_SLAB = registerBrickBlock("gray_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block BLACK_CRACKED_BRICK_SLAB = registerBrickBlock("black_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));
    public static final Block RED_CRACKED_BRICK_SLAB = registerBrickBlock("red_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS));

    // Cracked Stairs

    public static final Block CRACKED_BRICK_STAIRS = registerBrickBlock("cracked_brick_stairs", new StairsBlock(CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block WHITE_CRACKED_BRICK_STAIRS = registerBrickBlock("white_cracked_brick_stairs", new StairsBlock(ModBlocks.WHITE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block ORANGE_CRACKED_BRICK_STAIRS = registerBrickBlock("orange_cracked_brick_stairs", new StairsBlock(ModBlocks.ORANGE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block PINK_CRACKED_BRICK_STAIRS = registerBrickBlock("pink_cracked_brick_stairs", new StairsBlock(ModBlocks.PINK_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block YELLOW_CRACKED_BRICK_STAIRS = registerBrickBlock("yellow_cracked_brick_stairs", new StairsBlock(ModBlocks.YELLOW_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIME_CRACKED_BRICK_STAIRS = registerBrickBlock("lime_cracked_brick_stairs", new StairsBlock(ModBlocks.LIME_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block GREEN_CRACKED_BRICK_STAIRS = registerBrickBlock("green_cracked_brick_stairs", new StairsBlock(ModBlocks.GREEN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_CRACKED_BRICK_STAIRS = registerBrickBlock("light_blue_cracked_brick_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block CYAN_CRACKED_BRICK_STAIRS = registerBrickBlock("cyan_cracked_brick_stairs", new StairsBlock(ModBlocks.CYAN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BLUE_CRACKED_BRICK_STAIRS = registerBrickBlock("blue_cracked_brick_stairs", new StairsBlock(ModBlocks.BLUE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block MAGENTA_CRACKED_BRICK_STAIRS = registerBrickBlock("magenta_cracked_brick_stairs", new StairsBlock(ModBlocks.MAGENTA_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block PURPLE_CRACKED_BRICK_STAIRS = registerBrickBlock("purple_cracked_brick_stairs", new StairsBlock(ModBlocks.PURPLE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BROWN_CRACKED_BRICK_STAIRS = registerBrickBlock("brown_cracked_brick_stairs", new StairsBlock(ModBlocks.BROWN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_CRACKED_BRICK_STAIRS = registerBrickBlock("light_gray_cracked_brick_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block GRAY_CRACKED_BRICK_STAIRS = registerBrickBlock("gray_cracked_brick_stairs", new StairsBlock(ModBlocks.GRAY_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block BLACK_CRACKED_BRICK_STAIRS = registerBrickBlock("black_cracked_brick_stairs", new StairsBlock(ModBlocks.BLACK_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));
    public static final Block RED_CRACKED_BRICK_STAIRS = registerBrickBlock("red_cracked_brick_stairs", new StairsBlock(ModBlocks.RED_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS));

    // Cracked Walls

    public static final Block CRACKED_BRICK_WALL = registerBrickBlock("cracked_brick_wall", new WallBlock(BRICK_SETTINGS));
    public static final Block WHITE_CRACKED_BRICK_WALL = registerBrickBlock("white_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block ORANGE_CRACKED_BRICK_WALL = registerBrickBlock("orange_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block PINK_CRACKED_BRICK_WALL = registerBrickBlock("pink_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block YELLOW_CRACKED_BRICK_WALL = registerBrickBlock("yellow_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIME_CRACKED_BRICK_WALL = registerBrickBlock("lime_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block GREEN_CRACKED_BRICK_WALL = registerBrickBlock("green_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_CRACKED_BRICK_WALL = registerBrickBlock("light_blue_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block CYAN_CRACKED_BRICK_WALL = registerBrickBlock("cyan_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BLUE_CRACKED_BRICK_WALL = registerBrickBlock("blue_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block MAGENTA_CRACKED_BRICK_WALL = registerBrickBlock("magenta_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block PURPLE_CRACKED_BRICK_WALL = registerBrickBlock("purple_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BROWN_CRACKED_BRICK_WALL = registerBrickBlock("brown_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block GRAY_CRACKED_BRICK_WALL = registerBrickBlock("gray_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_CRACKED_BRICK_WALL = registerBrickBlock("light_gray_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block BLACK_CRACKED_BRICK_WALL = registerBrickBlock("black_cracked_bricks", new WallBlock(BRICK_SETTINGS));
    public static final Block RED_CRACKED_BRICK_WALL = registerBrickBlock("red_cracked_bricks", new WallBlock(BRICK_SETTINGS));

    // Chiseled Bricks
    public static final Block CHISELED_BRICKS = registerBrickBlock("chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block WHITE_CHISELED_BRICKS = registerBrickBlock("white_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block ORANGE_CHISELED_BRICKS = registerBrickBlock("orange_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block PINK_CHISELED_BRICKS = registerBrickBlock("pink_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block YELLOW_CHISELED_BRICKS = registerBrickBlock("yellow_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIME_CHISELED_BRICKS = registerBrickBlock("lime_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block GREEN_CHISELED_BRICKS = registerBrickBlock("green_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_CHISELED_BRICKS = registerBrickBlock("light_blue_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block CYAN_CHISELED_BRICKS = registerBrickBlock("cyan_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLUE_CHISELED_BRICKS = registerBrickBlock("blue_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block MAGENTA_CHISELED_BRICKS = registerBrickBlock("magenta_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block PURPLE_CHISELED_BRICKS = registerBrickBlock("purple_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block BROWN_CHISELED_BRICKS = registerBrickBlock("brown_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block GRAY_CHISELED_BRICKS = registerBrickBlock("gray_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_CHISELED_BRICKS = registerBrickBlock("light_gray_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLACK_CHISELED_BRICKS = registerBrickBlock("black_chiseled_bricks", new Block(BRICK_SETTINGS));
    public static final Block RED_CHISELED_BRICKS = registerBrickBlock("red_chiseled_bricks", new Block(BRICK_SETTINGS));

    private static void addBlocksToBuildingBlocksTab(FabricItemGroupEntries entries) {
        // Normal Brick Blocks
        entries.add(WHITE_BRICKS);
        entries.add(ORANGE_BRICKS);
        entries.add(PINK_BRICKS);
        entries.add(YELLOW_BRICKS);
        entries.add(LIME_BRICKS);
        entries.add(GREEN_BRICKS);
        entries.add(LIGHT_BLUE_BRICKS);
        entries.add(CYAN_BRICKS);
        entries.add(BLUE_BRICKS);
        entries.add(MAGENTA_BRICKS);
        entries.add(PURPLE_BRICKS);
        entries.add(BROWN_BRICKS);
        entries.add(GRAY_BRICKS);
        entries.add(LIGHT_GRAY_BRICKS);
        entries.add(BLACK_BRICKS);
        entries.add(RED_BRICKS);
        // Normal Brick Slabs
        entries.add(WHITE_BRICK_SLAB);
        entries.add(ORANGE_BRICK_SLAB);
        entries.add(PINK_BRICK_SLAB);
        entries.add(YELLOW_BRICK_SLAB);
        entries.add(LIME_BRICK_SLAB);
        entries.add(GREEN_BRICK_SLAB);
        entries.add(LIGHT_BLUE_BRICK_SLAB);
        entries.add(CYAN_BRICK_SLAB);
        entries.add(BLUE_BRICK_SLAB);
        entries.add(MAGENTA_BRICK_SLAB);
        entries.add(PURPLE_BRICK_SLAB);
        entries.add(BROWN_BRICK_SLAB);
        entries.add(GRAY_BRICK_SLAB);
        entries.add(LIGHT_GRAY_BRICK_SLAB);
        entries.add(BLACK_BRICK_SLAB);
        entries.add(RED_BRICK_SLAB);
        // Normal Brick Stairs
        entries.add(WHITE_BRICK_STAIRS);
        entries.add(ORANGE_BRICK_STAIRS);
        entries.add(PINK_BRICK_STAIRS);
        entries.add(YELLOW_BRICK_STAIRS);
        entries.add(LIME_BRICK_STAIRS);
        entries.add(GREEN_BRICK_STAIRS);
        entries.add(LIGHT_BLUE_BRICK_STAIRS);
        entries.add(CYAN_BRICK_STAIRS);
        entries.add(BLUE_BRICK_STAIRS);
        entries.add(MAGENTA_BRICK_STAIRS);
        entries.add(PURPLE_BRICK_STAIRS);
        entries.add(BROWN_BRICK_STAIRS);
        entries.add(GRAY_BRICK_STAIRS);
        entries.add(LIGHT_GRAY_BRICK_STAIRS);
        entries.add(BLACK_BRICK_STAIRS);
        entries.add(RED_BRICK_STAIRS);
        // Normal Brick Wall
        entries.add(WHITE_BRICK_WALL);
        entries.add(ORANGE_BRICK_WALL);
        entries.add(PINK_BRICK_WALL);
        entries.add(YELLOW_BRICK_WALL);
        entries.add(LIME_BRICK_WALL);
        entries.add(GREEN_BRICK_WALL);
        entries.add(LIGHT_BLUE_BRICK_WALL);
        entries.add(CYAN_BRICK_WALL);
        entries.add(BLUE_BRICK_WALL);
        entries.add(MAGENTA_BRICK_WALL);
        entries.add(PURPLE_BRICK_WALL);
        entries.add(BROWN_BRICK_WALL);
        entries.add(GRAY_BRICK_WALL);
        entries.add(LIGHT_GRAY_BRICK_WALL);
        entries.add(BLACK_BRICK_WALL);
        entries.add(RED_BRICK_WALL);
        // Cracked Bricks
        entries.add(CRACKED_BRICKS);
        entries.add(WHITE_CRACKED_BRICKS);
        entries.add(ORANGE_CRACKED_BRICKS);
        entries.add(PINK_CRACKED_BRICKS);
        entries.add(YELLOW_CRACKED_BRICKS);
        entries.add(LIME_CRACKED_BRICKS);
        entries.add(GREEN_CRACKED_BRICKS);
        entries.add(LIGHT_BLUE_CRACKED_BRICKS);
        entries.add(CYAN_CRACKED_BRICKS);
        entries.add(BLUE_CRACKED_BRICKS);
        entries.add(MAGENTA_CRACKED_BRICKS);
        entries.add(PURPLE_CRACKED_BRICKS);
        entries.add(BROWN_CRACKED_BRICKS);
        entries.add(GRAY_CRACKED_BRICKS);
        entries.add(LIGHT_GRAY_CRACKED_BRICKS);
        entries.add(BLACK_CRACKED_BRICKS);
        entries.add(RED_CRACKED_BRICKS);
        // Cracked Slabs
        entries.add(CRACKED_BRICK_SLAB);
        entries.add(WHITE_CRACKED_BRICK_SLAB);
        entries.add(ORANGE_CRACKED_BRICK_SLAB);
        entries.add(PINK_CRACKED_BRICK_SLAB);
        entries.add(YELLOW_CRACKED_BRICK_SLAB);
        entries.add(LIME_CRACKED_BRICK_SLAB);
        entries.add(GREEN_CRACKED_BRICK_SLAB);
        entries.add(LIGHT_BLUE_CRACKED_BRICK_SLAB);
        entries.add(CYAN_CRACKED_BRICK_SLAB);
        entries.add(BLUE_CRACKED_BRICK_SLAB);
        entries.add(MAGENTA_CRACKED_BRICK_SLAB);
        entries.add(PURPLE_CRACKED_BRICK_SLAB);
        entries.add(BROWN_CRACKED_BRICK_SLAB);
        entries.add(GRAY_CRACKED_BRICK_SLAB);
        entries.add(LIGHT_GRAY_CRACKED_BRICK_SLAB);
        entries.add(BLACK_CRACKED_BRICK_SLAB);
        entries.add(RED_CRACKED_BRICK_SLAB);
        // Cracked Stairs
        entries.add(CRACKED_BRICK_STAIRS);
        entries.add(WHITE_CRACKED_BRICK_STAIRS);
        entries.add(ORANGE_CRACKED_BRICK_STAIRS);
        entries.add(PINK_CRACKED_BRICK_STAIRS);
        entries.add(YELLOW_CRACKED_BRICK_STAIRS);
        entries.add(LIME_CRACKED_BRICK_STAIRS);
        entries.add(GREEN_CRACKED_BRICK_STAIRS);
        entries.add(LIGHT_BLUE_CRACKED_BRICK_STAIRS);
        entries.add(CYAN_CRACKED_BRICK_STAIRS);
        entries.add(BLUE_CRACKED_BRICK_STAIRS);
        entries.add(MAGENTA_CRACKED_BRICK_STAIRS);
        entries.add(PURPLE_CRACKED_BRICK_STAIRS);
        entries.add(BROWN_CRACKED_BRICK_STAIRS);
        entries.add(GRAY_CRACKED_BRICK_STAIRS);
        entries.add(LIGHT_GRAY_CRACKED_BRICK_STAIRS);
        entries.add(BLACK_CRACKED_BRICK_STAIRS);
        entries.add(RED_CRACKED_BRICK_STAIRS);
        // Cracked Walls
        entries.add(CRACKED_BRICK_WALL);
        entries.add(WHITE_CRACKED_BRICK_WALL);
        entries.add(ORANGE_CRACKED_BRICK_WALL);
        entries.add(PINK_CRACKED_BRICK_WALL);
        entries.add(YELLOW_CRACKED_BRICK_WALL);
        entries.add(LIME_CRACKED_BRICK_WALL);
        entries.add(GREEN_CRACKED_BRICK_WALL);
        entries.add(LIGHT_BLUE_CRACKED_BRICK_WALL);
        entries.add(CYAN_CRACKED_BRICK_WALL);
        entries.add(BLUE_CRACKED_BRICK_WALL);
        entries.add(MAGENTA_CRACKED_BRICK_WALL);
        entries.add(PURPLE_CRACKED_BRICK_WALL);
        entries.add(BROWN_CRACKED_BRICK_WALL);
        entries.add(GRAY_CRACKED_BRICK_WALL);
        entries.add(LIGHT_GRAY_CRACKED_BRICK_WALL);
        entries.add(BLACK_CRACKED_BRICK_WALL);
        entries.add(RED_CRACKED_BRICK_WALL);
        // Chiseled Bricks
        entries.add(CHISELED_BRICKS);
        entries.add(WHITE_CHISELED_BRICKS);
        entries.add(ORANGE_CHISELED_BRICKS);
        entries.add(PINK_CHISELED_BRICKS);
        entries.add(YELLOW_CHISELED_BRICKS);
        entries.add(LIME_CHISELED_BRICKS);
        entries.add(GREEN_CHISELED_BRICKS);
        entries.add(LIGHT_BLUE_CHISELED_BRICKS);
        entries.add(CYAN_CHISELED_BRICKS);
        entries.add(BLUE_CHISELED_BRICKS);
        entries.add(MAGENTA_CHISELED_BRICKS);
        entries.add(PURPLE_CHISELED_BRICKS);
        entries.add(BROWN_CHISELED_BRICKS);
        entries.add(GRAY_CHISELED_BRICKS);
        entries.add(LIGHT_GRAY_CHISELED_BRICKS);
        entries.add(BLACK_CHISELED_BRICKS);
        entries.add(RED_CHISELED_BRICKS);
    }

    private static Block registerBrickBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ColoredBricks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ColoredBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ColoredBricks.LOGGER.info("Registering Mod Blocks for " + ColoredBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTab);
    }
}
