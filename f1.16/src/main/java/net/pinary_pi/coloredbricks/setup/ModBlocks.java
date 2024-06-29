package net.pinary_pi.coloredbricks.setup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;
import net.pinary_pi.coloredbricks.setup.list.PottedContent;

public class ModBlocks {
    private static final AbstractBlock.Settings BRICK_SETTINGS = AbstractBlock.Settings.copy(Blocks.BRICKS);
    private static final AbstractBlock.Settings POT_SETTINGS = AbstractBlock.Settings.copy(Blocks.FLOWER_POT);
    private static final ItemGroup BUILDING_BLOCKS = ItemGroup.BUILDING_BLOCKS; 
    private static final ItemGroup DECORATIONS = ItemGroup.DECORATIONS;

    // Normal Brick Blocks
    public static final Block WHITE_BRICKS = registerBrickBlock("white_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_BRICKS = registerBrickBlock("orange_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_BRICKS = registerBrickBlock("pink_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_BRICKS = registerBrickBlock("yellow_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_BRICKS = registerBrickBlock("lime_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_BRICKS = registerBrickBlock("green_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_BRICKS = registerBrickBlock("light_blue_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_BRICKS = registerBrickBlock("cyan_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_BRICKS = registerBrickBlock("blue_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_BRICKS = registerBrickBlock("magenta_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_BRICKS = registerBrickBlock("purple_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_BRICKS = registerBrickBlock("brown_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_BRICKS = registerBrickBlock("gray_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_BRICKS = registerBrickBlock("light_gray_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_BRICKS = registerBrickBlock("black_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_BRICKS = registerBrickBlock("red_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);

    // Normal Brick SLabs

    public static final Block WHITE_BRICK_SLAB = registerBrickBlock("white_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_BRICK_SLAB = registerBrickBlock("orange_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_BRICK_SLAB = registerBrickBlock("pink_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_BRICK_SLAB = registerBrickBlock("yellow_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_BRICK_SLAB = registerBrickBlock("lime_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_BRICK_SLAB = registerBrickBlock("green_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBrickBlock("light_blue_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_BRICK_SLAB = registerBrickBlock("cyan_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_BRICK_SLAB = registerBrickBlock("blue_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_BRICK_SLAB = registerBrickBlock("magenta_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_BRICK_SLAB = registerBrickBlock("purple_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_BRICK_SLAB = registerBrickBlock("brown_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBrickBlock("light_gray_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_BRICK_SLAB = registerBrickBlock("gray_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_BRICK_SLAB = registerBrickBlock("black_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_BRICK_SLAB = registerBrickBlock("red_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);

    // Normal Brick Stairs

    public static final Block WHITE_BRICK_STAIRS = registerBrickBlock("white_brick_stairs", new ModStairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_BRICK_STAIRS = registerBrickBlock("orange_brick_stairs", new ModStairsBlock(ModBlocks.ORANGE_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_BRICK_STAIRS = registerBrickBlock("pink_brick_stairs", new ModStairsBlock(ModBlocks.PINK_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_BRICK_STAIRS = registerBrickBlock("yellow_brick_stairs", new ModStairsBlock(ModBlocks.YELLOW_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_BRICK_STAIRS = registerBrickBlock("lime_brick_stairs", new ModStairsBlock(ModBlocks.LIME_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_BRICK_STAIRS = registerBrickBlock("green_brick_stairs", new ModStairsBlock(ModBlocks.GREEN_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBrickBlock("light_blue_brick_stairs", new ModStairsBlock(ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_BRICK_STAIRS = registerBrickBlock("cyan_brick_stairs", new ModStairsBlock(ModBlocks.CYAN_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_BRICK_STAIRS = registerBrickBlock("blue_brick_stairs", new ModStairsBlock(ModBlocks.BLUE_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_BRICK_STAIRS = registerBrickBlock("magenta_brick_stairs", new ModStairsBlock(ModBlocks.MAGENTA_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_BRICK_STAIRS = registerBrickBlock("purple_brick_stairs", new ModStairsBlock(ModBlocks.PURPLE_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_BRICK_STAIRS = registerBrickBlock("brown_brick_stairs", new ModStairsBlock(ModBlocks.BROWN_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBrickBlock("light_gray_brick_stairs", new ModStairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_BRICK_STAIRS = registerBrickBlock("gray_brick_stairs", new ModStairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_BRICK_STAIRS = registerBrickBlock("black_brick_stairs", new ModStairsBlock(ModBlocks.BLACK_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_BRICK_STAIRS = registerBrickBlock("red_brick_stairs", new ModStairsBlock(ModBlocks.RED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);

    // Normal Brick Walls

    public static final Block WHITE_BRICK_WALL = registerBrickBlock("white_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block ORANGE_BRICK_WALL = registerBrickBlock("orange_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block PINK_BRICK_WALL = registerBrickBlock("pink_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block YELLOW_BRICK_WALL = registerBrickBlock("yellow_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIME_BRICK_WALL = registerBrickBlock("lime_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block GREEN_BRICK_WALL = registerBrickBlock("green_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBrickBlock("light_blue_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block CYAN_BRICK_WALL = registerBrickBlock("cyan_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BLUE_BRICK_WALL = registerBrickBlock("blue_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block MAGENTA_BRICK_WALL = registerBrickBlock("magenta_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block PURPLE_BRICK_WALL = registerBrickBlock("purple_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BROWN_BRICK_WALL = registerBrickBlock("brown_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block GRAY_BRICK_WALL = registerBrickBlock("gray_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBrickBlock("light_gray_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BLACK_BRICK_WALL = registerBrickBlock("black_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block RED_BRICK_WALL = registerBrickBlock("red_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);

    // Cracked Bricks

    public static final Block CRACKED_BRICKS = registerBrickBlock("cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block WHITE_CRACKED_BRICKS = registerBrickBlock("white_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_CRACKED_BRICKS = registerBrickBlock("orange_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_CRACKED_BRICKS = registerBrickBlock("pink_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_CRACKED_BRICKS = registerBrickBlock("yellow_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_CRACKED_BRICKS = registerBrickBlock("lime_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_CRACKED_BRICKS = registerBrickBlock("green_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CRACKED_BRICKS = registerBrickBlock("light_blue_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_CRACKED_BRICKS = registerBrickBlock("cyan_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_CRACKED_BRICKS = registerBrickBlock("blue_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_CRACKED_BRICKS = registerBrickBlock("magenta_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_CRACKED_BRICKS = registerBrickBlock("purple_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_CRACKED_BRICKS = registerBrickBlock("brown_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_CRACKED_BRICKS = registerBrickBlock("gray_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CRACKED_BRICKS = registerBrickBlock("light_gray_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_CRACKED_BRICKS = registerBrickBlock("black_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_CRACKED_BRICKS = registerBrickBlock("red_cracked_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);

    // Cracked Slabs

    public static final Block CRACKED_BRICK_SLAB = registerBrickBlock("cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block WHITE_CRACKED_BRICK_SLAB = registerBrickBlock("white_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_CRACKED_BRICK_SLAB = registerBrickBlock("orange_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_CRACKED_BRICK_SLAB = registerBrickBlock("pink_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_CRACKED_BRICK_SLAB = registerBrickBlock("yellow_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_CRACKED_BRICK_SLAB = registerBrickBlock("lime_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_CRACKED_BRICK_SLAB = registerBrickBlock("green_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CRACKED_BRICK_SLAB = registerBrickBlock("light_blue_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_CRACKED_BRICK_SLAB = registerBrickBlock("cyan_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_CRACKED_BRICK_SLAB = registerBrickBlock("blue_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_CRACKED_BRICK_SLAB = registerBrickBlock("magenta_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_CRACKED_BRICK_SLAB = registerBrickBlock("purple_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_CRACKED_BRICK_SLAB = registerBrickBlock("brown_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CRACKED_BRICK_SLAB = registerBrickBlock("light_gray_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_CRACKED_BRICK_SLAB = registerBrickBlock("gray_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_CRACKED_BRICK_SLAB = registerBrickBlock("black_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_CRACKED_BRICK_SLAB = registerBrickBlock("red_cracked_brick_slab", new SlabBlock(BRICK_SETTINGS), BUILDING_BLOCKS);

    // Cracked Stairs

    public static final Block CRACKED_BRICK_STAIRS = registerBrickBlock("cracked_brick_stairs", new ModStairsBlock(CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block WHITE_CRACKED_BRICK_STAIRS = registerBrickBlock("white_cracked_brick_stairs", new ModStairsBlock(ModBlocks.WHITE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_CRACKED_BRICK_STAIRS = registerBrickBlock("orange_cracked_brick_stairs", new ModStairsBlock(ModBlocks.ORANGE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_CRACKED_BRICK_STAIRS = registerBrickBlock("pink_cracked_brick_stairs", new ModStairsBlock(ModBlocks.PINK_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_CRACKED_BRICK_STAIRS = registerBrickBlock("yellow_cracked_brick_stairs", new ModStairsBlock(ModBlocks.YELLOW_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_CRACKED_BRICK_STAIRS = registerBrickBlock("lime_cracked_brick_stairs", new ModStairsBlock(ModBlocks.LIME_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_CRACKED_BRICK_STAIRS = registerBrickBlock("green_cracked_brick_stairs", new ModStairsBlock(ModBlocks.GREEN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CRACKED_BRICK_STAIRS = registerBrickBlock("light_blue_cracked_brick_stairs", new ModStairsBlock(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_CRACKED_BRICK_STAIRS = registerBrickBlock("cyan_cracked_brick_stairs", new ModStairsBlock(ModBlocks.CYAN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_CRACKED_BRICK_STAIRS = registerBrickBlock("blue_cracked_brick_stairs", new ModStairsBlock(ModBlocks.BLUE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_CRACKED_BRICK_STAIRS = registerBrickBlock("magenta_cracked_brick_stairs", new ModStairsBlock(ModBlocks.MAGENTA_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_CRACKED_BRICK_STAIRS = registerBrickBlock("purple_cracked_brick_stairs", new ModStairsBlock(ModBlocks.PURPLE_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_CRACKED_BRICK_STAIRS = registerBrickBlock("brown_cracked_brick_stairs", new ModStairsBlock(ModBlocks.BROWN_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CRACKED_BRICK_STAIRS = registerBrickBlock("light_gray_cracked_brick_stairs", new ModStairsBlock(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_CRACKED_BRICK_STAIRS = registerBrickBlock("gray_cracked_brick_stairs", new ModStairsBlock(ModBlocks.GRAY_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_CRACKED_BRICK_STAIRS = registerBrickBlock("black_cracked_brick_stairs", new ModStairsBlock(ModBlocks.BLACK_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_CRACKED_BRICK_STAIRS = registerBrickBlock("red_cracked_brick_stairs", new ModStairsBlock(ModBlocks.RED_CRACKED_BRICKS.getDefaultState(), BRICK_SETTINGS), BUILDING_BLOCKS);

    // Cracked Walls

    public static final Block CRACKED_BRICK_WALL = registerBrickBlock("cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block WHITE_CRACKED_BRICK_WALL = registerBrickBlock("white_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block ORANGE_CRACKED_BRICK_WALL = registerBrickBlock("orange_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block PINK_CRACKED_BRICK_WALL = registerBrickBlock("pink_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block YELLOW_CRACKED_BRICK_WALL = registerBrickBlock("yellow_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIME_CRACKED_BRICK_WALL = registerBrickBlock("lime_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block GREEN_CRACKED_BRICK_WALL = registerBrickBlock("green_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIGHT_BLUE_CRACKED_BRICK_WALL = registerBrickBlock("light_blue_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block CYAN_CRACKED_BRICK_WALL = registerBrickBlock("cyan_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BLUE_CRACKED_BRICK_WALL = registerBrickBlock("blue_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block MAGENTA_CRACKED_BRICK_WALL = registerBrickBlock("magenta_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block PURPLE_CRACKED_BRICK_WALL = registerBrickBlock("purple_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BROWN_CRACKED_BRICK_WALL = registerBrickBlock("brown_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block GRAY_CRACKED_BRICK_WALL = registerBrickBlock("gray_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block LIGHT_GRAY_CRACKED_BRICK_WALL = registerBrickBlock("light_gray_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block BLACK_CRACKED_BRICK_WALL = registerBrickBlock("black_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);
    public static final Block RED_CRACKED_BRICK_WALL = registerBrickBlock("red_cracked_brick_wall", new WallBlock(BRICK_SETTINGS), DECORATIONS);

    // Chiseled Bricks
    public static final Block CHISELED_BRICKS = registerBrickBlock("chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block WHITE_CHISELED_BRICKS = registerBrickBlock("white_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block ORANGE_CHISELED_BRICKS = registerBrickBlock("orange_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PINK_CHISELED_BRICKS = registerBrickBlock("pink_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block YELLOW_CHISELED_BRICKS = registerBrickBlock("yellow_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIME_CHISELED_BRICKS = registerBrickBlock("lime_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GREEN_CHISELED_BRICKS = registerBrickBlock("green_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CHISELED_BRICKS = registerBrickBlock("light_blue_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block CYAN_CHISELED_BRICKS = registerBrickBlock("cyan_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLUE_CHISELED_BRICKS = registerBrickBlock("blue_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block MAGENTA_CHISELED_BRICKS = registerBrickBlock("magenta_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block PURPLE_CHISELED_BRICKS = registerBrickBlock("purple_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BROWN_CHISELED_BRICKS = registerBrickBlock("brown_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block GRAY_CHISELED_BRICKS = registerBrickBlock("gray_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CHISELED_BRICKS = registerBrickBlock("light_gray_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block BLACK_CHISELED_BRICKS = registerBrickBlock("black_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);
    public static final Block RED_CHISELED_BRICKS = registerBrickBlock("red_chiseled_bricks", new Block(BRICK_SETTINGS), BUILDING_BLOCKS);

    // Flower Pots
    public static final Block WHITE_FLOWER_POT = registerBrickBlock("white_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.WHITE), DECORATIONS);
    public static final Block ORANGE_FLOWER_POT = registerBrickBlock("orange_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.ORANGE), DECORATIONS);
    public static final Block PINK_FLOWER_POT = registerBrickBlock("pink_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.PINK), DECORATIONS);
    public static final Block YELLOW_FLOWER_POT = registerBrickBlock("yellow_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.YELLOW), DECORATIONS);
    public static final Block LIME_FLOWER_POT = registerBrickBlock("lime_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.LIME), DECORATIONS);
    public static final Block GREEN_FLOWER_POT = registerBrickBlock("green_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.GREEN), DECORATIONS);
    public static final Block LIGHT_BLUE_FLOWER_POT = registerBrickBlock("light_blue_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.LIGHT_BLUE), DECORATIONS);
    public static final Block CYAN_FLOWER_POT = registerBrickBlock("cyan_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.CYAN), DECORATIONS);
    public static final Block BLUE_FLOWER_POT = registerBrickBlock("blue_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.BLUE), DECORATIONS);
    public static final Block MAGENTA_FLOWER_POT = registerBrickBlock("magenta_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.MAGENTA), DECORATIONS);
    public static final Block PURPLE_FLOWER_POT = registerBrickBlock("purple_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.PURPLE), DECORATIONS);
    public static final Block BROWN_FLOWER_POT = registerBrickBlock("brown_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.BROWN), DECORATIONS);
    public static final Block LIGHT_GRAY_FLOWER_POT = registerBrickBlock("light_gray_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.LIGHT_GRAY), DECORATIONS);
    public static final Block GRAY_FLOWER_POT = registerBrickBlock("gray_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.GRAY), DECORATIONS);
    public static final Block BLACK_FLOWER_POT = registerBrickBlock("black_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.BLACK), DECORATIONS);
    public static final Block RED_FLOWER_POT = registerBrickBlock("red_flower_pot", new ModFlowerPotBlock(Blocks.AIR, POT_SETTINGS, DyeColor.RED), DECORATIONS);

    private static void registerPottedFlowers(){
        for (PottedContent content : PottedContent.values()) {
            Block flower = content.getFlowerBlock();
            String white_name = Registry.ITEM.getId(WHITE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String orange_name = Registry.ITEM.getId(ORANGE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String pink_name = Registry.ITEM.getId(PINK_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String yellow_name = Registry.ITEM.getId(YELLOW_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String lime_name = Registry.ITEM.getId(LIME_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String green_name = Registry.ITEM.getId(GREEN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String light_blue_name = Registry.ITEM.getId(LIGHT_BLUE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String cyan_name = Registry.ITEM.getId(CYAN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String blue_name = Registry.ITEM.getId(BLUE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String magenta_name = Registry.ITEM.getId(MAGENTA_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String purple_name = Registry.ITEM.getId(PURPLE_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String brown_name = Registry.ITEM.getId(BROWN_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String light_gray_name = Registry.ITEM.getId(LIGHT_GRAY_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String gray_name = Registry.ITEM.getId(GRAY_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String black_name = Registry.ITEM.getId(BLACK_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
            String red_name = Registry.ITEM.getId(RED_FLOWER_POT.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();

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
        return Registry.register(Registry.BLOCK, new Identifier(ColoredBricks.MOD_ID, name), new ModFlowerPotBlock(content, POT_SETTINGS, color));
    }

    private static Block registerBrickBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ColoredBricks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ColoredBricks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ColoredBricks.LOGGER.info("Registering Mod Blocks for " + ColoredBricks.MOD_ID);

        ColoredBricks.LOGGER.info("Registering Potted Plants");
        registerPottedFlowers();
    }
}