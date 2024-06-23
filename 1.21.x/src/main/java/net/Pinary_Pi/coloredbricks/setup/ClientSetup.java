package net.Pinary_Pi.coloredbricks.setup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.gear.util.ModColorHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = coloredbricks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void init(final FMLClientSetupEvent event) {
        event.enqueueWork(ModColorHandler::setupRenderColors);
        LOGGER.info("Client Setup for Potted Ferns");
    }
}
