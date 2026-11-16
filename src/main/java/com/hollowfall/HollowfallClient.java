package com.hollowfall;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

/**
 * Entrada solo de cliente: habilita la pantalla de configuracion
 * dentro del menu de mods (Mods > Hollowfall > Config).
 */
@Mod(value = Hollowfall.MOD_ID, dist = Dist.CLIENT)
public class HollowfallClient {
    public HollowfallClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
