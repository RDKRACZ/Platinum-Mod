package net.legiblesleet827.platinum.mixin;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StatusEffect.class)
public class StatusEffectMixin {
    @Inject(method = "applyUpdateEffect", at = @At("HEAD"), cancellable = true)
    private void applyUpdateEffectInject(LivingEntity entity, int amplifier, CallbackInfo ci) {
        StatusEffect effect = (StatusEffect) (Object) this;
        if ((effect == StatusEffects.POISON || effect == StatusEffects.WITHER)
                && entity.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.PLATINUM_HELMET)
                && entity.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.PLATINUM_CHESTPLATE)
                && entity.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.PLATINUM_LEGGINGS)
                && entity.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.PLATINUM_BOOTS)) {
            ci.cancel();
        }
    }
}
