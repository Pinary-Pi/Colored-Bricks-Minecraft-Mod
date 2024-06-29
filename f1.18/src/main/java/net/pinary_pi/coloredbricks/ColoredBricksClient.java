package net.pinary_pi.coloredbricks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.client.color.world.GrassColors;
import net.pinary_pi.coloredbricks.setup.ModBlocks;
import net.pinary_pi.coloredbricks.setup.list.PottedContent;

public class ColoredBricksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        ColoredBricks.LOGGER.info("Colored Bricks Client Setup");

        ColoredBricks.LOGGER.info("Render Blocks");
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_FLOWER_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_FLOWER_POT, RenderLayer.getCutout());

        for (PottedContent content : PottedContent.values()) {
            for (DyeColor dyeColor : DyeColor.values()) {
                String color = dyeColor.getName();
                Block emptyPot = Registry.BLOCK.get(new Identifier(ColoredBricks.MOD_ID, color + "_flower_pot"));
                String potted_name = Registry.ITEM.getId(emptyPot.asItem()).getPath().replace("flower_pot", "potted_") + content.getFlowerName();
                Block potted_block = Registry.BLOCK.get(new Identifier(ColoredBricks.MOD_ID, potted_name));
                // ColoredBricks.LOGGER.info(ColoredBricks.MOD_ID + ":" + potted_name);
                BlockRenderLayerMap.INSTANCE.putBlock(potted_block, RenderLayer.getCutout());
            }
        }

        renderPottedFern(getPottedFernVersion(ModBlocks.WHITE_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.ORANGE_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.PINK_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.YELLOW_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.LIME_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.GREEN_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.LIGHT_BLUE_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.CYAN_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.BLUE_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.MAGENTA_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.PURPLE_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.BROWN_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.LIGHT_GRAY_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.GRAY_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.BLACK_BRICKS));
        renderPottedFern(getPottedFernVersion(ModBlocks.RED_BRICKS));
    }

    private static void renderPottedFern(Block block) {
        ColorProviderRegistry.BLOCK.register((state, reader, pos, tintIndex) ->
            reader != null && pos != null
            ? BiomeColors.getGrassColor(reader, pos)
            : GrassColors.getColor(0.5D, 1.0D),
             block);
    }

    private static Block getPottedFernVersion(Block block) {
        String block_id = Registry.BLOCK.getId(block).getPath();
        String pot_id = block_id.replace("bricks", "potted_fern");
        return Registry.BLOCK.get(new Identifier(ColoredBricks.MOD_ID, pot_id));
    }
}