package net.Pinary_Pi.coloredbricks.setup;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickSlabBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickStairsBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickWallBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.ColoredFlowerPots;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
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
            event.accept(BrickBlocks.WHITE_BRICKS);
            event.accept(BrickBlocks.ORANGE_BRICKS);
            event.accept(BrickBlocks.PINK_BRICKS);
            event.accept(BrickBlocks.YELLOW_BRICKS);
            event.accept(BrickBlocks.LIME_BRICKS);
            event.accept(BrickBlocks.GREEN_BRICKS);
            event.accept(BrickBlocks.LIGHT_BLUE_BRICKS);
            event.accept(BrickBlocks.CYAN_BRICKS);
            event.accept(BrickBlocks.BLUE_BRICKS);
            event.accept(BrickBlocks.MAGENTA_BRICKS);
            event.accept(BrickBlocks.PURPLE_BRICKS);
            event.accept(BrickBlocks.BROWN_BRICKS);
            event.accept(BrickBlocks.LIGHT_GRAY_BRICKS);
            event.accept(BrickBlocks.GRAY_BRICKS);
            event.accept(BrickBlocks.BLACK_BRICKS);
            event.accept(BrickBlocks.RED_BRICKS);
            // Brick Slabs
            event.accept(BrickSlabBlocks.WHITE_BRICK_SLAB);
            event.accept(BrickSlabBlocks.ORANGE_BRICK_SLAB);
            event.accept(BrickSlabBlocks.PINK_BRICK_SLAB);
            event.accept(BrickSlabBlocks.YELLOW_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIME_BRICK_SLAB);
            event.accept(BrickSlabBlocks.GREEN_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIGHT_BLUE_BRICK_SLAB);
            event.accept(BrickSlabBlocks.CYAN_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BLUE_BRICK_SLAB);
            event.accept(BrickSlabBlocks.MAGENTA_BRICK_SLAB);
            event.accept(BrickSlabBlocks.PURPLE_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BROWN_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIGHT_GRAY_BRICK_SLAB);
            event.accept(BrickSlabBlocks.GRAY_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BLACK_BRICK_SLAB);
            event.accept(BrickSlabBlocks.RED_BRICK_SLAB);
            // Brick Stairs
            event.accept(BrickStairsBlocks.WHITE_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.ORANGE_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.PINK_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.YELLOW_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIME_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.GREEN_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIGHT_BLUE_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.CYAN_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BLUE_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.MAGENTA_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.PURPLE_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BROWN_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIGHT_GRAY_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.GRAY_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BLACK_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.RED_BRICK_STAIRS);
            // Brick Walls
            event.accept(BrickWallBlocks.WHITE_BRICK_WALL);
            event.accept(BrickWallBlocks.ORANGE_BRICK_WALL);
            event.accept(BrickWallBlocks.PINK_BRICK_WALL);
            event.accept(BrickWallBlocks.YELLOW_BRICK_WALL);
            event.accept(BrickWallBlocks.LIME_BRICK_WALL);
            event.accept(BrickWallBlocks.GREEN_BRICK_WALL);
            event.accept(BrickWallBlocks.LIGHT_BLUE_BRICK_WALL);
            event.accept(BrickWallBlocks.CYAN_BRICK_WALL);
            event.accept(BrickWallBlocks.BLUE_BRICK_WALL);
            event.accept(BrickWallBlocks.MAGENTA_BRICK_WALL);
            event.accept(BrickWallBlocks.PURPLE_BRICK_WALL);
            event.accept(BrickWallBlocks.BROWN_BRICK_WALL);
            event.accept(BrickWallBlocks.LIGHT_GRAY_BRICK_WALL);
            event.accept(BrickWallBlocks.GRAY_BRICK_WALL);
            event.accept(BrickWallBlocks.BLACK_BRICK_WALL);
            event.accept(BrickWallBlocks.RED_BRICK_WALL);
            // Cracked Bricks
            event.accept(BrickBlocks.WHITE_CRACKED_BRICKS);
            event.accept(BrickBlocks.ORANGE_CRACKED_BRICKS);
            event.accept(BrickBlocks.PINK_CRACKED_BRICKS);
            event.accept(BrickBlocks.YELLOW_CRACKED_BRICKS);
            event.accept(BrickBlocks.LIME_CRACKED_BRICKS);
            event.accept(BrickBlocks.GREEN_CRACKED_BRICKS);
            event.accept(BrickBlocks.LIGHT_BLUE_CRACKED_BRICKS);
            event.accept(BrickBlocks.CYAN_CRACKED_BRICKS);
            event.accept(BrickBlocks.BLUE_CRACKED_BRICKS);
            event.accept(BrickBlocks.MAGENTA_CRACKED_BRICKS);
            event.accept(BrickBlocks.PURPLE_CRACKED_BRICKS);
            event.accept(BrickBlocks.BROWN_CRACKED_BRICKS);
            event.accept(BrickBlocks.LIGHT_GRAY_CRACKED_BRICKS);
            event.accept(BrickBlocks.GRAY_CRACKED_BRICKS);
            event.accept(BrickBlocks.BLACK_CRACKED_BRICKS);
            event.accept(BrickBlocks.RED_CRACKED_BRICKS);
            // Cracked Slabs
            event.accept(BrickSlabBlocks.WHITE_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.ORANGE_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.PINK_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.YELLOW_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIME_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.GREEN_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIGHT_BLUE_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.CYAN_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BLUE_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.MAGENTA_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.PURPLE_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BROWN_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.LIGHT_GRAY_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.GRAY_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.BLACK_CRACKED_BRICK_SLAB);
            event.accept(BrickSlabBlocks.RED_CRACKED_BRICK_SLAB);
            // Cracked Stairs
            event.accept(BrickStairsBlocks.WHITE_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.ORANGE_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.PINK_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.YELLOW_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIME_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.GREEN_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIGHT_BLUE_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.CYAN_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BLUE_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.MAGENTA_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.PURPLE_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BROWN_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.LIGHT_GRAY_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.GRAY_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.BLACK_CRACKED_BRICK_STAIRS);
            event.accept(BrickStairsBlocks.RED_CRACKED_BRICK_STAIRS);
            // Cracked Walls
            event.accept(BrickWallBlocks.WHITE_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.ORANGE_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.PINK_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.YELLOW_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.LIME_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.GREEN_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.LIGHT_BLUE_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.CYAN_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.BLUE_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.MAGENTA_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.PURPLE_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.BROWN_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.LIGHT_GRAY_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.GRAY_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.BLACK_CRACKED_BRICK_WALL);
            event.accept(BrickWallBlocks.RED_CRACKED_BRICK_WALL);
            // Chiseled Bricks
            event.accept(BrickBlocks.WHITE_CHISELED_BRICKS);
            event.accept(BrickBlocks.ORANGE_CHISELED_BRICKS);
            event.accept(BrickBlocks.PINK_CHISELED_BRICKS);
            event.accept(BrickBlocks.YELLOW_CHISELED_BRICKS);
            event.accept(BrickBlocks.LIME_CHISELED_BRICKS);
            event.accept(BrickBlocks.GREEN_CHISELED_BRICKS);
            event.accept(BrickBlocks.LIGHT_BLUE_CHISELED_BRICKS);
            event.accept(BrickBlocks.CYAN_CHISELED_BRICKS);
            event.accept(BrickBlocks.BLUE_CHISELED_BRICKS);
            event.accept(BrickBlocks.MAGENTA_CHISELED_BRICKS);
            event.accept(BrickBlocks.PURPLE_CHISELED_BRICKS);
            event.accept(BrickBlocks.BROWN_CHISELED_BRICKS);
            event.accept(BrickBlocks.LIGHT_GRAY_CHISELED_BRICKS);
            event.accept(BrickBlocks.GRAY_CHISELED_BRICKS);
            event.accept(BrickBlocks.BLACK_CHISELED_BRICKS);
            event.accept(BrickBlocks.RED_CHISELED_BRICKS);
            // Flower Pots
            event.accept(ColoredFlowerPots.WHITE_FLOWER_POT);
            event.accept(ColoredFlowerPots.ORANGE_FLOWER_POT);
            event.accept(ColoredFlowerPots.PINK_FLOWER_POT);
            event.accept(ColoredFlowerPots.YELLOW_FLOWER_POT);
            event.accept(ColoredFlowerPots.LIME_FLOWER_POT);
            event.accept(ColoredFlowerPots.GREEN_FLOWER_POT);
            event.accept(ColoredFlowerPots.LIGHT_BLUE_FLOWER_POT);
            event.accept(ColoredFlowerPots.CYAN_FLOWER_POT);
            event.accept(ColoredFlowerPots.BLUE_FLOWER_POT);
            event.accept(ColoredFlowerPots.MAGENTA_FLOWER_POT);
            event.accept(ColoredFlowerPots.PURPLE_FLOWER_POT);
            event.accept(ColoredFlowerPots.BROWN_FLOWER_POT);
            event.accept(ColoredFlowerPots.LIGHT_GRAY_FLOWER_POT);
            event.accept(ColoredFlowerPots.GRAY_FLOWER_POT);
            event.accept(ColoredFlowerPots.BLACK_FLOWER_POT);
            event.accept(ColoredFlowerPots.RED_FLOWER_POT);
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
