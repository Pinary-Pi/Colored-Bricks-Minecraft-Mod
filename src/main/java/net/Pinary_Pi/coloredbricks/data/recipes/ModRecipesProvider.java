package net.Pinary_Pi.coloredbricks.data.recipes;

import java.util.function.Consumer;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        // Brick Item Recipes

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.WHITE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.ORANGE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.PINK_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.YELLOW_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIME_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.GREEN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIGHT_BLUE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.CYAN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BLUE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MAGENTA_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.PURPLE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BROWN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIGHT_GRAY_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.GRAY_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BLACK_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.RED_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        // Brick Block Recipes

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_WHITE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WHITE))
        .build(consumer, coloredbricks.getId("white_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_ORANGE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_ORANGE))
        .build(consumer, coloredbricks.getId("orange_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICKS.get())
        .key('#', ModTags.Items.BRICK_PINK)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_PINK))
        .build(consumer, coloredbricks.getId("pink_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICKS.get())
        .key('#', ModTags.Items.BRICK_YELLOW)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIME)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIME))
        .build(consumer, coloredbricks.getId("lime_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_GREEN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_GREEN))
        .build(consumer, coloredbricks.getId("green_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIGHT_BLUE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_CYAN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_CYAN))
        .build(consumer, coloredbricks.getId("cyan_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BLUE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BLUE))
        .build(consumer, coloredbricks.getId("blue_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICKS.get())
        .key('#', ModTags.Items.BRICK_MAGENTA)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_PURPLE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_PURPLE))
        .build(consumer, coloredbricks.getId("purple_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BROWN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BROWN))
        .build(consumer, coloredbricks.getId("brown_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIGHT_GRAY)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICKS.get())
        .key('#', ModTags.Items.BRICK_GRAY)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_GRAY))
        .build(consumer, coloredbricks.getId("gray_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BLACK)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BLACK))
        .build(consumer, coloredbricks.getId("black_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_RED)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_RED))
        .build(consumer, coloredbricks.getId("red_bricks_alt"));

        // Slabs

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_GRAY)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
        .build(consumer, coloredbricks.getId("gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_slab_alt"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_slab_stonecutter"));

        // Stairs 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_stairs_alt"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_stairs_stonecutter"));
            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_stairs_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_stairs_stonecutter"));
            
        // Walls

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
        .build(consumer, coloredbricks.getId("gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_wall_alt")); 

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE),
            ModBlocks.WHITE_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE),
            ModBlocks.ORANGE_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK),
            ModBlocks.PINK_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW),
            ModBlocks.YELLOW_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME),
            ModBlocks.LIME_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN),
            ModBlocks.GREEN_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN),
            ModBlocks.CYAN_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE),
            ModBlocks.BLUE_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA),
            ModBlocks.MAGENTA_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE),
            ModBlocks.PURPLE_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN),
            ModBlocks.BROWN_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY),
            ModBlocks.GRAY_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK),
            ModBlocks.BLACK_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED),
            ModBlocks.RED_CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_chiseled_bricks_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(
            Blocks.BRICKS.asItem()),
            ModBlocks.CHISELED_BRICKS.get())
            .addCriterion("has item", hasItem(Blocks.BRICKS))
            .build(consumer, coloredbricks.getId("chiseled_bricks_stonecutter"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_WHITE)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_WHITE))
        .build(consumer, coloredbricks.getId("white_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_ORANGE)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_ORANGE))
        .build(consumer, coloredbricks.getId("orange_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_PINK)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_PINK))
        .build(consumer, coloredbricks.getId("pink_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_YELLOW)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_LIME)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIME))
        .build(consumer, coloredbricks.getId("lime_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_GREEN)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_GREEN))
        .build(consumer, coloredbricks.getId("green_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_LIGHT_BLUE)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_CYAN)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CYAN))
        .build(consumer, coloredbricks.getId("cyan_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_BLUE)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BLUE))
        .build(consumer, coloredbricks.getId("blue_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_MAGENTA)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_PURPLE)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_PURPLE))
        .build(consumer, coloredbricks.getId("purple_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_BROWN)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BROWN))
        .build(consumer, coloredbricks.getId("brown_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_LIGHT_GRAY)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_GRAY)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_GRAY))
        .build(consumer, coloredbricks.getId("gray_chiseled_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_BLACK)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BLACK))
        .build(consumer, coloredbricks.getId("black_chiseled_bricks_alt"));
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_CHISELED_BRICKS.get())
        .addIngredient(ModBlocks.CHISELED_BRICKS.get())
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(ModBlocks.CHISELED_BRICKS.get()))
        .build(consumer);
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_CHISELED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_SLAB_RED)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_RED))
        .build(consumer, coloredbricks.getId("red_chiseled_bricks_alt"));

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CHISELED_BRICKS.get())
        .key('#', Blocks.BRICK_SLAB)
        .patternLine("#")
        .patternLine("#")
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_CRACKED_BRICKS.get())
        .addIngredient(ModTags.Items.BRICKS_CRACKED)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer); 

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(
            Blocks.BRICKS.asItem()), 
            ModBlocks.CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(Blocks.BRICKS.asItem()))
            .build(consumer, coloredbricks.getId("cracked_bricks_furnace"));
        
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_bricks_furnace"));     
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_bricks_furnace"));
                
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_bricks_furnace"));
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_bricks_furnace"));
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_bricks_furnace"));  
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_bricks_furnace"));
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_bricks_furnace"));
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_bricks_furnace")); 
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_bricks_furnace"));  
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_bricks_furnace"));
                    
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_cracked_bricks_furnace"));
                                
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(
            Blocks.BRICK_SLAB.asItem()), 
            ModBlocks.CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(Blocks.BRICK_SLAB.asItem()))
            .build(consumer, coloredbricks.getId("cracked_brick_slab_furnace"));

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_slab_furnace"));  
        
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_slab_furnace"));       
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_slab_furnace"));
        
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_slab_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_SLAB_RED), 
            ModBlocks.RED_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_slab_furnace"));
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_CRACKED_BRICK_SLAB.get())
        .addIngredient(ModTags.Items.BRICK_SLAB_CRACKED)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_SLAB_CRACKED))
        .build(consumer);
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED), 
            ModBlocks.CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
            .build(consumer, coloredbricks.getId("cracked_brick_slab_stonecutter"));
                
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_slab_stonecutter"));
                            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_RED), 
            ModBlocks.RED_CRACKED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED),
            ModBlocks.CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
            .build(consumer, coloredbricks.getId("cracked_brick_stairs_stonecutter"));
            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_WHITE),
            ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_ORANGE),
            ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PINK),
            ModBlocks.PINK_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_YELLOW),
            ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIME),
            ModBlocks.LIME_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GREEN),
            ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_CYAN),
            ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLUE),
            ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_MAGENTA),
            ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PURPLE),
            ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BROWN),
            ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GRAY),
            ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLACK),
            ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_stairs_stonecutter"));
                        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_RED),
            ModBlocks.RED_CRACKED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_stairs_stonecutter"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_CRACKED_BRICK_STAIRS.get())
        .addIngredient(ModTags.Items.BRICK_STAIRS_CRACKED)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CRACKED))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer, coloredbricks.getId("cracked_brick_stairs_alt"));
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_WHITE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_WHITE))
        .build(consumer, coloredbricks.getId("white_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_ORANGE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_ORANGE))
        .build(consumer, coloredbricks.getId("orange_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_PINK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PINK))
        .build(consumer, coloredbricks.getId("pink_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_YELLOW)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIME)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIME))
        .build(consumer, coloredbricks.getId("lime_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_GREEN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GREEN))
        .build(consumer, coloredbricks.getId("green_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_CYAN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_CYAN))
        .build(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLUE))
        .build(consumer, coloredbricks.getId("blue_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_MAGENTA)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_PURPLE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PURPLE))
        .build(consumer, coloredbricks.getId("purple_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_BROWN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BROWN))
        .build(consumer, coloredbricks.getId("brown_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_GRAY)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GRAY))
        .build(consumer, coloredbricks.getId("gray_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_BLACK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLACK))
        .build(consumer, coloredbricks.getId("black_cracked_brick_stairs_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_CRACKED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CRACKED_RED)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_RED))
        .build(consumer, coloredbricks.getId("red_cracked_brick_stairs_alt"));

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(
            Blocks.BRICK_STAIRS.asItem()), 
            ModBlocks.CRACKED_BRICK_STAIRS.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS.asItem()))
            .build(consumer, coloredbricks.getId("cracked_brick_stairs_furnace"));

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_WHITE),
            ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_ORANGE),
            ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_PINK),
            ModBlocks.PINK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_YELLOW),
            ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_LIME),
            ModBlocks.LIME_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_GREEN),
            ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_LIGHT_BLUE),
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_CYAN),
            ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_BLUE),
            ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_MAGENTA),
            ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_PURPLE),
            ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_BROWN),
            ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_LIGHT_GRAY),
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_GRAY),
            ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_BLACK),
            ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_stairs_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_STAIRS_RED),
            ModBlocks.RED_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_STAIRS_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_stairs_furnace"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED), 
            ModBlocks.CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
            .build(consumer, coloredbricks.getId("cracked_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_wall_stonecutter"));
                    
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CRACKED_RED), 
            ModBlocks.RED_CRACKED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_wall_stonecutter"));

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(
            Blocks.BRICK_WALL.asItem()), 
            ModBlocks.CRACKED_BRICK_WALL.get(),
            0.1f, 200)
            .addCriterion("has item", hasItem(Blocks.BRICK_WALL.asItem()))
            .build(consumer, coloredbricks.getId("cracked_brick_wall_furnace"));

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_WHITE), 
            ModBlocks.WHITE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_WHITE))
            .build(consumer, coloredbricks.getId("white_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_ORANGE), 
            ModBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_ORANGE))
            .build(consumer, coloredbricks.getId("orange_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_PINK), 
            ModBlocks.PINK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_PINK))
            .build(consumer, coloredbricks.getId("pink_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_YELLOW), 
            ModBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_LIME), 
            ModBlocks.LIME_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_LIME))
            .build(consumer, coloredbricks.getId("lime_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_GREEN), 
            ModBlocks.GREEN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_GREEN))
            .build(consumer, coloredbricks.getId("green_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_CYAN), 
            ModBlocks.CYAN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CYAN))
            .build(consumer, coloredbricks.getId("cyan_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_BLUE), 
            ModBlocks.BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_BLUE))
            .build(consumer, coloredbricks.getId("blue_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_MAGENTA), 
            ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_PURPLE), 
            ModBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_PURPLE))
            .build(consumer, coloredbricks.getId("purple_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_BROWN), 
            ModBlocks.BROWN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_BROWN))
            .build(consumer, coloredbricks.getId("brown_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_GRAY), 
            ModBlocks.GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_GRAY))
            .build(consumer, coloredbricks.getId("gray_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_BLACK), 
            ModBlocks.BLACK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_BLACK))
            .build(consumer, coloredbricks.getId("black_cracked_brick_wall_furnace"));
            
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICK_WALL_RED), 
            ModBlocks.RED_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_RED))
            .build(consumer, coloredbricks.getId("red_cracked_brick_wall_furnace"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);
        
        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_CRACKED_BRICK_WALL.get())
        .addIngredient(ModTags.Items.BRICK_WALL_CRACKED)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WALL_CRACKED))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED))
        .build(consumer, coloredbricks.getId("cracked_brick_wall_alt"));
        
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_WHITE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_WHITE))
        .build(consumer, coloredbricks.getId("white_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_ORANGE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_ORANGE))
        .build(consumer, coloredbricks.getId("orange_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_PINK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PINK))
        .build(consumer, coloredbricks.getId("pink_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_YELLOW)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIME)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIME))
        .build(consumer, coloredbricks.getId("lime_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_GREEN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GREEN))
        .build(consumer, coloredbricks.getId("green_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_CYAN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_CYAN))
        .build(consumer, coloredbricks.getId("cyan_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLUE))
        .build(consumer, coloredbricks.getId("blue_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_MAGENTA)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_PURPLE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_PURPLE))
        .build(consumer, coloredbricks.getId("purple_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_BROWN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BROWN))
        .build(consumer, coloredbricks.getId("brown_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_GRAY))
        .build(consumer, coloredbricks.getId("gray_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_BLACK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_BLACK))
        .build(consumer, coloredbricks.getId("black_cracked_brick_wall_alt"));
                
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_CRACKED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CRACKED_RED)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CRACKED_RED))
        .build(consumer, coloredbricks.getId("red_cracked_brick_wall_alt"));
    }
}