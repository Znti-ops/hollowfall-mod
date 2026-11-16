package com.hollowfall.registry;

import com.hollowfall.Hollowfall;
import com.hollowfall.items.BandageItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Hollowfall.MOD_ID);

    // Objetos
    public static final DeferredItem<Item> BATTERY = ITEMS.registerSimpleItem("battery");
    public static final DeferredItem<BandageItem> BANDAGE =
            ITEMS.registerItem("bandage", BandageItem::new, new Item.Properties().stacksTo(16));

    // Items de bloque
    public static final DeferredItem<BlockItem> DECAYED_CONCRETE = ITEMS.registerSimpleBlockItem(ModBlocks.DECAYED_CONCRETE);
    public static final DeferredItem<BlockItem> OLD_TILES = ITEMS.registerSimpleBlockItem(ModBlocks.OLD_TILES);
    public static final DeferredItem<BlockItem> RUSTED_PLATING = ITEMS.registerSimpleBlockItem(ModBlocks.RUSTED_PLATING);
    public static final DeferredItem<BlockItem> FLESH_BLOCK = ITEMS.registerSimpleBlockItem(ModBlocks.FLESH_BLOCK);
    public static final DeferredItem<BlockItem> CORRUPTED_BLOCK = ITEMS.registerSimpleBlockItem(ModBlocks.CORRUPTED_BLOCK);
    public static final DeferredItem<BlockItem> EMERGENCY_LAMP = ITEMS.registerSimpleBlockItem(ModBlocks.EMERGENCY_LAMP);

    private ModItems() {}
}
