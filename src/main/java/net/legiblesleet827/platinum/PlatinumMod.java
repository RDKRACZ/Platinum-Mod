package net.legiblesleet827.platinum;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.legiblesleet827.platinum.item.ModItems;
import net.legiblesleet827.platinum.world.OreGeneration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.legiblesleet827.platinum.block.ModBlocks;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlatinumMod implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "platinum";
    public static final String MOD_NAME = "Platinum Mod";

    public static final CreativeModeTab PLATINUM_GROUP = FabricItemGroupBuilder.create(
            new ResourceLocation(PlatinumMod.MOD_ID, "platinum_group"))
            .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT))
            .build();

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        ModItems.register();
        ModBlocks.register();
        OreGeneration.register();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}