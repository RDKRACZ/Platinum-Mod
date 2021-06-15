package net.legiblesleet827.platinum.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.legiblesleet827.platinum.PlatinumMod;
import net.legiblesleet827.platinum.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreGeneration {
    public static ConfiguredFeature<?, ?> ORE_PLATINUM_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.PLATINUM_ORE.getDefaultState(),
                    1))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(0),
                    YOffset.fixed(20)
            ))))
            .spreadHorizontally()
            .repeat(3);

    public static ConfiguredFeature<?, ?> DEEPSLATE_ORE_PLATINUM_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState(),
                    3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(0),
                    YOffset.fixed(20)
            ))))
            .spreadHorizontally()
            .repeat(10);

    public static void register() {
        RegistryKey<ConfiguredFeature<?, ?>> orePlatinumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(PlatinumMod.MOD_ID, "ore_platinum_overworld"));
        RegistryKey<ConfiguredFeature<?, ?>> deepslateOrePlatinumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(PlatinumMod.MOD_ID, "deepslate_ore_platinum_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumOverworld.getValue(), ORE_PLATINUM_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, deepslateOrePlatinumOverworld.getValue(), DEEPSLATE_ORE_PLATINUM_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, deepslateOrePlatinumOverworld);
    }
}