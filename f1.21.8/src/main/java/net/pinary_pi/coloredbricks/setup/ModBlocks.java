package net.pinary_pi.coloredbricks.setup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;
import net.pinary_pi.coloredbricks.setup.list.PottedContent;

public class ModBlocks {
    private static final AbstractBlock.Settings BRICK_SETTINGS = AbstractBlock.Settings.copy(Blocks.BRICKS);
    private static final AbstractBlock.Settings POT_SETTINGS = AbstractBlock.Settings.copy(Blocks.FLOWER_POT); 

    // Normal Brick Blocks
    public static final Block WHITE_BRICKS = registerBrickBlock("white_bricks");
    public static final Block ORANGE_BRICKS = registerBrickBlock("orange_bricks");
    public static final Block PINK_BRICKS = registerBrickBlock("pink_bricks");
    public static final Block YELLOW_BRICKS = registerBrickBlock("yellow_bricks");
    public static final Block LIME_BRICKS = registerBrickBlock("lime_bricks");
    public static final Block GREEN_BRICKS = registerBrickBlock("green_bricks");
    public static final Block LIGHT_BLUE_BRICKS = registerBrickBlock("light_blue_bricks");
    public static final Block CYAN_BRICKS = registerBrickBlock("cyan_bricks");
    public static final Block BLUE_BRICKS = registerBrickBlock("blue_bricks");
    public static final Block MAGENTA_BRICKS = registerBrickBlock("magenta_bricks");
    public static final Block PURPLE_BRICKS = registerBrickBlock("purple_bricks");
    public static final Block BROWN_BRICKS = registerBrickBlock("brown_bricks");
    public static final Block GRAY_BRICKS = registerBrickBlock("gray_bricks");
    public static final Block LIGHT_GRAY_BRICKS = registerBrickBlock("light_gray_bricks");
    public static final Block BLACK_BRICKS = registerBrickBlock("black_bricks");
    public static final Block RED_BRICKS = registerBrickBlock("red_bricks");

    // Normal Brick SLabs

    public static final Block WHITE_BRICK_SLAB = registerSlabBlock("white_brick_slab");
    public static final Block ORANGE_BRICK_SLAB = registerSlabBlock("orange_brick_slab");
    public static final Block PINK_BRICK_SLAB = registerSlabBlock("pink_brick_slab");
    public static final Block YELLOW_BRICK_SLAB = registerSlabBlock("yellow_brick_slab");
    public static final Block LIME_BRICK_SLAB = registerSlabBlock("lime_brick_slab");
    public static final Block GREEN_BRICK_SLAB = registerSlabBlock("green_brick_slab");
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerSlabBlock("light_blue_brick_slab");
    public static final Block CYAN_BRICK_SLAB = registerSlabBlock("cyan_brick_slab");
    public static final Block BLUE_BRICK_SLAB = registerSlabBlock("blue_brick_slab");
    public static final Block MAGENTA_BRICK_SLAB = registerSlabBlock("magenta_brick_slab");
    public static final Block PURPLE_BRICK_SLAB = registerSlabBlock("purple_brick_slab");
    public static final Block BROWN_BRICK_SLAB = registerSlabBlock("brown_brick_slab");
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerSlabBlock("light_gray_brick_slab");
    public static final Block GRAY_BRICK_SLAB = registerSlabBlock("gray_brick_slab");
    public static final Block BLACK_BRICK_SLAB = registerSlabBlock("black_brick_slab");
    public static final Block RED_BRICK_SLAB = registerSlabBlock("red_brick_slab");

    // Normal Brick Stairs

