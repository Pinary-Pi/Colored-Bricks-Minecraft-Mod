package net.Pinary_Pi.coloredbricks.setup;

import net.Pinary_Pi.gear.util.ModResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> WHITE_BRICK = Registration.ITEMS.register("white_brick", () ->
        new Item(new Item.Properties().setId(ResourceKey.create(
            ForgeRegistries.ITEMS.getRegistryKey(),
            ModResourceLocation.create("white_brick")))));

    public static final RegistryObject<Item> ORANGE_BRICK = Registration.ITEMS.register("orange_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("orange_brick")))));

    public static final RegistryObject<Item> PINK_BRICK = Registration.ITEMS.register("pink_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("pink_brick")))));

    public static final RegistryObject<Item> YELLOW_BRICK = Registration.ITEMS.register("yellow_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("yellow_brick")))));

    public static final RegistryObject<Item> LIME_BRICK = Registration.ITEMS.register("lime_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("lime_brick")))));

    public static final RegistryObject<Item> GREEN_BRICK = Registration.ITEMS.register("green_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("green_brick")))));

    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = Registration.ITEMS.register("light_blue_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("light_blue_brick")))));

    public static final RegistryObject<Item> CYAN_BRICK = Registration.ITEMS.register("cyan_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("cyan_brick")))));

    public static final RegistryObject<Item> BLUE_BRICK = Registration.ITEMS.register("blue_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("blue_brick")))));

    public static final RegistryObject<Item> MAGENTA_BRICK = Registration.ITEMS.register("magenta_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("magenta_brick")))));

    public static final RegistryObject<Item> PURPLE_BRICK = Registration.ITEMS.register("purple_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("purple_brick")))));

    public static final RegistryObject<Item> BROWN_BRICK = Registration.ITEMS.register("brown_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("brown_brick")))));

    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = Registration.ITEMS.register("light_gray_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("light_gray_brick")))));

    public static final RegistryObject<Item> GRAY_BRICK = Registration.ITEMS.register("gray_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("gray_brick")))));

    public static final RegistryObject<Item> BLACK_BRICK = Registration.ITEMS.register("black_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("black_brick")))));

    public static final RegistryObject<Item> RED_BRICK = Registration.ITEMS.register("red_brick", () ->
            new Item(new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(),
                ModResourceLocation.create("red_brick")))));

        static void register() {}
}
