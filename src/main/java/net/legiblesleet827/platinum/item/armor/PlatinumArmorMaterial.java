package net.legiblesleet827.platinum.item.armor;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class PlatinumArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{15, 20, 20, 15};
    private static final int[] PROTECTION_VALUES = new int[]{10, 20, 20, 10};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 38;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PLATINUM_INGOT);
    }

    @Override
    public String getName() {
        return "platinum";
    }

    @Override
    public float getToughness() {
        return 10;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
