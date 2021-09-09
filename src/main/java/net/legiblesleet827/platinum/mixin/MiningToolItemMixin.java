package net.legiblesleet827.platinum.mixin;

import net.legiblesleet827.platinum.PlatinumMod;
import net.minecraft.block.BlockState;
import net.minecraft.item.MiningToolItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MiningToolItem.class)
public class MiningToolItemMixin {
    @Inject(method = "isSuitableFor", at = @At("HEAD"), cancellable = true)
    public void isSuitableForInject(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        int i = ((MiningToolItem) (Object) this).getMaterial().getMiningLevel();
        if (i < 5 && state.isIn(PlatinumMod.NEEDS_PLATINUM_TOOL)) {
            cir.setReturnValue(false);
        }
    }
}
