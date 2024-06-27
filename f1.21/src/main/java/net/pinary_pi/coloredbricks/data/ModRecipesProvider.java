package net.pinary_pi.coloredbricks.data;

import java.util.concurrent.CompletableFuture;

import org.javatuples.Pair;
import org.javatuples.Quintet;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;
import net.pinary_pi.coloredbricks.setup.ModBlocks;
import net.pinary_pi.coloredbricks.setup.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.ArrayList;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> DYEABLES = List.of(Items.BRICK,
                                                                  Blocks.BRICKS.asItem(),
                                                                  Blocks.BRICK_SLAB.asItem(),
                                                                  Blocks.BRICK_STAIRS.asItem(),
                                                                  Blocks.BRICK_WALL.asItem(),
                                                                  ModBlocks.CRACKED_BRICKS.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_SLAB.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_STAIRS.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_WALL.asItem(),
                                                                  ModBlocks.CHISELED_BRICKS.asItem());
    
    private static final List<ItemConvertible> DYES = List.of(Items.WHITE_DYE,
                                                              Items.ORANGE_DYE,
                                                              Items.PINK_DYE,
                                                              Items.YELLOW_DYE,
                                                              Items.LIME_DYE,
                                                              Items.GREEN_DYE,
                                                              Items.LIGHT_BLUE_DYE,
                                                              Items.CYAN_DYE,
                                                              Items.BLUE_DYE,
                                                              Items.MAGENTA_DYE,
                                                              Items.PURPLE_DYE,
                                                              Items.BROWN_DYE,
                                                              Items.LIGHT_GRAY_DYE,
                                                              Items.GRAY_DYE,
                                                              Items.BLACK_DYE,
                                                              Items.RED_DYE);

    private static final List<Pair<ItemConvertible, ItemConvertible>> COMPACT_2BY2_INPUTS_OUTPUTS = List.of(Pair.with(ModItems.WHITE_BRICK, ModBlocks.WHITE_BRICKS),
                                                                                                            Pair.with(ModItems.ORANGE_BRICK, ModBlocks.ORANGE_BRICKS),
                                                                                                            Pair.with(ModItems.PINK_BRICK, ModBlocks.PINK_BRICKS),
                                                                                                            Pair.with(ModItems.YELLOW_BRICK, ModBlocks.YELLOW_BRICKS),
                                                                                                            Pair.with(ModItems.LIME_BRICK, ModBlocks.LIME_BRICKS),
                                                                                                            Pair.with(ModItems.GREEN_BRICK, ModBlocks.GREEN_BRICKS),
                                                                                                            Pair.with(ModItems.LIGHT_BLUE_BRICK, ModBlocks.LIGHT_BLUE_BRICKS),
                                                                                                            Pair.with(ModItems.CYAN_BRICK, ModBlocks.CYAN_BRICKS),
                                                                                                            Pair.with(ModItems.BLUE_BRICK, ModBlocks.BLUE_BRICKS),
                                                                                                            Pair.with(ModItems.MAGENTA_BRICK, ModBlocks.MAGENTA_BRICKS),
                                                                                                            Pair.with(ModItems.PURPLE_BRICK, ModBlocks.PURPLE_BRICKS),
                                                                                                            Pair.with(ModItems.BROWN_BRICK, ModBlocks.BROWN_BRICKS),
                                                                                                            Pair.with(ModItems.LIGHT_GRAY_BRICK, ModBlocks.LIGHT_GRAY_BRICKS),
                                                                                                            Pair.with(ModItems.GRAY_BRICK, ModBlocks.GRAY_BRICKS),
                                                                                                            Pair.with(ModItems.BLACK_BRICK, ModBlocks.BLACK_BRICKS),
                                                                                                            Pair.with(ModItems.RED_BRICK, ModBlocks.RED_BRICKS));
    private static final List<ItemConvertible> BLOCKS = List.of(ModBlocks.WHITE_BRICKS,
                                                                ModBlocks.ORANGE_BRICKS,
                                                                ModBlocks.PINK_BRICKS,
                                                                ModBlocks.YELLOW_BRICKS,
                                                                ModBlocks.LIME_BRICKS,
                                                                ModBlocks.GREEN_BRICKS,
                                                                ModBlocks.LIGHT_BLUE_BRICKS,
                                                                ModBlocks.CYAN_BRICKS,
                                                                ModBlocks.BLUE_BRICKS,
                                                                ModBlocks.MAGENTA_BRICKS,
                                                                ModBlocks.PURPLE_BRICKS,
                                                                ModBlocks.BROWN_BRICKS,
                                                                ModBlocks.LIGHT_GRAY_BRICKS,
                                                                ModBlocks.GRAY_BRICKS,
                                                                ModBlocks.BLACK_BRICKS,
                                                                ModBlocks.RED_BRICKS,
                                                                ModBlocks.CRACKED_BRICKS,
                                                                ModBlocks.WHITE_CRACKED_BRICKS,
                                                                ModBlocks.ORANGE_CRACKED_BRICKS,
                                                                ModBlocks.PINK_CRACKED_BRICKS,
                                                                ModBlocks.YELLOW_CRACKED_BRICKS,
                                                                ModBlocks.LIME_CRACKED_BRICKS,
                                                                ModBlocks.GREEN_CRACKED_BRICKS,
                                                                ModBlocks.LIGHT_BLUE_CRACKED_BRICKS,
                                                                ModBlocks.CYAN_CRACKED_BRICKS,
                                                                ModBlocks.BLUE_CRACKED_BRICKS,
                                                                ModBlocks.MAGENTA_CRACKED_BRICKS,
                                                                ModBlocks.PURPLE_CRACKED_BRICKS,
                                                                ModBlocks.BROWN_CRACKED_BRICKS,
                                                                ModBlocks.LIGHT_GRAY_CRACKED_BRICKS,
                                                                ModBlocks.GRAY_CRACKED_BRICKS,
                                                                ModBlocks.BLACK_CRACKED_BRICKS,
                                                                ModBlocks.RED_CRACKED_BRICKS);

    private static final List<Pair<ItemConvertible, ItemConvertible>> CRACKED_PAIRS = List.of(
        Pair.with(ModBlocks.WHITE_BRICKS, ModBlocks.WHITE_CRACKED_BRICKS),
        Pair.with(ModBlocks.ORANGE_BRICKS, ModBlocks.ORANGE_CRACKED_BRICKS),
        Pair.with(ModBlocks.PINK_BRICKS, ModBlocks.PINK_CRACKED_BRICKS),
        Pair.with(ModBlocks.YELLOW_BRICKS, ModBlocks.YELLOW_CRACKED_BRICKS),
        Pair.with(ModBlocks.LIME_BRICKS, ModBlocks.LIME_CRACKED_BRICKS),
        Pair.with(ModBlocks.GREEN_BRICKS, ModBlocks.GREEN_CRACKED_BRICKS),
        Pair.with(ModBlocks.LIGHT_BLUE_BRICKS, ModBlocks.LIGHT_BLUE_CRACKED_BRICKS),
        Pair.with(ModBlocks.CYAN_BRICKS, ModBlocks.CYAN_CRACKED_BRICKS),
        Pair.with(ModBlocks.BLUE_BRICKS, ModBlocks.BLUE_CRACKED_BRICKS),
        Pair.with(ModBlocks.MAGENTA_BRICKS, ModBlocks.MAGENTA_CRACKED_BRICKS),
        Pair.with(ModBlocks.PURPLE_BRICKS, ModBlocks.PURPLE_CRACKED_BRICKS),
        Pair.with(ModBlocks.BROWN_BRICKS, ModBlocks.BROWN_CRACKED_BRICKS),
        Pair.with(ModBlocks.LIGHT_GRAY_BRICKS, ModBlocks.LIGHT_GRAY_CRACKED_BRICKS),
        Pair.with(ModBlocks.GRAY_BRICKS, ModBlocks.GRAY_CRACKED_BRICKS),
        Pair.with(ModBlocks.BLACK_BRICKS, ModBlocks.BLACK_CRACKED_BRICKS),
        Pair.with(ModBlocks.RED_BRICKS, ModBlocks.RED_CRACKED_BRICKS)
    );

    public static void offerCrackingRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), RecipeCategory.BUILDING_BLOCKS, output, 0.1F, 200)
			.criterion(hasItem(input), conditionsFromItem(input))
			.offerTo(exporter, "cracking_" + Registries.ITEM.getId(input.asItem()).getPath());
	}

    private static List<Quintet<ItemConvertible, ItemConvertible, ItemConvertible, ItemConvertible, ItemConvertible>> STONECUTTING_BLOCKS = new ArrayList<>();

    private static void addStoneCuttingBlocks() {
        for (ItemConvertible block : BLOCKS) {
            if (Registries.ITEM.getId(block.asItem()).getPath().contains("cracked")) {
                STONECUTTING_BLOCKS.add(Quintet.with(block, getSlabVersion(block), getStairVersion(block), getWallVersion(block), null));
            } else {
                STONECUTTING_BLOCKS.add(Quintet.with(block, getSlabVersion(block), getStairVersion(block), getWallVersion(block), getChiseledVersion(block)));
            }
        }
    }

    private static Item getSlabVersion(ItemConvertible block) {
        String block_id = Registries.ITEM.getId(block.asItem()).getPath();
        String slab_id = block_id.replace("bricks", "brick_slab");
        return Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, slab_id));
    }

    private static Item getStairVersion(ItemConvertible block) {
        String block_id = Registries.ITEM.getId(block.asItem()).getPath();
        String stair_id = block_id.replace("bricks", "brick_stairs");
        return Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, stair_id));
    }

    private static Item getWallVersion(ItemConvertible block) {
        String block_id = Registries.ITEM.getId(block.asItem()).getPath();
        String wall_id = block_id.replace("bricks", "brick_wall");
        return Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, wall_id));
    }

    private static Item getChiseledVersion(ItemConvertible block) {
        String block_id = Registries.ITEM.getId(block.asItem()).getPath();
        String chiseled_id = block_id.replace("bricks", "chiseled_bricks");
        ColoredBricks.LOGGER.info(Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, chiseled_id)).toString());
        return Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, chiseled_id));
    }

    private static void offerDyeableRecipes(RecipeExporter exporter, List<ItemConvertible> dyes, List<ItemConvertible> dyeables) {
        for (ItemConvertible dyeable : dyeables) {
            for (ItemConvertible dye : dyes) {
                Item output = getDyedVersion(dyeable, dye);

                ColoredBricks.LOGGER.info("Dye: " + dye.toString());
                ColoredBricks.LOGGER.info("Dyeable: " + dyeable.toString());
                ColoredBricks.LOGGER.info("Output: " + output.toString());

                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                    .input(dye)
                    .input(dyeable)
                    .criterion(hasItem(dye), conditionsFromItem(dye))
                    .offerTo(exporter, "dye_" + Registries.ITEM.getId(output).getPath());
            }
        }
    }

    private static Item getDyedVersion(ItemConvertible dyeable, ItemConvertible dye) {
        String dye_id = Registries.ITEM.getId(dye.asItem()).getPath();
        String dyeable_id = Registries.ITEM.getId(dyeable.asItem()).getPath();
        String dyed_version_id = dye_id.replace("dye", "") + dyeable_id;
        ColoredBricks.LOGGER.info(Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, dyed_version_id)).toString());
        return Registries.ITEM.get(Identifier.of(ColoredBricks.MOD_ID, dyed_version_id));
    }
    
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ColoredBricks.LOGGER.info("Starting recipe generation for Colored Bricks");

        // Dye Recipes
        offerDyeableRecipes(exporter, DYES, DYEABLES);

        // Compacting Recipes
        for (Pair<ItemConvertible, ItemConvertible> pair : COMPACT_2BY2_INPUTS_OUTPUTS) {
            ItemConvertible input = pair.getValue0();
            ItemConvertible output = pair.getValue1();

            offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, output, input);
        }

        // Slab, Stair, Wall, and Chiseled Block Recipes
        for (ItemConvertible block : BLOCKS) {
            ItemConvertible slab = getSlabVersion(block);
            ItemConvertible stair = getStairVersion(block);
            ItemConvertible wall = getWallVersion(block);

            offerSlabRecipe(exporter, RecipeCategory.MISC, slab, block);
            createStairsRecipe(stair, Ingredient.ofItems(block))
                .criterion(hasItem(block), conditionsFromItem(block))
                .offerTo(exporter);
            offerWallRecipe(exporter, RecipeCategory.MISC, wall, block);
            if (Registries.ITEM.getId(block.asItem()).getPath().contains("cracked")) {
                continue;
            } else {
                ItemConvertible chiseled = getChiseledVersion(block);

                offerChiseledBlockRecipe(exporter, RecipeCategory.MISC, chiseled, slab);
            }
        }

        offerChiseledBlockRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB);

        // Stonecutting Recipes
        addStoneCuttingBlocks();

        for (Quintet<ItemConvertible, ItemConvertible, ItemConvertible, ItemConvertible, ItemConvertible> set : STONECUTTING_BLOCKS) {
            ItemConvertible block = set.getValue0();
            ItemConvertible slab = set.getValue1();
            ItemConvertible stair = set.getValue2();
            ItemConvertible wall = set.getValue3();
            ItemConvertible chiseled = set.getValue4();
            
            if (Registries.ITEM.getId(block.asItem()).getPath().contains("cracked")) {
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, slab, block, 2);
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, stair, block);
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, wall, block);
            } else {
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, slab, block, 2);
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, stair, block);
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, wall, block);
                offerStonecuttingRecipe(exporter, RecipeCategory.MISC, chiseled, block);
            }
        }

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_BRICKS, Blocks.BRICKS);

        // Cracking Recipes/Smelting Recipes

        for (Pair<ItemConvertible, ItemConvertible> pair : CRACKED_PAIRS) {
            ItemConvertible block = pair.getValue0();
            ItemConvertible cracked_block = pair.getValue1();
            ItemConvertible slab = getSlabVersion(block);
            ItemConvertible cracked_slab = getSlabVersion(cracked_block);
            ItemConvertible stair = getStairVersion(block);
            ItemConvertible cracked_stair = getStairVersion(cracked_block);
            ItemConvertible wall = getWallVersion(block);
            ItemConvertible cracked_wall = getWallVersion(cracked_block);

            offerCrackingRecipe(exporter, cracked_block, block);
            offerCrackingRecipe(exporter, cracked_slab, slab);
            offerCrackingRecipe(exporter, cracked_stair, stair);
            offerCrackingRecipe(exporter, cracked_wall, wall);
        }

        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BRICKS, Blocks.BRICKS);
        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BRICK_SLAB, Blocks.BRICK_SLAB);
        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BRICK_STAIRS, Blocks.BRICK_STAIRS);
        offerCrackingRecipe(exporter, ModBlocks.CRACKED_BRICK_WALL, Blocks.BRICK_WALL);
    }
}