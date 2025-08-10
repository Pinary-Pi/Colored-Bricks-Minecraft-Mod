package net.Pinary_Pi.coloredbricks.data;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.Pinary_Pi.coloredbricks.setup.block.BrickBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickSlabBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickStairsBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickWallBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), coloredbricks.MOD_ID, event.getExistingFileHelper());
    }

    @Override 
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.WHITE_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.ORANGE_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PINK_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.YELLOW_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIME_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GREEN_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_BLUE_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.CYAN_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLUE_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.MAGENTA_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PURPLE_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BROWN_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GRAY_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_GRAY_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLACK_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.RED_BRICKS.get());
        
        // Slabs

        this.tag(ModTags.Blocks.BRICK_SLAB_WHITE).addOptional(BrickSlabBlocks.WHITE_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.WHITE_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_ORANGE).addOptional(BrickSlabBlocks.ORANGE_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.ORANGE_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_PINK).addOptional(BrickSlabBlocks.PINK_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.PINK_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_YELLOW).addOptional(BrickSlabBlocks.YELLOW_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.YELLOW_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_LIME).addOptional(BrickSlabBlocks.LIME_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIME_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_GREEN).addOptional(BrickSlabBlocks.GREEN_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.GREEN_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_LIGHT_BLUE).addOptional(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_CYAN).addOptional(BrickSlabBlocks.CYAN_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.CYAN_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_BLUE).addOptional(BrickSlabBlocks.BLUE_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BLUE_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_MAGENTA).addOptional(BrickSlabBlocks.MAGENTA_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.MAGENTA_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_PURPLE).addOptional(BrickSlabBlocks.PURPLE_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.PURPLE_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_BROWN).addOptional(BrickSlabBlocks.BROWN_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BROWN_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_LIGHT_GRAY).addOptional(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_GRAY).addOptional(BrickSlabBlocks.GRAY_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.GRAY_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_BLACK).addOptional(BrickSlabBlocks.BLACK_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BLACK_BRICK_SLAB.get());
        this.tag(ModTags.Blocks.BRICK_SLAB_RED).addOptional(BrickSlabBlocks.RED_BRICK_SLAB.getId());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.RED_BRICK_SLAB.get());

        /// Stairs

        this.tag(ModTags.Blocks.BRICK_STAIRS_WHITE).addOptional(BrickStairsBlocks.WHITE_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_ORANGE).addOptional(BrickStairsBlocks.ORANGE_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_PINK).addOptional(BrickStairsBlocks.PINK_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_YELLOW).addOptional(BrickStairsBlocks.YELLOW_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIME).addOptional(BrickStairsBlocks.LIME_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_GREEN).addOptional(BrickStairsBlocks.GREEN_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIGHT_BLUE).addOptional(BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CYAN).addOptional(BrickStairsBlocks.CYAN_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_BLUE).addOptional(BrickStairsBlocks.BLUE_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_MAGENTA).addOptional(BrickStairsBlocks.MAGENTA_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_PURPLE).addOptional(BrickStairsBlocks.PURPLE_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_BROWN).addOptional(BrickStairsBlocks.BROWN_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_LIGHT_GRAY).addOptional(BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_GRAY).addOptional(BrickStairsBlocks.GRAY_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_BLACK).addOptional(BrickStairsBlocks.BLACK_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_RED).addOptional(BrickStairsBlocks.RED_BRICK_STAIRS.getId());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.WHITE_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.ORANGE_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.PINK_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.YELLOW_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.LIME_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.GREEN_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.CYAN_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.BLUE_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.MAGENTA_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.PURPLE_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.BROWN_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.GRAY_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.BLACK_BRICK_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickStairsBlocks.RED_BRICK_STAIRS.get());

        /// Walls

        this.tag(ModTags.Blocks.BRICK_WALL_WHITE).addOptional(BrickWallBlocks.WHITE_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_ORANGE).addOptional(BrickWallBlocks.ORANGE_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_PINK).addOptional(BrickWallBlocks.PINK_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_YELLOW).addOptional(BrickWallBlocks.YELLOW_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_LIME).addOptional(BrickWallBlocks.LIME_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_GREEN).addOptional(BrickWallBlocks.GREEN_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE).addOptional(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CYAN).addOptional(BrickWallBlocks.CYAN_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_BLUE).addOptional(BrickWallBlocks.BLUE_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_MAGENTA).addOptional(BrickWallBlocks.MAGENTA_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_PURPLE).addOptional(BrickWallBlocks.PURPLE_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_BROWN).addOptional(BrickWallBlocks.BROWN_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY).addOptional(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_GRAY).addOptional(BrickWallBlocks.GRAY_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_BLACK).addOptional(BrickWallBlocks.BLACK_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_RED).addOptional(BrickWallBlocks.RED_BRICK_WALL.getId());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.WHITE_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.ORANGE_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.PINK_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.YELLOW_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIME_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.GREEN_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.CYAN_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BLUE_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.MAGENTA_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.PURPLE_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BROWN_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.GRAY_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BLACK_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.RED_BRICK_WALL.get());

        this.tag(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT).addOptional(BrickWallBlocks.WHITE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_WHITE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT).addOptional(BrickWallBlocks.ORANGE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_ORANGE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT).addOptional(BrickWallBlocks.PINK_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PINK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT).addOptional(BrickWallBlocks.YELLOW_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_YELLOW_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT).addOptional(BrickWallBlocks.LIME_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIME_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT).addOptional(BrickWallBlocks.GREEN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GREEN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT).addOptional(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT).addOptional(BrickWallBlocks.CYAN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CYAN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT).addOptional(BrickWallBlocks.BLUE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT).addOptional(BrickWallBlocks.MAGENTA_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_MAGENTA_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT).addOptional(BrickWallBlocks.PURPLE_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_PURPLE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT).addOptional(BrickWallBlocks.BROWN_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BROWN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT).addOptional(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_LIGHT_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT).addOptional(BrickWallBlocks.GRAY_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT).addOptional(BrickWallBlocks.BLACK_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_BLACK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT).addOptional(BrickWallBlocks.RED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_RED_MINECRAFT);

        // Chiseled Bricks

        this.tag(ModTags.Blocks.BRICKS_CHISELED_WHITE).add(BrickBlocks.WHITE_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_ORANGE).add(BrickBlocks.ORANGE_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_PINK).add(BrickBlocks.PINK_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_YELLOW).add(BrickBlocks.YELLOW_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIME).add(BrickBlocks.LIME_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_GREEN).add(BrickBlocks.GREEN_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_BLUE).add(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_CYAN).add(BrickBlocks.CYAN_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BLUE).add(BrickBlocks.BLUE_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_MAGENTA).add(BrickBlocks.MAGENTA_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_PURPLE).add(BrickBlocks.PURPLE_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BROWN).add(BrickBlocks.BROWN_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_LIGHT_GRAY).add(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_GRAY).add(BrickBlocks.GRAY_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_BLACK).add(BrickBlocks.BLACK_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED_RED).add(BrickBlocks.RED_CHISELED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CHISELED).add(BrickBlocks.CHISELED_BRICKS.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.WHITE_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.ORANGE_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PINK_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.YELLOW_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIME_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GREEN_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.CYAN_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLUE_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.MAGENTA_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PURPLE_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BROWN_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GRAY_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLACK_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.RED_CHISELED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.CHISELED_BRICKS.get());

        // Cracked Bricks

        this.tag(ModTags.Blocks.BRICKS_CRACKED).add(BrickBlocks.CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_WHITE).add(BrickBlocks.WHITE_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_ORANGE).add(BrickBlocks.ORANGE_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_PINK).add(BrickBlocks.PINK_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_YELLOW).add(BrickBlocks.YELLOW_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIME).add(BrickBlocks.LIME_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_GREEN).add(BrickBlocks.GREEN_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_BLUE).add(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_CYAN).add(BrickBlocks.CYAN_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BLUE).add(BrickBlocks.BLUE_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_MAGENTA).add(BrickBlocks.MAGENTA_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_PURPLE).add(BrickBlocks.PURPLE_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BROWN).add(BrickBlocks.BROWN_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_LIGHT_GRAY).add(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_GRAY).add(BrickBlocks.GRAY_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_BLACK).add(BrickBlocks.BLACK_CRACKED_BRICKS.get());
        this.tag(ModTags.Blocks.BRICKS_CRACKED_RED).add(BrickBlocks.RED_CRACKED_BRICKS.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.WHITE_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.ORANGE_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PINK_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.YELLOW_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIME_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GREEN_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.CYAN_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLUE_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.MAGENTA_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.PURPLE_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BROWN_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.GRAY_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.BLACK_CRACKED_BRICKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickBlocks.RED_CRACKED_BRICKS.get());

        // Cracked Brick Slabs

        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED).addOptional(BrickSlabBlocks.CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE).addOptional(BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE).addOptional(BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK).addOptional(BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW).addOptional(BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME).addOptional(BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN).addOptional(BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN).addOptional(BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE).addOptional(BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE).addOptional(BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA).addOptional(BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE).addOptional(BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN).addOptional(BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY).addOptional(BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY).addOptional(BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK).addOptional(BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_RED).addOptional(BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.getId());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickSlabBlocks.RED_CRACKED_BRICK_SLAB.get());

        // Cracked Brick Stairs

        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED).addOptional(BrickStairsBlocks.CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_WHITE).addOptional(BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_ORANGE).addOptional(BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PINK).addOptional(BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_YELLOW).addOptional(BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIME).addOptional(BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GREEN).addOptional(BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_BLUE).addOptional(BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_CYAN).addOptional(BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLUE).addOptional(BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_MAGENTA).addOptional(BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_PURPLE).addOptional(BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BROWN).addOptional(BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_LIGHT_GRAY).addOptional(BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_GRAY).addOptional(BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_BLACK).addOptional(BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_STAIRS_CRACKED_RED).addOptional(BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.getId());

        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED).addOptional(BrickStairsBlocks.CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_WHITE).addOptional(BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_ORANGE).addOptional(BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PINK).addOptional(BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_YELLOW).addOptional(BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIME).addOptional(BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GREEN).addOptional(BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_CYAN).addOptional(BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_BLUE).addOptional(BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLUE).addOptional(BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_MAGENTA).addOptional(BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_PURPLE).addOptional(BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BROWN).addOptional(BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_LIGHT_GRAY).addOptional(BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_GRAY).addOptional(BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_BLACK).addOptional(BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS.getId());
        this.tag(ModTags.Blocks.BRICK_SLAB_CRACKED_RED).addOptional(BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS.getId());

        // Cracked Brick Walls

        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED).addOptional(BrickWallBlocks.CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE).addOptional(BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE).addOptional(BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK).addOptional(BrickWallBlocks.PINK_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW).addOptional(BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME).addOptional(BrickWallBlocks.LIME_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN).addOptional(BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE).addOptional(BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN).addOptional(BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE).addOptional(BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA).addOptional(BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE).addOptional(BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN).addOptional(BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY).addOptional(BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY).addOptional(BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK).addOptional(BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.getId());
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_RED).addOptional(BrickWallBlocks.RED_CRACKED_BRICK_WALL.getId());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.PINK_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIME_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BrickWallBlocks.RED_CRACKED_BRICK_WALL.get());

        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MINECRAFT).addOptional(BrickWallBlocks.CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_WHITE_MINECRAFT).addOptional(BrickWallBlocks.WHITE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_ORANGE_MINECRAFT).addOptional(BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PINK_MINECRAFT).addOptional(BrickWallBlocks.PINK_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_YELLOW_MINECRAFT).addOptional(BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIME_MINECRAFT).addOptional(BrickWallBlocks.LIME_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GREEN_MINECRAFT).addOptional(BrickWallBlocks.GREEN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_BLUE_MINECRAFT).addOptional(BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_CYAN_MINECRAFT).addOptional(BrickWallBlocks.CYAN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLUE_MINECRAFT).addOptional(BrickWallBlocks.BLUE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_MAGENTA_MINECRAFT).addOptional(BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_PURPLE_MINECRAFT).addOptional(BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BROWN_MINECRAFT).addOptional(BrickWallBlocks.BROWN_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_LIGHT_GRAY_MINECRAFT).addOptional(BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_GRAY_MINECRAFT).addOptional(BrickWallBlocks.GRAY_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_BLACK_MINECRAFT).addOptional(BrickWallBlocks.BLACK_CRACKED_BRICK_WALL.getId());
        this.tag(BlockTags.WALLS).addTag(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT);
        this.tag(ModTags.Blocks.BRICK_WALL_CRACKED_RED_MINECRAFT).addOptional(BrickWallBlocks.RED_CRACKED_BRICK_WALL.getId());
    }
}