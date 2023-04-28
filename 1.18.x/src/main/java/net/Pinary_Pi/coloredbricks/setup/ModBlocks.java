package net.Pinary_Pi.coloredbricks.setup;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import javax.annotation.Nullable;

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

    // Flower Pots

    public static final RegistryObject<FlowerPotBlock> WHITE_FLOWER_POT = register("white_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_OAK_SAPLING = registerNoItem("white_potted_oak_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_SPRUCE_SAPLING = registerNoItem("white_potted_spruce_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BIRCH_SAPLING = registerNoItem("white_potted_birch_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_JUNGLE_SAPLING = registerNoItem("white_potted_jungle_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ACACIA_SAPLING = registerNoItem("white_potted_acacia_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DARK_OAK_SAPLING = registerNoItem("white_potted_dark_oak_sapling", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_FERN = registerNoItem("white_potted_fern", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DANDELION = registerNoItem("white_potted_dandelion", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_POPPY = registerNoItem("white_potted_poppy", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BLUE_ORCHID = registerNoItem("white_potted_blue_orchid", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ALLIUM = registerNoItem("white_potted_allium", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_AZURE_BLUET = registerNoItem("white_potted_azure_bluet", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_RED_TULIP = registerNoItem("white_potted_red_tulip", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ORANGE_TULIP = registerNoItem("white_potted_orange_tulip", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WHITE_TULIP = registerNoItem("white_potted_white_tulip", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_PINK_TULIP = registerNoItem("white_potted_pink_tulip", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_OXEYE_DAISY = registerNoItem("white_potted_oxeye_daisy", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CORNFLOWER = registerNoItem("white_potted_cornflower", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_LILY_OF_THE_VALLEY = registerNoItem("white_potted_lily_of_the_valley", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WITHER_ROSE = registerNoItem("white_potted_wither_rose", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_RED_MUSHROOM = registerNoItem("white_potted_red_mushroom", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BROWN_MUSHROOM = registerNoItem("white_potted_brown_mushroom", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DEAD_BUSH = registerNoItem("white_potted_dead_bush", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CACTUS = registerNoItem("white_potted_cactus", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BAMBOO = registerNoItem("white_potted_bamboo", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CRIMSON_FUNGUS = registerNoItem("white_potted_crimson_fungus", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WARPED_FUNGUS = registerNoItem("white_potted_warped_fungus", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CRIMSON_ROOTS = registerNoItem("white_potted_crimson_roots", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WARPED_ROOTS = registerNoItem("white_potted_warped_roots", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_AZALEA = registerNoItem("white_potted_azalea_bush", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_FLOWERING_AZALEA = registerNoItem("white_potted_flowering_azalea_bush", () -> getFlowerPot(() -> WHITE_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> ORANGE_FLOWER_POT = register("orange_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_OAK_SAPLING = registerNoItem("orange_potted_oak_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_SPRUCE_SAPLING = registerNoItem("orange_potted_spruce_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BIRCH_SAPLING = registerNoItem("orange_potted_birch_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_JUNGLE_SAPLING = registerNoItem("orange_potted_jungle_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ACACIA_SAPLING = registerNoItem("orange_potted_acacia_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DARK_OAK_SAPLING = registerNoItem("orange_potted_dark_oak_sapling", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_FERN = registerNoItem("orange_potted_fern", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DANDELION = registerNoItem("orange_potted_dandelion", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_POPPY = registerNoItem("orange_potted_poppy", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BLUE_ORCHID = registerNoItem("orange_potted_blue_orchid", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ALLIUM = registerNoItem("orange_potted_allium", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_AZURE_BLUET = registerNoItem("orange_potted_azure_bluet", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_RED_TULIP = registerNoItem("orange_potted_red_tulip", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ORANGE_TULIP = registerNoItem("orange_potted_orange_tulip", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WHITE_TULIP = registerNoItem("orange_potted_white_tulip", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_PINK_TULIP = registerNoItem("orange_potted_pink_tulip", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_OXEYE_DAISY = registerNoItem("orange_potted_oxeye_daisy", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CORNFLOWER = registerNoItem("orange_potted_cornflower", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_LILY_OF_THE_VALLEY = registerNoItem("orange_potted_lily_of_the_valley", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WITHER_ROSE = registerNoItem("orange_potted_wither_rose", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_RED_MUSHROOM = registerNoItem("orange_potted_red_mushroom", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BROWN_MUSHROOM = registerNoItem("orange_potted_brown_mushroom", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DEAD_BUSH = registerNoItem("orange_potted_dead_bush", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CACTUS = registerNoItem("orange_potted_cactus", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BAMBOO = registerNoItem("orange_potted_bamboo", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CRIMSON_FUNGUS = registerNoItem("orange_potted_crimson_fungus", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WARPED_FUNGUS = registerNoItem("orange_potted_warped_fungus", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CRIMSON_ROOTS = registerNoItem("orange_potted_crimson_roots", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WARPED_ROOTS = registerNoItem("orange_potted_warped_roots", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_AZALEA = registerNoItem("orange_potted_azalea_bush", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_FLOWERING_AZALEA = registerNoItem("orange_potted_flowering_azalea_bush", () -> getFlowerPot(() -> ORANGE_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> PINK_FLOWER_POT = register("pink_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_OAK_SAPLING = registerNoItem("pink_potted_oak_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_SPRUCE_SAPLING = registerNoItem("pink_potted_spruce_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BIRCH_SAPLING = registerNoItem("pink_potted_birch_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_JUNGLE_SAPLING = registerNoItem("pink_potted_jungle_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ACACIA_SAPLING = registerNoItem("pink_potted_acacia_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DARK_OAK_SAPLING = registerNoItem("pink_potted_dark_oak_sapling", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_FERN = registerNoItem("pink_potted_fern", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DANDELION = registerNoItem("pink_potted_dandelion", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_POPPY = registerNoItem("pink_potted_poppy", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BLUE_ORCHID = registerNoItem("pink_potted_blue_orchid", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ALLIUM = registerNoItem("pink_potted_allium", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_AZURE_BLUET = registerNoItem("pink_potted_azure_bluet", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_RED_TULIP = registerNoItem("pink_potted_red_tulip", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ORANGE_TULIP = registerNoItem("pink_potted_orange_tulip", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WHITE_TULIP = registerNoItem("pink_potted_white_tulip", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_PINK_TULIP = registerNoItem("pink_potted_pink_tulip", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_OXEYE_DAISY = registerNoItem("pink_potted_oxeye_daisy", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CORNFLOWER = registerNoItem("pink_potted_cornflower", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_LILY_OF_THE_VALLEY = registerNoItem("pink_potted_lily_of_the_valley", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WITHER_ROSE = registerNoItem("pink_potted_wither_rose", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_RED_MUSHROOM = registerNoItem("pink_potted_red_mushroom", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BROWN_MUSHROOM = registerNoItem("pink_potted_brown_mushroom", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DEAD_BUSH = registerNoItem("pink_potted_dead_bush", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CACTUS = registerNoItem("pink_potted_cactus", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BAMBOO = registerNoItem("pink_potted_bamboo", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CRIMSON_FUNGUS = registerNoItem("pink_potted_crimson_fungus", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WARPED_FUNGUS = registerNoItem("pink_potted_warped_fungus", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CRIMSON_ROOTS = registerNoItem("pink_potted_crimson_roots", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WARPED_ROOTS = registerNoItem("pink_potted_warped_roots", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_AZALEA = registerNoItem("pink_potted_azalea_bush", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_FLOWERING_AZALEA = registerNoItem("pink_potted_flowering_azalea_bush", () -> getFlowerPot(() -> PINK_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> YELLOW_FLOWER_POT = register("yellow_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_OAK_SAPLING = registerNoItem("yellow_potted_oak_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_SPRUCE_SAPLING = registerNoItem("yellow_potted_spruce_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BIRCH_SAPLING = registerNoItem("yellow_potted_birch_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_JUNGLE_SAPLING = registerNoItem("yellow_potted_jungle_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ACACIA_SAPLING = registerNoItem("yellow_potted_acacia_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DARK_OAK_SAPLING = registerNoItem("yellow_potted_dark_oak_sapling", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_FERN = registerNoItem("yellow_potted_fern", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DANDELION = registerNoItem("yellow_potted_dandelion", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_POPPY = registerNoItem("yellow_potted_poppy", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BLUE_ORCHID = registerNoItem("yellow_potted_blue_orchid", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ALLIUM = registerNoItem("yellow_potted_allium", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_AZURE_BLUET = registerNoItem("yellow_potted_azure_bluet", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_RED_TULIP = registerNoItem("yellow_potted_red_tulip", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ORANGE_TULIP = registerNoItem("yellow_potted_orange_tulip", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WHITE_TULIP = registerNoItem("yellow_potted_white_tulip", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_PINK_TULIP = registerNoItem("yellow_potted_pink_tulip", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_OXEYE_DAISY = registerNoItem("yellow_potted_oxeye_daisy", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CORNFLOWER = registerNoItem("yellow_potted_cornflower", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_LILY_OF_THE_VALLEY = registerNoItem("yellow_potted_lily_of_the_valley", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WITHER_ROSE = registerNoItem("yellow_potted_wither_rose", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_RED_MUSHROOM = registerNoItem("yellow_potted_red_mushroom", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BROWN_MUSHROOM = registerNoItem("yellow_potted_brown_mushroom", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DEAD_BUSH = registerNoItem("yellow_potted_dead_bush", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CACTUS = registerNoItem("yellow_potted_cactus", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BAMBOO = registerNoItem("yellow_potted_bamboo", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CRIMSON_FUNGUS = registerNoItem("yellow_potted_crimson_fungus", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WARPED_FUNGUS = registerNoItem("yellow_potted_warped_fungus", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CRIMSON_ROOTS = registerNoItem("yellow_potted_crimson_roots", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WARPED_ROOTS = registerNoItem("yellow_potted_warped_roots", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_AZALEA = registerNoItem("yellow_potted_azalea_bush", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_FLOWERING_AZALEA = registerNoItem("yellow_potted_flowering_azalea_bush", () -> getFlowerPot(() -> YELLOW_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> LIME_FLOWER_POT = register("lime_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_OAK_SAPLING = registerNoItem("lime_potted_oak_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_SPRUCE_SAPLING = registerNoItem("lime_potted_spruce_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BIRCH_SAPLING = registerNoItem("lime_potted_birch_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_JUNGLE_SAPLING = registerNoItem("lime_potted_jungle_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ACACIA_SAPLING = registerNoItem("lime_potted_acacia_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DARK_OAK_SAPLING = registerNoItem("lime_potted_dark_oak_sapling", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_FERN = registerNoItem("lime_potted_fern", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DANDELION = registerNoItem("lime_potted_dandelion", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_POPPY = registerNoItem("lime_potted_poppy", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BLUE_ORCHID = registerNoItem("lime_potted_blue_orchid", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ALLIUM = registerNoItem("lime_potted_allium", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_AZURE_BLUET = registerNoItem("lime_potted_azure_bluet", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_RED_TULIP = registerNoItem("lime_potted_red_tulip", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ORANGE_TULIP = registerNoItem("lime_potted_orange_tulip", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WHITE_TULIP = registerNoItem("lime_potted_white_tulip", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_PINK_TULIP = registerNoItem("lime_potted_pink_tulip", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_OXEYE_DAISY = registerNoItem("lime_potted_oxeye_daisy", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CORNFLOWER = registerNoItem("lime_potted_cornflower", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_LILY_OF_THE_VALLEY = registerNoItem("lime_potted_lily_of_the_valley", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WITHER_ROSE = registerNoItem("lime_potted_wither_rose", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_RED_MUSHROOM = registerNoItem("lime_potted_red_mushroom", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BROWN_MUSHROOM = registerNoItem("lime_potted_brown_mushroom", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DEAD_BUSH = registerNoItem("lime_potted_dead_bush", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CACTUS = registerNoItem("lime_potted_cactus", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BAMBOO = registerNoItem("lime_potted_bamboo", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CRIMSON_FUNGUS = registerNoItem("lime_potted_crimson_fungus", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WARPED_FUNGUS = registerNoItem("lime_potted_warped_fungus", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CRIMSON_ROOTS = registerNoItem("lime_potted_crimson_roots", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WARPED_ROOTS = registerNoItem("lime_potted_warped_roots", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_AZALEA = registerNoItem("lime_potted_azalea_bush", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_FLOWERING_AZALEA = registerNoItem("lime_potted_flowering_azalea_bush", () -> getFlowerPot(() -> LIME_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> GREEN_FLOWER_POT = register("green_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_OAK_SAPLING = registerNoItem("green_potted_oak_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_SPRUCE_SAPLING = registerNoItem("green_potted_spruce_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BIRCH_SAPLING = registerNoItem("green_potted_birch_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_JUNGLE_SAPLING = registerNoItem("green_potted_jungle_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ACACIA_SAPLING = registerNoItem("green_potted_acacia_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DARK_OAK_SAPLING = registerNoItem("green_potted_dark_oak_sapling", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_FERN = registerNoItem("green_potted_fern", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DANDELION = registerNoItem("green_potted_dandelion", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_POPPY = registerNoItem("green_potted_poppy", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BLUE_ORCHID = registerNoItem("green_potted_blue_orchid", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ALLIUM = registerNoItem("green_potted_allium", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_AZURE_BLUET = registerNoItem("green_potted_azure_bluet", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_RED_TULIP = registerNoItem("green_potted_red_tulip", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ORANGE_TULIP = registerNoItem("green_potted_orange_tulip", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WHITE_TULIP = registerNoItem("green_potted_white_tulip", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_PINK_TULIP = registerNoItem("green_potted_pink_tulip", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_OXEYE_DAISY = registerNoItem("green_potted_oxeye_daisy", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CORNFLOWER = registerNoItem("green_potted_cornflower", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_LILY_OF_THE_VALLEY = registerNoItem("green_potted_lily_of_the_valley", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WITHER_ROSE = registerNoItem("green_potted_wither_rose", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_RED_MUSHROOM = registerNoItem("green_potted_red_mushroom", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BROWN_MUSHROOM = registerNoItem("green_potted_brown_mushroom", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DEAD_BUSH = registerNoItem("green_potted_dead_bush", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CACTUS = registerNoItem("green_potted_cactus", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BAMBOO = registerNoItem("green_potted_bamboo", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CRIMSON_FUNGUS = registerNoItem("green_potted_crimson_fungus", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WARPED_FUNGUS = registerNoItem("green_potted_warped_fungus", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CRIMSON_ROOTS = registerNoItem("green_potted_crimson_roots", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WARPED_ROOTS = registerNoItem("green_potted_warped_roots", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_AZALEA = registerNoItem("green_potted_azalea_bush", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_FLOWERING_AZALEA = registerNoItem("green_potted_flowering_azalea_bush", () -> getFlowerPot(() -> GREEN_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_FLOWER_POT = register("light_blue_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_OAK_SAPLING = registerNoItem("light_blue_potted_oak_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_SPRUCE_SAPLING = registerNoItem("light_blue_potted_spruce_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BIRCH_SAPLING = registerNoItem("light_blue_potted_birch_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_JUNGLE_SAPLING = registerNoItem("light_blue_potted_jungle_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ACACIA_SAPLING = registerNoItem("light_blue_potted_acacia_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DARK_OAK_SAPLING = registerNoItem("light_blue_potted_dark_oak_sapling", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_FERN = registerNoItem("light_blue_potted_fern", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DANDELION = registerNoItem("light_blue_potted_dandelion", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_POPPY = registerNoItem("light_blue_potted_poppy", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BLUE_ORCHID = registerNoItem("light_blue_potted_blue_orchid", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ALLIUM = registerNoItem("light_blue_potted_allium", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_AZURE_BLUET = registerNoItem("light_blue_potted_azure_bluet", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_RED_TULIP = registerNoItem("light_blue_potted_red_tulip", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ORANGE_TULIP = registerNoItem("light_blue_potted_orange_tulip", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WHITE_TULIP = registerNoItem("light_blue_potted_white_tulip", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_PINK_TULIP = registerNoItem("light_blue_potted_pink_tulip", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_OXEYE_DAISY = registerNoItem("light_blue_potted_oxeye_daisy", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CORNFLOWER = registerNoItem("light_blue_potted_cornflower", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_LILY_OF_THE_VALLEY = registerNoItem("light_blue_potted_lily_of_the_valley", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WITHER_ROSE = registerNoItem("light_blue_potted_wither_rose", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_RED_MUSHROOM = registerNoItem("light_blue_potted_red_mushroom", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BROWN_MUSHROOM = registerNoItem("light_blue_potted_brown_mushroom", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DEAD_BUSH = registerNoItem("light_blue_potted_dead_bush", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CACTUS = registerNoItem("light_blue_potted_cactus", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BAMBOO = registerNoItem("light_blue_potted_bamboo", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CRIMSON_FUNGUS = registerNoItem("light_blue_potted_crimson_fungus", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WARPED_FUNGUS = registerNoItem("light_blue_potted_warped_fungus", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CRIMSON_ROOTS = registerNoItem("light_blue_potted_crimson_roots", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WARPED_ROOTS = registerNoItem("light_blue_potted_warped_roots", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_AZALEA = registerNoItem("light_blue_potted_azalea_bush", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_FLOWERING_AZALEA = registerNoItem("light_blue_potted_flowering_azalea_bush", () -> getFlowerPot(() -> LIGHT_BLUE_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> CYAN_FLOWER_POT = register("cyan_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_OAK_SAPLING = registerNoItem("cyan_potted_oak_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_SPRUCE_SAPLING = registerNoItem("cyan_potted_spruce_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BIRCH_SAPLING = registerNoItem("cyan_potted_birch_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_JUNGLE_SAPLING = registerNoItem("cyan_potted_jungle_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ACACIA_SAPLING = registerNoItem("cyan_potted_acacia_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DARK_OAK_SAPLING = registerNoItem("cyan_potted_dark_oak_sapling", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_FERN = registerNoItem("cyan_potted_fern", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DANDELION = registerNoItem("cyan_potted_dandelion", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_POPPY = registerNoItem("cyan_potted_poppy", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BLUE_ORCHID = registerNoItem("cyan_potted_blue_orchid", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ALLIUM = registerNoItem("cyan_potted_allium", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_AZURE_BLUET = registerNoItem("cyan_potted_azure_bluet", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_RED_TULIP = registerNoItem("cyan_potted_red_tulip", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ORANGE_TULIP = registerNoItem("cyan_potted_orange_tulip", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WHITE_TULIP = registerNoItem("cyan_potted_white_tulip", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_PINK_TULIP = registerNoItem("cyan_potted_pink_tulip", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_OXEYE_DAISY = registerNoItem("cyan_potted_oxeye_daisy", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CORNFLOWER = registerNoItem("cyan_potted_cornflower", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_LILY_OF_THE_VALLEY = registerNoItem("cyan_potted_lily_of_the_valley", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WITHER_ROSE = registerNoItem("cyan_potted_wither_rose", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_RED_MUSHROOM = registerNoItem("cyan_potted_red_mushroom", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BROWN_MUSHROOM = registerNoItem("cyan_potted_brown_mushroom", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DEAD_BUSH = registerNoItem("cyan_potted_dead_bush", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CACTUS = registerNoItem("cyan_potted_cactus", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BAMBOO = registerNoItem("cyan_potted_bamboo", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CRIMSON_FUNGUS = registerNoItem("cyan_potted_crimson_fungus", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WARPED_FUNGUS = registerNoItem("cyan_potted_warped_fungus", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CRIMSON_ROOTS = registerNoItem("cyan_potted_crimson_roots", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WARPED_ROOTS = registerNoItem("cyan_potted_warped_roots", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_AZALEA = registerNoItem("cyan_potted_azalea_bush", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_FLOWERING_AZALEA = registerNoItem("cyan_potted_flowering_azalea_bush", () -> getFlowerPot(() -> CYAN_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> BLUE_FLOWER_POT = register("blue_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_OAK_SAPLING = registerNoItem("blue_potted_oak_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_SPRUCE_SAPLING = registerNoItem("blue_potted_spruce_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BIRCH_SAPLING = registerNoItem("blue_potted_birch_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_JUNGLE_SAPLING = registerNoItem("blue_potted_jungle_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ACACIA_SAPLING = registerNoItem("blue_potted_acacia_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DARK_OAK_SAPLING = registerNoItem("blue_potted_dark_oak_sapling", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_FERN = registerNoItem("blue_potted_fern", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DANDELION = registerNoItem("blue_potted_dandelion", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_POPPY = registerNoItem("blue_potted_poppy", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BLUE_ORCHID = registerNoItem("blue_potted_blue_orchid", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ALLIUM = registerNoItem("blue_potted_allium", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_AZURE_BLUET = registerNoItem("blue_potted_azure_bluet", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_RED_TULIP = registerNoItem("blue_potted_red_tulip", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ORANGE_TULIP = registerNoItem("blue_potted_orange_tulip", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WHITE_TULIP = registerNoItem("blue_potted_white_tulip", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_PINK_TULIP = registerNoItem("blue_potted_pink_tulip", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_OXEYE_DAISY = registerNoItem("blue_potted_oxeye_daisy", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CORNFLOWER = registerNoItem("blue_potted_cornflower", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_LILY_OF_THE_VALLEY = registerNoItem("blue_potted_lily_of_the_valley", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WITHER_ROSE = registerNoItem("blue_potted_wither_rose", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_RED_MUSHROOM = registerNoItem("blue_potted_red_mushroom", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BROWN_MUSHROOM = registerNoItem("blue_potted_brown_mushroom", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DEAD_BUSH = registerNoItem("blue_potted_dead_bush", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CACTUS = registerNoItem("blue_potted_cactus", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BAMBOO = registerNoItem("blue_potted_bamboo", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CRIMSON_FUNGUS = registerNoItem("blue_potted_crimson_fungus", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WARPED_FUNGUS = registerNoItem("blue_potted_warped_fungus", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CRIMSON_ROOTS = registerNoItem("blue_potted_crimson_roots", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WARPED_ROOTS = registerNoItem("blue_potted_warped_roots", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_AZALEA = registerNoItem("blue_potted_azalea_bush", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_FLOWERING_AZALEA = registerNoItem("blue_potted_flowering_azalea_bush", () -> getFlowerPot(() -> BLUE_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> MAGENTA_FLOWER_POT = register("magenta_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_OAK_SAPLING = registerNoItem("magenta_potted_oak_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_SPRUCE_SAPLING = registerNoItem("magenta_potted_spruce_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BIRCH_SAPLING = registerNoItem("magenta_potted_birch_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_JUNGLE_SAPLING = registerNoItem("magenta_potted_jungle_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ACACIA_SAPLING = registerNoItem("magenta_potted_acacia_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DARK_OAK_SAPLING = registerNoItem("magenta_potted_dark_oak_sapling", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_FERN = registerNoItem("magenta_potted_fern", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DANDELION = registerNoItem("magenta_potted_dandelion", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_POPPY = registerNoItem("magenta_potted_poppy", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BLUE_ORCHID = registerNoItem("magenta_potted_blue_orchid", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ALLIUM = registerNoItem("magenta_potted_allium", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_AZURE_BLUET = registerNoItem("magenta_potted_azure_bluet", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_RED_TULIP = registerNoItem("magenta_potted_red_tulip", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ORANGE_TULIP = registerNoItem("magenta_potted_orange_tulip", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WHITE_TULIP = registerNoItem("magenta_potted_white_tulip", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_PINK_TULIP = registerNoItem("magenta_potted_pink_tulip", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_OXEYE_DAISY = registerNoItem("magenta_potted_oxeye_daisy", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CORNFLOWER = registerNoItem("magenta_potted_cornflower", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_LILY_OF_THE_VALLEY = registerNoItem("magenta_potted_lily_of_the_valley", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WITHER_ROSE = registerNoItem("magenta_potted_wither_rose", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_RED_MUSHROOM = registerNoItem("magenta_potted_red_mushroom", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BROWN_MUSHROOM = registerNoItem("magenta_potted_brown_mushroom", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DEAD_BUSH = registerNoItem("magenta_potted_dead_bush", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CACTUS = registerNoItem("magenta_potted_cactus", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BAMBOO = registerNoItem("magenta_potted_bamboo", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CRIMSON_FUNGUS = registerNoItem("magenta_potted_crimson_fungus", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WARPED_FUNGUS = registerNoItem("magenta_potted_warped_fungus", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CRIMSON_ROOTS = registerNoItem("magenta_potted_crimson_roots", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WARPED_ROOTS = registerNoItem("magenta_potted_warped_roots", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_AZALEA = registerNoItem("magenta_potted_azalea_bush", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_FLOWERING_AZALEA = registerNoItem("magenta_potted_flowering_azalea_bush", () -> getFlowerPot(() -> MAGENTA_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> PURPLE_FLOWER_POT = register("purple_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_OAK_SAPLING = registerNoItem("purple_potted_oak_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_SPRUCE_SAPLING = registerNoItem("purple_potted_spruce_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BIRCH_SAPLING = registerNoItem("purple_potted_birch_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_JUNGLE_SAPLING = registerNoItem("purple_potted_jungle_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ACACIA_SAPLING = registerNoItem("purple_potted_acacia_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DARK_OAK_SAPLING = registerNoItem("purple_potted_dark_oak_sapling", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_FERN = registerNoItem("purple_potted_fern", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DANDELION = registerNoItem("purple_potted_dandelion", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_POPPY = registerNoItem("purple_potted_poppy", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BLUE_ORCHID = registerNoItem("purple_potted_blue_orchid", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ALLIUM = registerNoItem("purple_potted_allium", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_AZURE_BLUET = registerNoItem("purple_potted_azure_bluet", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_RED_TULIP = registerNoItem("purple_potted_red_tulip", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ORANGE_TULIP = registerNoItem("purple_potted_orange_tulip", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WHITE_TULIP = registerNoItem("purple_potted_white_tulip", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_PINK_TULIP = registerNoItem("purple_potted_pink_tulip", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_OXEYE_DAISY = registerNoItem("purple_potted_oxeye_daisy", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CORNFLOWER = registerNoItem("purple_potted_cornflower", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_LILY_OF_THE_VALLEY = registerNoItem("purple_potted_lily_of_the_valley", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WITHER_ROSE = registerNoItem("purple_potted_wither_rose", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_RED_MUSHROOM = registerNoItem("purple_potted_red_mushroom", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BROWN_MUSHROOM = registerNoItem("purple_potted_brown_mushroom", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DEAD_BUSH = registerNoItem("purple_potted_dead_bush", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CACTUS = registerNoItem("purple_potted_cactus", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BAMBOO = registerNoItem("purple_potted_bamboo", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CRIMSON_FUNGUS = registerNoItem("purple_potted_crimson_fungus", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WARPED_FUNGUS = registerNoItem("purple_potted_warped_fungus", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CRIMSON_ROOTS = registerNoItem("purple_potted_crimson_roots", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WARPED_ROOTS = registerNoItem("purple_potted_warped_roots", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_AZALEA = registerNoItem("purple_potted_azalea_bush", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_FLOWERING_AZALEA = registerNoItem("purple_potted_flowering_azalea_bush", () -> getFlowerPot(() -> PURPLE_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> BROWN_FLOWER_POT = register("brown_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_OAK_SAPLING = registerNoItem("brown_potted_oak_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_SPRUCE_SAPLING = registerNoItem("brown_potted_spruce_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BIRCH_SAPLING = registerNoItem("brown_potted_birch_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_JUNGLE_SAPLING = registerNoItem("brown_potted_jungle_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ACACIA_SAPLING = registerNoItem("brown_potted_acacia_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DARK_OAK_SAPLING = registerNoItem("brown_potted_dark_oak_sapling", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_FERN = registerNoItem("brown_potted_fern", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DANDELION = registerNoItem("brown_potted_dandelion", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_POPPY = registerNoItem("brown_potted_poppy", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BLUE_ORCHID = registerNoItem("brown_potted_blue_orchid", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ALLIUM = registerNoItem("brown_potted_allium", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_AZURE_BLUET = registerNoItem("brown_potted_azure_bluet", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_RED_TULIP = registerNoItem("brown_potted_red_tulip", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ORANGE_TULIP = registerNoItem("brown_potted_orange_tulip", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WHITE_TULIP = registerNoItem("brown_potted_white_tulip", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_PINK_TULIP = registerNoItem("brown_potted_pink_tulip", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_OXEYE_DAISY = registerNoItem("brown_potted_oxeye_daisy", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CORNFLOWER = registerNoItem("brown_potted_cornflower", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_LILY_OF_THE_VALLEY = registerNoItem("brown_potted_lily_of_the_valley", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WITHER_ROSE = registerNoItem("brown_potted_wither_rose", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_RED_MUSHROOM = registerNoItem("brown_potted_red_mushroom", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BROWN_MUSHROOM = registerNoItem("brown_potted_brown_mushroom", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DEAD_BUSH = registerNoItem("brown_potted_dead_bush", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CACTUS = registerNoItem("brown_potted_cactus", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BAMBOO = registerNoItem("brown_potted_bamboo", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CRIMSON_FUNGUS = registerNoItem("brown_potted_crimson_fungus", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WARPED_FUNGUS = registerNoItem("brown_potted_warped_fungus", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CRIMSON_ROOTS = registerNoItem("brown_potted_crimson_roots", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WARPED_ROOTS = registerNoItem("brown_potted_warped_roots", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_AZALEA = registerNoItem("brown_potted_azalea_bush", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_FLOWERING_AZALEA = registerNoItem("brown_potted_flowering_azalea_bush", () -> getFlowerPot(() -> BROWN_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_FLOWER_POT = register("light_gray_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_OAK_SAPLING = registerNoItem("light_gray_potted_oak_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_SPRUCE_SAPLING = registerNoItem("light_gray_potted_spruce_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BIRCH_SAPLING = registerNoItem("light_gray_potted_birch_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_JUNGLE_SAPLING = registerNoItem("light_gray_potted_jungle_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ACACIA_SAPLING = registerNoItem("light_gray_potted_acacia_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DARK_OAK_SAPLING = registerNoItem("light_gray_potted_dark_oak_sapling", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_FERN = registerNoItem("light_gray_potted_fern", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DANDELION = registerNoItem("light_gray_potted_dandelion", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_POPPY = registerNoItem("light_gray_potted_poppy", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BLUE_ORCHID = registerNoItem("light_gray_potted_blue_orchid", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ALLIUM = registerNoItem("light_gray_potted_allium", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_AZURE_BLUET = registerNoItem("light_gray_potted_azure_bluet", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_RED_TULIP = registerNoItem("light_gray_potted_red_tulip", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ORANGE_TULIP = registerNoItem("light_gray_potted_orange_tulip", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WHITE_TULIP = registerNoItem("light_gray_potted_white_tulip", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_PINK_TULIP = registerNoItem("light_gray_potted_pink_tulip", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_OXEYE_DAISY = registerNoItem("light_gray_potted_oxeye_daisy", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CORNFLOWER = registerNoItem("light_gray_potted_cornflower", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_LILY_OF_THE_VALLEY = registerNoItem("light_gray_potted_lily_of_the_valley", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WITHER_ROSE = registerNoItem("light_gray_potted_wither_rose", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_RED_MUSHROOM = registerNoItem("light_gray_potted_red_mushroom", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BROWN_MUSHROOM = registerNoItem("light_gray_potted_brown_mushroom", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DEAD_BUSH = registerNoItem("light_gray_potted_dead_bush", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CACTUS = registerNoItem("light_gray_potted_cactus", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BAMBOO = registerNoItem("light_gray_potted_bamboo", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CRIMSON_FUNGUS = registerNoItem("light_gray_potted_crimson_fungus", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WARPED_FUNGUS = registerNoItem("light_gray_potted_warped_fungus", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CRIMSON_ROOTS = registerNoItem("light_gray_potted_crimson_roots", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WARPED_ROOTS = registerNoItem("light_gray_potted_warped_roots", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_AZALEA = registerNoItem("light_gray_potted_azalea_bush", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_FLOWERING_AZALEA = registerNoItem("light_gray_potted_flowering_azalea_bush", () -> getFlowerPot(() -> LIGHT_GRAY_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> GRAY_FLOWER_POT = register("gray_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_OAK_SAPLING = registerNoItem("gray_potted_oak_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_SPRUCE_SAPLING = registerNoItem("gray_potted_spruce_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BIRCH_SAPLING = registerNoItem("gray_potted_birch_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_JUNGLE_SAPLING = registerNoItem("gray_potted_jungle_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ACACIA_SAPLING = registerNoItem("gray_potted_acacia_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DARK_OAK_SAPLING = registerNoItem("gray_potted_dark_oak_sapling", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_FERN = registerNoItem("gray_potted_fern", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DANDELION = registerNoItem("gray_potted_dandelion", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_POPPY = registerNoItem("gray_potted_poppy", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BLUE_ORCHID = registerNoItem("gray_potted_blue_orchid", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ALLIUM = registerNoItem("gray_potted_allium", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_AZURE_BLUET = registerNoItem("gray_potted_azure_bluet", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_RED_TULIP = registerNoItem("gray_potted_red_tulip", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ORANGE_TULIP = registerNoItem("gray_potted_orange_tulip", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WHITE_TULIP = registerNoItem("gray_potted_white_tulip", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_PINK_TULIP = registerNoItem("gray_potted_pink_tulip", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_OXEYE_DAISY = registerNoItem("gray_potted_oxeye_daisy", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CORNFLOWER = registerNoItem("gray_potted_cornflower", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_LILY_OF_THE_VALLEY = registerNoItem("gray_potted_lily_of_the_valley", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WITHER_ROSE = registerNoItem("gray_potted_wither_rose", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_RED_MUSHROOM = registerNoItem("gray_potted_red_mushroom", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BROWN_MUSHROOM = registerNoItem("gray_potted_brown_mushroom", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DEAD_BUSH = registerNoItem("gray_potted_dead_bush", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CACTUS = registerNoItem("gray_potted_cactus", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BAMBOO = registerNoItem("gray_potted_bamboo", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CRIMSON_FUNGUS = registerNoItem("gray_potted_crimson_fungus", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WARPED_FUNGUS = registerNoItem("gray_potted_warped_fungus", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CRIMSON_ROOTS = registerNoItem("gray_potted_crimson_roots", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WARPED_ROOTS = registerNoItem("gray_potted_warped_roots", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_AZALEA = registerNoItem("gray_potted_azalea_bush", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_FLOWERING_AZALEA = registerNoItem("gray_potted_flowering_azalea_bush", () -> getFlowerPot(() -> GRAY_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> BLACK_FLOWER_POT = register("black_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_OAK_SAPLING = registerNoItem("black_potted_oak_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_SPRUCE_SAPLING = registerNoItem("black_potted_spruce_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BIRCH_SAPLING = registerNoItem("black_potted_birch_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_JUNGLE_SAPLING = registerNoItem("black_potted_jungle_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ACACIA_SAPLING = registerNoItem("black_potted_acacia_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DARK_OAK_SAPLING = registerNoItem("black_potted_dark_oak_sapling", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_FERN = registerNoItem("black_potted_fern", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DANDELION = registerNoItem("black_potted_dandelion", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_POPPY = registerNoItem("black_potted_poppy", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BLUE_ORCHID = registerNoItem("black_potted_blue_orchid", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ALLIUM = registerNoItem("black_potted_allium", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_AZURE_BLUET = registerNoItem("black_potted_azure_bluet", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_RED_TULIP = registerNoItem("black_potted_red_tulip", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ORANGE_TULIP = registerNoItem("black_potted_orange_tulip", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WHITE_TULIP = registerNoItem("black_potted_white_tulip", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_PINK_TULIP = registerNoItem("black_potted_pink_tulip", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_OXEYE_DAISY = registerNoItem("black_potted_oxeye_daisy", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CORNFLOWER = registerNoItem("black_potted_cornflower", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_LILY_OF_THE_VALLEY = registerNoItem("black_potted_lily_of_the_valley", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WITHER_ROSE = registerNoItem("black_potted_wither_rose", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_RED_MUSHROOM = registerNoItem("black_potted_red_mushroom", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BROWN_MUSHROOM = registerNoItem("black_potted_brown_mushroom", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DEAD_BUSH = registerNoItem("black_potted_dead_bush", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CACTUS = registerNoItem("black_potted_cactus", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BAMBOO = registerNoItem("black_potted_bamboo", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CRIMSON_FUNGUS = registerNoItem("black_potted_crimson_fungus", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WARPED_FUNGUS = registerNoItem("black_potted_warped_fungus", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CRIMSON_ROOTS = registerNoItem("black_potted_crimson_roots", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WARPED_ROOTS = registerNoItem("black_potted_warped_roots", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_AZALEA = registerNoItem("black_potted_azalea_bush", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_FLOWERING_AZALEA = registerNoItem("black_potted_flowering_azalea_bush", () -> getFlowerPot(() -> BLACK_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

    public static final RegistryObject<FlowerPotBlock> RED_FLOWER_POT = register("red_flower_pot", () -> getFlowerPot(null, () -> Blocks.AIR), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_OAK_SAPLING = registerNoItem("red_potted_oak_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_SPRUCE_SAPLING = registerNoItem("red_potted_spruce_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.SPRUCE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BIRCH_SAPLING = registerNoItem("red_potted_birch_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.BIRCH_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_JUNGLE_SAPLING = registerNoItem("red_potted_jungle_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.JUNGLE_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ACACIA_SAPLING = registerNoItem("red_potted_acacia_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.ACACIA_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DARK_OAK_SAPLING = registerNoItem("red_potted_dark_oak_sapling", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.DARK_OAK_SAPLING));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_FERN = registerNoItem("red_potted_fern", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.FERN));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DANDELION = registerNoItem("red_potted_dandelion", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.DANDELION));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_POPPY = registerNoItem("red_potted_poppy", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.POPPY));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BLUE_ORCHID = registerNoItem("red_potted_blue_orchid", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.BLUE_ORCHID));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ALLIUM = registerNoItem("red_potted_allium", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.ALLIUM));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_AZURE_BLUET = registerNoItem("red_potted_azure_bluet", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.AZURE_BLUET));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_RED_TULIP = registerNoItem("red_potted_red_tulip", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.RED_TULIP));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ORANGE_TULIP = registerNoItem("red_potted_orange_tulip", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.ORANGE_TULIP));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WHITE_TULIP = registerNoItem("red_potted_white_tulip", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.WHITE_TULIP));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_PINK_TULIP = registerNoItem("red_potted_pink_tulip", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.PINK_TULIP));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_OXEYE_DAISY = registerNoItem("red_potted_oxeye_daisy", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.OXEYE_DAISY));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CORNFLOWER = registerNoItem("red_potted_cornflower", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.CORNFLOWER));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_LILY_OF_THE_VALLEY = registerNoItem("red_potted_lily_of_the_valley", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.LILY_OF_THE_VALLEY));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WITHER_ROSE = registerNoItem("red_potted_wither_rose", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.WITHER_ROSE));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_RED_MUSHROOM = registerNoItem("red_potted_red_mushroom", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.RED_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BROWN_MUSHROOM = registerNoItem("red_potted_brown_mushroom", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.BROWN_MUSHROOM));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DEAD_BUSH = registerNoItem("red_potted_dead_bush", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.DEAD_BUSH));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CACTUS = registerNoItem("red_potted_cactus", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.CACTUS));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BAMBOO = registerNoItem("red_potted_bamboo", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.BAMBOO));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CRIMSON_FUNGUS = registerNoItem("red_potted_crimson_fungus", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.CRIMSON_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WARPED_FUNGUS = registerNoItem("red_potted_warped_fungus", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.WARPED_FUNGUS));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CRIMSON_ROOTS = registerNoItem("red_potted_crimson_roots", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.CRIMSON_ROOTS));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WARPED_ROOTS = registerNoItem("red_potted_warped_roots", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.WARPED_ROOTS));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_AZALEA = registerNoItem("red_potted_azalea_bush", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.AZALEA));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_FLOWERING_AZALEA = registerNoItem("red_potted_flowering_azalea_bush", () -> getFlowerPot(() -> RED_FLOWER_POT.get(), () -> Blocks.FLOWERING_AZALEA));

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

    private static ModFlowerPotBlock getFlowerPot(@Nullable Supplier<FlowerPotBlock> emptyPot, Supplier<Block> content) {
        return new ModFlowerPotBlock(emptyPot, content, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT));
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        return register(name, block, CreativeModeTab.TAB_BUILDING_BLOCKS);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(tab)));
        return ret;
    }

    static class ModFlowerPotBlock extends FlowerPotBlock {
        public ModFlowerPotBlock(@Nullable Supplier<FlowerPotBlock> emptyPot, Supplier<? extends Block> content, Properties properties) {
            super(emptyPot, content, properties);
            if (emptyPot != null) {
                emptyPot.get().addPlant(ForgeRegistries.BLOCKS.getKey(content.get()), () -> this);
            }
        }
    }
}