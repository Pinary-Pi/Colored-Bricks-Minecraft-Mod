package net.pinary_pi.coloredbricks.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.util.Identifier;
import net.pinary_pi.coloredbricks.ColoredBricks;
import net.pinary_pi.coloredbricks.setup.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> DYEABLES = List.of(Items.BRICK,
                                                                  Blocks.BRICKS.asItem(),
                                                                  Blocks.BRICK_SLAB.asItem(),
                                                                  Blocks.BRICK_STAIRS.asItem(),
                                                                  Blocks.BRICK_WALL.asItem(),
                                                                  ModBlocks.CRACKED_BRICKS.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_SLAB.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_STAIRS.asItem(),
                                                                  ModBlocks.CRACKED_BRICK_WALL.asItem(),
                                                                  ModBlocks.CHISELED_BRICKS.asItem());
    
    private static final List<ItemConvertible> DYES = List.of(Items.WHITE_DYE,
                                                              Items.ORANGE_DYE,
                                                              Items.PINK_DYE,
                                                              Items.YELLOW_DYE,
                                                              Items.LIME_DYE,
                                                              Items.GREEN_DYE,
                                                              Items.LIGHT_BLUE_DYE,
                                                              Items.CYAN_DYE,
                                                              Items.BLUE_DYE,
                                                              Items.MAGENTA_DYE,
                                                              Items.PURPLE_DYE,
                                                              Items.BROWN_DYE,
                                                              Items.LIGHT_GRAY_DYE,
                                                              Items.GRAY_DYE,
                                                              Items.BLACK_DYE,
                                                              Items.RED_DYE);

    private static void offerDyeableRecipes(RecipeExporter exporter, List<ItemConvertible> dyes, List<ItemConvertible> dyeables) {
        for (ItemConvertible dyeable : dyeables) {
            for (ItemConvertible dye : dyes) {
                Item output = getDyedVersion(dyeable, dye);

                ColoredBricks.LOGGER.info("Dye: " + dye.toString());
                ColoredBricks.LOGGER.info("Dyeable: " + dyeable.toString());
                ColoredBricks.LOGGER.info("Output: " + output.toString());

                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                    .input(dye)
                    .input(dyeable)
                    .criterion(hasItem(dye), conditionsFromItem(dye))
                    .offerTo(exporter, "dye_" + Registries.ITEM.getId(output).getPath());
            }
        }
    }

    private static Item getDyedVersion(ItemConvertible dyeable, ItemConvertible dye) {
        String dye_id = Registries.ITEM.getId(dye.asItem()).getPath();
        String dyeable_id = Registries.ITEM.getId(dyeable.asItem()).getPath();
        String dyed_version_id = dye_id.replace("dye", "") + dyeable_id;
        ColoredBricks.LOGGER.info(Registries.ITEM.get(Identifier.of("coloredbricks", dyed_version_id)).toString());
        return Registries.ITEM.get(Identifier.of("coloredbricks", dyed_version_id));
    }
    
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ColoredBricks.LOGGER.info("Starting recipe generation for Colored Bricks");
        offerDyeableRecipes(exporter, DYES, DYEABLES);
    }

}