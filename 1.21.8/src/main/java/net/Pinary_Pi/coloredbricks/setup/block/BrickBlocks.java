package net.Pinary_Pi.coloredbricks.setup.block;

import static net.Pinary_Pi.gear.util.BlockRegistrationHelper.*;

import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrickBlocks {
    // Brick Blocks

    public static final RegistryObject<Block> WHITE_BRICKS = register("white_bricks", () -> getBlockBrick("white_bricks"));
    public static final RegistryObject<Block> ORANGE_BRICKS = register("orange_bricks", () -> getBlockBrick("orange_bricks"));
    public static final RegistryObject<Block> PINK_BRICKS = register("pink_bricks", () -> getBlockBrick("pink_bricks"));
    public static final RegistryObject<Block> YELLOW_BRICKS = register("yellow_bricks", () -> getBlockBrick("yellow_bricks"));
    public static final RegistryObject<Block> LIME_BRICKS = register("lime_bricks", () -> getBlockBrick("lime_bricks"));
    public static final RegistryObject<Block> GREEN_BRICKS = register("green_bricks", () -> getBlockBrick("green_bricks"));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS = register("light_blue_bricks", () -> getBlockBrick("light_blue_bricks"));
    public static final RegistryObject<Block> CYAN_BRICKS = register("cyan_bricks", () -> getBlockBrick("cyan_bricks"));
    public static final RegistryObject<Block> BLUE_BRICKS = register("blue_bricks", () -> getBlockBrick("blue_bricks"));
    public static final RegistryObject<Block> MAGENTA_BRICKS = register("magenta_bricks", () -> getBlockBrick("magenta_bricks"));
    public static final RegistryObject<Block> PURPLE_BRICKS = register("purple_bricks", () -> getBlockBrick("purple_bricks"));
    public static final RegistryObject<Block> BROWN_BRICKS = register("brown_bricks", () -> getBlockBrick("brown_bricks"));
    public static final RegistryObject<Block> GRAY_BRICKS = register("gray_bricks", () -> getBlockBrick("gray_bricks"));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = register("light_gray_bricks", () -> getBlockBrick("light_gray_bricks"));
    public static final RegistryObject<Block> BLACK_BRICKS = register("black_bricks", () -> getBlockBrick("black_bricks"));
    public static final RegistryObject<Block> RED_BRICKS = register("red_bricks", () -> getBlockBrick("red_bricks"));

    // Cracked Bricks

    public static final RegistryObject<Block> CRACKED_BRICKS = register("cracked_bricks", () -> getBlockBrick("cracked_bricks"));
    public static final RegistryObject<Block> WHITE_CRACKED_BRICKS = register("white_cracked_bricks", () -> getBlockBrick("white_cracked_bricks"));
    public static final RegistryObject<Block> ORANGE_CRACKED_BRICKS = register("orange_cracked_bricks", () -> getBlockBrick("orange_cracked_bricks"));
    public static final RegistryObject<Block> PINK_CRACKED_BRICKS = register("pink_cracked_bricks", () -> getBlockBrick("pink_cracked_bricks"));
    public static final RegistryObject<Block> YELLOW_CRACKED_BRICKS = register("yellow_cracked_bricks", () -> getBlockBrick("yellow_cracked_bricks"));
    public static final RegistryObject<Block> LIME_CRACKED_BRICKS = register("lime_cracked_bricks", () -> getBlockBrick("lime_cracked_bricks"));
    public static final RegistryObject<Block> GREEN_CRACKED_BRICKS = register("green_cracked_bricks", () -> getBlockBrick("green_cracked_bricks"));
    public static final RegistryObject<Block> LIGHT_BLUE_CRACKED_BRICKS = register("light_blue_cracked_bricks", () -> getBlockBrick("light_blue_cracked_bricks"));
    public static final RegistryObject<Block> CYAN_CRACKED_BRICKS = register("cyan_cracked_bricks", () -> getBlockBrick("cyan_cracked_bricks"));
    public static final RegistryObject<Block> BLUE_CRACKED_BRICKS = register("blue_cracked_bricks", () -> getBlockBrick("blue_cracked_bricks"));
    public static final RegistryObject<Block> MAGENTA_CRACKED_BRICKS = register("magenta_cracked_bricks", () -> getBlockBrick("magenta_cracked_bricks"));
    public static final RegistryObject<Block> PURPLE_CRACKED_BRICKS = register("purple_cracked_bricks", () -> getBlockBrick("purple_cracked_bricks"));
    public static final RegistryObject<Block> BROWN_CRACKED_BRICKS = register("brown_cracked_bricks", () -> getBlockBrick("brown_cracked_bricks"));
    public static final RegistryObject<Block> LIGHT_GRAY_CRACKED_BRICKS = register("light_gray_cracked_bricks", () -> getBlockBrick("light_gray_cracked_bricks"));
    public static final RegistryObject<Block> GRAY_CRACKED_BRICKS = register("gray_cracked_bricks", () -> getBlockBrick("gray_cracked_bricks"));
    public static final RegistryObject<Block> BLACK_CRACKED_BRICKS = register("black_cracked_bricks", () -> getBlockBrick("black_cracked_bricks"));
    public static final RegistryObject<Block> RED_CRACKED_BRICKS = register("red_cracked_bricks", () -> getBlockBrick("red_cracked_bricks"));

    // Chiseled Bricks

    public static final RegistryObject<Block> CHISELED_BRICKS = register("chiseled_bricks", () -> getBlockBrick("chiseled_bricks"));
    public static final RegistryObject<Block> WHITE_CHISELED_BRICKS = register("white_chiseled_bricks", () -> getBlockBrick("white_chiseled_bricks"));
    public static final RegistryObject<Block> ORANGE_CHISELED_BRICKS = register("orange_chiseled_bricks", () -> getBlockBrick("orange_chiseled_bricks"));
    public static final RegistryObject<Block> PINK_CHISELED_BRICKS = register("pink_chiseled_bricks", () -> getBlockBrick("pink_chiseled_bricks"));
    public static final RegistryObject<Block> YELLOW_CHISELED_BRICKS = register("yellow_chiseled_bricks", () -> getBlockBrick("yellow_chiseled_bricks"));
    public static final RegistryObject<Block> LIME_CHISELED_BRICKS = register("lime_chiseled_bricks", () -> getBlockBrick("lime_chiseled_bricks"));
    public static final RegistryObject<Block> GREEN_CHISELED_BRICKS = register("green_chiseled_bricks", () -> getBlockBrick("green_chiseled_bricks"));
    public static final RegistryObject<Block> LIGHT_BLUE_CHISELED_BRICKS = register("light_blue_chiseled_bricks", () -> getBlockBrick("light_blue_chiseled_bricks"));
    public static final RegistryObject<Block> CYAN_CHISELED_BRICKS = register("cyan_chiseled_bricks", () -> getBlockBrick("cyan_chiseled_bricks"));
    public static final RegistryObject<Block> BLUE_CHISELED_BRICKS = register("blue_chiseled_bricks", () -> getBlockBrick("blue_chiseled_bricks"));
    public static final RegistryObject<Block> MAGENTA_CHISELED_BRICKS = register("magenta_chiseled_bricks", () -> getBlockBrick("magenta_chiseled_bricks"));
    public static final RegistryObject<Block> PURPLE_CHISELED_BRICKS = register("purple_chiseled_bricks", () -> getBlockBrick("purple_chiseled_bricks"));
    public static final RegistryObject<Block> BROWN_CHISELED_BRICKS = register("brown_chiseled_bricks", () -> getBlockBrick("brown_chiseled_bricks"));
    public static final RegistryObject<Block> GRAY_CHISELED_BRICKS = register("gray_chiseled_bricks", () -> getBlockBrick("gray_chiseled_bricks"));
    public static final RegistryObject<Block> LIGHT_GRAY_CHISELED_BRICKS = register("light_gray_chiseled_bricks", () -> getBlockBrick("light_gray_chiseled_bricks"));
    public static final RegistryObject<Block> BLACK_CHISELED_BRICKS = register("black_chiseled_bricks", () -> getBlockBrick("black_chiseled_bricks"));
    public static final RegistryObject<Block> RED_CHISELED_BRICKS = register("red_chiseled_bricks", () -> getBlockBrick("red_chiseled_bricks"));

    public static void initialize() {}

    private static Block getBlockBrick(String name) {
        return new Block(BlockBehaviour.Properties
        .ofFullCopy(Blocks.BRICKS)
        .setId(ResourceKey.create(
            ForgeRegistries.BLOCKS.getRegistryKey(), 
            ModResourceLocation.create(name))));
    }
}
