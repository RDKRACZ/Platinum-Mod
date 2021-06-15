package net.legiblesleet827.platinum.tools;

import net.legiblesleet827.platinum.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PlatinumToolMaterial implements ToolMaterial {
    public static final PlatinumToolMaterial INSTANCE = new PlatinumToolMaterial();

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }

    @Override
    public float getAttackDamage() {
        return 12.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PLATINUM_INGOT);
    }
}
