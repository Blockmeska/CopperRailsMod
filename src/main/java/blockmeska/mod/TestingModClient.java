package blockmeska.mod;

import blockmeska.mod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TestingModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // Cutouts for non-opaque blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POWERED_COPPER_RAIL, RenderLayer.getCutout());
    }
}
