package net.legiblesleet827.platinum.world;

import net.legiblesleet827.platinum.PlatinumMod;
import net.legiblesleet827.platinum.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.RangeDecorator;

public class OreGeneration {
    public static ConfiguredFeature<?, ?> ORE_PLATINUM_OVERWORLD = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NATURAL_STONE,
                    ModBlocks.PLATINUM_ORE.defaultBlockState(),
                    1))
            .decorated(RangeDecorator.RANGE.configured(new RangeDecoratorConfiguration(UniformHeight.of(
                    VerticalAnchor.absolute(20),
                    VerticalAnchor.absolute(0)
            )))
            .squared()
            .count(1));

    public static ConfiguredFeature<?, ?> DEEPSLATE_ORE_PLATINUM_OVERWORLD = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_PLATINUM_ORE.defaultBlockState(),
                    3))
            .decorated(RangeDecorator.RANGE.configured(new RangeDecoratorConfiguration(UniformHeight.of(
                    VerticalAnchor.absolute(20),
                    VerticalAnchor.absolute(0)
            )))
            .squared()
            .count(1));

    public static void register() {
        ResourceKey<ConfiguredFeature<?, ?>> orePlatinumOverworld = ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,
                new ResourceLocation(PlatinumMod.MOD_ID, "ore_platinum_overworld"));
        ResourceKey<ConfiguredFeature<?, ?>> deepslateOrePlatinumOverworld = ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,
                new ResourceLocation(PlatinumMod.MOD_ID, "deepslate_ore_platinum_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumOverworld.location(), ORE_PLATINUM_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, deepslateOrePlatinumOverworld.location(), DEEPSLATE_ORE_PLATINUM_OVERWORLD);
    }
}