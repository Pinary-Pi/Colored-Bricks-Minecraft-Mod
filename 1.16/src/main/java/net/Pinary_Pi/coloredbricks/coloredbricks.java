package net.Pinary_Pi.coloredbricks;

import net.Pinary_Pi.coloredbricks.setup.Features;
import net.Pinary_Pi.coloredbricks.setup.Registration;
import net.Pinary_Pi.gear.util.ColoredbricksRenderer;
import net.Pinary_Pi.gear.util.ModColorHandler;
import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.MissingMappings;
import net.minecraftforge.event.RegistryEvent.MissingMappings.Mapping;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import team.chisel.api.ChiselAPIProps;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.client.gui.PreviewType;
import team.chisel.common.carving.CarvingVariationRegistry;
import team.chisel.common.carving.ChiselModeRegistry;
import team.chisel.common.item.ChiselMode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(coloredbricks.MOD_ID)
public class coloredbricks
{
    public static final String MOD_ID = "coloredbricks";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public coloredbricks() {
        Registration.register();

        CarvingUtils.chisel = new CarvingVariationRegistry();
        CarvingUtils.modes = ChiselModeRegistry.INSTANCE;
        ChiselMode.values();
        PreviewType.values();
        ChiselAPIProps.MOD_ID = MOD_ID;

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ourselves for server and other game events we are interested in
        // MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.addGenericListener(Block.class, this::onMissingBlock);
        MinecraftForge.EVENT_BUS.addGenericListener(Item.class, this::onMissingItem);

        Features.init();

        // Register the setup method for mod loading
        bus.addListener(this::setup);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);
        bus.addListener(this::clientSetup);
        bus.addListener(ModColorHandler::register);

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ColoredbricksRenderer.registerRenderLayers();
        });
    }

   private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    public static ModResourceLocation getId(String path) {
        if (path.contains(":")) {
            throw new IllegalArgumentException("path contains namespace");
        }
        return new ModResourceLocation(path);
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    private static Map<String, Block> remaps = ImmutableMap.of();

    private void onMissingBlock(MissingMappings<Block> event) {
        for (Mapping<Block> mapping : event.getMappings(MOD_ID)) {
            Optional.ofNullable(remaps.get(mapping.key.getPath())).ifPresent(mapping::remap);
        }
    }
    
    private void onMissingItem(MissingMappings<Item> event) {
        for (Mapping<Item> mapping : event.getMappings(MOD_ID)) {
            Optional.ofNullable(remaps.get(mapping.key.getPath())).map(Block::asItem).ifPresent(mapping::remap);
        }
    }
}