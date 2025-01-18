package net.lightningfish27.tutorial;

import net.fabricmc.api.ModInitializer;

import net.lightningfish27.tutorial.block.ModBlocks;
import net.lightningfish27.tutorial.item.ModItemGroups;
import net.lightningfish27.tutorial.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	public static final String MOD_ID = "tutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups(); // create new creative tabs for the items added by this mod
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}