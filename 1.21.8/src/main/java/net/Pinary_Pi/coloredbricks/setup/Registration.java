package net.Pinary_Pi.coloredbricks.setup;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickSlabBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickStairsBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.BrickWallBlocks;
import net.Pinary_Pi.coloredbricks.setup.block.ColoredFlowerPots;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, coloredbricks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, coloredbricks.MOD_ID);

    public static void register(BusGroup modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModItems.register();
        BrickBlocks.initialize();
        BrickSlabBlocks.initialize();
        BrickStairsBlocks.initialize();
        BrickWallBlocks.initialize();
        ColoredFlowerPots.initialize();
    }
}