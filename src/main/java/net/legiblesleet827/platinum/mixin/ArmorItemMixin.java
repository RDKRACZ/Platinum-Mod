package net.legiblesleet827.platinum.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin {

    @Shadow @Final private static UUID[] MODIFIERS;
    @Shadow @Final @Mutable private Multimap<Attribute, AttributeModifier> attributeModifiers;
    @Shadow @Final protected float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void constructor(ArmorMaterial material, EquipmentSlot slot, Item.Properties settings, CallbackInfo ci) {
        UUID uUID = MODIFIERS[slot.getIndex()];

        if (material == ModItems.platinumArmorMaterial) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    Attributes.KNOCKBACK_RESISTANCE,
                    new AttributeModifier(uUID,
                            "Armor knockback resistance",
                            this.knockbackResistance,
                            AttributeModifier.Operation.ADDITION
                    )
            );

            this.attributeModifiers = builder.build();
        }
    }

}