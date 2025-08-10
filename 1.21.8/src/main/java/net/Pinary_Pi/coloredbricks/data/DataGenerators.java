package net.Pinary_Pi.coloredbricks.data;


import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.data.client.ModModelProvider;
// import net.Pinary_Pi.coloredbricks.data.loot.ModBlockLootTables;
import net.Pinary_Pi.coloredbricks.data.recipes.ModRecipesProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = coloredbricks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(event);
        var packOutput = gen.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        gen.addProvider(event.includeClient(), new ModModelProvider(packOutput));
        gen.addProvider(true, blockTags);
        gen.addProvider(event.includeServer(), new ModRecipesProvider.Runner(packOutput, lookupProvider));
        // gen.addProvider(true, new ModBlockLootTables(gen));
    }
}