    public static final Block WHITE_BRICK_STAIRS = registerStairsBlock("white_brick_stairs", ModBlocks.WHITE_BRICKS.getDefaultState());
    public static final Block ORANGE_BRICK_STAIRS = registerStairsBlock("orange_brick_stairs", ModBlocks.ORANGE_BRICKS.getDefaultState());
    public static final Block PINK_BRICK_STAIRS = registerStairsBlock("pink_brick_stairs", ModBlocks.PINK_BRICKS.getDefaultState());
    public static final Block YELLOW_BRICK_STAIRS = registerStairsBlock("yellow_brick_stairs", ModBlocks.YELLOW_BRICKS.getDefaultState());
    public static final Block LIME_BRICK_STAIRS = registerStairsBlock("lime_brick_stairs", ModBlocks.LIME_BRICKS.getDefaultState());
    public static final Block GREEN_BRICK_STAIRS = registerStairsBlock("green_brick_stairs", ModBlocks.GREEN_BRICKS.getDefaultState());
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerStairsBlock("light_blue_brick_stairs", ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState());
    public static final Block CYAN_BRICK_STAIRS = registerStairsBlock("cyan_brick_stairs", ModBlocks.CYAN_BRICKS.getDefaultState());
    public static final Block BLUE_BRICK_STAIRS = registerStairsBlock("blue_brick_stairs", ModBlocks.BLUE_BRICKS.getDefaultState());
    public static final Block MAGENTA_BRICK_STAIRS = registerStairsBlock("magenta_brick_stairs", ModBlocks.MAGENTA_BRICKS.getDefaultState());
    public static final Block PURPLE_BRICK_STAIRS = registerStairsBlock("purple_brick_stairs", ModBlocks.PURPLE_BRICKS.getDefaultState());
    public static final Block BROWN_BRICK_STAIRS = registerStairsBlock("brown_brick_stairs", ModBlocks.BROWN_BRICKS.getDefaultState());
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerStairsBlock("light_gray_brick_stairs", ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState());
    public static final Block GRAY_BRICK_STAIRS = registerStairsBlock("gray_brick_stairs", ModBlocks.GRAY_BRICKS.getDefaultState());
    public static final Block BLACK_BRICK_STAIRS = registerStairsBlock("black_brick_stairs", ModBlocks.BLACK_BRICKS.getDefaultState());
    public static final Block RED_BRICK_STAIRS = registerStairsBlock("red_brick_stairs", ModBlocks.RED_BRICKS.getDefaultState());

    // Normal Brick Walls

    public static final Block WHITE_BRICK_WALL = registerWallBlock("white_brick_wall");
    public static final Block ORANGE_BRICK_WALL = registerWallBlock("orange_brick_wall");
    public static final Block PINK_BRICK_WALL = registerWallBlock("pink_brick_wall");
    public static final Block YELLOW_BRICK_WALL = registerWallBlock("yellow_brick_wall");
    public static final Block LIME_BRICK_WALL = registerWallBlock("lime_brick_wall");
    public static final Block GREEN_BRICK_WALL = registerWallBlock("green_brick_wall");
    public static final Block LIGHT_BLUE_BRICK_WALL = registerWallBlock("light_blue_brick_wall");
    public static final Block CYAN_BRICK_WALL = registerWallBlock("cyan_brick_wall");
    public static final Block BLUE_BRICK_WALL = registerWallBlock("blue_brick_wall");
    public static final Block MAGENTA_BRICK_WALL = registerWallBlock("magenta_brick_wall");
    public static final Block PURPLE_BRICK_WALL = registerWallBlock("purple_brick_wall");
    public static final Block BROWN_BRICK_WALL = registerWallBlock("brown_brick_wall");
    public static final Block GRAY_BRICK_WALL = registerWallBlock("gray_brick_wall");
    public static final Block LIGHT_GRAY_BRICK_WALL = registerWallBlock("light_gray_brick_wall");
    public static final Block BLACK_BRICK_WALL = registerWallBlock("black_brick_wall");
    public static final Block RED_BRICK_WALL = registerWallBlock("red_brick_wall");

    // Cracked Bricks

