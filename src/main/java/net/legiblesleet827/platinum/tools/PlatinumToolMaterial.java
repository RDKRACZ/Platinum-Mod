package net.legiblesleet827.platinum.tools;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class PlatinumToolMaterial implements Tier {
    public static final PlatinumToolMaterial INSTANCE = new PlatinumToolMaterial();

    @Override
    public int getUses() {
        return 3000;
    }

    @Override
    public float getSpeed() {
        return 9.0F;
    }

    @Override
    public float getAttackDamageBonus() {
        return 10.0F;
    }

    @Override
    public int getLevel() {
        return 4;
    }

    @Override
    public int getEnchantmentValue() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.PLATINUM_INGOT);
    }
}
