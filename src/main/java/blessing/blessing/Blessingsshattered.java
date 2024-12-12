package blessing.blessing;

import blessing.blessing.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import blessing.blessing.item.ModItems;

public class Blessingsshattered implements ModInitializer {
	public static final String MOD_ID = "blessingsshattered";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Logging Blessings Shattered");
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					new Identifier(MOD_ID, "blessingsshattered"),
					modContainer,
					ResourcePackActivationType.DEFAULT_ENABLED);
		});
		ModLootTableModifiers.modifyLootTables();
		ModItems.registerModItems();
	}
}