package net.raaqir.raaqnroll;

import net.fabricmc.api.ModInitializer;

import net.raaqir.raaqnroll.block.ModBlocks;
import net.raaqir.raaqnroll.item.ModItemGroup;
import net.raaqir.raaqnroll.item.ModItems;
import net.raaqir.raaqnroll.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaaqNRollMod implements ModInitializer {
	public static final String MOD_ID = "raaqnroll";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();


	}
}