    public static final Block CRACKED_BRICKS = registerBrickBlock("cracked_bricks");
    public static final Block WHITE_CRACKED_BRICKS = registerBrickBlock("white_cracked_bricks");
    public static final Block ORANGE_CRACKED_BRICKS = registerBrickBlock("orange_cracked_bricks");
    public static final Block PINK_CRACKED_BRICKS = registerBrickBlock("pink_cracked_bricks");
    public static final Block YELLOW_CRACKED_BRICKS = registerBrickBlock("yellow_cracked_bricks");
    public static final Block LIME_CRACKED_BRICKS = registerBrickBlock("lime_cracked_bricks");
    public static final Block GREEN_CRACKED_BRICKS = registerBrickBlock("green_cracked_bricks");
    public static final Block LIGHT_BLUE_CRACKED_BRICKS = registerBrickBlock("light_blue_cracked_bricks");
    public static final Block CYAN_CRACKED_BRICKS = registerBrickBlock("cyan_cracked_bricks");
    public static final Block BLUE_CRACKED_BRICKS = registerBrickBlock("blue_cracked_bricks");
    public static final Block MAGENTA_CRACKED_BRICKS = registerBrickBlock("magenta_cracked_bricks");
    public static final Block PURPLE_CRACKED_BRICKS = registerBrickBlock("purple_cracked_bricks");
    public static final Block BROWN_CRACKED_BRICKS = registerBrickBlock("brown_cracked_bricks");
    public static final Block GRAY_CRACKED_BRICKS = registerBrickBlock("gray_cracked_bricks");
    public static final Block LIGHT_GRAY_CRACKED_BRICKS = registerBrickBlock("light_gray_cracked_bricks");
    public static final Block BLACK_CRACKED_BRICKS = registerBrickBlock("black_cracked_bricks");
    public static final Block RED_CRACKED_BRICKS = registerBrickBlock("red_cracked_bricks");

    // Cracked Slabs

    public static final Block CRACKED_BRICK_SLAB = registerSlabBlock("cracked_brick_slab");
    public static final Block WHITE_CRACKED_BRICK_SLAB = registerSlabBlock("white_cracked_brick_slab");
    public static final Block ORANGE_CRACKED_BRICK_SLAB = registerSlabBlock("orange_cracked_brick_slab");
    public static final Block PINK_CRACKED_BRICK_SLAB = registerSlabBlock("pink_cracked_brick_slab");
    public static final Block YELLOW_CRACKED_BRICK_SLAB = registerSlabBlock("yellow_cracked_brick_slab");
    public static final Block LIME_CRACKED_BRICK_SLAB = registerSlabBlock("lime_cracked_brick_slab");
    public static final Block GREEN_CRACKED_BRICK_SLAB = registerSlabBlock("green_cracked_brick_slab");
    public static final Block LIGHT_BLUE_CRACKED_BRICK_SLAB = registerSlabBlock("light_blue_cracked_brick_slab");
    public static final Block CYAN_CRACKED_BRICK_SLAB = registerSlabBlock("cyan_cracked_brick_slab");
    public static final Block BLUE_CRACKED_BRICK_SLAB = registerSlabBlock("blue_cracked_brick_slab");
    public static final Block MAGENTA_CRACKED_BRICK_SLAB = registerSlabBlock("magenta_cracked_brick_slab");
    public static final Block PURPLE_CRACKED_BRICK_SLAB = registerSlabBlock("purple_cracked_brick_slab");
    public static final Block BROWN_CRACKED_BRICK_SLAB = registerSlabBlock("brown_cracked_brick_slab");
    public static final Block LIGHT_GRAY_CRACKED_BRICK_SLAB = registerSlabBlock("light_gray_cracked_brick_slab");
    public static final Block GRAY_CRACKED_BRICK_SLAB = registerSlabBlock("gray_cracked_brick_slab");
    public static final Block BLACK_CRACKED_BRICK_SLAB = registerSlabBlock("black_cracked_brick_slab");
    public static final Block RED_CRACKED_BRICK_SLAB = registerSlabBlock("red_cracked_brick_slab");

    // Cracked Stairs

