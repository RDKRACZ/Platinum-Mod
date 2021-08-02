package net.legiblesleet827.platinum.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.legiblesleet827.platinum.PlatinumMod;
import net.legiblesleet827.platinum.armor.PlatinumArmorMaterial;
import net.legiblesleet827.platinum.tools.PlatinumAxe;
import net.legiblesleet827.platinum.tools.PlatinumHoe;
import net.legiblesleet827.platinum.tools.PlatinumPickaxe;
import net.legiblesleet827.platinum.tools.PlatinumToolMaterial;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class ModItems {
    public static final ArmorMaterial platinumArmorMaterial = new PlatinumArmorMaterial();

    public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item PLATINUM_NUGGET = new Item(new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item RAW_PLATINUM_NUGGET = new Item(new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item RAW_PLATINUM_INGOT = new Item(new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));

    // Armor
    public static final Item PLATINUM_HELMET = new ArmorItem(platinumArmorMaterial, EquipmentSlot.HEAD, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item PLATINUM_CHESTPLATE = new ArmorItem(platinumArmorMaterial, EquipmentSlot.CHEST, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item PLATINUM_LEGGINGS = new ArmorItem(platinumArmorMaterial, EquipmentSlot.LEGS, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static final Item PLATINUM_BOOTS = new ArmorItem(platinumArmorMaterial, EquipmentSlot.FEET, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));

    // Tools
    public static TieredItem PLATINUM_SWORD = new SwordItem(PlatinumToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static TieredItem PLATINUM_SHOVEL = new ShovelItem(PlatinumToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static PlatinumPickaxe PLATINUM_PICKAXE = new PlatinumPickaxe(PlatinumToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static PlatinumAxe PLATINUM_AXE = new PlatinumAxe(PlatinumToolMaterial.INSTANCE, 7, -3.2F, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));
    public static PlatinumHoe PLATINUM_HOE = new PlatinumHoe(PlatinumToolMaterial.INSTANCE, 7, -3.2F, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_nugget"), PLATINUM_NUGGET);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "raw_platinum_nugget"), RAW_PLATINUM_NUGGET);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "raw_platinum_ingot"), RAW_PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_helmet"), PLATINUM_HELMET);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_chestplate"), PLATINUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_leggings"), PLATINUM_LEGGINGS);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_boots"), PLATINUM_BOOTS);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_sword"), PLATINUM_SWORD);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_shovel"), PLATINUM_SHOVEL);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_pickaxe"), PLATINUM_PICKAXE);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_axe"), PLATINUM_AXE);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_hoe"), PLATINUM_HOE);
    }
}
