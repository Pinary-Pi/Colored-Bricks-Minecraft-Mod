package net.Pinary_Pi.gear.util;

import java.util.function.Supplier;

import net.Pinary_Pi.coloredbricks.setup.ModTabs;
import net.Pinary_Pi.coloredbricks.setup.Registration;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistrationHelper {
    public static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        return register(name, block, CreativeModeTabs.BUILDING_BLOCKS);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, ResourceKey<CreativeModeTab> tab) {
        RegistryObject<T> regBlock = registerNoItem(name, block);
        ModTabs.addToBuildingBlocks(Registration.ITEMS.register(name, () -> new BlockItem(
            regBlock.get(), 
            new Item.Properties().setId(ResourceKey.create(
                ForgeRegistries.ITEMS.getRegistryKey(), 
                ModResourceLocation.create(name)
            ))
        )));
        return regBlock;
    }
}