package net.Pinary_Pi.coloredbricks.setup;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    // Blocks

    public static final RegistryObject<Block> WHITE_BRICKS = register("white_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> ORANGE_BRICKS = register("orange_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PINK_BRICKS = register("pink_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> YELLOW_BRICKS = register("yellow_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIME_BRICKS = register("lime_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GREEN_BRICKS = register("green_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS = register("light_blue_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> CYAN_BRICKS = register("cyan_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLUE_BRICKS = register("blue_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> MAGENTA_BRICKS = register("magenta_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PURPLE_BRICKS = register("purple_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BROWN_BRICKS = register("brown_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GRAY_BRICKS = register("gray_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = register("light_gray_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLACK_BRICKS = register("black_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> RED_BRICKS = register("red_bricks", () -> getBlockBrick());

    // Slabs

    public static final RegistryObject<SlabBlock> WHITE_BRICK_SLAB = register("white_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> ORANGE_BRICK_SLAB = register("orange_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> PINK_BRICK_SLAB = register("pink_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> YELLOW_BRICK_SLAB = register("yellow_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIME_BRICK_SLAB = register("lime_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> GREEN_BRICK_SLAB = register("green_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> CYAN_BRICK_SLAB = register("cyan_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BLUE_BRICK_SLAB = register("blue_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> MAGENTA_BRICK_SLAB = register("magenta_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> PURPLE_BRICK_SLAB = register("purple_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BROWN_BRICK_SLAB = register("brown_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> GRAY_BRICK_SLAB = register("gray_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BLACK_BRICK_SLAB = register("black_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> RED_BRICK_SLAB = register("red_brick_slab", () -> getSlabBrick());
    
    // Stairs

    public static final Supplier<BlockState> STAIR_BLOCKSTATE_WHITE = () -> WHITE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_ORANGE = () -> ORANGE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_PINK = () -> PINK_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_YELLOW = () -> YELLOW_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIME = () -> LIME_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_GREEN = () -> GREEN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CYAN = () -> CYAN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIGHT_BLUE = () -> LIGHT_BLUE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BLUE = () -> BLUE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_MAGENTA = () -> MAGENTA_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_PURPLE = () -> PURPLE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BROWN = () -> BROWN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIGHT_GRAY = () -> LIGHT_GRAY_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_GRAY = () -> GRAY_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BLACK = () -> BLACK_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_RED = () -> RED_BRICKS.get().defaultBlockState();

    public static final RegistryObject<StairBlock> WHITE_BRICK_STAIRS = register("white_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_WHITE));
    public static final RegistryObject<StairBlock> ORANGE_BRICK_STAIRS = register("orange_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_ORANGE));
    public static final RegistryObject<StairBlock> PINK_BRICK_STAIRS = register("pink_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_PINK));
    public static final RegistryObject<StairBlock> YELLOW_BRICK_STAIRS = register("yellow_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_YELLOW));
    public static final RegistryObject<StairBlock> LIME_BRICK_STAIRS = register("lime_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIME));
    public static final RegistryObject<StairBlock> GREEN_BRICK_STAIRS = register("green_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_GREEN));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIGHT_BLUE));
    public static final RegistryObject<StairBlock> CYAN_BRICK_STAIRS = register("cyan_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CYAN));
    public static final RegistryObject<StairBlock> BLUE_BRICK_STAIRS = register("blue_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BLUE));
    public static final RegistryObject<StairBlock> MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_MAGENTA));
    public static final RegistryObject<StairBlock> PURPLE_BRICK_STAIRS = register("purple_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_PURPLE));
    public static final RegistryObject<StairBlock> BROWN_BRICK_STAIRS = register("brown_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BROWN));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIGHT_GRAY));
    public static final RegistryObject<StairBlock> GRAY_BRICK_STAIRS = register("gray_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_GRAY));
    public static final RegistryObject<StairBlock> BLACK_BRICK_STAIRS = register("black_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BLACK));
    public static final RegistryObject<StairBlock> RED_BRICK_STAIRS = register("red_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_RED));

    // Wall

    public static final RegistryObject<WallBlock> WHITE_BRICK_WALL = register("white_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> ORANGE_BRICK_WALL = register("orange_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> PINK_BRICK_WALL = register("pink_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> YELLOW_BRICK_WALL = register("yellow_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> LIME_BRICK_WALL = register("lime_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> GREEN_BRICK_WALL = register("green_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> CYAN_BRICK_WALL = register("cyan_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> BLUE_BRICK_WALL = register("blue_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> MAGENTA_BRICK_WALL = register("magenta_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> PURPLE_BRICK_WALL = register("purple_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> BROWN_BRICK_WALL = register("brown_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> GRAY_BRICK_WALL = register("gray_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> BLACK_BRICK_WALL = register("black_brick_wall", () -> getWallBrick());
    public static final RegistryObject<WallBlock> RED_BRICK_WALL = register("red_brick_wall", () -> getWallBrick());

    // Cracked Bricks

    public static final RegistryObject<Block> CRACKED_BRICKS = register("cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> WHITE_CRACKED_BRICKS = register("white_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> ORANGE_CRACKED_BRICKS = register("orange_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PINK_CRACKED_BRICKS = register("pink_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> YELLOW_CRACKED_BRICKS = register("yellow_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIME_CRACKED_BRICKS = register("lime_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GREEN_CRACKED_BRICKS = register("green_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_BLUE_CRACKED_BRICKS = register("light_blue_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> CYAN_CRACKED_BRICKS = register("cyan_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLUE_CRACKED_BRICKS = register("blue_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> MAGENTA_CRACKED_BRICKS = register("magenta_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PURPLE_CRACKED_BRICKS = register("purple_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BROWN_CRACKED_BRICKS = register("brown_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_GRAY_CRACKED_BRICKS = register("light_gray_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GRAY_CRACKED_BRICKS = register("gray_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLACK_CRACKED_BRICKS = register("black_cracked_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> RED_CRACKED_BRICKS = register("red_cracked_bricks", () -> getBlockBrick());

    // Cracked Slabs

    public static final RegistryObject<SlabBlock> CRACKED_BRICK_SLAB = register("cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> WHITE_CRACKED_BRICK_SLAB = register("white_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> ORANGE_CRACKED_BRICK_SLAB = register("orange_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> PINK_CRACKED_BRICK_SLAB = register("pink_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> YELLOW_CRACKED_BRICK_SLAB = register("yellow_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIME_CRACKED_BRICK_SLAB = register("lime_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> GREEN_CRACKED_BRICK_SLAB = register("green_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> CYAN_CRACKED_BRICK_SLAB = register("cyan_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CRACKED_BRICK_SLAB = register("light_blue_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BLUE_CRACKED_BRICK_SLAB = register("blue_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> MAGENTA_CRACKED_BRICK_SLAB = register("magenta_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> PURPLE_CRACKED_BRICK_SLAB = register("purple_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BROWN_CRACKED_BRICK_SLAB = register("brown_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CRACKED_BRICK_SLAB = register("light_gray_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> GRAY_CRACKED_BRICK_SLAB = register("gray_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> BLACK_CRACKED_BRICK_SLAB = register("black_cracked_brick_slab", () -> getSlabBrick());
    public static final RegistryObject<SlabBlock> RED_CRACKED_BRICK_SLAB = register("red_cracked_brick_slab", () -> getSlabBrick());

    // Cracked Stairs

    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED = () -> CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_WHITE = () -> WHITE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_ORANGE = () -> ORANGE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_PINK = () -> PINK_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_YELLOW = () -> YELLOW_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIME = () -> LIME_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_GREEN = () -> GREEN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIGHT_BLUE = () -> LIGHT_BLUE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_CYAN = () -> CYAN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BLUE = () -> BLUE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_MAGENTA = () -> MAGENTA_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_PURPLE = () -> PURPLE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BROWN = () -> BROWN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIGHT_GRAY = () -> LIGHT_GRAY_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_GRAY = () -> GRAY_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BLACK = () -> BLACK_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_RED = () -> RED_CRACKED_BRICKS.get().defaultBlockState();
    
    public static final RegistryObject<StairBlock> CRACKED_BRICK_STAIRS = register("cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED));
    public static final RegistryObject<StairBlock> WHITE_CRACKED_BRICK_STAIRS = register("white_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_WHITE));
    public static final RegistryObject<StairBlock> ORANGE_CRACKED_BRICK_STAIRS = register("orange_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_ORANGE));
    public static final RegistryObject<StairBlock> PINK_CRACKED_BRICK_STAIRS = register("pink_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_PINK));
    public static final RegistryObject<StairBlock> YELLOW_CRACKED_BRICK_STAIRS = register("yellow_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_YELLOW));
    public static final RegistryObject<StairBlock> LIME_CRACKED_BRICK_STAIRS = register("lime_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIME));
    public static final RegistryObject<StairBlock> GREEN_CRACKED_BRICK_STAIRS = register("green_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_GREEN));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CRACKED_BRICK_STAIRS = register("light_blue_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIGHT_BLUE));
    public static final RegistryObject<StairBlock> CYAN_CRACKED_BRICK_STAIRS = register("cyan_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_CYAN));
    public static final RegistryObject<StairBlock> BLUE_CRACKED_BRICK_STAIRS = register("blue_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BLUE));
    public static final RegistryObject<StairBlock> MAGENTA_CRACKED_BRICK_STAIRS = register("magenta_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_MAGENTA));
    public static final RegistryObject<StairBlock> PURPLE_CRACKED_BRICK_STAIRS = register("purple_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_PURPLE));
    public static final RegistryObject<StairBlock> BROWN_CRACKED_BRICK_STAIRS = register("brown_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BROWN));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CRACKED_BRICK_STAIRS = register("light_gray_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIGHT_GRAY));
    public static final RegistryObject<StairBlock> GRAY_CRACKED_BRICK_STAIRS = register("gray_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_GRAY));
    public static final RegistryObject<StairBlock> BLACK_CRACKED_BRICK_STAIRS = register("black_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BLACK));
    public static final RegistryObject<StairBlock> RED_CRACKED_BRICK_STAIRS = register("red_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_RED));

    // Cracked Brick Wall

    public static final RegistryObject<WallBlock> CRACKED_BRICK_WALL = register("cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> WHITE_CRACKED_BRICK_WALL = register("white_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> ORANGE_CRACKED_BRICK_WALL = register("orange_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> PINK_CRACKED_BRICK_WALL = register("pink_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> YELLOW_CRACKED_BRICK_WALL = register("yellow_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> LIME_CRACKED_BRICK_WALL = register("lime_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> GREEN_CRACKED_BRICK_WALL = register("green_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CRACKED_BRICK_WALL = register("light_blue_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> CYAN_CRACKED_BRICK_WALL = register("cyan_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> BLUE_CRACKED_BRICK_WALL = register("blue_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> MAGENTA_CRACKED_BRICK_WALL = register("magenta_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> PURPLE_CRACKED_BRICK_WALL = register("purple_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> BROWN_CRACKED_BRICK_WALL = register("brown_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CRACKED_BRICK_WALL = register("light_gray_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> GRAY_CRACKED_BRICK_WALL = register("gray_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> BLACK_CRACKED_BRICK_WALL = register("black_cracked_brick_wall", () ->  getWallBrick());
    public static final RegistryObject<WallBlock> RED_CRACKED_BRICK_WALL = register("red_cracked_brick_wall", () ->  getWallBrick());

    // Chiseled Blocks

    public static final RegistryObject<Block> CHISELED_BRICKS = register("chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> WHITE_CHISELED_BRICKS = register("white_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> ORANGE_CHISELED_BRICKS = register("orange_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PINK_CHISELED_BRICKS = register("pink_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> YELLOW_CHISELED_BRICKS = register("yellow_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIME_CHISELED_BRICKS = register("lime_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GREEN_CHISELED_BRICKS = register("green_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_BLUE_CHISELED_BRICKS = register("light_blue_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> CYAN_CHISELED_BRICKS = register("cyan_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLUE_CHISELED_BRICKS = register("blue_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> MAGENTA_CHISELED_BRICKS = register("magenta_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> PURPLE_CHISELED_BRICKS = register("purple_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BROWN_CHISELED_BRICKS = register("brown_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> GRAY_CHISELED_BRICKS = register("gray_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> LIGHT_GRAY_CHISELED_BRICKS = register("light_gray_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> BLACK_CHISELED_BRICKS = register("black_chiseled_bricks", () -> getBlockBrick());
    public static final RegistryObject<Block> RED_CHISELED_BRICKS = register("red_chiseled_bricks", () -> getBlockBrick());

    static void register() {}

    private static Block getBlockBrick() {
        return new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS));
    }

    private static StairBlock getStairsBrick(Supplier<BlockState> state) {
        return new StairBlock(state, BlockBehaviour.Properties.copy(Blocks.BRICKS));
    }

    private static SlabBlock getSlabBrick() {
        return new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS));
    }

    private static WallBlock getWallBrick() {
        return new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS));
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}