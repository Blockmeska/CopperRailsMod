package blockmeska.mod.item;

import blockmeska.mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {
    private static void addItemsToRedstoneTab(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.COPPER_RAIL);
        entries.add(ModBlocks.POWERED_COPPER_RAIL);
        entries.add(ModBlocks.COPPER_DETECTOR_RAIL);
        //entries.add(ModBlocks.COPPER_ACTIVATOR_RAIL);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItemGroups::addItemsToRedstoneTab);
    }

    public static void registerModGroups() {}
}
