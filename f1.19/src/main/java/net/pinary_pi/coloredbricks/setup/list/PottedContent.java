package net.pinary_pi.coloredbricks.setup.list;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;

public enum PottedContent {
    OAK_SAPLING(Blocks.OAK_SAPLING, getFlowerName(Blocks.OAK_SAPLING)),
    SPRUCE_SAPLING(Blocks.SPRUCE_SAPLING, getFlowerName(Blocks.SPRUCE_SAPLING)),
    BIRCH_SAPLING(Blocks.BIRCH_SAPLING, getFlowerName(Blocks.BIRCH_SAPLING)),
    JUNGLE_SAPLING(Blocks.JUNGLE_SAPLING, getFlowerName(Blocks.JUNGLE_SAPLING)),
    ACACIA_SAPLING(Blocks.ACACIA_SAPLING, getFlowerName(Blocks.ACACIA_SAPLING)),
    DARK_OAK_SAPLING(Blocks.DARK_OAK_SAPLING, getFlowerName(Blocks.DARK_OAK_SAPLING)),
    MANGROVE_PROPAGULE(Blocks.MANGROVE_PROPAGULE, getFlowerName(Blocks.MANGROVE_PROPAGULE)),
    FERN(Blocks.FERN, getFlowerName(Blocks.FERN)),
    DANDELION(Blocks.DANDELION, getFlowerName(Blocks.DANDELION)),
    POPPY(Blocks.POPPY, getFlowerName(Blocks.POPPY)),
    BLUE_ORCHID(Blocks.BLUE_ORCHID, getFlowerName(Blocks.BLUE_ORCHID)),
    ALLIUM(Blocks.ALLIUM, getFlowerName(Blocks.ALLIUM)),
    AZURE_BLUET(Blocks.AZURE_BLUET, getFlowerName(Blocks.AZURE_BLUET)),
    RED_TULIP(Blocks.RED_TULIP, getFlowerName(Blocks.RED_TULIP)),
    ORANGE_TULIP(Blocks.ORANGE_TULIP, getFlowerName(Blocks.ORANGE_TULIP)),
    WHITE_TULIP(Blocks.WHITE_TULIP, getFlowerName(Blocks.WHITE_TULIP)),
    PINK_TULIP(Blocks.PINK_TULIP, getFlowerName(Blocks.PINK_TULIP)),
    OXEYE_DAISY(Blocks.OXEYE_DAISY, getFlowerName(Blocks.OXEYE_DAISY)),
    CORNFLOWER(Blocks.CORNFLOWER, getFlowerName(Blocks.CORNFLOWER)),
    LILY_OF_THE_VALLEY(Blocks.LILY_OF_THE_VALLEY, getFlowerName(Blocks.LILY_OF_THE_VALLEY)),
    WITHER_ROSE(Blocks.WITHER_ROSE, getFlowerName(Blocks.WITHER_ROSE)),
    RED_MUSHROOM(Blocks.RED_MUSHROOM, getFlowerName(Blocks.RED_MUSHROOM)),
    BROWN_MUSHROOM(Blocks.BROWN_MUSHROOM, getFlowerName(Blocks.BROWN_MUSHROOM)),
    DEAD_BUSH(Blocks.DEAD_BUSH, getFlowerName(Blocks.DEAD_BUSH)),
    CACTUS(Blocks.CACTUS, getFlowerName(Blocks.CACTUS)),
    BAMBOO(Blocks.BAMBOO, getFlowerName(Blocks.BAMBOO)),
    CRIMSON_FUNGUS(Blocks.CRIMSON_FUNGUS, getFlowerName(Blocks.CRIMSON_FUNGUS)),
    WARPED_FUNGUS(Blocks.WARPED_FUNGUS, getFlowerName(Blocks.WARPED_FUNGUS)),
    CRIMSON_ROOTS(Blocks.CRIMSON_ROOTS, getFlowerName(Blocks.CRIMSON_ROOTS)),
    WARPED_ROOTS(Blocks.WARPED_ROOTS, getFlowerName(Blocks.WARPED_ROOTS)),
    AZALEA(Blocks.AZALEA, "azalea_bush"),
    FLOWERING_AZALEA(Blocks.FLOWERING_AZALEA, "flowering_azalea_bush"),
    CHERRY_SAPLING(Blocks.CHERRY_SAPLING, getFlowerName(Blocks.CHERRY_SAPLING)),
    TORCHFLOWER(Blocks.TORCHFLOWER, getFlowerName(Blocks.TORCHFLOWER));
    

    private final Block pottedContent;
    private final String flowerName; 

    PottedContent(Block pottedContent, String flowerName) {
        this.pottedContent = pottedContent;
        this.flowerName = flowerName;
    }

    public Block getFlowerBlock() {
        return pottedContent;
    }

    public String getFlowerName() {
        return flowerName;
    }

    private static String getFlowerName(Block block) {
        return Registries.ITEM.getId(block.asItem()).getPath();
    }
}
