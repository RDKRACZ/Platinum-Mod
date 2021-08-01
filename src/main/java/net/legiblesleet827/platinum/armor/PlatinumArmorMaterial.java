package net.legiblesleet827.platinum.armor;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class PlatinumArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{4, 7, 9, 4};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getIndex()] * 40;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.PLATINUM_INGOT);
    }

    @Override
    public String getName() {
        return "platinum";
    }

    @Override
    public float getToughness() {
        return 5;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2F;
    }
}
