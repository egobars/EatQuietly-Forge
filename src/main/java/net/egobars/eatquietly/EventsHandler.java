package net.egobars.eatquietly;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = EatQuietly.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventsHandler
{
    @SubscribeEvent
    public static void RightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) {
            Player playerEntity = (Player) entity;
            if (event.getHand() == InteractionHand.OFF_HAND) {
                if (playerEntity.getMainHandItem().isEdible()) {
                    event.setCanceled(true);
                }
            }
        }
    }
}
