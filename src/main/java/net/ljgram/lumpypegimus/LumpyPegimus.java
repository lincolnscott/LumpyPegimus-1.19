package net.ljgram.lumpypegimus;

import net.fabricmc.api.ModInitializer;
import net.ljgram.lumpypegimus.block.ModBlocks;
import net.ljgram.lumpypegimus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LumpyPegimus implements ModInitializer {

	public static final String MOD_ID = "lumpypegimus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