    public static final Block CRACKED_BRICK_STAIRS = registerStairsBlock("cracked_brick_stairs", CRACKED_BRICKS.getDefaultState());
    public static final Block WHITE_CRACKED_BRICK_STAIRS = registerStairsBlock("white_cracked_brick_stairs", ModBlocks.WHITE_CRACKED_BRICKS.getDefaultState());
    public static final Block ORANGE_CRACKED_BRICK_STAIRS = registerStairsBlock("orange_cracked_brick_stairs", ModBlocks.ORANGE_CRACKED_BRICKS.getDefaultState());
    public static final Block PINK_CRACKED_BRICK_STAIRS = registerStairsBlock("pink_cracked_brick_stairs", ModBlocks.PINK_CRACKED_BRICKS.getDefaultState());
    public static final Block YELLOW_CRACKED_BRICK_STAIRS = registerStairsBlock("yellow_cracked_brick_stairs", ModBlocks.YELLOW_CRACKED_BRICKS.getDefaultState());
    public static final Block LIME_CRACKED_BRICK_STAIRS = registerStairsBlock("lime_cracked_brick_stairs", ModBlocks.LIME_CRACKED_BRICKS.getDefaultState());
    public static final Block GREEN_CRACKED_BRICK_STAIRS = registerStairsBlock("green_cracked_brick_stairs", ModBlocks.GREEN_CRACKED_BRICKS.getDefaultState());
    public static final Block LIGHT_BLUE_CRACKED_BRICK_STAIRS = registerStairsBlock("light_blue_cracked_brick_stairs", ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.getDefaultState());
    public static final Block CYAN_CRACKED_BRICK_STAIRS = registerStairsBlock("cyan_cracked_brick_stairs", ModBlocks.CYAN_CRACKED_BRICKS.getDefaultState());
    public static final Block BLUE_CRACKED_BRICK_STAIRS = registerStairsBlock("blue_cracked_brick_stairs", ModBlocks.BLUE_CRACKED_BRICKS.getDefaultState());
    public static final Block MAGENTA_CRACKED_BRICK_STAIRS = registerStairsBlock("magenta_cracked_brick_stairs", ModBlocks.MAGENTA_CRACKED_BRICKS.getDefaultState());
    public static final Block PURPLE_CRACKED_BRICK_STAIRS = registerStairsBlock("purple_cracked_brick_stairs", ModBlocks.PURPLE_CRACKED_BRICKS.getDefaultState());
    public static final Block BROWN_CRACKED_BRICK_STAIRS = registerStairsBlock("brown_cracked_brick_stairs", ModBlocks.BROWN_CRACKED_BRICKS.getDefaultState());
    public static final Block LIGHT_GRAY_CRACKED_BRICK_STAIRS = registerStairsBlock("light_gray_cracked_brick_stairs", ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.getDefaultState());
    public static final Block GRAY_CRACKED_BRICK_STAIRS = registerStairsBlock("gray_cracked_brick_stairs", ModBlocks.GRAY_CRACKED_BRICKS.getDefaultState());
    public static final Block BLACK_CRACKED_BRICK_STAIRS = registerStairsBlock("black_cracked_brick_stairs", ModBlocks.BLACK_CRACKED_BRICKS.getDefaultState());
    public static final Block RED_CRACKED_BRICK_STAIRS = registerStairsBlock("red_cracked_brick_stairs", ModBlocks.RED_CRACKED_BRICKS.getDefaultState());

    // Cracked Walls

    public static final Block CRACKED_BRICK_WALL = registerWallBlock("cracked_brick_wall");
    public static final Block WHITE_CRACKED_BRICK_WALL = registerWallBlock("white_cracked_brick_wall");
    public static final Block ORANGE_CRACKED_BRICK_WALL = registerWallBlock("orange_cracked_brick_wall");
    public static final Block PINK_CRACKED_BRICK_WALL = registerWallBlock("pink_cracked_brick_wall");
    public static final Block YELLOW_CRACKED_BRICK_WALL = registerWallBlock("yellow_cracked_brick_wall");
    public static final Block LIME_CRACKED_BRICK_WALL = registerWallBlock("lime_cracked_brick_wall");
    public static final Block GREEN_CRACKED_BRICK_WALL = registerWallBlock("green_cracked_brick_wall");
    public static final Block LIGHT_BLUE_CRACKED_BRICK_WALL = registerWallBlock("light_blue_cracked_brick_wall");
    public static final Block CYAN_CRACKED_BRICK_WALL = registerWallBlock("cyan_cracked_brick_wall");
    public static final Block BLUE_CRACKED_BRICK_WALL = registerWallBlock("blue_cracked_brick_wall");
    public static final Block MAGENTA_CRACKED_BRICK_WALL = registerWallBlock("magenta_cracked_brick_wall");
    public static final Block PURPLE_CRACKED_BRICK_WALL = registerWallBlock("purple_cracked_brick_wall");
    public static final Block BROWN_CRACKED_BRICK_WALL = registerWallBlock("brown_cracked_brick_wall");
    public static final Block GRAY_CRACKED_BRICK_WALL = registerWallBlock("gray_cracked_brick_wall");
    public static final Block LIGHT_GRAY_CRACKED_BRICK_WALL = registerWallBlock("light_gray_cracked_brick_wall");
    public static final Block BLACK_CRACKED_BRICK_WALL = registerWallBlock("black_cracked_brick_wall");
    public static final Block RED_CRACKED_BRICK_WALL = registerWallBlock("red_cracked_brick_wall");

