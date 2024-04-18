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
    private boolean injectedPoweredRailCheck(BlockState state, Block POWERED_RAIL) {
        return state.isOf(POWERED_RAIL) || state.isOf(ModBlocks.POWERED_COPPER_RAIL);
    }
}
