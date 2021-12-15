package net.Pinary_Pi.coloredbricks.data.client;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, coloredbricks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("white_bricks", modLoc("block/white_bricks"));
        withExistingParent("orange_bricks", modLoc("block/orange_bricks"));
        withExistingParent("pink_bricks", modLoc("block/pink_bricks"));
        withExistingParent("yellow_bricks", modLoc("block/yellow_bricks"));
        withExistingParent("lime_bricks", modLoc("block/lime_bricks"));
        withExistingParent("green_bricks", modLoc("block/green_bricks"));
        withExistingParent("light_blue_bricks", modLoc("block/light_blue_bricks"));
        withExistingParent("cyan_bricks", modLoc("block/cyan_bricks"));
        withExistingParent("blue_bricks", modLoc("block/blue_bricks"));
        withExistingParent("magenta_bricks", modLoc("block/magenta_bricks"));
        withExistingParent("purple_bricks", modLoc("block/purple_bricks"));
        withExistingParent("brown_bricks", modLoc("block/brown_bricks"));
        withExistingParent("gray_bricks", modLoc("block/gray_bricks"));
        withExistingParent("light_gray_bricks", modLoc("block/light_gray_bricks"));
        withExistingParent("black_bricks", modLoc("block/black_bricks"));
        withExistingParent("red_bricks", modLoc("block/red_bricks"));
        withExistingParent("white_brick_slab", modLoc("block/white_brick_slab"));
        withExistingParent("orange_brick_slab", modLoc("block/orange_brick_slab"));
        withExistingParent("pink_brick_slab", modLoc("block/pink_brick_slab"));
        withExistingParent("yellow_brick_slab", modLoc("block/yellow_brick_slab"));
        withExistingParent("lime_brick_slab", modLoc("block/lime_brick_slab"));
        withExistingParent("green_brick_slab", modLoc("block/green_brick_slab"));
        withExistingParent("light_blue_brick_slab", modLoc("block/light_blue_brick_slab"));
        withExistingParent("cyan_brick_slab", modLoc("block/cyan_brick_slab"));
        withExistingParent("blue_brick_slab", modLoc("block/blue_brick_slab"));
        withExistingParent("magenta_brick_slab", modLoc("block/magenta_brick_slab"));
        withExistingParent("purple_brick_slab", modLoc("block/purple_brick_slab"));
        withExistingParent("brown_brick_slab", modLoc("block/brown_brick_slab"));
        withExistingParent("light_gray_brick_slab", modLoc("block/light_gray_brick_slab"));
        withExistingParent("gray_brick_slab", modLoc("block/gray_brick_slab"));
        withExistingParent("black_brick_slab", modLoc("block/black_brick_slab"));
        withExistingParent("red_brick_slab", modLoc("block/red_brick_slab"));
        withExistingParent("white_brick_stairs", modLoc("block/white_brick_stairs"));
        withExistingParent("orange_brick_stairs", modLoc("block/orange_brick_stairs"));
        withExistingParent("pink_brick_stairs", modLoc("block/pink_brick_stairs"));
        withExistingParent("yellow_brick_stairs", modLoc("block/yellow_brick_stairs"));
        withExistingParent("lime_brick_stairs", modLoc("block/lime_brick_stairs"));
        withExistingParent("green_brick_stairs", modLoc("block/green_brick_stairs"));
        withExistingParent("light_blue_brick_stairs", modLoc("block/light_blue_brick_stairs"));
        withExistingParent("cyan_brick_stairs", modLoc("block/cyan_brick_stairs"));
        withExistingParent("blue_brick_stairs", modLoc("block/blue_brick_stairs"));
        withExistingParent("magenta_brick_stairs", modLoc("block/magenta_brick_stairs"));
        withExistingParent("purple_brick_stairs", modLoc("block/purple_brick_stairs"));
        withExistingParent("brown_brick_stairs", modLoc("block/brown_brick_stairs"));
        withExistingParent("light_gray_brick_stairs", modLoc("block/light_gray_brick_stairs"));
        withExistingParent("gray_brick_stairs", modLoc("block/gray_brick_stairs"));
        withExistingParent("black_brick_stairs", modLoc("block/black_brick_stairs"));
        withExistingParent("red_brick_stairs", modLoc("block/red_brick_stairs"));
        withExistingParent("white_chiseled_bricks", modLoc("block/white_chiseled_bricks"));
        withExistingParent("orange_chiseled_bricks", modLoc("block/orange_chiseled_bricks"));
        withExistingParent("pink_chiseled_bricks", modLoc("block/pink_chiseled_bricks"));
        withExistingParent("yellow_chiseled_bricks", modLoc("block/yellow_chiseled_bricks"));
        withExistingParent("lime_chiseled_bricks", modLoc("block/lime_chiseled_bricks"));
        withExistingParent("green_chiseled_bricks", modLoc("block/green_chiseled_bricks"));
        withExistingParent("light_blue_chiseled_bricks", modLoc("block/light_blue_chiseled_bricks"));
        withExistingParent("cyan_chiseled_bricks", modLoc("block/cyan_chiseled_bricks"));
        withExistingParent("blue_chiseled_bricks", modLoc("block/blue_chiseled_bricks"));
        withExistingParent("magenta_chiseled_bricks", modLoc("block/magenta_chiseled_bricks"));
        withExistingParent("purple_chiseled_bricks", modLoc("block/purple_chiseled_bricks"));
        withExistingParent("brown_chiseled_bricks", modLoc("block/brown_chiseled_bricks"));
        withExistingParent("gray_chiseled_bricks", modLoc("block/gray_chiseled_bricks"));
        withExistingParent("light_gray_chiseled_bricks", modLoc("block/light_gray_chiseled_bricks"));
        withExistingParent("black_chiseled_bricks", modLoc("block/black_chiseled_bricks"));
        withExistingParent("red_chiseled_bricks", modLoc("block/red_chiseled_bricks"));
        withExistingParent("chiseled_bricks", modLoc("block/chiseled_bricks"));
        
        withExistingParent("cracked_bricks", modLoc("block/cracked_bricks"));
        withExistingParent("white_cracked_bricks", modLoc("block/white_cracked_bricks"));
        withExistingParent("orange_cracked_bricks", modLoc("block/orange_cracked_bricks"));
        withExistingParent("pink_cracked_bricks", modLoc("block/pink_cracked_bricks"));
        withExistingParent("yellow_cracked_bricks", modLoc("block/yellow_cracked_bricks"));
        withExistingParent("lime_cracked_bricks", modLoc("block/lime_cracked_bricks"));
        withExistingParent("green_cracked_bricks", modLoc("block/green_cracked_bricks"));
        withExistingParent("light_blue_cracked_bricks", modLoc("block/light_blue_cracked_bricks"));
        withExistingParent("cyan_cracked_bricks", modLoc("block/cyan_cracked_bricks"));
        withExistingParent("blue_cracked_bricks", modLoc("block/blue_cracked_bricks"));
        withExistingParent("magenta_cracked_bricks", modLoc("block/magenta_cracked_bricks"));
        withExistingParent("purple_cracked_bricks", modLoc("block/purple_cracked_bricks"));
        withExistingParent("brown_cracked_bricks", modLoc("block/brown_cracked_bricks"));
        withExistingParent("light_gray_cracked_bricks", modLoc("block/light_gray_cracked_bricks"));
        withExistingParent("gray_cracked_bricks", modLoc("block/gray_cracked_bricks"));
        withExistingParent("black_cracked_bricks", modLoc("block/black_cracked_bricks"));
        withExistingParent("red_cracked_bricks", modLoc("block/red_cracked_bricks"));

        withExistingParent("cracked_brick_slab", modLoc("block/cracked_brick_slab"));
        withExistingParent("white_cracked_brick_slab", modLoc("block/white_cracked_brick_slab"));
        withExistingParent("orange_cracked_brick_slab", modLoc("block/orange_cracked_brick_slab"));
        withExistingParent("pink_cracked_brick_slab", modLoc("block/pink_cracked_brick_slab"));
        withExistingParent("yellow_cracked_brick_slab", modLoc("block/yellow_cracked_brick_slab"));
        withExistingParent("lime_cracked_brick_slab", modLoc("block/lime_cracked_brick_slab"));
        withExistingParent("green_cracked_brick_slab", modLoc("block/green_cracked_brick_slab"));
        withExistingParent("cyan_cracked_brick_slab", modLoc("block/cyan_cracked_brick_slab"));
        withExistingParent("light_blue_cracked_brick_slab", modLoc("block/light_blue_cracked_brick_slab"));
        withExistingParent("blue_cracked_brick_slab", modLoc("block/blue_cracked_brick_slab"));
        withExistingParent("magenta_cracked_brick_slab", modLoc("block/magenta_cracked_brick_slab"));
        withExistingParent("purple_cracked_brick_slab", modLoc("block/purple_cracked_brick_slab"));
        withExistingParent("brown_cracked_brick_slab", modLoc("block/brown_cracked_brick_slab"));
        withExistingParent("light_gray_cracked_brick_slab", modLoc("block/light_gray_cracked_brick_slab"));
        withExistingParent("gray_cracked_brick_slab", modLoc("block/gray_cracked_brick_slab"));
        withExistingParent("black_cracked_brick_slab", modLoc("block/black_cracked_brick_slab"));
        withExistingParent("red_cracked_brick_slab", modLoc("block/red_cracked_brick_slab"));

        withExistingParent("cracked_brick_stairs", modLoc("block/cracked_brick_stairs"));
        withExistingParent("white_cracked_brick_stairs", modLoc("block/white_cracked_brick_stairs"));
        withExistingParent("orange_cracked_brick_stairs", modLoc("block/orange_cracked_brick_stairs"));
        withExistingParent("pink_cracked_brick_stairs", modLoc("block/pink_cracked_brick_stairs"));
        withExistingParent("yellow_cracked_brick_stairs", modLoc("block/yellow_cracked_brick_stairs"));
        withExistingParent("lime_cracked_brick_stairs", modLoc("block/lime_cracked_brick_stairs"));
        withExistingParent("green_cracked_brick_stairs", modLoc("block/green_cracked_brick_stairs"));
        withExistingParent("light_blue_cracked_brick_stairs", modLoc("block/light_blue_cracked_brick_stairs"));
        withExistingParent("cyan_cracked_brick_stairs", modLoc("block/cyan_cracked_brick_stairs"));
        withExistingParent("blue_cracked_brick_stairs", modLoc("block/blue_cracked_brick_stairs"));
        withExistingParent("magenta_cracked_brick_stairs", modLoc("block/magenta_cracked_brick_stairs"));
        withExistingParent("purple_cracked_brick_stairs", modLoc("block/purple_cracked_brick_stairs"));
        withExistingParent("brown_cracked_brick_stairs", modLoc("block/brown_cracked_brick_stairs"));
        withExistingParent("light_gray_cracked_brick_stairs", modLoc("block/light_gray_cracked_brick_stairs"));
        withExistingParent("gray_cracked_brick_stairs", modLoc("block/gray_cracked_brick_stairs"));
        withExistingParent("black_cracked_brick_stairs", modLoc("block/black_cracked_brick_stairs"));
        withExistingParent("red_cracked_brick_stairs", modLoc("block/red_cracked_brick_stairs"));

        wallBuilder("white");
        wallBuilder("orange");
        wallBuilder("pink");
        wallBuilder("yellow");
        wallBuilder("lime");
        wallBuilder("green");
        wallBuilder("light_blue");
        wallBuilder("cyan");
        wallBuilder("blue");
        wallBuilder("magenta");
        wallBuilder("purple");
        wallBuilder("brown");
        wallBuilder("light_gray");
        wallBuilder("gray");
        wallBuilder("black");
        wallBuilder("red");

        wallBuilder("cracked");
        wallBuilder("white_cracked");
        wallBuilder("orange_cracked");
        wallBuilder("pink_cracked");
        wallBuilder("yellow_cracked");
        wallBuilder("lime_cracked");
        wallBuilder("green_cracked");
        wallBuilder("light_blue_cracked");
        wallBuilder("cyan_cracked");
        wallBuilder("blue_cracked");
        wallBuilder("magenta_cracked");
        wallBuilder("purple_cracked");
        wallBuilder("brown_cracked");
        wallBuilder("light_gray_cracked");
        wallBuilder("gray_cracked");
        wallBuilder("black_cracked");
        wallBuilder("red_cracked");

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "white_brick");
        builder(itemGenerated, "orange_brick");
        builder(itemGenerated, "pink_brick");
        builder(itemGenerated, "yellow_brick");
        builder(itemGenerated, "lime_brick");
        builder(itemGenerated, "green_brick");
        builder(itemGenerated, "light_blue_brick");
        builder(itemGenerated, "cyan_brick");
        builder(itemGenerated, "blue_brick");
        builder(itemGenerated, "magenta_brick");
        builder(itemGenerated, "purple_brick");
        builder(itemGenerated, "brown_brick");
        builder(itemGenerated, "gray_brick");
        builder(itemGenerated, "light_gray_brick");
        builder(itemGenerated, "black_brick");
        builder(itemGenerated, "red_brick");
    }

    private ItemModelBuilder wallBuilder(String color) {
        return withExistingParent(color + "_brick_wall", mcLoc("block/wall_inventory")).texture("wall", "block/" + color + "_bricks");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