    // Chiseled Bricks
    public static final Block CHISELED_BRICKS = registerBrickBlock("chiseled_bricks");
    public static final Block WHITE_CHISELED_BRICKS = registerBrickBlock("white_chiseled_bricks");
    public static final Block ORANGE_CHISELED_BRICKS = registerBrickBlock("orange_chiseled_bricks");
    public static final Block PINK_CHISELED_BRICKS = registerBrickBlock("pink_chiseled_bricks");
    public static final Block YELLOW_CHISELED_BRICKS = registerBrickBlock("yellow_chiseled_bricks");
    public static final Block LIME_CHISELED_BRICKS = registerBrickBlock("lime_chiseled_bricks");
    public static final Block GREEN_CHISELED_BRICKS = registerBrickBlock("green_chiseled_bricks");
    public static final Block LIGHT_BLUE_CHISELED_BRICKS = registerBrickBlock("light_blue_chiseled_bricks");
    public static final Block CYAN_CHISELED_BRICKS = registerBrickBlock("cyan_chiseled_bricks");
    public static final Block BLUE_CHISELED_BRICKS = registerBrickBlock("blue_chiseled_bricks");
    public static final Block MAGENTA_CHISELED_BRICKS = registerBrickBlock("magenta_chiseled_bricks");
    public static final Block PURPLE_CHISELED_BRICKS = registerBrickBlock("purple_chiseled_bricks");
    public static final Block BROWN_CHISELED_BRICKS = registerBrickBlock("brown_chiseled_bricks");
    public static final Block GRAY_CHISELED_BRICKS = registerBrickBlock("gray_chiseled_bricks");
    public static final Block LIGHT_GRAY_CHISELED_BRICKS = registerBrickBlock("light_gray_chiseled_bricks");
    public static final Block BLACK_CHISELED_BRICKS = registerBrickBlock("black_chiseled_bricks");
    public static final Block RED_CHISELED_BRICKS = registerBrickBlock("red_chiseled_bricks");

