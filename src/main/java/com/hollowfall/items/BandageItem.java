package com.hollowfall.items;

import com.hollowfall.config.HorrorConfig;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Vendaje: cura vida al usarlo (clic derecho). No se consume si la vida esta completa.
 */
public class BandageItem extends Item {
    private static final int COOLDOWN_TICKS = 40;

    public BandageItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (player.getHealth() >= player.getMaxHealth()) {
            return InteractionResultHolder.fail(stack);
        }
        if (!level.isClientSide()) {
            player.heal(HorrorConfig.BANDAGE_HEAL.get().floatValue());
            level.playSound(null, player.blockPosition(), SoundEvents.WOOL_PLACE, SoundSource.PLAYERS, 1.0F, 1.0F);
            player.getCooldowns().addCooldown(this, COOLDOWN_TICKS);
            stack.consume(1, player);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}
