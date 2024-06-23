package net.Pinary_Pi.coloredbricks.setup;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = coloredbricks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, coloredbricks.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> BUILDING_BLOCKS_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> FUNCTIONAL_BLOCKS_ITEMS = new ArrayList<>();

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.WHITE_BRICK);
            event.accept(ModItems.ORANGE_BRICK);
            event.accept(ModItems.PINK_BRICK);
            event.accept(ModItems.YELLOW_BRICK);
            event.accept(ModItems.LIME_BRICK);
            event.accept(ModItems.GREEN_BRICK);
            event.accept(ModItems.LIGHT_BLUE_BRICK);
            event.accept(ModItems.CYAN_BRICK);
            event.accept(ModItems.BLUE_BRICK);
            event.accept(ModItems.MAGENTA_BRICK);
            event.accept(ModItems.PURPLE_BRICK);
            event.accept(ModItems.BROWN_BRICK);
            event.accept(ModItems.GRAY_BRICK);
            event.accept(ModItems.LIGHT_GRAY_BRICK);
            event.accept(ModItems.BLACK_BRICK);
            event.accept(ModItems.RED_BRICK);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            BUILDING_BLOCKS_ITEMS.forEach(itemLike -> event.accept(itemLike.get()));
        } 
        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            FUNCTIONAL_BLOCKS_ITEMS.forEach(itemLike -> event.accept(itemLike.get()));
        }
    }

    public static <T extends Item> RegistryObject<T> addToBuildingBlocks(RegistryObject<T> itemLike) {
        BUILDING_BLOCKS_ITEMS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToFunctionalBlocks(RegistryObject<T> itemLike) {
        FUNCTIONAL_BLOCKS_ITEMS.add(itemLike);
        return itemLike;
    }
}