    // Flower Pots
    public static final Block WHITE_FLOWER_POT = registerEmptyFlowerPot("white_flower_pot", DyeColor.WHITE);
    public static final Block ORANGE_FLOWER_POT = registerEmptyFlowerPot("orange_flower_pot", DyeColor.ORANGE);
    public static final Block PINK_FLOWER_POT = registerEmptyFlowerPot("pink_flower_pot", DyeColor.PINK);
    public static final Block YELLOW_FLOWER_POT = registerEmptyFlowerPot("yellow_flower_pot", DyeColor.YELLOW);
    public static final Block LIME_FLOWER_POT = registerEmptyFlowerPot("lime_flower_pot", DyeColor.LIME);
    public static final Block GREEN_FLOWER_POT = registerEmptyFlowerPot("green_flower_pot", DyeColor.GREEN);
    public static final Block LIGHT_BLUE_FLOWER_POT = registerEmptyFlowerPot("light_blue_flower_pot", DyeColor.LIGHT_BLUE);
    public static final Block CYAN_FLOWER_POT = registerEmptyFlowerPot("cyan_flower_pot", DyeColor.CYAN);
    public static final Block BLUE_FLOWER_POT = registerEmptyFlowerPot("blue_flower_pot", DyeColor.BLUE);
    public static final Block MAGENTA_FLOWER_POT = registerEmptyFlowerPot("magenta_flower_pot", DyeColor.MAGENTA);
    public static final Block PURPLE_FLOWER_POT = registerEmptyFlowerPot("purple_flower_pot", DyeColor.PURPLE);
    public static final Block BROWN_FLOWER_POT = registerEmptyFlowerPot("brown_flower_pot", DyeColor.BROWN);
    public static final Block LIGHT_GRAY_FLOWER_POT = registerEmptyFlowerPot("light_gray_flower_pot", DyeColor.LIGHT_GRAY);
    public static final Block GRAY_FLOWER_POT = registerEmptyFlowerPot("gray_flower_pot", DyeColor.GRAY);
    public static final Block BLACK_FLOWER_POT = registerEmptyFlowerPot("black_flower_pot", DyeColor.BLACK);
    public static final Block RED_FLOWER_POT = registerEmptyFlowerPot("red_flower_pot", DyeColor.RED);

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

    private static void addBlocksToFunctionalBlocksTab(FabricItemGroupEntries entries) {
        // Flower Pots
        entries.add(WHITE_FLOWER_POT);
        entries.add(ORANGE_FLOWER_POT);
        entries.add(PINK_FLOWER_POT);
        entries.add(YELLOW_FLOWER_POT);
        entries.add(LIME_FLOWER_POT);
        entries.add(GREEN_FLOWER_POT);
        entries.add(LIGHT_BLUE_FLOWER_POT);
        entries.add(CYAN_FLOWER_POT);
        entries.add(BLUE_FLOWER_POT);
        entries.add(MAGENTA_FLOWER_POT);
        entries.add(PURPLE_FLOWER_POT);
        entries.add(BROWN_FLOWER_POT);
        entries.add(LIGHT_GRAY_FLOWER_POT);
        entries.add(GRAY_FLOWER_POT);
        entries.add(BLACK_FLOWER_POT);
        entries.add(RED_FLOWER_POT);
    }

    private static void addBlocksToColoredBlocksTab(FabricItemGroupEntries entries) {
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
        // Flower Pots
        entries.add(WHITE_FLOWER_POT);
        entries.add(ORANGE_FLOWER_POT);
        entries.add(PINK_FLOWER_POT);
        entries.add(YELLOW_FLOWER_POT);
        entries.add(LIME_FLOWER_POT);
        entries.add(GREEN_FLOWER_POT);
        entries.add(LIGHT_BLUE_FLOWER_POT);
        entries.add(CYAN_FLOWER_POT);
        entries.add(BLUE_FLOWER_POT);
        entries.add(MAGENTA_FLOWER_POT);
        entries.add(PURPLE_FLOWER_POT);
        entries.add(BROWN_FLOWER_POT);
        entries.add(LIGHT_GRAY_FLOWER_POT);
        entries.add(GRAY_FLOWER_POT);
        entries.add(BLACK_FLOWER_POT);
        entries.add(RED_FLOWER_POT);
    }

