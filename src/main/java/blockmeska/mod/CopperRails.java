package blockmeska.mod;

import blockmeska.mod.block.ModBlocks;
import blockmeska.mod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

public class CopperRails implements ModInitializer {
    public static final String MOD_ID = "copper-rails";

	@Override
	public void onInitialize() {
		ModItemGroups.registerModGroups();
		ModItemGroups.registerModItems();
		ModBlocks.registerModBlocks();
	}
}