package net.pinary_pi.coloredbricks.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.setup.ModBlocks;

public class ModBlockTagsProvider extends BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static final TagKey<Block> BRICKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("coloredbricks:bricks"));

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BRICKS)
            .add(ModBlocks.WHITE_BRICKS)
            .add(ModBlocks.ORANGE_BRICKS)
            .add(ModBlocks.PINK_BRICKS)
            .add(ModBlocks.YELLOW_BRICKS)
            .add(ModBlocks.LIME_BRICKS)
            .add(ModBlocks.GREEN_BRICKS)
            .add(ModBlocks.LIGHT_BLUE_BRICKS)
            .add(ModBlocks.CYAN_BRICKS)
            .add(ModBlocks.BLUE_BRICKS)
            .add(ModBlocks.MAGENTA_BRICKS)
            .add(ModBlocks.PURPLE_BRICKS)
            .add(ModBlocks.BROWN_BRICKS)
            .add(ModBlocks.GRAY_BRICKS)
            .add(ModBlocks.LIGHT_GRAY_BRICKS)
            .add(ModBlocks.BLACK_BRICKS)
            .add(ModBlocks.RED_BRICKS);

        getTagBuilder(BlockTags.PICKAXE_MINEABLE).addTag(BRICKS.id());
    }
}
