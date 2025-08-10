package net.Pinary_Pi.coloredbricks.setup.block;

import static net.Pinary_Pi.gear.util.BlockRegistrationHelper.*;

import java.util.function.Supplier;

import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrickStairsBlocks {
    // Brick Stairs

    public static final Supplier<BlockState> STAIR_BLOCKSTATE_WHITE = () -> BrickBlocks.WHITE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_ORANGE = () -> BrickBlocks.ORANGE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_PINK = () -> BrickBlocks.PINK_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_YELLOW = () -> BrickBlocks.YELLOW_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIME = () -> BrickBlocks.LIME_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_GREEN = () -> BrickBlocks.GREEN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CYAN = () -> BrickBlocks.CYAN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIGHT_BLUE = () -> BrickBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BLUE = () -> BrickBlocks.BLUE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_MAGENTA = () -> BrickBlocks.MAGENTA_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_PURPLE = () -> BrickBlocks.PURPLE_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BROWN = () -> BrickBlocks.BROWN_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_LIGHT_GRAY = () -> BrickBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_GRAY = () -> BrickBlocks.GRAY_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_BLACK = () -> BrickBlocks.BLACK_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_RED = () -> BrickBlocks.RED_BRICKS.get().defaultBlockState();

    public static final RegistryObject<StairBlock> WHITE_BRICK_STAIRS = register("white_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_WHITE.get(), "white_brick_stairs"));
    public static final RegistryObject<StairBlock> ORANGE_BRICK_STAIRS = register("orange_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_ORANGE.get(), "orange_brick_stairs"));
    public static final RegistryObject<StairBlock> PINK_BRICK_STAIRS = register("pink_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_PINK.get(), "pink_brick_stairs"));
    public static final RegistryObject<StairBlock> YELLOW_BRICK_STAIRS = register("yellow_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_YELLOW.get(), "yellow_brick_stairs"));
    public static final RegistryObject<StairBlock> LIME_BRICK_STAIRS = register("lime_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIME.get(), "lime_brick_stairs"));
    public static final RegistryObject<StairBlock> GREEN_BRICK_STAIRS = register("green_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_GREEN.get(), "green_brick_stairs"));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIGHT_BLUE.get(), "light_blue_brick_stairs"));
    public static final RegistryObject<StairBlock> CYAN_BRICK_STAIRS = register("cyan_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CYAN.get(), "cyan_brick_stairs"));
    public static final RegistryObject<StairBlock> BLUE_BRICK_STAIRS = register("blue_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BLUE.get(), "blue_brick_stairs"));
    public static final RegistryObject<StairBlock> MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_MAGENTA.get(), "magenta_brick_stairs"));
    public static final RegistryObject<StairBlock> PURPLE_BRICK_STAIRS = register("purple_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_PURPLE.get(), "purple_brick_stairs"));
    public static final RegistryObject<StairBlock> BROWN_BRICK_STAIRS = register("brown_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BROWN.get(), "brown_brick_stairs"));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_LIGHT_GRAY.get(), "light_gray_brick_stairs"));
    public static final RegistryObject<StairBlock> GRAY_BRICK_STAIRS = register("gray_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_GRAY.get(), "gray_brick_stairs"));
    public static final RegistryObject<StairBlock> BLACK_BRICK_STAIRS = register("black_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_BLACK.get(), "black_brick_stairs"));
    public static final RegistryObject<StairBlock> RED_BRICK_STAIRS = register("red_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_RED.get(), "red_brick_stairs"));

    // Cracked Brick Stairs

    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED = () -> BrickBlocks.CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_WHITE = () -> BrickBlocks.WHITE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_ORANGE = () -> BrickBlocks.ORANGE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_PINK = () -> BrickBlocks.PINK_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_YELLOW = () -> BrickBlocks.YELLOW_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIME = () -> BrickBlocks.LIME_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_GREEN = () -> BrickBlocks.GREEN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIGHT_BLUE = () -> BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_CYAN = () -> BrickBlocks.CYAN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BLUE = () -> BrickBlocks.BLUE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_MAGENTA = () -> BrickBlocks.MAGENTA_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_PURPLE = () -> BrickBlocks.PURPLE_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BROWN = () -> BrickBlocks.BROWN_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_LIGHT_GRAY = () -> BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_GRAY = () -> BrickBlocks.GRAY_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_BLACK = () -> BrickBlocks.BLACK_CRACKED_BRICKS.get().defaultBlockState();
    public static final Supplier<BlockState> STAIR_BLOCKSTATE_CRACKED_RED = () -> BrickBlocks.RED_CRACKED_BRICKS.get().defaultBlockState();
    
    public static final RegistryObject<StairBlock> CRACKED_BRICK_STAIRS = register("cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED.get(), "cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> WHITE_CRACKED_BRICK_STAIRS = register("white_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_WHITE.get(), "white_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> ORANGE_CRACKED_BRICK_STAIRS = register("orange_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_ORANGE.get(), "orange_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> PINK_CRACKED_BRICK_STAIRS = register("pink_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_PINK.get(), "pink_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> YELLOW_CRACKED_BRICK_STAIRS = register("yellow_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_YELLOW.get(), "yellow_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> LIME_CRACKED_BRICK_STAIRS = register("lime_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIME.get(), "lime_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> GREEN_CRACKED_BRICK_STAIRS = register("green_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_GREEN.get(), "green_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CRACKED_BRICK_STAIRS = register("light_blue_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIGHT_BLUE.get(), "light_blue_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> CYAN_CRACKED_BRICK_STAIRS = register("cyan_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_CYAN.get(), "cyan_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> BLUE_CRACKED_BRICK_STAIRS = register("blue_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BLUE.get(), "blue_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> MAGENTA_CRACKED_BRICK_STAIRS = register("magenta_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_MAGENTA.get(), "magenta_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> PURPLE_CRACKED_BRICK_STAIRS = register("purple_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_PURPLE.get(), "purple_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> BROWN_CRACKED_BRICK_STAIRS = register("brown_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BROWN.get(), "brown_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CRACKED_BRICK_STAIRS = register("light_gray_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_LIGHT_GRAY.get(), "light_gray_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> GRAY_CRACKED_BRICK_STAIRS = register("gray_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_GRAY.get(), "gray_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> BLACK_CRACKED_BRICK_STAIRS = register("black_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_BLACK.get(), "black_cracked_brick_stairs"));
    public static final RegistryObject<StairBlock> RED_CRACKED_BRICK_STAIRS = register("red_cracked_brick_stairs", () -> getStairsBrick(STAIR_BLOCKSTATE_CRACKED_RED.get(), "red_cracked_brick_stairs"));

    public static void initialize() {}

    private static StairBlock getStairsBrick(BlockState state, String name) {
        return new StairBlock(state, BlockBehaviour.Properties
        .ofFullCopy(Blocks.BRICK_STAIRS)
        .setId(ResourceKey.create(
            ForgeRegistries.BLOCKS.getRegistryKey(), 
            ModResourceLocation.create(name))));
    }
}
