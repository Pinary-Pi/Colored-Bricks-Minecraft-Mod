package net.Pinary_Pi.coloredbricks.data.recipes;

import java.util.function.Consumer;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Brick Item Recipes

        ShapelessRecipeBuilder.shapeless(ModItems.WHITE_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ORANGE_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.PINK_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.YELLOW_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.LIME_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.GREEN_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.LIGHT_BLUE_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.CYAN_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.BLUE_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.MAGENTA_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.PURPLE_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.BROWN_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.LIGHT_GRAY_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.GRAY_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.BLACK_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.RED_BRICK.get())
        .requires(Tags.Items.INGOTS_BRICK)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(Tags.Items.INGOTS_BRICK))
        .save(consumer);

        // Brick Block Recipes

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_BRICKS.get())
        .define('#', ModTags.Items.BRICK_WHITE)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_WHITE))
        .save(consumer, coloredbricks.getId("white_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_BRICKS.get())
        .define('#', ModTags.Items.BRICK_ORANGE)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_ORANGE))
        .save(consumer, coloredbricks.getId("orange_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_BRICKS.get())
        .define('#', ModTags.Items.BRICK_PINK)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_PINK))
        .save(consumer, coloredbricks.getId("pink_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_BRICKS.get())
        .define('#', ModTags.Items.BRICK_YELLOW)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIME_BRICKS.get())
        .define('#', ModTags.Items.BRICK_LIME)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_LIME))
        .save(consumer, coloredbricks.getId("lime_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_BRICKS.get())
        .define('#', ModTags.Items.BRICK_GREEN)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_GREEN))
        .save(consumer, coloredbricks.getId("green_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .define('#', ModTags.Items.BRICK_LIGHT_BLUE)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_BRICKS.get())
        .define('#', ModTags.Items.BRICK_CYAN)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_CYAN))
        .save(consumer, coloredbricks.getId("cyan_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_BRICKS.get())
        .define('#', ModTags.Items.BRICK_BLUE)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_BLUE))
        .save(consumer, coloredbricks.getId("blue_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_BRICKS.get())
        .define('#', ModTags.Items.BRICK_MAGENTA)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_BRICKS.get())
        .define('#', ModTags.Items.BRICK_PURPLE)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_PURPLE))
        .save(consumer, coloredbricks.getId("purple_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_BRICKS.get())
        .define('#', ModTags.Items.BRICK_BROWN)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_BROWN))
        .save(consumer, coloredbricks.getId("brown_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .define('#', ModTags.Items.BRICK_LIGHT_GRAY)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_BRICKS.get())
        .define('#', ModTags.Items.BRICK_GRAY)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_GRAY))
        .save(consumer, coloredbricks.getId("gray_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_BRICKS.get())
        .define('#', ModTags.Items.BRICK_BLACK)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_BLACK))
        .save(consumer, coloredbricks.getId("black_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.RED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_RED)
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModTags.Items.BRICK_RED))
        .save(consumer, coloredbricks.getId("red_bricks_alt"));

        // Slabs

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_WHITE)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
        .save(consumer, coloredbricks.getId("white_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_ORANGE)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
        .save(consumer, coloredbricks.getId("orange_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_PINK)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
        .save(consumer, coloredbricks.getId("pink_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_YELLOW)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIME_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIME)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
        .save(consumer, coloredbricks.getId("lime_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_GREEN)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
        .save(consumer, coloredbricks.getId("green_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_CYAN)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
        .save(consumer, coloredbricks.getId("cyan_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_BLUE)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
        .save(consumer, coloredbricks.getId("blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_MAGENTA)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_PURPLE)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
        .save(consumer, coloredbricks.getId("purple_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_BROWN)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
        .save(consumer, coloredbricks.getId("brown_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_GRAY)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
        .save(consumer, coloredbricks.getId("gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_BLACK)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
        .save(consumer, coloredbricks.getId("black_brick_slab_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.RED_BRICK_SLAB.get(), 6)
        .define('#', ModTags.Items.BRICKS_RED)
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
        .save(consumer, coloredbricks.getId("red_brick_slab_alt"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
            .save(consumer, coloredbricks.getId("white_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
            .save(consumer, coloredbricks.getId("pink_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
            .save(consumer, coloredbricks.getId("lime_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
            .save(consumer, coloredbricks.getId("green_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
            .save(consumer, coloredbricks.getId("blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
            .save(consumer, coloredbricks.getId("brown_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
            .save(consumer, coloredbricks.getId("gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
            .save(consumer, coloredbricks.getId("black_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
            .save(consumer, coloredbricks.getId("red_brick_slab_stonecutter"));

        // Stairs 

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_WHITE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
        .save(consumer, coloredbricks.getId("white_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_ORANGE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
        .save(consumer, coloredbricks.getId("orange_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_PINK)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
        .save(consumer, coloredbricks.getId("pink_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_YELLOW)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIME_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_LIME)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
        .save(consumer, coloredbricks.getId("lime_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_GREEN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
        .save(consumer, coloredbricks.getId("green_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CYAN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
        .save(consumer, coloredbricks.getId("cyan_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_BLUE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
        .save(consumer, coloredbricks.getId("blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_MAGENTA)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_PURPLE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
        .save(consumer, coloredbricks.getId("purple_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_BROWN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
        .save(consumer, coloredbricks.getId("brown_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_BLACK)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
        .save(consumer, coloredbricks.getId("black_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.RED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_RED)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
        .save(consumer, coloredbricks.getId("red_brick_stairs_alt"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
            .save(consumer, coloredbricks.getId("white_brick_stairs_stonecutter"));
            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_brick_stairs_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
            .save(consumer, coloredbricks.getId("pink_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
            .save(consumer, coloredbricks.getId("lime_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
            .save(consumer, coloredbricks.getId("green_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
            .save(consumer, coloredbricks.getId("blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
            .save(consumer, coloredbricks.getId("brown_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
            .save(consumer, coloredbricks.getId("gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
            .save(consumer, coloredbricks.getId("black_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
            .save(consumer, coloredbricks.getId("red_brick_stairs_stonecutter"));
            
        // Walls

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_WHITE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
        .save(consumer, coloredbricks.getId("white_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_ORANGE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
        .save(consumer, coloredbricks.getId("orange_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_PINK)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
        .save(consumer, coloredbricks.getId("pink_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_YELLOW)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIME_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIME)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
        .save(consumer, coloredbricks.getId("lime_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_GREEN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
        .save(consumer, coloredbricks.getId("green_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CYAN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
        .save(consumer, coloredbricks.getId("cyan_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_BLUE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
        .save(consumer, coloredbricks.getId("blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_MAGENTA)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_PURPLE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
        .save(consumer, coloredbricks.getId("purple_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_BROWN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
        .save(consumer, coloredbricks.getId("brown_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_GRAY)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
        .save(consumer, coloredbricks.getId("gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_BLACK)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
        .save(consumer, coloredbricks.getId("black_brick_wall_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.RED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_RED)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
        .save(consumer, coloredbricks.getId("red_brick_wall_alt")); 

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
            .save(consumer, coloredbricks.getId("white_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
            .save(consumer, coloredbricks.getId("pink_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
            .save(consumer, coloredbricks.getId("lime_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
            .save(consumer, coloredbricks.getId("green_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
            .save(consumer, coloredbricks.getId("blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
            .save(consumer, coloredbricks.getId("brown_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
            .save(consumer, coloredbricks.getId("gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
            .save(consumer, coloredbricks.getId("black_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
            .save(consumer, coloredbricks.getId("red_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_WHITE),
            ModBlocks.WHITE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
            .save(consumer, coloredbricks.getId("white_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_ORANGE),
            ModBlocks.ORANGE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PINK),
            ModBlocks.PINK_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
            .save(consumer, coloredbricks.getId("pink_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_YELLOW),
            ModBlocks.YELLOW_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIME),
            ModBlocks.LIME_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
            .save(consumer, coloredbricks.getId("lime_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GREEN),
            ModBlocks.GREEN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
            .save(consumer, coloredbricks.getId("green_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CYAN),
            ModBlocks.CYAN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLUE),
            ModBlocks.BLUE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
            .save(consumer, coloredbricks.getId("blue_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_MAGENTA),
            ModBlocks.MAGENTA_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_PURPLE),
            ModBlocks.PURPLE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BROWN),
            ModBlocks.BROWN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
            .save(consumer, coloredbricks.getId("brown_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_GRAY),
            ModBlocks.GRAY_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
            .save(consumer, coloredbricks.getId("gray_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_BLACK),
            ModBlocks.BLACK_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
            .save(consumer, coloredbricks.getId("black_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_RED),
            ModBlocks.RED_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
            .save(consumer, coloredbricks.getId("red_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            Blocks.BRICKS.asItem()),
            ModBlocks.CHISELED_BRICKS.get())
            .unlockedBy("has item", has(Blocks.BRICKS))
            .save(consumer, coloredbricks.getId("chiseled_bricks_stonecutter"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_WHITE)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_WHITE))
        .save(consumer, coloredbricks.getId("white_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_ORANGE)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_ORANGE))
        .save(consumer, coloredbricks.getId("orange_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_PINK)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_PINK))
        .save(consumer, coloredbricks.getId("pink_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_YELLOW)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_LIME)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIME))
        .save(consumer, coloredbricks.getId("lime_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_GREEN)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_GREEN))
        .save(consumer, coloredbricks.getId("green_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_LIGHT_BLUE)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_CYAN)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CYAN))
        .save(consumer, coloredbricks.getId("cyan_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_BLUE)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BLUE))
        .save(consumer, coloredbricks.getId("blue_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_MAGENTA)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_PURPLE)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_PURPLE))
        .save(consumer, coloredbricks.getId("purple_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_BROWN)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BROWN))
        .save(consumer, coloredbricks.getId("brown_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_LIGHT_GRAY)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_GRAY)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_GRAY))
        .save(consumer, coloredbricks.getId("gray_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_BLACK)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BLACK))
        .save(consumer, coloredbricks.getId("black_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_CHISELED_BRICKS.get())
        .requires(ModBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(ModBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.RED_CHISELED_BRICKS.get())
        .define('#', ModTags.Items.BRICK_SLAB_RED)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_RED))
        .save(consumer, coloredbricks.getId("red_chiseled_bricks_alt"));

        ShapedRecipeBuilder.shaped(ModBlocks.CHISELED_BRICKS.get())
        .define('#', Blocks.BRICK_SLAB)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_CRACKED_BRICKS.get())
        .requires(ModTags.Items.BRICKS_CRACKED)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer); 

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICKS.asItem()), 
            ModBlocks.CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICKS.asItem()))
            .save(consumer, coloredbricks.getId("cracked_bricks_furnace"));
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_bricks_furnace"));     
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_bricks_furnace"));
                
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_bricks_furnace"));
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_bricks_furnace"));
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_bricks_furnace"));  
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_bricks_furnace"));
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_bricks_furnace"));
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_bricks_furnace")); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_bricks_furnace"));  
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_bricks_furnace"));
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_RED))
            .save(consumer, coloredbricks.getId("red_cracked_bricks_furnace"));
                                
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_SLAB.asItem()), 
            ModBlocks.CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_SLAB.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_slab_furnace"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_slab_furnace"));  
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_slab_furnace"));       
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_slab_furnace"));
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_slab_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_SLAB_RED), 
            ModBlocks.RED_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_slab_furnace"));
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_CRACKED_BRICK_SLAB.get())
        .requires(ModTags.Items.BRICK_SLAB_CRACKED)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(ModTags.Items.BRICK_SLAB_CRACKED))
        .save(consumer);
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED), 
            ModBlocks.CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
            .save(consumer, coloredbricks.getId("cracked_brick_slab_stonecutter"));
                
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_RED), 
            ModBlocks.RED_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED),
            ModBlocks.CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
            .save(consumer, coloredbricks.getId("cracked_brick_stairs_stonecutter"));
            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_WHITE),
            ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_ORANGE),
            ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PINK),
            ModBlocks.PINK_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_YELLOW),
            ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIME),
            ModBlocks.LIME_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GREEN),
            ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_CYAN),
            ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLUE),
            ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_MAGENTA),
            ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PURPLE),
            ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BROWN),
            ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GRAY),
            ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLACK),
            ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_RED),
            ModBlocks.RED_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_stonecutter"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_CRACKED_BRICK_STAIRS.get())
        .requires(ModTags.Items.BRICK_STAIRS_CRACKED)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CRACKED))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer, coloredbricks.getId("cracked_brick_stairs_alt"));
        
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_WHITE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_WHITE))
        .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_ORANGE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_ORANGE))
        .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_PINK)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PINK))
        .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_YELLOW)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIME)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIME))
        .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_GREEN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GREEN))
        .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_CYAN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_CYAN))
        .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_BLUE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLUE))
        .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_MAGENTA)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_PURPLE)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PURPLE))
        .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_BROWN)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BROWN))
        .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_GRAY)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GRAY))
        .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_BLACK)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLACK))
        .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.RED_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', ModTags.Items.BRICKS_CRACKED_RED)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_RED))
        .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_alt"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_STAIRS.asItem()), 
            ModBlocks.CRACKED_BRICK_STAIRS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_STAIRS.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_stairs_furnace"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_WHITE),
            ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_ORANGE),
            ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_PINK),
            ModBlocks.PINK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_YELLOW),
            ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_LIME),
            ModBlocks.LIME_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_GREEN),
            ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_CYAN),
            ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_BLUE),
            ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_MAGENTA),
            ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_PURPLE),
            ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_BROWN),
            ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_GRAY),
            ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_BLACK),
            ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_STAIRS_RED),
            ModBlocks.RED_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_STAIRS_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_furnace"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED), 
            ModBlocks.CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
            .save(consumer, coloredbricks.getId("cracked_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            ModTags.Items.BRICKS_CRACKED_RED), 
            ModBlocks.RED_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_wall_stonecutter"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_WALL.asItem()), 
            ModBlocks.CRACKED_BRICK_WALL.get(),
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_WALL.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_wall_furnace"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_WHITE))
            .save(consumer, coloredbricks.getId("white_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_ORANGE))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_PINK))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_YELLOW))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_LIME))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_GREEN))
            .save(consumer, coloredbricks.getId("green_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_LIGHT_BLUE))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CYAN))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_BLUE))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_MAGENTA))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_PURPLE))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_BROWN))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_LIGHT_GRAY))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_GRAY))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_BLACK))
            .save(consumer, coloredbricks.getId("black_cracked_brick_wall_furnace"));
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            ModTags.Items.BRICK_WALL_RED), 
            ModBlocks.RED_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_RED))
            .save(consumer, coloredbricks.getId("red_cracked_brick_wall_furnace"));

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_WHITE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_ORANGE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_PINK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_YELLOW)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIME_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_LIME)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_GREEN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_CYAN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_BLUE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_MAGENTA)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_PURPLE)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BROWN_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_BROWN)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_LIGHT_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_BLACK)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_CRACKED_BRICK_WALL.get())
        .requires(ModTags.Items.BRICK_WALL_CRACKED)
        .requires(Tags.Items.DYES_RED)
        .unlockedBy("has item", has(ModTags.Items.BRICK_WALL_CRACKED))
        .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED))
        .save(consumer, coloredbricks.getId("cracked_brick_wall_alt"));
        
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_WHITE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_WHITE))
        .save(consumer, coloredbricks.getId("white_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_ORANGE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_ORANGE))
        .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_PINK)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PINK))
        .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_YELLOW)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_YELLOW))
        .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIME)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIME))
        .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_GREEN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GREEN))
        .save(consumer, coloredbricks.getId("green_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
        .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_CYAN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_CYAN))
        .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_BLUE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLUE))
        .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_MAGENTA)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_MAGENTA))
        .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_PURPLE)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_PURPLE))
        .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_BROWN)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BROWN))
        .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
        .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_GRAY)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_GRAY))
        .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_BLACK)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_BLACK))
        .save(consumer, coloredbricks.getId("black_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shaped(ModBlocks.RED_CRACKED_BRICK_WALL.get(), 6)
        .define('#', ModTags.Items.BRICKS_CRACKED_RED)
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(ModTags.Items.BRICKS_CRACKED_RED))
        .save(consumer, coloredbricks.getId("red_cracked_brick_wall_alt"));
    }
}