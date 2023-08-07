package net.Pinary_Pi.coloredbricks.data.loot;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.Registration;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootDataId;
import net.minecraft.world.level.storage.loot.LootDataType;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends LootTableProvider {

    public ModBlockLootTables(DataGenerator gen) {
        super(gen.getPackOutput(), Collections.emptySet(), VanillaLootTableProvider.create(gen.getPackOutput()).getTables());
    }

    @Override
    public List<SubProviderEntry> getTables() {
        return ImmutableList.of(
                new SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
        map.forEach((name, loo) -> {
            loo.validate(validationContext.setParams(loo.getParamSet()).enterElement("{" + name + "}", new LootDataId<>(LootDataType.TABLE, name)));
        });
    }
    
    private static final class BlockLootTables extends BlockLootSubProvider {
        protected BlockLootTables() {
            super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            dropSelf(ModBlocks.WHITE_BRICKS.get());
            dropSelf(ModBlocks.ORANGE_BRICKS.get());
            dropSelf(ModBlocks.PINK_BRICKS.get());
            dropSelf(ModBlocks.YELLOW_BRICKS.get());
            dropSelf(ModBlocks.LIME_BRICKS.get());
            dropSelf(ModBlocks.GREEN_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_BLUE_BRICKS.get());
            dropSelf(ModBlocks.CYAN_BRICKS.get());
            dropSelf(ModBlocks.BLUE_BRICKS.get());
            dropSelf(ModBlocks.MAGENTA_BRICKS.get());
            dropSelf(ModBlocks.PURPLE_BRICKS.get());
            dropSelf(ModBlocks.BROWN_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_GRAY_BRICKS.get());
            dropSelf(ModBlocks.GRAY_BRICKS.get());
            dropSelf(ModBlocks.BLACK_BRICKS.get());
            dropSelf(ModBlocks.RED_BRICKS.get());
            createSlabItemTable(ModBlocks.WHITE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.WHITE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.ORANGE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.PINK_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.YELLOW_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIME_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.GREEN_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.CYAN_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BLUE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.MAGENTA_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.PURPLE_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BROWN_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.GRAY_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BLACK_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.RED_BRICK_SLAB.get());
            dropSelf(ModBlocks.WHITE_BRICK_STAIRS.get());
            dropSelf(ModBlocks.ORANGE_BRICK_STAIRS.get());
            dropSelf(ModBlocks.PINK_BRICK_STAIRS.get());
            dropSelf(ModBlocks.YELLOW_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIME_BRICK_STAIRS.get());
            dropSelf(ModBlocks.GREEN_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
            dropSelf(ModBlocks.CYAN_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BLUE_BRICK_STAIRS.get());
            dropSelf(ModBlocks.MAGENTA_BRICK_STAIRS.get());
            dropSelf(ModBlocks.PURPLE_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BROWN_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
            dropSelf(ModBlocks.GRAY_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BLACK_BRICK_STAIRS.get());
            dropSelf(ModBlocks.RED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.WHITE_BRICK_WALL.get());
            dropSelf(ModBlocks.ORANGE_BRICK_WALL.get());
            dropSelf(ModBlocks.PINK_BRICK_WALL.get());
            dropSelf(ModBlocks.YELLOW_BRICK_WALL.get());
            dropSelf(ModBlocks.LIME_BRICK_WALL.get());
            dropSelf(ModBlocks.GREEN_BRICK_WALL.get());
            dropSelf(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
            dropSelf(ModBlocks.CYAN_BRICK_WALL.get());
            dropSelf(ModBlocks.BLUE_BRICK_WALL.get());
            dropSelf(ModBlocks.MAGENTA_BRICK_WALL.get());
            dropSelf(ModBlocks.PURPLE_BRICK_WALL.get());
            dropSelf(ModBlocks.BROWN_BRICK_WALL.get());
            dropSelf(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
            dropSelf(ModBlocks.GRAY_BRICK_WALL.get());
            dropSelf(ModBlocks.BLACK_BRICK_WALL.get());
            dropSelf(ModBlocks.RED_BRICK_WALL.get());
            dropSelf(ModBlocks.WHITE_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.ORANGE_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.PINK_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.YELLOW_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.LIME_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.GREEN_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.CYAN_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.BLUE_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.MAGENTA_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.PURPLE_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.BROWN_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.GRAY_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.BLACK_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.RED_CHISELED_BRICKS.get());
            dropSelf(ModBlocks.CHISELED_BRICKS.get());
            dropSelf(ModBlocks.CRACKED_BRICKS.get());
            dropSelf(ModBlocks.WHITE_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.ORANGE_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.PINK_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.YELLOW_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.LIME_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.GREEN_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.CYAN_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.BLUE_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.MAGENTA_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.PURPLE_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.BROWN_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.GRAY_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.BLACK_CRACKED_BRICKS.get());
            dropSelf(ModBlocks.RED_CRACKED_BRICKS.get());
            createSlabItemTable(ModBlocks.CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.WHITE_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.PINK_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIME_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.GREEN_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.CYAN_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BLUE_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BROWN_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.GRAY_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.BLACK_CRACKED_BRICK_SLAB.get());
            createSlabItemTable(ModBlocks.RED_CRACKED_BRICK_SLAB.get());
            dropSelf(ModBlocks.CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.RED_CRACKED_BRICK_STAIRS.get());
            dropSelf(ModBlocks.CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.WHITE_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.PINK_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.LIME_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.GREEN_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.CYAN_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.BLUE_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.BROWN_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.GRAY_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.BLACK_CRACKED_BRICK_WALL.get());
            dropSelf(ModBlocks.RED_CRACKED_BRICK_WALL.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
