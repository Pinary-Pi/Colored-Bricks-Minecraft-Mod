package net.pinary_pi.coloredbricks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.pinary_pi.coloredbricks.data.ModBlockTagsProvider;

public class ColoredBricksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator pack) {
		ColoredBricks.LOGGER.info("Beginning Colored Bricks Data Generation");

		ColoredBricks.LOGGER.info("Starting Block Tags for Colored Bricks");
		pack.addProvider(ModBlockTagsProvider::new);
	}
}
