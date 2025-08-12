package net.pinary_pi.coloredbricks.data;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagBuilder;
import net.pinary_pi.coloredbricks.setup.ModBlocks;

public class ModBlockTagsProvider extends BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        // All brick-type blocks (no flower pots)
        List<Block> mineableBricks = List.of(
            ModBlocks.WHITE_BRICKS,
            ModBlocks.ORANGE_BRICKS,
            ModBlocks.PINK_BRICKS,
            ModBlocks.YELLOW_BRICKS,
            ModBlocks.LIME_BRICKS,
            ModBlocks.GREEN_BRICKS,
            ModBlocks.LIGHT_BLUE_BRICKS,
            ModBlocks.CYAN_BRICKS,
            ModBlocks.BLUE_BRICKS,
            ModBlocks.MAGENTA_BRICKS,
            ModBlocks.PURPLE_BRICKS,
            ModBlocks.BROWN_BRICKS,
            ModBlocks.GRAY_BRICKS,
            ModBlocks.LIGHT_GRAY_BRICKS,
            ModBlocks.BLACK_BRICKS,
            ModBlocks.RED_BRICKS,

            ModBlocks.WHITE_BRICK_SLAB,
            ModBlocks.ORANGE_BRICK_SLAB,
            ModBlocks.PINK_BRICK_SLAB,
            ModBlocks.YELLOW_BRICK_SLAB,
            ModBlocks.LIME_BRICK_SLAB,
            ModBlocks.GREEN_BRICK_SLAB,
            ModBlocks.LIGHT_BLUE_BRICK_SLAB,
            ModBlocks.CYAN_BRICK_SLAB,
            ModBlocks.BLUE_BRICK_SLAB,
            ModBlocks.MAGENTA_BRICK_SLAB,
            ModBlocks.PURPLE_BRICK_SLAB,
            ModBlocks.BROWN_BRICK_SLAB,
            ModBlocks.GRAY_BRICK_SLAB,
            ModBlocks.LIGHT_GRAY_BRICK_SLAB,
            ModBlocks.BLACK_BRICK_SLAB,
            ModBlocks.RED_BRICK_SLAB,

            ModBlocks.WHITE_BRICK_STAIRS,
            ModBlocks.ORANGE_BRICK_STAIRS,
            ModBlocks.PINK_BRICK_STAIRS,
            ModBlocks.YELLOW_BRICK_STAIRS,
            ModBlocks.LIME_BRICK_STAIRS,
            ModBlocks.GREEN_BRICK_STAIRS,
            ModBlocks.LIGHT_BLUE_BRICK_STAIRS,
            ModBlocks.CYAN_BRICK_STAIRS,
            ModBlocks.BLUE_BRICK_STAIRS,
            ModBlocks.MAGENTA_BRICK_STAIRS,
            ModBlocks.PURPLE_BRICK_STAIRS,
            ModBlocks.BROWN_BRICK_STAIRS,
            ModBlocks.GRAY_BRICK_STAIRS,
            ModBlocks.LIGHT_GRAY_BRICK_STAIRS,
            ModBlocks.BLACK_BRICK_STAIRS,
            ModBlocks.RED_BRICK_STAIRS,

            ModBlocks.WHITE_BRICK_WALL,
            ModBlocks.ORANGE_BRICK_WALL,
            ModBlocks.PINK_BRICK_WALL,
            ModBlocks.YELLOW_BRICK_WALL,
            ModBlocks.LIME_BRICK_WALL,
            ModBlocks.GREEN_BRICK_WALL,
            ModBlocks.LIGHT_BLUE_BRICK_WALL,
            ModBlocks.CYAN_BRICK_WALL,
            ModBlocks.BLUE_BRICK_WALL,
            ModBlocks.MAGENTA_BRICK_WALL,
            ModBlocks.PURPLE_BRICK_WALL,
            ModBlocks.BROWN_BRICK_WALL,
            ModBlocks.GRAY_BRICK_WALL,
            ModBlocks.LIGHT_GRAY_BRICK_WALL,
            ModBlocks.BLACK_BRICK_WALL,
            ModBlocks.RED_BRICK_WALL,

            // cracked variants...
            ModBlocks.CRACKED_BRICKS,
            ModBlocks.WHITE_CRACKED_BRICKS,
            ModBlocks.ORANGE_CRACKED_BRICKS,
            ModBlocks.PINK_CRACKED_BRICKS,
            ModBlocks.YELLOW_CRACKED_BRICKS,
            ModBlocks.LIME_CRACKED_BRICKS,
            ModBlocks.GREEN_CRACKED_BRICKS,
            ModBlocks.LIGHT_BLUE_CRACKED_BRICKS,
            ModBlocks.CYAN_CRACKED_BRICKS,
            ModBlocks.BLUE_CRACKED_BRICKS,
            ModBlocks.MAGENTA_CRACKED_BRICKS,
            ModBlocks.PURPLE_CRACKED_BRICKS,
            ModBlocks.BROWN_CRACKED_BRICKS,
            ModBlocks.GRAY_CRACKED_BRICKS,
            ModBlocks.LIGHT_GRAY_CRACKED_BRICKS,
            ModBlocks.BLACK_CRACKED_BRICKS,
            ModBlocks.RED_CRACKED_BRICKS,

            ModBlocks.CRACKED_BRICK_SLAB,
            ModBlocks.WHITE_CRACKED_BRICK_SLAB,
            ModBlocks.ORANGE_CRACKED_BRICK_SLAB,
            ModBlocks.PINK_CRACKED_BRICK_SLAB,
            ModBlocks.YELLOW_CRACKED_BRICK_SLAB,
            ModBlocks.LIME_CRACKED_BRICK_SLAB,
            ModBlocks.GREEN_CRACKED_BRICK_SLAB,
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB,
            ModBlocks.CYAN_CRACKED_BRICK_SLAB,
            ModBlocks.BLUE_CRACKED_BRICK_SLAB,
            ModBlocks.MAGENTA_CRACKED_BRICK_SLAB,
            ModBlocks.PURPLE_CRACKED_BRICK_SLAB,
            ModBlocks.BROWN_CRACKED_BRICK_SLAB,
            ModBlocks.GRAY_CRACKED_BRICK_SLAB,
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB,
            ModBlocks.BLACK_CRACKED_BRICK_SLAB,
            ModBlocks.RED_CRACKED_BRICK_SLAB,

            ModBlocks.CRACKED_BRICK_STAIRS,
            ModBlocks.WHITE_CRACKED_BRICK_STAIRS,
            ModBlocks.ORANGE_CRACKED_BRICK_STAIRS,
            ModBlocks.PINK_CRACKED_BRICK_STAIRS,
            ModBlocks.YELLOW_CRACKED_BRICK_STAIRS,
            ModBlocks.LIME_CRACKED_BRICK_STAIRS,
            ModBlocks.GREEN_CRACKED_BRICK_STAIRS,
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS,
            ModBlocks.CYAN_CRACKED_BRICK_STAIRS,
            ModBlocks.BLUE_CRACKED_BRICK_STAIRS,
            ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS,
            ModBlocks.PURPLE_CRACKED_BRICK_STAIRS,
            ModBlocks.BROWN_CRACKED_BRICK_STAIRS,
            ModBlocks.GRAY_CRACKED_BRICK_STAIRS,
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS,
            ModBlocks.BLACK_CRACKED_BRICK_STAIRS,
            ModBlocks.RED_CRACKED_BRICK_STAIRS,

            ModBlocks.CRACKED_BRICK_WALL,
            ModBlocks.WHITE_CRACKED_BRICK_WALL,
            ModBlocks.ORANGE_CRACKED_BRICK_WALL,
            ModBlocks.PINK_CRACKED_BRICK_WALL,
            ModBlocks.YELLOW_CRACKED_BRICK_WALL,
            ModBlocks.LIME_CRACKED_BRICK_WALL,
            ModBlocks.GREEN_CRACKED_BRICK_WALL,
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL,
            ModBlocks.CYAN_CRACKED_BRICK_WALL,
            ModBlocks.BLUE_CRACKED_BRICK_WALL,
            ModBlocks.MAGENTA_CRACKED_BRICK_WALL,
            ModBlocks.PURPLE_CRACKED_BRICK_WALL,
            ModBlocks.BROWN_CRACKED_BRICK_WALL,
            ModBlocks.GRAY_CRACKED_BRICK_WALL,
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL,
            ModBlocks.BLACK_CRACKED_BRICK_WALL,
            ModBlocks.RED_CRACKED_BRICK_WALL,

            // chiseled
            ModBlocks.CHISELED_BRICKS,
            ModBlocks.WHITE_CHISELED_BRICKS,
            ModBlocks.ORANGE_CHISELED_BRICKS,
            ModBlocks.PINK_CHISELED_BRICKS,
            ModBlocks.YELLOW_CHISELED_BRICKS,
            ModBlocks.LIME_CHISELED_BRICKS,
            ModBlocks.GREEN_CHISELED_BRICKS,
            ModBlocks.LIGHT_BLUE_CHISELED_BRICKS,
            ModBlocks.CYAN_CHISELED_BRICKS,
            ModBlocks.BLUE_CHISELED_BRICKS,
            ModBlocks.MAGENTA_CHISELED_BRICKS,
            ModBlocks.PURPLE_CHISELED_BRICKS,
            ModBlocks.BROWN_CHISELED_BRICKS,
            ModBlocks.GRAY_CHISELED_BRICKS,
            ModBlocks.LIGHT_GRAY_CHISELED_BRICKS,
            ModBlocks.BLACK_CHISELED_BRICKS,
            ModBlocks.RED_CHISELED_BRICKS
        );

        TagBuilder mineablePickaxeTag = getTagBuilder(BlockTags.PICKAXE_MINEABLE);
        for (Block block : mineableBricks) {
            mineablePickaxeTag.add(Registries.BLOCK.getId(block));
        }

        // Walls still need to be in the WALL tag
        List<Block> walls = mineableBricks.stream()
            .filter(b -> b.getTranslationKey().contains("wall"))
            .toList();

        TagBuilder wallsTag = getTagBuilder(BlockTags.WALLS);
        for (Block wall : walls) {
            wallsTag.add(Registries.BLOCK.getId(wall));
        }
    }
}