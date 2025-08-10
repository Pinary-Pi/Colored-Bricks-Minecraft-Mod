package net.Pinary_Pi.gear.util;

import net.Pinary_Pi.coloredbricks.setup.block.ColoredFlowerPots;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

public class ModColorHandler {
    @SuppressWarnings("deprecation")
    private static void renderPottedFern(Block block) {
        Minecraft.getInstance().getBlockColors().register((state, reader, pos, tintIndex) ->
            reader != null && pos != null
            ? BiomeColors.getAverageGrassColor(reader, pos)
            : GrassColor.get(0.5D, 1.0D),
            block
        );
    }

    public static void setupRenderColors() {
        renderPottedFern(ColoredFlowerPots.WHITE_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.ORANGE_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.PINK_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.YELLOW_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.LIME_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.GREEN_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.LIGHT_BLUE_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.CYAN_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.BLUE_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.MAGENTA_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.PURPLE_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.BROWN_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.GRAY_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.LIGHT_GRAY_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.BLACK_POTTED_FERN.get());
        renderPottedFern(ColoredFlowerPots.RED_POTTED_FERN.get());
    }
}
