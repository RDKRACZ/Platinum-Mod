package net.legiblesleet827.platinum.mixin;

import net.legiblesleet827.platinum.world.OreGeneration;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BiomeDefaultFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(BiomeGenerationSettings.Builder builder, CallbackInfo ci) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OreGeneration.ORE_PLATINUM_OVERWORLD);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OreGeneration.DEEPSLATE_ORE_PLATINUM_OVERWORLD);
    }
}
