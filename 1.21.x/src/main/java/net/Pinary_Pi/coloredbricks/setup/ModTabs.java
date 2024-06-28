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
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            // Bricks
            event.accept(ModBlocks.WHITE_BRICKS);
            event.accept(ModBlocks.ORANGE_BRICKS);
            event.accept(ModBlocks.PINK_BRICKS);
            event.accept(ModBlocks.YELLOW_BRICKS);
            event.accept(ModBlocks.LIME_BRICKS);
            event.accept(ModBlocks.GREEN_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_BRICKS);
            event.accept(ModBlocks.CYAN_BRICKS);
            event.accept(ModBlocks.BLUE_BRICKS);
            event.accept(ModBlocks.MAGENTA_BRICKS);
            event.accept(ModBlocks.PURPLE_BRICKS);
            event.accept(ModBlocks.BROWN_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_BRICKS);
            event.accept(ModBlocks.GRAY_BRICKS);
            event.accept(ModBlocks.BLACK_BRICKS);
            event.accept(ModBlocks.RED_BRICKS);
            // Brick Slabs
            event.accept(ModBlocks.WHITE_BRICK_SLAB);
            event.accept(ModBlocks.ORANGE_BRICK_SLAB);
            event.accept(ModBlocks.PINK_BRICK_SLAB);
            event.accept(ModBlocks.YELLOW_BRICK_SLAB);
            event.accept(ModBlocks.LIME_BRICK_SLAB);
            event.accept(ModBlocks.GREEN_BRICK_SLAB);
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
            event.accept(ModBlocks.CYAN_BRICK_SLAB);
            event.accept(ModBlocks.BLUE_BRICK_SLAB);
            event.accept(ModBlocks.MAGENTA_BRICK_SLAB);
            event.accept(ModBlocks.PURPLE_BRICK_SLAB);
            event.accept(ModBlocks.BROWN_BRICK_SLAB);
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
            event.accept(ModBlocks.GRAY_BRICK_SLAB);
            event.accept(ModBlocks.BLACK_BRICK_SLAB);
            event.accept(ModBlocks.RED_BRICK_SLAB);
            // Brick Stairs
            event.accept(ModBlocks.WHITE_BRICK_STAIRS);
            event.accept(ModBlocks.ORANGE_BRICK_STAIRS);
            event.accept(ModBlocks.PINK_BRICK_STAIRS);
            event.accept(ModBlocks.YELLOW_BRICK_STAIRS);
            event.accept(ModBlocks.LIME_BRICK_STAIRS);
            event.accept(ModBlocks.GREEN_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
            event.accept(ModBlocks.CYAN_BRICK_STAIRS);
            event.accept(ModBlocks.BLUE_BRICK_STAIRS);
            event.accept(ModBlocks.MAGENTA_BRICK_STAIRS);
            event.accept(ModBlocks.PURPLE_BRICK_STAIRS);
            event.accept(ModBlocks.BROWN_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
            event.accept(ModBlocks.GRAY_BRICK_STAIRS);
            event.accept(ModBlocks.BLACK_BRICK_STAIRS);
            event.accept(ModBlocks.RED_BRICK_STAIRS);
            // Brick Walls
            event.accept(ModBlocks.WHITE_BRICK_WALL);
            event.accept(ModBlocks.ORANGE_BRICK_WALL);
            event.accept(ModBlocks.PINK_BRICK_WALL);
            event.accept(ModBlocks.YELLOW_BRICK_WALL);
            event.accept(ModBlocks.LIME_BRICK_WALL);
            event.accept(ModBlocks.GREEN_BRICK_WALL);
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_WALL);
            event.accept(ModBlocks.CYAN_BRICK_WALL);
            event.accept(ModBlocks.BLUE_BRICK_WALL);
            event.accept(ModBlocks.MAGENTA_BRICK_WALL);
            event.accept(ModBlocks.PURPLE_BRICK_WALL);
            event.accept(ModBlocks.BROWN_BRICK_WALL);
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_WALL);
            event.accept(ModBlocks.GRAY_BRICK_WALL);
            event.accept(ModBlocks.BLACK_BRICK_WALL);
            event.accept(ModBlocks.RED_BRICK_WALL);
            // Cracked Bricks
            event.accept(ModBlocks.WHITE_CRACKED_BRICKS);
            event.accept(ModBlocks.ORANGE_CRACKED_BRICKS);
            event.accept(ModBlocks.PINK_CRACKED_BRICKS);
            event.accept(ModBlocks.YELLOW_CRACKED_BRICKS);
            event.accept(ModBlocks.LIME_CRACKED_BRICKS);
            event.accept(ModBlocks.GREEN_CRACKED_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_CRACKED_BRICKS);
            event.accept(ModBlocks.CYAN_CRACKED_BRICKS);
            event.accept(ModBlocks.BLUE_CRACKED_BRICKS);
            event.accept(ModBlocks.MAGENTA_CRACKED_BRICKS);
            event.accept(ModBlocks.PURPLE_CRACKED_BRICKS);
            event.accept(ModBlocks.BROWN_CRACKED_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_CRACKED_BRICKS);
            event.accept(ModBlocks.GRAY_CRACKED_BRICKS);
            event.accept(ModBlocks.BLACK_CRACKED_BRICKS);
            event.accept(ModBlocks.RED_CRACKED_BRICKS);
            // Cracked Slabs
            event.accept(ModBlocks.WHITE_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.ORANGE_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.PINK_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.YELLOW_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.LIME_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.GREEN_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.CYAN_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.BLUE_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.MAGENTA_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.PURPLE_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.BROWN_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.GRAY_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.BLACK_CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.RED_CRACKED_BRICK_SLAB);
            // Cracked Stairs
            event.accept(ModBlocks.WHITE_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.ORANGE_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.PINK_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.YELLOW_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.LIME_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.GREEN_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.CYAN_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.BLUE_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.MAGENTA_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.PURPLE_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.BROWN_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.GRAY_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.BLACK_CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.RED_CRACKED_BRICK_STAIRS);
            // Cracked Walls
            event.accept(ModBlocks.WHITE_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.ORANGE_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.PINK_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.YELLOW_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.LIME_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.GREEN_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.CYAN_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.BLUE_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.MAGENTA_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.PURPLE_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.BROWN_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.GRAY_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.BLACK_CRACKED_BRICK_WALL);
            event.accept(ModBlocks.RED_CRACKED_BRICK_WALL);
            // Chiseled Bricks
            event.accept(ModBlocks.WHITE_CHISELED_BRICKS);
            event.accept(ModBlocks.ORANGE_CHISELED_BRICKS);
            event.accept(ModBlocks.PINK_CHISELED_BRICKS);
            event.accept(ModBlocks.YELLOW_CHISELED_BRICKS);
            event.accept(ModBlocks.LIME_CHISELED_BRICKS);
            event.accept(ModBlocks.GREEN_CHISELED_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_CHISELED_BRICKS);
            event.accept(ModBlocks.CYAN_CHISELED_BRICKS);
            event.accept(ModBlocks.BLUE_CHISELED_BRICKS);
            event.accept(ModBlocks.MAGENTA_CHISELED_BRICKS);
            event.accept(ModBlocks.PURPLE_CHISELED_BRICKS);
            event.accept(ModBlocks.BROWN_CHISELED_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_CHISELED_BRICKS);
            event.accept(ModBlocks.GRAY_CHISELED_BRICKS);
            event.accept(ModBlocks.BLACK_CHISELED_BRICKS);
            event.accept(ModBlocks.RED_CHISELED_BRICKS);
            // Flower Pots
            event.accept(ModBlocks.WHITE_FLOWER_POT);
            event.accept(ModBlocks.ORANGE_FLOWER_POT);
            event.accept(ModBlocks.PINK_FLOWER_POT);
            event.accept(ModBlocks.YELLOW_FLOWER_POT);
            event.accept(ModBlocks.LIME_FLOWER_POT);
            event.accept(ModBlocks.GREEN_FLOWER_POT);
            event.accept(ModBlocks.LIGHT_BLUE_FLOWER_POT);
            event.accept(ModBlocks.CYAN_FLOWER_POT);
            event.accept(ModBlocks.BLUE_FLOWER_POT);
            event.accept(ModBlocks.MAGENTA_FLOWER_POT);
            event.accept(ModBlocks.PURPLE_FLOWER_POT);
            event.accept(ModBlocks.BROWN_FLOWER_POT);
            event.accept(ModBlocks.LIGHT_GRAY_FLOWER_POT);
            event.accept(ModBlocks.GRAY_FLOWER_POT);
            event.accept(ModBlocks.BLACK_FLOWER_POT);
            event.accept(ModBlocks.RED_FLOWER_POT);
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
