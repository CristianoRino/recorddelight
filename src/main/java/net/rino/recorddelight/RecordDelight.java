package net.rino.recorddelight;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecordDelight implements ModInitializer {
	public static final String MOD_ID = "recorddelight";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}