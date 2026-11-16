package com.hollowfall.registry;

import com.hollowfall.Hollowfall;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Hollowfall.MOD_ID);

    public static final DeferredBlock<Block> DECAYED_CONCRETE = BLOCKS.registerSimpleBlock("decayed_concrete",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> OLD_TILES = BLOCKS.registerSimpleBlock("old_tiles",
            BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
                    .strength(1.5F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> RUSTED_PLATING = BLOCKS.registerSimpleBlock("rusted_plating",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
                    .strength(3.0F, 8.0F).sound(SoundType.METAL).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> FLESH_BLOCK = BLOCKS.registerSimpleBlock("flesh_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_NYLIUM)
                    .strength(1.0F).sound(SoundType.SLIME_BLOCK));

    public static final DeferredBlock<Block> CORRUPTED_BLOCK = BLOCKS.registerSimpleBlock("corrupted_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(2.0F, 4.0F).sound(SoundType.SCULK));

    public static final DeferredBlock<Block> EMERGENCY_LAMP = BLOCKS.registerSimpleBlock("emergency_lamp",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .strength(0.5F).sound(SoundType.GLASS).lightLevel(state -> 12));

    private ModBlocks() {}
}
