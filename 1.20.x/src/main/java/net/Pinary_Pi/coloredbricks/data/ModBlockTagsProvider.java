package net.Pinary_Pi.coloredbricks.data;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.data.event.GatherDataEvent;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), coloredbricks.MOD_ID, event.getExistingFileHelper());
    }

    @Override 
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.BRICKS_WHITE).add(ModBlocks.WHITE_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_WHITE);
        this.tag(ModTags.Blocks.BRICKS_ORANGE).add(ModBlocks.ORANGE_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_ORANGE);
        this.tag(ModTags.Blocks.BRICKS_PINK).add(ModBlocks.PINK_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_PINK);
        this.tag(ModTags.Blocks.BRICKS_YELLOW).add(ModBlocks.YELLOW_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_YELLOW);
        this.tag(ModTags.Blocks.BRICKS_LIME).add(ModBlocks.LIME_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIME);
        this.tag(ModTags.Blocks.BRICKS_GREEN).add(ModBlocks.GREEN_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_GREEN);
        this.tag(ModTags.Blocks.BRICKS_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICKS_CYAN).add(ModBlocks.CYAN_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CYAN);
        this.tag(ModTags.Blocks.BRICKS_BLUE).add(ModBlocks.BLUE_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BLUE);
        this.tag(ModTags.Blocks.BRICKS_MAGENTA).add(ModBlocks.MAGENTA_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_MAGENTA);
        this.tag(ModTags.Blocks.BRICKS_PURPLE).add(ModBlocks.PURPLE_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_PURPLE);
        this.tag(ModTags.Blocks.BRICKS_BROWN).add(ModBlocks.BROWN_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BROWN);
        this.tag(ModTags.Blocks.BRICKS_GRAY).add(ModBlocks.GRAY_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_GRAY);
        this.tag(ModTags.Blocks.BRICKS_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICKS_BLACK).add(ModBlocks.BLACK_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_BLACK);
        this.tag(ModTags.Blocks.BRICKS_RED).add(ModBlocks.RED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_RED);
        
        // Slabs

        this.tag(ModTags.Blocks.BRICK_SLAB_WHITE).addOptional(ModBlocks.WHITE_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_WHITE);
        this.tag(ModTags.Blocks.BRICK_SLAB_ORANGE).addOptional(ModBlocks.ORANGE_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_ORANGE);
        this.tag(ModTags.Blocks.BRICK_SLAB_PINK).addOptional(ModBlocks.PINK_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_PINK);
        this.tag(ModTags.Blocks.BRICK_SLAB_YELLOW).addOptional(ModBlocks.YELLOW_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_YELLOW);
        this.tag(ModTags.Blocks.BRICK_SLAB_LIME).addOptional(ModBlocks.LIME_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIME);
        this.tag(ModTags.Blocks.BRICK_SLAB_GREEN).addOptional(ModBlocks.GREEN_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_GREEN);
        this.tag(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CYAN).addOptional(ModBlocks.CYAN_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CYAN);
        this.tag(ModTags.Blocks.BRICK_SLAB_BLUE).addOptional(ModBlocks.BLUE_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BLUE);
        this.tag(ModTags.Blocks.BRICK_SLAB_MAGENTA).addOptional(ModBlocks.MAGENTA_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_SLAB_PURPLE).addOptional(ModBlocks.PURPLE_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_PURPLE);
        this.tag(ModTags.Blocks.BRICK_SLAB_BROWN).addOptional(ModBlocks.BROWN_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BROWN);
        this.tag(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_SLAB_GRAY).addOptional(ModBlocks.GRAY_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_GRAY);
        this.tag(ModTags.Blocks.BRICK_SLAB_BLACK).addOptional(ModBlocks.BLACK_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_BLACK);
        this.tag(ModTags.Blocks.BRICK_SLAB_RED).addOptional(ModBlocks.RED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_RED);
        this.tag(ModTags.Blocks.BRICK_STAIRS_WHITE).addOptional(ModBlocks.WHITE_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_WHITE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_ORANGE).addOptional(ModBlocks.ORANGE_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_ORANGE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_PINK).addOptional(ModBlocks.PINK_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_PINK);
        this.tag(ModTags.Blocks.BRICK_STAIRS_YELLOW).addOptional(ModBlocks.YELLOW_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_YELLOW);
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIME).addOptional(ModBlocks.LIME_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIME);
        this.tag(ModTags.Blocks.BRICK_STAIRS_GREEN).addOptional(ModBlocks.GREEN_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_GREEN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CYAN).addOptional(ModBlocks.CYAN_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CYAN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_BLUE).addOptional(ModBlocks.BLUE_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BLUE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_MAGENTA).addOptional(ModBlocks.MAGENTA_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_STAIRS_PURPLE).addOptional(ModBlocks.PURPLE_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_PURPLE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_BROWN).addOptional(ModBlocks.BROWN_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BROWN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_STAIRS_GRAY).addOptional(ModBlocks.GRAY_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_GRAY);
        this.tag(ModTags.Blocks.BRICK_STAIRS_BLACK).addOptional(ModBlocks.BLACK_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_BLACK);
        this.tag(ModTags.Blocks.BRICK_STAIRS_RED).addOptional(ModBlocks.RED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_RED);
        this.tag(ModTags.Blocks.BRICK_WALL_WHITE).addOptional(ModBlocks.WHITE_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_WHITE);
        this.tag(ModTags.Blocks.BRICK_WALL_ORANGE).addOptional(ModBlocks.ORANGE_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_ORANGE);
        this.tag(ModTags.Blocks.BRICK_WALL_PINK).addOptional(ModBlocks.PINK_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_PINK);
        this.tag(ModTags.Blocks.BRICK_WALL_YELLOW).addOptional(ModBlocks.YELLOW_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_YELLOW);
        this.tag(ModTags.Blocks.BRICK_WALL_LIME).addOptional(ModBlocks.LIME_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIME);
        this.tag(ModTags.Blocks.BRICK_WALL_GREEN).addOptional(ModBlocks.GREEN_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_GREEN);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_WALL_CYAN).addOptional(ModBlocks.CYAN_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CYAN);
        this.tag(ModTags.Blocks.BRICK_WALL_BLUE).addOptional(ModBlocks.BLUE_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BLUE);
        this.tag(ModTags.Blocks.BRICK_WALL_MAGENTA).addOptional(ModBlocks.MAGENTA_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_WALL_PURPLE).addOptional(ModBlocks.PURPLE_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_PURPLE);
        this.tag(ModTags.Blocks.BRICK_WALL_BROWN).addOptional(ModBlocks.BROWN_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BROWN);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_WALL_GRAY).addOptional(ModBlocks.GRAY_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_GRAY);
        this.tag(ModTags.Blocks.BRICK_WALL_BLACK).addOptional(ModBlocks.BLACK_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_BLACK);
        this.tag(ModTags.Blocks.BRICK_WALL_RED).addOptional(ModBlocks.RED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_RED);

        this.tag(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT).addOptional(ModBlocks.WHITE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT).addOptional(ModBlocks.ORANGE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT).addOptional(ModBlocks.PINK_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT).addOptional(ModBlocks.YELLOW_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT).addOptional(ModBlocks.LIME_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT).addOptional(ModBlocks.GREEN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT).addOptional(ModBlocks.LIGHT_BLUE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT).addOptional(ModBlocks.CYAN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT).addOptional(ModBlocks.BLUE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT).addOptional(ModBlocks.MAGENTA_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT).addOptional(ModBlocks.PURPLE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT).addOptional(ModBlocks.BROWN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT).addOptional(ModBlocks.LIGHT_GRAY_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT).addOptional(ModBlocks.GRAY_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT).addOptional(ModBlocks.BLACK_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT).addOptional(ModBlocks.RED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT);

        // Chiseled Bricks

        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_WHITE);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_WHITE).add(ModBlocks.WHITE_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_ORANGE);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_ORANGE).add(ModBlocks.ORANGE_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_PINK);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_PINK).add(ModBlocks.PINK_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_YELLOW);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_YELLOW).add(ModBlocks.YELLOW_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIME);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIME).add(ModBlocks.LIME_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_GREEN);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_GREEN).add(ModBlocks.GREEN_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_CYAN);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_CYAN).add(ModBlocks.CYAN_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BLUE);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BLUE).add(ModBlocks.BLUE_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_MAGENTA);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_MAGENTA).add(ModBlocks.MAGENTA_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_PURPLE);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_PURPLE).add(ModBlocks.PURPLE_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BROWN);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BROWN).add(ModBlocks.BROWN_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_GRAY);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_GRAY).add(ModBlocks.GRAY_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_BLACK);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BLACK).add(ModBlocks.BLACK_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED_RED);
        this.tag(ModTags.Blocks.BRICKS_CHISELED_RED).add(ModBlocks.RED_CHISELED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CHISELED);
        this.tag(ModTags.Blocks.BRICKS_CHISELED).add(ModBlocks.CHISELED_BRICKS.getKey());

        // Cracked Bricks

        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED);
        this.tag(ModTags.Blocks.BRICKS_CRACKED).add(ModBlocks.CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_WHITE);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_WHITE).add(ModBlocks.WHITE_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_ORANGE);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_ORANGE).add(ModBlocks.ORANGE_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_PINK);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_PINK).add(ModBlocks.PINK_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_YELLOW);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_YELLOW).add(ModBlocks.YELLOW_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIME);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIME).add(ModBlocks.LIME_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_GREEN);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_GREEN).add(ModBlocks.GREEN_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_BLUE).add(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_CYAN);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_CYAN).add(ModBlocks.CYAN_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BLUE);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BLUE).add(ModBlocks.BLUE_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_MAGENTA);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_MAGENTA).add(ModBlocks.MAGENTA_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_PURPLE);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_PURPLE).add(ModBlocks.PURPLE_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BROWN);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BROWN).add(ModBlocks.BROWN_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_GRAY).add(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_GRAY);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_GRAY).add(ModBlocks.GRAY_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_BLACK);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BLACK).add(ModBlocks.BLACK_CRACKED_BRICKS.getKey());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICKS_CRACKED_RED);
        this.tag(ModTags.Blocks.BRICKS_CRACKED_RED).add(ModBlocks.RED_CRACKED_BRICKS.getKey());

        // Cracked Brick Slabs

        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED).addOptional(ModBlocks.CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE).addOptional(ModBlocks.WHITE_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE).addOptional(ModBlocks.ORANGE_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK).addOptional(ModBlocks.PINK_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW).addOptional(ModBlocks.YELLOW_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME).addOptional(ModBlocks.LIME_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN).addOptional(ModBlocks.GREEN_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN).addOptional(ModBlocks.CYAN_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE).addOptional(ModBlocks.BLUE_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA).addOptional(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE).addOptional(ModBlocks.PURPLE_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN).addOptional(ModBlocks.BROWN_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY).addOptional(ModBlocks.GRAY_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK).addOptional(ModBlocks.BLACK_CRACKED_BRICK_SLAB.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_SLAB_CRACKED_RED);
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_RED).addOptional(ModBlocks.RED_CRACKED_BRICK_SLAB.getId());

        // Cracked Brick Stairs

        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED).addOptional(ModBlocks.CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_WHITE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_WHITE).addOptional(ModBlocks.WHITE_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_ORANGE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_ORANGE).addOptional(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PINK);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PINK).addOptional(ModBlocks.PINK_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_YELLOW);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_YELLOW).addOptional(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIME);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIME).addOptional(ModBlocks.LIME_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GREEN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GREEN).addOptional(ModBlocks.GREEN_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_CYAN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_CYAN).addOptional(ModBlocks.CYAN_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLUE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLUE).addOptional(ModBlocks.BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_MAGENTA).addOptional(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PURPLE);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PURPLE).addOptional(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BROWN);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BROWN).addOptional(ModBlocks.BROWN_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GRAY);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GRAY).addOptional(ModBlocks.GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLACK);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLACK).addOptional(ModBlocks.BLACK_CRACKED_BRICK_STAIRS.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_STAIRS_CRACKED_RED);
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_RED).addOptional(ModBlocks.RED_CRACKED_BRICK_STAIRS.getId());

        // Cracked Brick Walls

        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED).addOptional(ModBlocks.CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE).addOptional(ModBlocks.WHITE_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE).addOptional(ModBlocks.ORANGE_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK).addOptional(ModBlocks.PINK_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW).addOptional(ModBlocks.YELLOW_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME).addOptional(ModBlocks.LIME_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN).addOptional(ModBlocks.GREEN_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE).addOptional(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN).addOptional(ModBlocks.CYAN_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE).addOptional(ModBlocks.BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA).addOptional(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE).addOptional(ModBlocks.PURPLE_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN).addOptional(ModBlocks.BROWN_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY).addOptional(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY).addOptional(ModBlocks.GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK).addOptional(ModBlocks.BLACK_CRACKED_BRICK_WALL.getId());
        this.tag(Tags.Blocks.STONE).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_RED);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_RED).addOptional(ModBlocks.RED_CRACKED_BRICK_WALL.getId());

        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT).addOptional(ModBlocks.CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT).addOptional(ModBlocks.WHITE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT).addOptional(ModBlocks.ORANGE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT).addOptional(ModBlocks.PINK_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT).addOptional(ModBlocks.YELLOW_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT).addOptional(ModBlocks.LIME_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT).addOptional(ModBlocks.GREEN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT).addOptional(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT).addOptional(ModBlocks.CYAN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT).addOptional(ModBlocks.BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT).addOptional(ModBlocks.MAGENTA_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT).addOptional(ModBlocks.PURPLE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT).addOptional(ModBlocks.BROWN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT).addOptional(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT).addOptional(ModBlocks.GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT).addOptional(ModBlocks.BLACK_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT).addOptional(ModBlocks.RED_CRACKED_BRICK_WALL.getId());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(Tags.Blocks.STONE);
    }
}