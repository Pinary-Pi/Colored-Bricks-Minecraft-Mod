package net.Pinary_Pi.coloredbricks;

import net.Pinary_Pi.coloredbricks.setup.ClientSetup;
//import net.Pinary_Pi.coloredbricks.setup.ClientSetup;
import net.Pinary_Pi.coloredbricks.setup.Registration;
import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceLocation;
// import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(coloredbricks.MOD_ID)
public class coloredbricks
{
    public static final String MOD_ID = "coloredbricks";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public coloredbricks(FMLJavaModLoadingContext context) {
        BusGroup modBusGroup = context.getModBusGroup();

        // Register ourselves for server and other game events we are interested in
        // MinecraftForge.EVENT_BUS.register(this);

        // MinecraftForge.EVENT_BUS.register(this);

        // Register the setup method for mod loading
        Registration.register(modBusGroup);
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(coloredbricks::setup);
        FMLClientSetupEvent.getBus(modBusGroup).addListener(ClientSetup::init);
    }

    public static ResourceLocation getId(String path) {
        if (path.contains(":")) {
            throw new IllegalArgumentException("path contains namespace");
        }
        return ModResourceLocation.create(path);
    }

    private static void setup(final FMLCommonSetupEvent event)
    {
        // some pre-init code
        LOGGER.info("HELLO FROM PRE-INIT");
        // LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}