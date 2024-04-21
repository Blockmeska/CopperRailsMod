package blockmeska.mod.mixin;

import blockmeska.mod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractMinecartEntity.class)
public class AbstractMinecartMixin {

    @Redirect(method = "moveOnRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"), require = 1)
    private boolean modifyPoweredRailCheck(BlockState state, Block block) {
        return state.isOf(block) || state.isOf(ModBlocks.POWERED_COPPER_RAIL);
    }

    @Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    private boolean modifyIsOfBlock(BlockState state, Block block) {
        return state.isOf(block) || state.isOf(ModBlocks.COPPER_ACTIVATOR_RAIL);
    }
}
