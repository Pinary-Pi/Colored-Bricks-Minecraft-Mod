package net.Pinary_Pi.coloredbricks.data;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, coloredbricks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.BRICKS_WHITE, ModTags.Items.BRICKS_WHITE);
        copy(ModTags.Blocks.BRICKS_ORANGE, ModTags.Items.BRICKS_ORANGE);
        copy(ModTags.Blocks.BRICKS_PINK, ModTags.Items.BRICKS_PINK);
        copy(ModTags.Blocks.BRICKS_YELLOW, ModTags.Items.BRICKS_YELLOW);
        copy(ModTags.Blocks.BRICKS_LIME, ModTags.Items.BRICKS_LIME);
        copy(ModTags.Blocks.BRICKS_GREEN, ModTags.Items.BRICKS_GREEN);
        copy(ModTags.Blocks.BRICKS_LIGHT_BLUE, ModTags.Items.BRICKS_LIGHT_BLUE);
        copy(ModTags.Blocks.BRICKS_CYAN, ModTags.Items.BRICKS_CYAN);
        copy(ModTags.Blocks.BRICKS_BLUE, ModTags.Items.BRICKS_BLUE);
        copy(ModTags.Blocks.BRICKS_MAGENTA, ModTags.Items.BRICKS_MAGENTA);
        copy(ModTags.Blocks.BRICKS_PURPLE, ModTags.Items.BRICKS_PURPLE);
        copy(ModTags.Blocks.BRICKS_BROWN, ModTags.Items.BRICKS_BROWN);
        copy(ModTags.Blocks.BRICKS_GRAY, ModTags.Items.BRICKS_GRAY);
        copy(ModTags.Blocks.BRICKS_LIGHT_GRAY, ModTags.Items.BRICKS_LIGHT_GRAY);
        copy(ModTags.Blocks.BRICKS_BLACK, ModTags.Items.BRICKS_BLACK);
        copy(ModTags.Blocks.BRICKS_RED, ModTags.Items.BRICKS_RED);
        copy(ModTags.Blocks.BRICK_SLAB_WHITE, ModTags.Items.BRICK_SLAB_WHITE);
        copy(ModTags.Blocks.BRICK_SLAB_ORANGE, ModTags.Items.BRICK_SLAB_ORANGE);
        copy(ModTags.Blocks.BRICK_SLAB_PINK, ModTags.Items.BRICK_SLAB_PINK);
        copy(ModTags.Blocks.BRICK_SLAB_YELLOW, ModTags.Items.BRICK_SLAB_YELLOW);
        copy(ModTags.Blocks.BRICK_SLAB_LIME, ModTags.Items.BRICK_SLAB_LIME);
        copy(ModTags.Blocks.BRICK_SLAB_GREEN, ModTags.Items.BRICK_SLAB_GREEN);
        copy(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE, ModTags.Items.BRICK_SLAB_LIGHT_BLUE);
        copy(ModTags.Blocks.BRICK_SLAB_CYAN, ModTags.Items.BRICK_SLAB_CYAN);
        copy(ModTags.Blocks.BRICK_SLAB_BLUE, ModTags.Items.BRICK_SLAB_BLUE);
        copy(ModTags.Blocks.BRICK_SLAB_MAGENTA, ModTags.Items.BRICK_SLAB_MAGENTA);
        copy(ModTags.Blocks.BRICK_SLAB_PURPLE, ModTags.Items.BRICK_SLAB_PURPLE);
        copy(ModTags.Blocks.BRICK_SLAB_BROWN, ModTags.Items.BRICK_SLAB_BROWN);
        copy(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY, ModTags.Items.BRICK_SLAB_LIGHT_GRAY);
        copy(ModTags.Blocks.BRICK_SLAB_GRAY, ModTags.Items.BRICK_SLAB_GRAY);
        copy(ModTags.Blocks.BRICK_SLAB_BLACK, ModTags.Items.BRICK_SLAB_BLACK);
        copy(ModTags.Blocks.BRICK_SLAB_RED, ModTags.Items.BRICK_SLAB_RED);
        copy(ModTags.Blocks.BRICK_STAIRS_WHITE, ModTags.Items.BRICK_STAIRS_WHITE);
        copy(ModTags.Blocks.BRICK_STAIRS_ORANGE, ModTags.Items.BRICK_STAIRS_ORANGE);
        copy(ModTags.Blocks.BRICK_STAIRS_PINK, ModTags.Items.BRICK_STAIRS_PINK);
        copy(ModTags.Blocks.BRICK_STAIRS_YELLOW, ModTags.Items.BRICK_STAIRS_YELLOW);
        copy(ModTags.Blocks.BRICK_STAIRS_LIME, ModTags.Items.BRICK_STAIRS_LIME);
        copy(ModTags.Blocks.BRICK_STAIRS_GREEN, ModTags.Items.BRICK_STAIRS_GREEN);
        copy(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE, ModTags.Items.BRICK_STAIRS_LIGHT_BLUE);
        copy(ModTags.Blocks.BRICK_STAIRS_CYAN, ModTags.Items.BRICK_STAIRS_CYAN);
        copy(ModTags.Blocks.BRICK_STAIRS_BLUE, ModTags.Items.BRICK_STAIRS_BLUE);
        copy(ModTags.Blocks.BRICK_STAIRS_MAGENTA, ModTags.Items.BRICK_STAIRS_MAGENTA);
        copy(ModTags.Blocks.BRICK_STAIRS_PURPLE, ModTags.Items.BRICK_STAIRS_PURPLE);
        copy(ModTags.Blocks.BRICK_STAIRS_BROWN, ModTags.Items.BRICK_STAIRS_BROWN);
        copy(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY, ModTags.Items.BRICK_STAIRS_LIGHT_GRAY);
        copy(ModTags.Blocks.BRICK_STAIRS_GRAY, ModTags.Items.BRICK_STAIRS_GRAY);
        copy(ModTags.Blocks.BRICK_STAIRS_BLACK, ModTags.Items.BRICK_STAIRS_BLACK);
        copy(ModTags.Blocks.BRICK_STAIRS_RED, ModTags.Items.BRICK_STAIRS_RED);
        copy(ModTags.Blocks.BRICK_WALL_WHITE, ModTags.Items.BRICK_WALL_WHITE);
        copy(ModTags.Blocks.BRICK_WALL_ORANGE, ModTags.Items.BRICK_WALL_ORANGE);
        copy(ModTags.Blocks.BRICK_WALL_PINK, ModTags.Items.BRICK_WALL_PINK);
        copy(ModTags.Blocks.BRICK_WALL_YELLOW, ModTags.Items.BRICK_WALL_YELLOW);
        copy(ModTags.Blocks.BRICK_WALL_LIME, ModTags.Items.BRICK_WALL_LIME);
        copy(ModTags.Blocks.BRICK_WALL_GREEN, ModTags.Items.BRICK_WALL_GREEN);
        copy(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE, ModTags.Items.BRICK_WALL_LIGHT_BLUE);
        copy(ModTags.Blocks.BRICK_WALL_CYAN, ModTags.Items.BRICK_WALL_CYAN);
        copy(ModTags.Blocks.BRICK_WALL_BLUE, ModTags.Items.BRICK_WALL_BLUE);
        copy(ModTags.Blocks.BRICK_WALL_MAGENTA, ModTags.Items.BRICK_WALL_MAGENTA);
        copy(ModTags.Blocks.BRICK_WALL_PURPLE, ModTags.Items.BRICK_WALL_PURPLE);
        copy(ModTags.Blocks.BRICK_WALL_BROWN, ModTags.Items.BRICK_WALL_BROWN);
        copy(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY, ModTags.Items.BRICK_WALL_LIGHT_GRAY);
        copy(ModTags.Blocks.BRICK_WALL_GRAY, ModTags.Items.BRICK_WALL_GRAY);
        copy(ModTags.Blocks.BRICK_WALL_BLACK, ModTags.Items.BRICK_WALL_BLACK);
        copy(ModTags.Blocks.BRICK_WALL_RED, ModTags.Items.BRICK_WALL_RED);





        
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        getOrCreateBuilder(ModTags.Items.BRICK_WHITE).add(ModItems.WHITE_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_WHITE);
        getOrCreateBuilder(ModTags.Items.BRICK_ORANGE).add(ModItems.ORANGE_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_ORANGE);
        getOrCreateBuilder(ModTags.Items.BRICK_PINK).add(ModItems.PINK_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_PINK);
        getOrCreateBuilder(ModTags.Items.BRICK_YELLOW).add(ModItems.YELLOW_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_YELLOW);
        getOrCreateBuilder(ModTags.Items.BRICK_LIME).add(ModItems.LIME_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_LIME);
        getOrCreateBuilder(ModTags.Items.BRICK_GREEN).add(ModItems.GREEN_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_GREEN);
        getOrCreateBuilder(ModTags.Items.BRICK_LIGHT_BLUE).add(ModItems.LIGHT_BLUE_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_LIGHT_BLUE);
        getOrCreateBuilder(ModTags.Items.BRICK_CYAN).add(ModItems.CYAN_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_CYAN);
        getOrCreateBuilder(ModTags.Items.BRICK_BLUE).add(ModItems.BLUE_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_BLUE);
        getOrCreateBuilder(ModTags.Items.BRICK_MAGENTA).add(ModItems.MAGENTA_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_MAGENTA);
        getOrCreateBuilder(ModTags.Items.BRICK_PURPLE).add(ModItems.PURPLE_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_PURPLE);
        getOrCreateBuilder(ModTags.Items.BRICK_BROWN).add(ModItems.BROWN_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_BROWN);
        getOrCreateBuilder(ModTags.Items.BRICK_LIGHT_GRAY).add(ModItems.LIGHT_GRAY_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_LIGHT_GRAY);
        getOrCreateBuilder(ModTags.Items.BRICK_GRAY).add(ModItems.GRAY_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_GRAY);
        getOrCreateBuilder(ModTags.Items.BRICK_BLACK).add(ModItems.BLACK_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_BLACK);
        getOrCreateBuilder(ModTags.Items.BRICK_RED).add(ModItems.RED_BRICK.get());
        getOrCreateBuilder(Tags.Items.STONE).addTag(ModTags.Items.BRICK_RED);
    }
}