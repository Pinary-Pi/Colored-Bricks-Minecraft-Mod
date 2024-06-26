package net.pinary_pi.coloredbricks.setup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;

public class ModBlocks {
    private static final AbstractBlock.Settings BRICK_SETTINGS = AbstractBlock.Settings.copy(Blocks.BRICKS);

    // Normal Brick Blocks
    public static final Block WHITE_BRICKS = registerBrickBlock("white_bricks", new Block(BRICK_SETTINGS));
    public static final Block ORANGE_BRICKS = registerBrickBlock("orange_bricks", new Block(BRICK_SETTINGS));
    public static final Block PINK_BRICKS = registerBrickBlock("pink_bricks", new Block(BRICK_SETTINGS));
    public static final Block YELLOW_BRICKS = registerBrickBlock("yellow_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIME_BRICKS = registerBrickBlock("lime_bricks", new Block(BRICK_SETTINGS));
    public static final Block GREEN_BRICKS = registerBrickBlock("green_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_BLUE_BRICKS = registerBrickBlock("light_blue_bricks", new Block(BRICK_SETTINGS));
    public static final Block CYAN_BRICKS = registerBrickBlock("cyan_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLUE_BRICKS = registerBrickBlock("blue_bricks", new Block(BRICK_SETTINGS));
    public static final Block MAGENTA_BRICKS = registerBrickBlock("magenta_bricks", new Block(BRICK_SETTINGS));
    public static final Block PURPLE_BRICKS = registerBrickBlock("purple_bricks", new Block(BRICK_SETTINGS));
    public static final Block BROWN_BRICKS = registerBrickBlock("brown_bricks", new Block(BRICK_SETTINGS));
    public static final Block GRAY_BRICKS = registerBrickBlock("gray_bricks", new Block(BRICK_SETTINGS));
    public static final Block LIGHT_GRAY_BRICKS = registerBrickBlock("light_gray_bricks", new Block(BRICK_SETTINGS));
    public static final Block BLACK_BRICKS = registerBrickBlock("black_bricks", new Block(BRICK_SETTINGS));
    public static final Block RED_BRICKS = registerBrickBlock("red_bricks", new Block(BRICK_SETTINGS));

    private static void addBlocksToBuildingBlocksTab(FabricItemGroupEntries entries) {
        entries.add(WHITE_BRICKS);
        entries.add(ORANGE_BRICKS);
        entries.add(PINK_BRICKS);
        entries.add(YELLOW_BRICKS);
        entries.add(LIME_BRICKS);
        entries.add(GREEN_BRICKS);
        entries.add(LIGHT_BLUE_BRICKS);
        entries.add(CYAN_BRICKS);
        entries.add(BLUE_BRICKS);
        entries.add(MAGENTA_BRICKS);
        entries.add(PURPLE_BRICKS);
        entries.add(BROWN_BRICKS);
        entries.add(GRAY_BRICKS);
        entries.add(LIGHT_GRAY_BRICKS);
        entries.add(BLACK_BRICKS);
        entries.add(RED_BRICKS);
    }

    private static Block registerBrickBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ColoredBricks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ColoredBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ColoredBricks.LOGGER.info("Registering Mod Blocks for " + ColoredBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTab);
    }
}
