package net.legiblesleet827.platinum.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.legiblesleet827.platinum.PlatinumMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ModBlocks {
    public static final OreBlock PLATINUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(100, 2400).breakByTool(FabricToolTags.PICKAXES, 4).requiresCorrectToolForDrops().sound(SoundType.STONE));
    public static final OreBlock DEEPSLATE_PLATINUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(200, 4800).breakByTool(FabricToolTags.PICKAXES, 4).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE));
    public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(100, 2400).breakByTool(FabricToolTags.PICKAXES, 4).requiresCorrectToolForDrops().sound(SoundType.METAL));
    public static final Block RAW_PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(100, 2400).breakByTool(FabricToolTags.PICKAXES, 4).requiresCorrectToolForDrops().sound(SoundType.METAL));

    public static void register() {
        Registry.register(Registry.BLOCK, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP)));
        Registry.register(Registry.BLOCK, new ResourceLocation(PlatinumMod.MOD_ID, "deepslate_platinum_ore"), DEEPSLATE_PLATINUM_ORE);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "deepslate_platinum_ore"), new BlockItem(DEEPSLATE_PLATINUM_ORE, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP)));
        Registry.register(Registry.BLOCK, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP)));
        Registry.register(Registry.BLOCK, new ResourceLocation(PlatinumMod.MOD_ID, "raw_platinum_block"), RAW_PLATINUM_BLOCK);
        Registry.register(Registry.ITEM, new ResourceLocation(PlatinumMod.MOD_ID, "raw_platinum_block"), new BlockItem(RAW_PLATINUM_BLOCK, new FabricItemSettings().tab(PlatinumMod.PLATINUM_GROUP)));
    }
}