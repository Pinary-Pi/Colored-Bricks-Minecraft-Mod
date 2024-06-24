package net.Pinary_Pi.coloredbricks.data;

import java.util.concurrent.CompletableFuture;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.data.client.ModBlockStateProvider;
import net.Pinary_Pi.coloredbricks.data.client.ModItemModelProvider;
// import net.Pinary_Pi.coloredbricks.data.loot.ModBlockLootTables;
import net.Pinary_Pi.coloredbricks.data.recipes.ModRecipesProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = coloredbricks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> registries = event.getLookupProvider();
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(event);

        gen.addProvider(true, new ModItemModelProvider(gen, existingFileHelper));
        gen.addProvider(true, new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(true, blockTags);
        gen.addProvider(true, new ModItemTagsProvider(event, blockTags));
        gen.addProvider(true, new ModRecipesProvider(gen, registries));
        // gen.addProvider(true, new ModBlockLootTables(gen));
    }
}