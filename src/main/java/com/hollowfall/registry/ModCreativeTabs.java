package com.hollowfall.registry;

import com.hollowfall.Hollowfall;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hollowfall.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Hollowfall.MOD_ID + ".main"))
                    .icon(() -> ModItems.BATTERY.get().getDefaultInstance())
                    .displayItems((params, output) ->
                            ModItems.ITEMS.getEntries().forEach(entry -> output.accept(entry.get())))
                    .build());

    private ModCreativeTabs() {}
}
