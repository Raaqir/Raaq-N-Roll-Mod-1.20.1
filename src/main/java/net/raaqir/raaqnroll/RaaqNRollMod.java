package net.raaqir.raaqnroll;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaaqNRollMod implements ModInitializer {
	public static final String MOD_ID = "raaqnroll";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//comment fuck
		LOGGER.info("Hello Fabric world!");
	}
}