    private static void registerPottedFlowers(){
        for (PottedContent content : PottedContent.values()) {
            Block flower = content.getFlowerBlock();
            String white_name = Registries.ITEM.getId(WHITE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String orange_name = Registries.ITEM.getId(ORANGE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String pink_name = Registries.ITEM.getId(PINK_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String yellow_name = Registries.ITEM.getId(YELLOW_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String lime_name = Registries.ITEM.getId(LIME_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String green_name = Registries.ITEM.getId(GREEN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String light_blue_name = Registries.ITEM.getId(LIGHT_BLUE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String cyan_name = Registries.ITEM.getId(CYAN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String blue_name = Registries.ITEM.getId(BLUE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String magenta_name = Registries.ITEM.getId(MAGENTA_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String purple_name = Registries.ITEM.getId(PURPLE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String brown_name = Registries.ITEM.getId(BROWN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String light_gray_name = Registries.ITEM.getId(LIGHT_GRAY_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String gray_name = Registries.ITEM.getId(GRAY_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String black_name = Registries.ITEM.getId(BLACK_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String red_name = Registries.ITEM.getId(RED_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();

            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + white_name + "}");
            registerPottedFLower(white_name, flower, DyeColor.WHITE);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + orange_name + "}");
            registerPottedFLower(orange_name, flower, DyeColor.ORANGE);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + pink_name + "}");
            registerPottedFLower(pink_name, flower, DyeColor.PINK);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + yellow_name + "}");
            registerPottedFLower(yellow_name, flower, DyeColor.YELLOW);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + lime_name + "}");
            registerPottedFLower(lime_name, flower, DyeColor.LIME);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + green_name + "}");
            registerPottedFLower(green_name, flower, DyeColor.GREEN);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + light_blue_name + "}");
            registerPottedFLower(light_blue_name, flower, DyeColor.LIGHT_BLUE);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + cyan_name + "}");
            registerPottedFLower(cyan_name, flower, DyeColor.CYAN);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + blue_name + "}");
            registerPottedFLower(blue_name, flower, DyeColor.BLUE);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + magenta_name + "}");
            registerPottedFLower(magenta_name, flower, DyeColor.MAGENTA);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + purple_name + "}");
            registerPottedFLower(purple_name, flower, DyeColor.PURPLE);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + brown_name + "}");
            registerPottedFLower(brown_name, flower, DyeColor.BROWN);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + light_gray_name + "}");
            registerPottedFLower(light_gray_name, flower, DyeColor.LIGHT_GRAY);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + gray_name + "}");
            registerPottedFLower(gray_name, flower, DyeColor.GRAY);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + black_name + "}");
            registerPottedFLower(black_name, flower, DyeColor.BLACK);
            ColoredBricks.LOGGER.info("Registering: {" + ColoredBricks.MOD_ID + ":" + red_name + "}");
            registerPottedFLower(red_name, flower, DyeColor.RED);
        }
    }

    private static Block registerPottedFLower(String name, Block content, DyeColor color) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        return Registry.register(Registries.BLOCK, id, 
            new ColoredFlowerPotBlock(content, 
                POT_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id)), 
                color
            )
        );
    }

    private static Block registerEmptyFlowerPot(String name, DyeColor color) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        Block block = Registry.register(Registries.BLOCK, id, 
            new ColoredFlowerPotBlock(Blocks.AIR, 
                POT_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id)),
                color
            )
        );
        registerBlockItem(name, block);
        return block;
    }

    private static Block registerSlabBlock(String name) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        Block block = Registry.register(Registries.BLOCK, id, 
            new SlabBlock(
                BRICK_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
            )
        );
        registerBlockItem(name, block);
        return block;
    }

    private static Block registerStairsBlock (String name, BlockState baseBlockState) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        Block block = Registry.register(Registries.BLOCK, id, 
            new StairsBlock(baseBlockState, 
                BRICK_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
            )
        );
        registerBlockItem(name, block);
        return block;
    }

    private static Block registerWallBlock (String name) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        Block block = Registry.register(Registries.BLOCK, id,
            new WallBlock(
                BRICK_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
            )
        );
        registerBlockItem(name, block);
        return block;
    }

    private static Block registerBrickBlock(String name) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        Block block = Registry.register(Registries.BLOCK, id, 
            new Block(
                BRICK_SETTINGS.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
            )
        );
        registerBlockItem(name, block);
        return block;
    }

    private static Item registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(ColoredBricks.MOD_ID, name);
        return Registry.register(Registries.ITEM, id,
            new BlockItem(block, 
                new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id))
            )
        );
    }

    public static void registerModBlocks() {
        ColoredBricks.LOGGER.info("Registering Mod Blocks for " + ColoredBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addBlocksToFunctionalBlocksTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBlocksToColoredBlocksTab);

        ColoredBricks.LOGGER.info("Registering Potted Plants");
        registerPottedFlowers();
    }
}