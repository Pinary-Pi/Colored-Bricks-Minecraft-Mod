package net.Pinary_Pi.coloredbricks.data;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, coloredbricks.MOD_ID, existingFileHelper);
    }

    @Override 
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.BRICKS_WHITE).add(ModBlocks.WHITE_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_ORANGE).add(ModBlocks.ORANGE_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_PINK).add(ModBlocks.PINK_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_YELLOW).add(ModBlocks.YELLOW_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_LIME).add(ModBlocks.LIME_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_GREEN).add(ModBlocks.GREEN_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CYAN).add(ModBlocks.CYAN_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_BLUE).add(ModBlocks.BLUE_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_MAGENTA).add(ModBlocks.MAGENTA_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_PURPLE).add(ModBlocks.PURPLE_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_BROWN).add(ModBlocks.BROWN_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_GRAY).add(ModBlocks.GRAY_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_BLACK).add(ModBlocks.BLACK_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_RED).add(ModBlocks.RED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_RED);
        
        // Slabs

        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_WHITE).add(ModBlocks.WHITE_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_ORANGE).add(ModBlocks.ORANGE_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_PINK).add(ModBlocks.PINK_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_YELLOW).add(ModBlocks.YELLOW_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_LIME).add(ModBlocks.LIME_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_GREEN).add(ModBlocks.GREEN_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CYAN).add(ModBlocks.CYAN_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_BLUE).add(ModBlocks.BLUE_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_MAGENTA).add(ModBlocks.MAGENTA_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_PURPLE).add(ModBlocks.PURPLE_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_BROWN).add(ModBlocks.BROWN_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_GRAY).add(ModBlocks.GRAY_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_BLACK).add(ModBlocks.BLACK_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_RED).add(ModBlocks.RED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_WHITE).add(ModBlocks.WHITE_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_ORANGE).add(ModBlocks.ORANGE_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_PINK).add(ModBlocks.PINK_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_YELLOW).add(ModBlocks.YELLOW_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_LIME).add(ModBlocks.LIME_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_GREEN).add(ModBlocks.GREEN_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CYAN).add(ModBlocks.CYAN_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_BLUE).add(ModBlocks.BLUE_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_MAGENTA).add(ModBlocks.MAGENTA_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_PURPLE).add(ModBlocks.PURPLE_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_BROWN).add(ModBlocks.BROWN_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_GRAY).add(ModBlocks.GRAY_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_BLACK).add(ModBlocks.BLACK_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_RED).add(ModBlocks.RED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_WHITE).add(ModBlocks.WHITE_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_ORANGE).add(ModBlocks.ORANGE_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_PINK).add(ModBlocks.PINK_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_YELLOW).add(ModBlocks.YELLOW_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIME).add(ModBlocks.LIME_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_GREEN).add(ModBlocks.GREEN_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CYAN).add(ModBlocks.CYAN_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BLUE).add(ModBlocks.BLUE_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_MAGENTA).add(ModBlocks.MAGENTA_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_PURPLE).add(ModBlocks.PURPLE_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BROWN).add(ModBlocks.BROWN_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_GRAY).add(ModBlocks.GRAY_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BLACK).add(ModBlocks.BLACK_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_RED).add(ModBlocks.RED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_RED);

        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT).add(ModBlocks.WHITE_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT).add(ModBlocks.ORANGE_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT).add(ModBlocks.PINK_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT).add(ModBlocks.YELLOW_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT).add(ModBlocks.LIME_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT).add(ModBlocks.GREEN_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT).add(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT).add(ModBlocks.CYAN_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT).add(ModBlocks.BLUE_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT).add(ModBlocks.MAGENTA_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT).add(ModBlocks.PURPLE_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT).add(ModBlocks.BROWN_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT).add(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT).add(ModBlocks.GRAY_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT).add(ModBlocks.BLACK_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT).add(ModBlocks.RED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT);

        // Chiseled Bricks

        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_WHITE).add(ModBlocks.WHITE_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_ORANGE).add(ModBlocks.ORANGE_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_PINK).add(ModBlocks.PINK_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_YELLOW).add(ModBlocks.YELLOW_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_LIME).add(ModBlocks.LIME_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_GREEN).add(ModBlocks.GREEN_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_CYAN).add(ModBlocks.CYAN_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_BLUE).add(ModBlocks.BLUE_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_MAGENTA).add(ModBlocks.MAGENTA_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_PURPLE).add(ModBlocks.PURPLE_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_BROWN).add(ModBlocks.BROWN_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_GRAY).add(ModBlocks.GRAY_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_BLACK).add(ModBlocks.BLACK_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED_RED).add(ModBlocks.RED_CHISELED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CHISELED).add(ModBlocks.CHISELED_BRICKS.get());

        // Cracked Bricks

        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED).add(ModBlocks.CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_WHITE).add(ModBlocks.WHITE_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_ORANGE).add(ModBlocks.ORANGE_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_PINK).add(ModBlocks.PINK_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_YELLOW).add(ModBlocks.YELLOW_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_LIME).add(ModBlocks.LIME_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_GREEN).add(ModBlocks.GREEN_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_CYAN).add(ModBlocks.CYAN_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_BLUE).add(ModBlocks.BLUE_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_MAGENTA).add(ModBlocks.MAGENTA_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_PURPLE).add(ModBlocks.PURPLE_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_BROWN).add(ModBlocks.BROWN_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_GRAY).add(ModBlocks.GRAY_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_BLACK).add(ModBlocks.BLACK_CRACKED_BRICKS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICKS_CRACKED_RED).add(ModBlocks.RED_CRACKED_BRICKS.get());

        // Cracked Brick Slabs

        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED).add(ModBlocks.CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE).add(ModBlocks.WHITE_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE).add(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK).add(ModBlocks.PINK_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW).add(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME).add(ModBlocks.LIME_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN).add(ModBlocks.GREEN_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN).add(ModBlocks.CYAN_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE).add(ModBlocks.BLUE_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA).add(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE).add(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN).add(ModBlocks.BROWN_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY).add(ModBlocks.GRAY_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK).add(ModBlocks.BLACK_CRACKED_BRICK_SLAB.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_SLAB_CRACKED_RED).add(ModBlocks.RED_CRACKED_BRICK_SLAB.get());

        // Cracked Brick Stairs

        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED).add(ModBlocks.CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_WHITE).add(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_ORANGE).add(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_PINK).add(ModBlocks.PINK_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_YELLOW).add(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIME).add(ModBlocks.LIME_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_GREEN).add(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_CYAN).add(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLUE).add(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_MAGENTA).add(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_PURPLE).add(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_BROWN).add(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_GRAY).add(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLACK).add(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_STAIRS_CRACKED_RED).add(ModBlocks.RED_CRACKED_BRICK_STAIRS.get());

        // Cracked Brick Walls

        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED).add(ModBlocks.CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE).add(ModBlocks.WHITE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE).add(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_PINK).add(ModBlocks.PINK_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW).add(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIME).add(ModBlocks.LIME_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN).add(ModBlocks.GREEN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN).add(ModBlocks.CYAN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE).add(ModBlocks.BLUE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA).add(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE).add(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN).add(ModBlocks.BROWN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY).add(ModBlocks.GRAY_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK).add(ModBlocks.BLACK_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_RED);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_RED).add(ModBlocks.RED_CRACKED_BRICK_WALL.get());

        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT).add(ModBlocks.CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT).add(ModBlocks.WHITE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT).add(ModBlocks.ORANGE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT).add(ModBlocks.PINK_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT).add(ModBlocks.YELLOW_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT).add(ModBlocks.LIME_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT).add(ModBlocks.GREEN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT).add(ModBlocks.CYAN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT).add(ModBlocks.BLUE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT).add(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT).add(ModBlocks.PURPLE_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT).add(ModBlocks.BROWN_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT).add(ModBlocks.GRAY_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT).add(ModBlocks.BLACK_CRACKED_BRICK_WALL.get());
        getOrCreateBuilder(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT);
        getOrCreateBuilder(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT).add(ModBlocks.RED_CRACKED_BRICK_WALL.get());
    }
}
