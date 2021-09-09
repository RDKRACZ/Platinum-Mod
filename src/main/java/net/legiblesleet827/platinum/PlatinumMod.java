package net.legiblesleet827.platinum;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.legiblesleet827.platinum.block.ModBlocks;
import net.legiblesleet827.platinum.item.ModItems;
import net.legiblesleet827.platinum.world.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlatinumMod implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "platinum";
    public static final String MOD_NAME = "Platinum Mod";

    public static final ItemGroup PLATINUM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(PlatinumMod.MOD_ID, "platinum_group"))
            .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT))
            .build();

    public static Tag<Block> NEEDS_PLATINUM_TOOL;

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        ModItems.register();
        ModBlocks.register();
        OreGeneration.register();

        NEEDS_PLATINUM_TOOL = TagFactory.BLOCK.create(new Identifier(MOD_ID, "needs_platinum_tool"));

        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(MOD_ID, "platinum_programmer_art"), FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(), ResourcePackActivationType.NORMAL);
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}