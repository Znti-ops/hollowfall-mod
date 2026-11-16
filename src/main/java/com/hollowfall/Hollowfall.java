package com.hollowfall;

import com.hollowfall.config.HorrorConfig;
import com.hollowfall.registry.ModBlocks;
import com.hollowfall.registry.ModCreativeTabs;
import com.hollowfall.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

/**
 * Punto de entrada comun (cliente y servidor) de Hollowfall.
 */
@Mod(Hollowfall.MOD_ID)
public class Hollowfall {
    public static final String MOD_ID = "hollowfall";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Hollowfall(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, HorrorConfig.SPEC);
        LOGGER.info("Hollowfall cargado (Fase 1: fundamentos)");
    }
}
