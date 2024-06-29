package net.pinary_pi.coloredbricks.setup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;

public class ModItems {

    public static final Item WHITE_BRICK = registerItem("white_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ORANGE_BRICK = registerItem("orange_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item PINK_BRICK = registerItem("pink_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item YELLOW_BRICK = registerItem("yellow_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item LIME_BRICK = registerItem("lime_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item GREEN_BRICK = registerItem("green_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item LIGHT_BLUE_BRICK = registerItem("light_blue_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CYAN_BRICK = registerItem("cyan_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item BLUE_BRICK = registerItem("blue_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MAGENTA_BRICK = registerItem("magenta_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item PURPLE_BRICK = registerItem("purple_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item BROWN_BRICK = registerItem("brown_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item GRAY_BRICK = registerItem("gray_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item LIGHT_GRAY_BRICK = registerItem("light_gray_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item BLACK_BRICK = registerItem("black_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item RED_BRICK = registerItem("red_brick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ColoredBricks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ColoredBricks.LOGGER.info("Registering Mod Items for " + ColoredBricks.MOD_ID);
    }
}
