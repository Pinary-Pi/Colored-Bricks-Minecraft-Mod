package net.Pinary_Pi.coloredbricks.data.recipes;

import java.util.concurrent.CompletableFuture;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.block.BrickBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickSlabBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickStairsBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickWallBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.ColoredFlowerPots;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ModRecipesProvider extends RecipeProvider {
    
    public ModRecipesProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
        HolderGetter<Item> items = this.registries.lookupOrThrow(Registries.ITEM);
        RecipeOutput consumer = this.output;

        // Brick Item Recipes

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.WHITE_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.WHITE_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.ORANGE_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.PINK_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.PINK_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.YELLOW_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.LIME_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.LIME_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.GREEN_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.GREEN_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.LIGHT_BLUE_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.CYAN_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.CYAN_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.BLUE_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.BLUE_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.MAGENTA_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.PURPLE_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.BROWN_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.BROWN_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.LIGHT_GRAY_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.GRAY_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.GRAY_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.BLACK_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.BLACK_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.RED_BRICK.get())
        .requires(Items.BRICK)
        .requires(Items.RED_DYE)
        .unlockedBy("has_brick", has(Items.BRICK))
        .save(consumer);

        // Brick Block Recipes

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.WHITE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.WHITE_BRICKS.get())
        .define('#', ModItems.WHITE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.WHITE_BRICK.get()))
        .save(consumer, coloredbricks.getId("white_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.ORANGE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.ORANGE_BRICKS.get())
        .define('#', ModItems.ORANGE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.ORANGE_BRICK.get()))
        .save(consumer, coloredbricks.getId("orange_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PINK_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PINK_BRICKS.get())
        .define('#', ModItems.PINK_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.PINK_BRICK.get()))
        .save(consumer, coloredbricks.getId("pink_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.YELLOW_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.YELLOW_BRICKS.get())
        .define('#', ModItems.YELLOW_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.YELLOW_BRICK.get()))
        .save(consumer, coloredbricks.getId("yellow_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIME_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIME_BRICKS.get())
        .define('#', ModItems.LIME_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.LIME_BRICK.get()))
        .save(consumer, coloredbricks.getId("lime_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GREEN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GREEN_BRICKS.get())
        .define('#', ModItems.GREEN_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.GREEN_BRICK.get()))
        .save(consumer, coloredbricks.getId("green_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_BLUE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_BLUE_BRICKS.get())
        .define('#', ModItems.LIGHT_BLUE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.LIGHT_BLUE_BRICK.get()))
        .save(consumer, coloredbricks.getId("light_blue_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CYAN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CYAN_BRICKS.get())
        .define('#', ModItems.CYAN_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.CYAN_BRICK.get()))
        .save(consumer, coloredbricks.getId("cyan_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLUE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLUE_BRICKS.get())
        .define('#', ModItems.BLUE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.BLUE_BRICK.get()))
        .save(consumer, coloredbricks.getId("blue_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.MAGENTA_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.MAGENTA_BRICKS.get())
        .define('#', ModItems.WHITE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.MAGENTA_BRICK.get()))
        .save(consumer, coloredbricks.getId("magenta_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PURPLE_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PURPLE_BRICKS.get())
        .define('#', ModItems.PURPLE_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.PURPLE_BRICK.get()))
        .save(consumer, coloredbricks.getId("purple_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BROWN_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BROWN_BRICKS.get())
        .define('#', ModItems.BROWN_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.BROWN_BRICK.get()))
        .save(consumer, coloredbricks.getId("brown_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_GRAY_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_GRAY_BRICKS.get())
        .define('#', ModItems.LIGHT_GRAY_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.LIGHT_GRAY_BRICK.get()))
        .save(consumer, coloredbricks.getId("light_gray_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GRAY_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GRAY_BRICKS.get())
        .define('#', ModItems.GRAY_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.GRAY_BRICK.get()))
        .save(consumer, coloredbricks.getId("gray_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLACK_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLACK_BRICKS.get())
        .define('#', ModItems.BLACK_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.BLACK_BRICK.get()))
        .save(consumer, coloredbricks.getId("black_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.RED_BRICKS.get())
        .requires(Blocks.BRICKS)
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(Blocks.BRICKS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.RED_BRICKS.get())
        .define('#', ModItems.RED_BRICK.get())
        .pattern("##")
        .pattern("##")
        .unlockedBy("has item", has(ModItems.RED_BRICK.get()))
        .save(consumer, coloredbricks.getId("red_bricks_alt").toString());

        // Slabs

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.WHITE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.WHITE_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.WHITE_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("white_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.ORANGE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.ORANGE_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.ORANGE_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PINK_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PINK_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.PINK_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.YELLOW_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.YELLOW_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.YELLOW_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIME_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIME_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.LIME_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GREEN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GREEN_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.GREEN_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("green_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.CYAN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.CYAN_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.CYAN_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLUE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLUE_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.BLUE_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.MAGENTA_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.MAGENTA_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.MAGENTA_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PURPLE_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PURPLE_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.PURPLE_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BROWN_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BROWN_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.BROWN_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GRAY_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GRAY_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.GRAY_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("gray_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLACK_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLACK_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.BLACK_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("black_brick_slab_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.RED_BRICK_SLAB.get())
        .requires(Blocks.BRICK_SLAB)
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.RED_BRICK_SLAB.get(), 6)
        .define('#', BrickBlocks.RED_BRICKS.get().asItem())
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("red_brick_slab_alt").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickSlabBlocks.WHITE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_brick_slab_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.ORANGE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PINK_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.YELLOW_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_brick_slab_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIME_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GREEN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.CYAN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLUE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.MAGENTA_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PURPLE_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_brick_slab_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BROWN_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GRAY_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLACK_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.RED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_brick_slab_stonecutter").toString());

        // Stairs 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.WHITE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.WHITE_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.WHITE_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("white_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.ORANGE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.ORANGE_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.ORANGE_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PINK_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PINK_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.PINK_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.YELLOW_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.YELLOW_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.YELLOW_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIME_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIME_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIME_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GREEN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GREEN_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.GREEN_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("green_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.CYAN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.CYAN_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.CYAN_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLUE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLUE_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BLUE_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.MAGENTA_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PURPLE_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PURPLE_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.PURPLE_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BROWN_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BROWN_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BROWN_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLACK_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLACK_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BLACK_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("black_brick_stairs_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.RED_BRICK_STAIRS.get())
        .requires(Blocks.BRICK_STAIRS)
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_STAIRS))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.RED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.RED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("red_brick_stairs_alt").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.WHITE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_brick_stairs_stonecutter").toString());
            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.ORANGE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_brick_stairs_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.PINK_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.YELLOW_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.LIME_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.GREEN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.CYAN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.BLUE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.PURPLE_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.BROWN_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.GRAY_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.BLACK_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_brick_stairs_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickStairsBlocks.RED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_brick_stairs_stonecutter").toString());
            
        // Walls

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.WHITE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.WHITE_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.WHITE_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("white_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.ORANGE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.ORANGE_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.ORANGE_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PINK_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PINK_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.PINK_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.YELLOW_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.YELLOW_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.YELLOW_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIME_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIME_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIME_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GREEN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GREEN_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.GREEN_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("green_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.CYAN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.CYAN_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.CYAN_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLUE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLUE_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BLUE_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.MAGENTA_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.MAGENTA_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.MAGENTA_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PURPLE_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PURPLE_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.PURPLE_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BROWN_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BROWN_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BROWN_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GRAY_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GRAY_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.GRAY_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("gray_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLACK_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLACK_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BLACK_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("black_brick_wall_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.RED_BRICK_WALL.get())
        .requires(Blocks.BRICK_WALL)
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(Blocks.BRICK_WALL))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.RED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.RED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("red_brick_wall_alt").toString()); 

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.WHITE_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.ORANGE_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.PINK_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_brick_wall_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.YELLOW_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.LIME_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_brick_wall_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.GREEN_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.CYAN_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.BLUE_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.MAGENTA_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.PURPLE_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.BROWN_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.GRAY_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.BLACK_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.RED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_brick_wall_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.WHITE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.ORANGE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.PINK_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.YELLOW_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.LIME_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.GREEN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.CYAN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.BLUE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.MAGENTA_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.PURPLE_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.BROWN_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.GRAY_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.BLACK_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.RED_CHISELED_BRICKS.get())
            .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_chiseled_bricks_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            Blocks.BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.CHISELED_BRICKS.get())
            .unlockedBy("has item", has(Blocks.BRICKS))
            .save(consumer, coloredbricks.getId("chiseled_bricks_stonecutter").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.WHITE_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.WHITE_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.WHITE_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.WHITE_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("white_chiseled_bricks_alt").toString());
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.ORANGE_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.ORANGE_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.ORANGE_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.ORANGE_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PINK_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PINK_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.PINK_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.PINK_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.YELLOW_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.YELLOW_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.YELLOW_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.YELLOW_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIME_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIME_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.LIME_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.LIME_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GREEN_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GREEN_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.GREEN_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.GREEN_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("green_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CYAN_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CYAN_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.CYAN_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.CYAN_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLUE_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLUE_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.BLUE_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.BLUE_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_chiseled_bricks_alt").toString());
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.MAGENTA_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.MAGENTA_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.MAGENTA_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.MAGENTA_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PURPLE_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PURPLE_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.PURPLE_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.PURPLE_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_chiseled_bricks_alt").toString());
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BROWN_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BROWN_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.BROWN_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.BROWN_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GRAY_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GRAY_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.GRAY_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.GRAY_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("gray_chiseled_bricks_alt").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLACK_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLACK_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.BLACK_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.BLACK_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("black_chiseled_bricks_alt").toString());
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.RED_CHISELED_BRICKS.get())
        .requires(BrickBlocks.CHISELED_BRICKS.get())
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(BrickBlocks.CHISELED_BRICKS.get()))
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.RED_CHISELED_BRICKS.get())
        .define('#', BrickSlabBlocks.RED_BRICK_SLAB.get().asItem())
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(BrickSlabBlocks.RED_BRICK_SLAB.get().asItem()))
        .save(consumer, coloredbricks.getId("red_chiseled_bricks_alt").toString());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CHISELED_BRICKS.get())
        .define('#', Blocks.BRICK_SLAB)
        .pattern("#")
        .pattern("#")
        .unlockedBy("has item", has(Blocks.BRICK_SLAB))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.WHITE_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.ORANGE_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PINK_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.YELLOW_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIME_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GREEN_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.CYAN_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLUE_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.MAGENTA_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.PURPLE_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BROWN_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.GRAY_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.BLACK_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickBlocks.RED_CRACKED_BRICKS.get())
        .requires(BrickBlocks.CRACKED_BRICKS.get().asItem())
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer); 

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICKS.asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICKS.asItem()))
            .save(consumer, coloredbricks.getId("cracked_bricks_furnace").toString());
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.WHITE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.WHITE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.WHITE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_bricks_furnace").toString());     
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.ORANGE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.ORANGE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.ORANGE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_bricks_furnace").toString());
                
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.PINK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.PINK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.PINK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_bricks_furnace").toString());
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.YELLOW_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.YELLOW_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.YELLOW_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_bricks_furnace").toString());
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.LIME_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.LIME_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.LIME_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.GREEN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.GREEN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.GREEN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.CYAN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.CYAN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.CYAN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_bricks_furnace").toString());  
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_bricks_furnace").toString());
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.BLUE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.BLUE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.BLUE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_bricks_furnace").toString());
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.MAGENTA_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.MAGENTA_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.PURPLE_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.PURPLE_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.PURPLE_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.BROWN_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.BROWN_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.BROWN_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_bricks_furnace").toString()); 
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.GRAY_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.GRAY_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.GRAY_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_bricks_furnace").toString());  
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.BLACK_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.BLACK_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.BLACK_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_bricks_furnace").toString());
                    
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickBlocks.RED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickBlocks.RED_CRACKED_BRICKS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickBlocks.RED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_bricks_furnace").toString());
                                
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_SLAB.asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_SLAB.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_slab_furnace").toString());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.WHITE_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.WHITE_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_slab_furnace").toString());  
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.ORANGE_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.ORANGE_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_slab_furnace").toString());       
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.PINK_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.PINK_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.YELLOW_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.YELLOW_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.LIME_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.LIME_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.GREEN_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.GREEN_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.CYAN_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.CYAN_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_slab_furnace").toString());
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.BLUE_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.BLUE_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.MAGENTA_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.MAGENTA_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.PURPLE_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.PURPLE_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.BROWN_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.BROWN_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.GRAY_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.GRAY_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.BLACK_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.BLACK_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_slab_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickSlabBlocks.RED_BRICK_SLAB.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickSlabBlocks.RED_BRICK_SLAB.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_slab_furnace").toString());
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.get())
        .requires(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem())
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(BrickSlabBlocks.CRACKED_BRICK_SLAB.get().asItem()))
        .save(consumer);
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_slab_stonecutter").toString());
                
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_slab_stonecutter").toString().toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_slab_stonecutter").toString());
                            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.get(), 2)
            .unlockedBy("has item", has(BrickBlocks.RED_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_slab_stonecutter").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_stairs_stonecutter").toString());
            
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_stonecutter").toString());
                        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.get())
            .unlockedBy("has item", has(BrickBlocks.RED_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_stonecutter").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.get())
        .requires(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem())
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(BrickStairsBlocks.CRACKED_BRICK_STAIRS.get().asItem()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cracked_brick_stairs_alt").toString());
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.PINK_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIME_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.get(), 4)
        .define('#', BrickBlocks.RED_CRACKED_BRICKS.get().asItem())
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.RED_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_alt").toString());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_STAIRS.asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.CRACKED_BRICK_STAIRS.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_STAIRS.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_stairs_furnace").toString());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.WHITE_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.WHITE_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.ORANGE_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.ORANGE_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.PINK_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.PINK_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.YELLOW_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.YELLOW_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.LIME_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.LIME_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.GREEN_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.GREEN_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.CYAN_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.CYAN_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.BLUE_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.BLUE_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.PURPLE_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.PURPLE_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.BROWN_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.BROWN_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.GRAY_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.GRAY_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.BLACK_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.BLACK_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_stairs_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickStairsBlocks.RED_BRICK_STAIRS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.get(),
            0.1f, 200)
            .unlockedBy("has item", has(BrickStairsBlocks.RED_BRICK_STAIRS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_stairs_furnace").toString());

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_wall_stonecutter").toString());
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_wall_stonecutter").toString());
                    
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(
            BrickBlocks.RED_CRACKED_BRICKS.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.RED_CRACKED_BRICK_WALL.get())
            .unlockedBy("has item", has(BrickBlocks.RED_CRACKED_BRICKS.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_wall_stonecutter").toString());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            Blocks.BRICK_WALL.asItem()), RecipeCategory.BUILDING_BLOCKS, 
            BrickWallBlocks.CRACKED_BRICK_WALL.get(),
            0.1f, 200)
            .unlockedBy("has item", has(Blocks.BRICK_WALL.asItem()))
            .save(consumer, coloredbricks.getId("cracked_brick_wall_furnace").toString());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.WHITE_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.WHITE_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("white_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.ORANGE_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.ORANGE_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.PINK_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.PINK_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.YELLOW_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.YELLOW_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.LIME_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.LIME_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.GREEN_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.GREEN_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("green_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.CYAN_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.CYAN_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.BLUE_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.BLUE_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.MAGENTA_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.MAGENTA_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.PURPLE_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.PURPLE_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.BROWN_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.BROWN_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.GRAY_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.GRAY_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.BLACK_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.BLACK_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("black_cracked_brick_wall_furnace").toString());
            
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
            BrickWallBlocks.RED_BRICK_WALL.get().asItem()), RecipeCategory.BUILDING_BLOCKS,
            BrickWallBlocks.RED_CRACKED_BRICK_WALL.get(), 
            0.1f, 200)
            .unlockedBy("has item", has(BrickWallBlocks.RED_BRICK_WALL.get().asItem()))
            .save(consumer, coloredbricks.getId("red_cracked_brick_wall_furnace").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.WHITE_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.ORANGE_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.PINK_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.YELLOW_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.LIME_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.GREEN_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.LIGHT_BLUE_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.CYAN_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.BLUE_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.MAGENTA_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.PURPLE_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.BROWN_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.LIGHT_GRAY_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Tags.Items.DYES_GRAY)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.BLACK_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.RED_CRACKED_BRICK_WALL.get())
        .requires(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem())
        .requires(Items.RED_DYE)
        .unlockedBy("has item", has(BrickWallBlocks.CRACKED_BRICK_WALL.get().asItem()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cracked_brick_wall_alt").toString());
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.WHITE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("white_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.ORANGE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("orange_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.PINK_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PINK_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("pink_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.YELLOW_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("yellow_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIME_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIME_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("lime_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GREEN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("green_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_blue_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.CYAN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("cyan_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLUE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("blue_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.MAGENTA_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("magenta_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.PURPLE_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("purple_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BROWN_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("brown_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("light_gray_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.GRAY_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("gray_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.BLACK_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("black_cracked_brick_wall_alt").toString());
                
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, BrickWallBlocks.RED_CRACKED_BRICK_WALL.get(), 6)
        .define('#', BrickBlocks.RED_CRACKED_BRICKS.get().asItem())
        .pattern("###")
        .pattern("###")
        .unlockedBy("has item", has(BrickBlocks.RED_CRACKED_BRICKS.get().asItem()))
        .save(consumer, coloredbricks.getId("red_cracked_brick_wall_alt").toString());

        // Pots

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.WHITE_FLOWER_POT.get())
        .define('#', ModItems.WHITE_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.WHITE_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.ORANGE_FLOWER_POT.get())
        .define('#', ModItems.ORANGE_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.ORANGE_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.PINK_FLOWER_POT.get())
        .define('#', ModItems.PINK_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.PINK_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.YELLOW_FLOWER_POT.get())
        .define('#', ModItems.YELLOW_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.YELLOW_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIME_FLOWER_POT.get())
        .define('#', ModItems.LIME_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.LIME_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.GREEN_FLOWER_POT.get())
        .define('#', ModItems.GREEN_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.GREEN_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIGHT_BLUE_FLOWER_POT.get())
        .define('#', ModItems.LIGHT_BLUE_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.LIGHT_BLUE_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.CYAN_FLOWER_POT.get())
        .define('#', ModItems.CYAN_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.CYAN_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BLUE_FLOWER_POT.get())
        .define('#', ModItems.BLUE_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.BLUE_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.MAGENTA_FLOWER_POT.get())
        .define('#', ModItems.MAGENTA_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.MAGENTA_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.PURPLE_FLOWER_POT.get())
        .define('#', ModItems.PURPLE_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.PURPLE_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BROWN_FLOWER_POT.get())
        .define('#', ModItems.BROWN_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.BROWN_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIGHT_GRAY_FLOWER_POT.get())
        .define('#', ModItems.LIGHT_GRAY_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.LIGHT_GRAY_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.GRAY_FLOWER_POT.get())
        .define('#', ModItems.GRAY_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.GRAY_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BLACK_FLOWER_POT.get())
        .define('#', ModItems.BLACK_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.BLACK_BRICK.get()))
        .save(consumer);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.RED_FLOWER_POT.get())
        .define('#', ModItems.RED_BRICK.get())
        .pattern("# #")
        .pattern(" # ")
        .unlockedBy("has item", has(ModItems.RED_BRICK.get()))
        .save(consumer);

        // Pot Dye Recipes
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.WHITE_FLOWER_POT.get())
        .requires(Items.WHITE_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.WHITE_DYE))
        .save(consumer, coloredbricks.getId("dye_white_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.ORANGE_FLOWER_POT.get())
        .requires(Items.ORANGE_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.ORANGE_DYE))
        .save(consumer, coloredbricks.getId("dye_orange_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.PINK_FLOWER_POT.get())
        .requires(Items.PINK_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.PINK_DYE))
        .save(consumer, coloredbricks.getId("dye_pink_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.YELLOW_FLOWER_POT.get())
        .requires(Items.YELLOW_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.YELLOW_DYE))
        .save(consumer, coloredbricks.getId("dye_yellow_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIME_FLOWER_POT.get())
        .requires(Items.LIME_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.LIME_DYE))
        .save(consumer, coloredbricks.getId("dye_lime_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.GREEN_FLOWER_POT.get())
        .requires(Items.GREEN_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.GREEN_DYE))
        .save(consumer, coloredbricks.getId("dye_green_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIGHT_BLUE_FLOWER_POT.get())
        .requires(Items.LIGHT_BLUE_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.LIGHT_BLUE_DYE))
        .save(consumer, coloredbricks.getId("dye_light_blue_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.CYAN_FLOWER_POT.get())
        .requires(Items.CYAN_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.CYAN_DYE))
        .save(consumer, coloredbricks.getId("dye_cyan_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BLUE_FLOWER_POT.get())
        .requires(Items.BLUE_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.BLUE_DYE))
        .save(consumer, coloredbricks.getId("dye_blue_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.MAGENTA_FLOWER_POT.get())
        .requires(Items.MAGENTA_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.MAGENTA_DYE))
        .save(consumer, coloredbricks.getId("dye_magenta_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.PURPLE_FLOWER_POT.get())
        .requires(Items.PURPLE_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.PURPLE_DYE))
        .save(consumer, coloredbricks.getId("dye_purple_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BROWN_FLOWER_POT.get())
        .requires(Items.BROWN_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.BROWN_DYE))
        .save(consumer, coloredbricks.getId("dye_brown_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.LIGHT_GRAY_FLOWER_POT.get())
        .requires(Items.LIGHT_GRAY_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.LIGHT_GRAY_DYE))
        .save(consumer, coloredbricks.getId("dye_light_gray_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.GRAY_FLOWER_POT.get())
        .requires(Items.GRAY_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.GRAY_DYE))
        .save(consumer, coloredbricks.getId("dye_gray_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.BLACK_FLOWER_POT.get())
        .requires(Items.BLACK_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.BLACK_DYE))
        .save(consumer, coloredbricks.getId("dye_black_flower_pot").toString());

        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.DECORATIONS, ColoredFlowerPots.RED_FLOWER_POT.get())
        .requires(Items.RED_DYE)
        .requires(Items.FLOWER_POT)
        .unlockedBy("has item", has(Items.RED_DYE))
        .save(consumer, coloredbricks.getId("dye_red_flower_pot").toString());
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(packOutput, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new ModRecipesProvider(provider, output);
        }

        @Override
        public String getName() {
            return "Colored Bricks Mod Recipes Provider";
        }
    }
}