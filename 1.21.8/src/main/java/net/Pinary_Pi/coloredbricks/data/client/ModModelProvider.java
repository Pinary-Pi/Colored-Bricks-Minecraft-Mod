package net.Pinary_Pi.coloredbricks.data.client;
import java.util.stream.Stream;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.block.BrickBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickSlabBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickStairsBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickWallBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.ColoredFlowerPots;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(Dist.CLIENT)
public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected Stream<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
            .filter(block -> coloredbricks.MOD_ID.equals(
                ForgeRegistries.BLOCKS.getKey(block).getNamespace()
            ))
            .filter(block -> !(block instanceof FlowerPotBlock));
    }
    
    @Override
    protected Stream<Item> getKnownItems() {
        return ForgeRegistries.ITEMS.getValues().stream()
            .filter(item -> coloredbricks.MOD_ID.equals(
                ForgeRegistries.ITEMS.getKey(item).getNamespace()
            ));
    }

    @Override
    protected BlockModelGenerators getBlockModelGenerators(BlockStateGeneratorCollector blocks, ItemInfoCollector items, SimpleModelCollector models) {
        BlockModelGenerators gen = new BlockModelGenerators(blocks, items, models) {

            @Override
            public void run() {
                // Brick Blocks

                System.out.println("Generating: Brick Blocks Block States");
                family(BrickBlocks.WHITE_BRICKS.get())
                    .slab(BrickSlabBlocks.WHITE_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.WHITE_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.WHITE_BRICK_WALL.get());
                family(BrickBlocks.ORANGE_BRICKS.get())
                    .slab(BrickSlabBlocks.ORANGE_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.ORANGE_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.ORANGE_BRICK_WALL.get());
                family(BrickBlocks.PINK_BRICKS.get())
                    .slab(BrickSlabBlocks.PINK_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.PINK_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.PINK_BRICK_WALL.get());
                family(BrickBlocks.YELLOW_BRICKS.get())
                    .slab(BrickSlabBlocks.YELLOW_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.YELLOW_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.YELLOW_BRICK_WALL.get());
                family(BrickBlocks.LIME_BRICKS.get())
                    .slab(BrickSlabBlocks.LIME_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIME_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIME_BRICK_WALL.get());
                family(BrickBlocks.GREEN_BRICKS.get())
                    .slab(BrickSlabBlocks.GREEN_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.GREEN_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.GREEN_BRICK_WALL.get());
                family(BrickBlocks.LIGHT_BLUE_BRICKS.get())
                    .slab(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get());
                family(BrickBlocks.CYAN_BRICKS.get())
                    .slab(BrickSlabBlocks.CYAN_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.CYAN_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.CYAN_BRICK_WALL.get());
                family(BrickBlocks.BLUE_BRICKS.get())
                    .slab(BrickSlabBlocks.BLUE_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BLUE_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BLUE_BRICK_WALL.get());
                family(BrickBlocks.MAGENTA_BRICKS.get())
                    .slab(BrickSlabBlocks.MAGENTA_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.MAGENTA_BRICK_WALL.get());
                family(BrickBlocks.PURPLE_BRICKS.get())
                    .slab(BrickSlabBlocks.PURPLE_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.PURPLE_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.PURPLE_BRICK_WALL.get());
                family(BrickBlocks.BROWN_BRICKS.get())
                    .slab(BrickSlabBlocks.BROWN_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BROWN_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BROWN_BRICK_WALL.get());
                family(BrickBlocks.GRAY_BRICKS.get())
                    .slab(BrickSlabBlocks.GRAY_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.GRAY_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.GRAY_BRICK_WALL.get());
                family(BrickBlocks.LIGHT_GRAY_BRICKS.get())
                    .slab(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get());
                family(BrickBlocks.BLACK_BRICKS.get())
                    .slab(BrickSlabBlocks.BLACK_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BLACK_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BLACK_BRICK_WALL.get());
                family(BrickBlocks.RED_BRICKS.get())
                    .slab(BrickSlabBlocks.RED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.RED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.RED_BRICK_WALL.get());

                // Chiseled Bricks

                System.out.println("Generating: Chiseled Brick Blocks Block States");
                createTrivialCube(BrickBlocks.WHITE_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.ORANGE_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.PINK_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.YELLOW_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.LIME_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.GREEN_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.CYAN_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.BLUE_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.MAGENTA_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.PURPLE_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.BROWN_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.GRAY_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.BLACK_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.RED_CHISELED_BRICKS.get());
                createTrivialCube(BrickBlocks.CHISELED_BRICKS.get());

                // Cracked Bricks

                System.out.println("Generating: Cracked Brick Blocks Block States");
                family(BrickBlocks.CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.CRACKED_BRICK_WALL.get());
                family(BrickBlocks.WHITE_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.ORANGE_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.PINK_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.YELLOW_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.LIME_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.GREEN_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.CYAN_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.BLUE_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.MAGENTA_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.PURPLE_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.BROWN_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.GRAY_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.BLACK_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get());
                family(BrickBlocks.RED_CRACKED_BRICKS.get())
                    .slab(BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.get())
                    .stairs(BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.get())
                    .wall(BrickWallBlocks.RED_CRACKED_BRICK_WALL.get());

                System.out.println("Generating: Brick Blocks Items");
                registerSimpleItemModel(BrickBlocks.WHITE_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.WHITE_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.ORANGE_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.ORANGE_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PINK_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PINK_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.YELLOW_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.YELLOW_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIME_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIME_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GREEN_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GREEN_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_BLUE_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.CYAN_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.CYAN_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLUE_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLUE_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.MAGENTA_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.MAGENTA_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PURPLE_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PURPLE_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BROWN_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BROWN_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GRAY_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GRAY_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_GRAY_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLACK_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLACK_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.RED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.RED_BRICKS.get()));

                System.out.println("Generating: Cracked Brick Blocks Items");
                registerSimpleItemModel(BrickBlocks.CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.WHITE_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.ORANGE_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PINK_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.YELLOW_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIME_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GREEN_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.CYAN_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLUE_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.MAGENTA_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PURPLE_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BROWN_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GRAY_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLACK_CRACKED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.RED_CRACKED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.RED_CRACKED_BRICKS.get()));

                System.out.println("Generating: Chiseled Brick Blocks Items");
                registerSimpleItemModel(BrickBlocks.CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.WHITE_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.WHITE_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.ORANGE_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.ORANGE_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PINK_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PINK_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.YELLOW_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.YELLOW_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIME_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIME_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GREEN_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GREEN_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.CYAN_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.CYAN_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLUE_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLUE_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.MAGENTA_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.MAGENTA_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.PURPLE_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.PURPLE_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BROWN_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BROWN_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.GRAY_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.GRAY_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.BLACK_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.BLACK_CHISELED_BRICKS.get()));
                registerSimpleItemModel(BrickBlocks.RED_CHISELED_BRICKS.get().asItem(), ModelLocationUtils.getModelLocation(BrickBlocks.RED_CHISELED_BRICKS.get()));

                System.out.println("Generating: Flower Pot Items");
                registerSimpleFlatItemModel(ColoredFlowerPots.WHITE_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.ORANGE_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.PINK_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.YELLOW_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.LIME_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.GREEN_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.LIGHT_BLUE_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.CYAN_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.BLUE_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.MAGENTA_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.PURPLE_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.BROWN_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.LIGHT_GRAY_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.GRAY_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.BLACK_FLOWER_POT.get().asItem());
                registerSimpleFlatItemModel(ColoredFlowerPots.RED_FLOWER_POT.get().asItem());
            }
        };
        return gen;
    }

    @Override
    protected ItemModelGenerators getItemModelGenerators(ItemInfoCollector items, SimpleModelCollector model) {
        ItemModelGenerators gen = new ItemModelGenerators(items, model) {
            
            @Override
            public void run() {
                System.out.println("Generating: Item Models");
                generateFlatItem(ModItems.WHITE_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.ORANGE_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.PINK_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.YELLOW_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.LIME_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.GREEN_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.LIGHT_BLUE_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.CYAN_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.BLUE_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.MAGENTA_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.PURPLE_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.BROWN_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.GRAY_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.LIGHT_GRAY_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.BLACK_BRICK.get(), ModelTemplates.FLAT_ITEM);
                generateFlatItem(ModItems.RED_BRICK.get(), ModelTemplates.FLAT_ITEM);
            }
        };
        return gen;
    }
}
