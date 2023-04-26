package net.Pinary_Pi.gear.util;

import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModColorHandler {
    @SubscribeEvent
    public static void register(final ColorHandlerEvent.Block event)
    {
        event.getBlockColors().register(
            (blockState, reader, blockPos, tintIndex) -> {
                return reader != null && blockPos != null ? BiomeColors.getGrassColor(reader, blockPos) : GrassColors.get(0.5D, 1.0D);
             },
            ModBlocks.WHITE_POTTED_FERN.get(),
            ModBlocks.ORANGE_POTTED_FERN.get(),
            ModBlocks.PINK_POTTED_FERN.get(),
            ModBlocks.YELLOW_POTTED_FERN.get(),
            ModBlocks.LIME_POTTED_FERN.get(),
            ModBlocks.GREEN_POTTED_FERN.get(),
            ModBlocks.LIGHT_BLUE_POTTED_FERN.get(),
            ModBlocks.CYAN_POTTED_FERN.get(),
            ModBlocks.BLUE_POTTED_FERN.get(),
            ModBlocks.MAGENTA_POTTED_FERN.get(),
            ModBlocks.PURPLE_POTTED_FERN.get(),
            ModBlocks.BROWN_POTTED_FERN.get(),
            ModBlocks.GRAY_POTTED_FERN.get(),
            ModBlocks.LIGHT_GRAY_POTTED_FERN.get(),
            ModBlocks.BLACK_POTTED_FERN.get(),
            ModBlocks.RED_POTTED_FERN.get());
    }
}
