package net.legiblesleet827.platinum.mixin;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "tick", at = @At("TAIL"))
    private void tickInject(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity) (Object) this;
        if (entity.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.PLATINUM_HELMET)
                && entity.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.PLATINUM_CHESTPLATE)
                && entity.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.PLATINUM_LEGGINGS)
                && entity.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.PLATINUM_BOOTS)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 4));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 0));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 2));
        }
    }
}
