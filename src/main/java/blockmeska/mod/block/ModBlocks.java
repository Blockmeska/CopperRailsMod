package blockmeska.mod.block;

import blockmeska.mod.CopperRails;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COPPER_RAIL = registerBlock("copper_rail", new RailBlock(FabricBlockSettings.copyOf(Blocks.RAIL)));
    public static final Block POWERED_COPPER_RAIL = registerBlock("powered_copper_rail", new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.POWERED_RAIL)));
    public static final Block COPPER_DETECTOR_RAIL = registerBlock("copper_detector_rail", new DetectorRailBlock(FabricBlockSettings.copyOf(Blocks.DETECTOR_RAIL)));
    //public static final Block COPPER_ACTIVATOR_RAIL = registerBlock("copper_activator_rail", new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.ACTIVATOR_RAIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CopperRails.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CopperRails.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {}
}