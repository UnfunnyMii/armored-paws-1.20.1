package com.unfunnymii;

import com.unfunnymii.entity.ModEntities;
import com.unfunnymii.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmadilloBackport implements ModInitializer {

	public static final String MOD_ID = "mc1205";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.init();
		ModEntities.init();

	}
}