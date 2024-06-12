package net.Pinary_Pi.gear.util;

import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;

public class ModColorHandler {
    private static void renderPottedFern(Block block) {
        Minecraft.getInstance().getBlockColors().register((state, reader, pos, tintIndex) -> 
            reader != null && pos != null
            ? BiomeColors.getGrassColor(reader, pos)
            : GrassColors.get(0.5D, 1.0D),
            block
        );
    }

    public static void setupRenderColors() {
        renderPottedFern(ModBlocks.WHITE_POTTED_FERN.get());
        renderPottedFern(ModBlocks.ORANGE_POTTED_FERN.get());
        renderPottedFern(ModBlocks.PINK_POTTED_FERN.get());
        renderPottedFern(ModBlocks.YELLOW_POTTED_FERN.get());
        renderPottedFern(ModBlocks.LIME_POTTED_FERN.get());
        renderPottedFern(ModBlocks.GREEN_POTTED_FERN.get());
        renderPottedFern(ModBlocks.LIGHT_BLUE_POTTED_FERN.get());
        renderPottedFern(ModBlocks.CYAN_POTTED_FERN.get());
        renderPottedFern(ModBlocks.BLUE_POTTED_FERN.get());
        renderPottedFern(ModBlocks.MAGENTA_POTTED_FERN.get());
        renderPottedFern(ModBlocks.PURPLE_POTTED_FERN.get());
        renderPottedFern(ModBlocks.BROWN_POTTED_FERN.get());
        renderPottedFern(ModBlocks.GRAY_POTTED_FERN.get());
        renderPottedFern(ModBlocks.LIGHT_GRAY_POTTED_FERN.get());
        renderPottedFern(ModBlocks.BLACK_POTTED_FERN.get());
        renderPottedFern(ModBlocks.RED_POTTED_FERN.get());
    }
}
