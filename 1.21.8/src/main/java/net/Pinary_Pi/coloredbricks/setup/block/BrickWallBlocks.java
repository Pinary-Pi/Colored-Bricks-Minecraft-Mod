package net.Pinary_Pi.coloredbricks.setup.block;

import static net.Pinary_Pi.gear.util.BlockRegistrationHelper.*;

import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrickWallBlocks {
    // Brick Walls

    public static final RegistryObject<WallBlock> WHITE_BRICK_WALL = register("white_brick_wall", () -> getWallBrick("white_brick_wall"));
    public static final RegistryObject<WallBlock> ORANGE_BRICK_WALL = register("orange_brick_wall", () -> getWallBrick("orange_brick_wall"));
    public static final RegistryObject<WallBlock> PINK_BRICK_WALL = register("pink_brick_wall", () -> getWallBrick("pink_brick_wall"));
    public static final RegistryObject<WallBlock> YELLOW_BRICK_WALL = register("yellow_brick_wall", () -> getWallBrick("yellow_brick_wall"));
    public static final RegistryObject<WallBlock> LIME_BRICK_WALL = register("lime_brick_wall", () -> getWallBrick("lime_brick_wall"));
    public static final RegistryObject<WallBlock> GREEN_BRICK_WALL = register("green_brick_wall", () -> getWallBrick("green_brick_wall"));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall", () -> getWallBrick("light_blue_brick_wall"));
    public static final RegistryObject<WallBlock> CYAN_BRICK_WALL = register("cyan_brick_wall", () -> getWallBrick("cyan_brick_wall"));
    public static final RegistryObject<WallBlock> BLUE_BRICK_WALL = register("blue_brick_wall", () -> getWallBrick("blue_brick_wall"));
    public static final RegistryObject<WallBlock> MAGENTA_BRICK_WALL = register("magenta_brick_wall", () -> getWallBrick("magenta_brick_wall"));
    public static final RegistryObject<WallBlock> PURPLE_BRICK_WALL = register("purple_brick_wall", () -> getWallBrick("purple_brick_wall"));
    public static final RegistryObject<WallBlock> BROWN_BRICK_WALL = register("brown_brick_wall", () -> getWallBrick("brown_brick_wall"));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall", () -> getWallBrick("light_gray_brick_wall"));
    public static final RegistryObject<WallBlock> GRAY_BRICK_WALL = register("gray_brick_wall", () -> getWallBrick("gray_brick_wall"));
    public static final RegistryObject<WallBlock> BLACK_BRICK_WALL = register("black_brick_wall", () -> getWallBrick("black_brick_wall"));
    public static final RegistryObject<WallBlock> RED_BRICK_WALL = register("red_brick_wall", () -> getWallBrick("red_brick_wall"));

    // Cracked Brick Walls

    public static final RegistryObject<WallBlock> CRACKED_BRICK_WALL = register("cracked_brick_wall", () -> getWallBrick("cracked_brick_wall"));
    public static final RegistryObject<WallBlock> WHITE_CRACKED_BRICK_WALL = register("white_cracked_brick_wall", () -> getWallBrick("white_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> ORANGE_CRACKED_BRICK_WALL = register("orange_cracked_brick_wall", () -> getWallBrick("orange_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> PINK_CRACKED_BRICK_WALL = register("pink_cracked_brick_wall", () -> getWallBrick("pink_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> YELLOW_CRACKED_BRICK_WALL = register("yellow_cracked_brick_wall", () -> getWallBrick("yellow_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> LIME_CRACKED_BRICK_WALL = register("lime_cracked_brick_wall", () -> getWallBrick("lime_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> GREEN_CRACKED_BRICK_WALL = register("green_cracked_brick_wall", () -> getWallBrick("green_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CRACKED_BRICK_WALL = register("light_blue_cracked_brick_wall", () -> getWallBrick("light_blue_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> CYAN_CRACKED_BRICK_WALL = register("cyan_cracked_brick_wall", () -> getWallBrick("cyan_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> BLUE_CRACKED_BRICK_WALL = register("blue_cracked_brick_wall", () -> getWallBrick("blue_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> MAGENTA_CRACKED_BRICK_WALL = register("magenta_cracked_brick_wall", () -> getWallBrick("magenta_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> PURPLE_CRACKED_BRICK_WALL = register("purple_cracked_brick_wall", () -> getWallBrick("purple_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> BROWN_CRACKED_BRICK_WALL = register("brown_cracked_brick_wall", () -> getWallBrick("brown_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CRACKED_BRICK_WALL = register("light_gray_cracked_brick_wall", () -> getWallBrick("light_gray_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> GRAY_CRACKED_BRICK_WALL = register("gray_cracked_brick_wall", () -> getWallBrick("gray_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> BLACK_CRACKED_BRICK_WALL = register("black_cracked_brick_wall", () -> getWallBrick("black_cracked_brick_wall"));
    public static final RegistryObject<WallBlock> RED_CRACKED_BRICK_WALL = register("red_cracked_brick_wall", () -> getWallBrick("red_cracked_brick_wall"));

    public static void initialize() {}

    private static WallBlock getWallBrick(String name) {
        return new WallBlock(BlockBehaviour.Properties
        .ofFullCopy(Blocks.BRICK_WALL)
        .setId(ResourceKey.create(
            ForgeRegistries.BLOCKS.getRegistryKey(), 
            ModResourceLocation.create(name))));
    }
}
