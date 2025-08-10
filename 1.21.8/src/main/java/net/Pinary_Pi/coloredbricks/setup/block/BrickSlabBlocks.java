package net.Pinary_Pi.coloredbricks.setup.block;

import static net.Pinary_Pi.gear.util.BlockRegistrationHelper.*;

import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrickSlabBlocks {
    // Brick Slabs
    
    public static final RegistryObject<SlabBlock> WHITE_BRICK_SLAB = register("white_brick_slab", () -> getSlabBrick("white_brick_slab"));
    public static final RegistryObject<SlabBlock> ORANGE_BRICK_SLAB = register("orange_brick_slab", () -> getSlabBrick("orange_brick_slab"));
    public static final RegistryObject<SlabBlock> PINK_BRICK_SLAB = register("pink_brick_slab", () -> getSlabBrick("pink_brick_slab"));
    public static final RegistryObject<SlabBlock> YELLOW_BRICK_SLAB = register("yellow_brick_slab", () -> getSlabBrick("yellow_brick_slab"));
    public static final RegistryObject<SlabBlock> LIME_BRICK_SLAB = register("lime_brick_slab", () -> getSlabBrick("lime_brick_slab"));
    public static final RegistryObject<SlabBlock> GREEN_BRICK_SLAB = register("green_brick_slab", () -> getSlabBrick("green_brick_slab"));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab", () -> getSlabBrick("light_blue_brick_slab"));
    public static final RegistryObject<SlabBlock> CYAN_BRICK_SLAB = register("cyan_brick_slab", () -> getSlabBrick("cyan_brick_slab"));
    public static final RegistryObject<SlabBlock> BLUE_BRICK_SLAB = register("blue_brick_slab", () -> getSlabBrick("blue_brick_slab"));
    public static final RegistryObject<SlabBlock> MAGENTA_BRICK_SLAB = register("magenta_brick_slab", () -> getSlabBrick("magenta_brick_slab"));
    public static final RegistryObject<SlabBlock> PURPLE_BRICK_SLAB = register("purple_brick_slab", () -> getSlabBrick("purple_brick_slab"));
    public static final RegistryObject<SlabBlock> BROWN_BRICK_SLAB = register("brown_brick_slab", () -> getSlabBrick("brown_brick_slab"));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab", () -> getSlabBrick("light_gray_brick_slab"));
    public static final RegistryObject<SlabBlock> GRAY_BRICK_SLAB = register("gray_brick_slab", () -> getSlabBrick("gray_brick_slab"));
    public static final RegistryObject<SlabBlock> BLACK_BRICK_SLAB = register("black_brick_slab", () -> getSlabBrick("black_brick_slab"));
    public static final RegistryObject<SlabBlock> RED_BRICK_SLAB = register("red_brick_slab", () -> getSlabBrick("red_brick_slab"));

    // Cracked Brick Slabs
    
    public static final RegistryObject<SlabBlock> CRACKED_BRICK_SLAB = register("cracked_brick_slab", () -> getSlabBrick("cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> WHITE_CRACKED_BRICK_SLAB = register("white_cracked_brick_slab", () -> getSlabBrick("white_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> ORANGE_CRACKED_BRICK_SLAB = register("orange_cracked_brick_slab", () -> getSlabBrick("orange_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> PINK_CRACKED_BRICK_SLAB = register("pink_cracked_brick_slab", () -> getSlabBrick("pink_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> YELLOW_CRACKED_BRICK_SLAB = register("yellow_cracked_brick_slab", () -> getSlabBrick("yellow_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> LIME_CRACKED_BRICK_SLAB = register("lime_cracked_brick_slab", () -> getSlabBrick("lime_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> GREEN_CRACKED_BRICK_SLAB = register("green_cracked_brick_slab", () -> getSlabBrick("green_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> CYAN_CRACKED_BRICK_SLAB = register("cyan_cracked_brick_slab", () -> getSlabBrick("cyan_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CRACKED_BRICK_SLAB = register("light_blue_cracked_brick_slab", () -> getSlabBrick("light_blue_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> BLUE_CRACKED_BRICK_SLAB = register("blue_cracked_brick_slab", () -> getSlabBrick("blue_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> MAGENTA_CRACKED_BRICK_SLAB = register("magenta_cracked_brick_slab", () -> getSlabBrick("magenta_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> PURPLE_CRACKED_BRICK_SLAB = register("purple_cracked_brick_slab", () -> getSlabBrick("purple_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> BROWN_CRACKED_BRICK_SLAB = register("brown_cracked_brick_slab", () -> getSlabBrick("brown_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CRACKED_BRICK_SLAB = register("light_gray_cracked_brick_slab", () -> getSlabBrick("light_gray_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> GRAY_CRACKED_BRICK_SLAB = register("gray_cracked_brick_slab", () -> getSlabBrick("gray_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> BLACK_CRACKED_BRICK_SLAB = register("black_cracked_brick_slab", () -> getSlabBrick("black_cracked_brick_slab"));
    public static final RegistryObject<SlabBlock> RED_CRACKED_BRICK_SLAB = register("red_cracked_brick_slab", () -> getSlabBrick("red_cracked_brick_slab"));

    public static void initialize() {}

    private static SlabBlock getSlabBrick(String name) {
        return new SlabBlock(BlockBehaviour.Properties
        .ofFullCopy(Blocks.BRICK_SLAB)
        .setId(ResourceKey.create(
            ForgeRegistries.BLOCKS.getRegistryKey(), 
            ModResourceLocation.create(name))));
    }
}
