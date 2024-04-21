package blockmeska.mod.datagen;

import blockmeska.mod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTurnableRail(ModBlocks.COPPER_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.POWERED_COPPER_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.COPPER_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(ModBlocks.COPPER_ACTIVATOR_RAIL);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
