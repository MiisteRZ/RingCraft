
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import miisterzmods.ringcraft.client.renderer.SandBallRenderer;
import miisterzmods.ringcraft.client.renderer.KingSandstormRenderer;
import miisterzmods.ringcraft.client.renderer.IceKingEntityRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RingcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RingcraftModEntities.ICE_KING_ENTITY.get(), IceKingEntityRenderer::new);
		event.registerEntityRenderer(RingcraftModEntities.KING_SANDSTORM.get(), KingSandstormRenderer::new);
		event.registerEntityRenderer(RingcraftModEntities.SAND_BALL.get(), SandBallRenderer::new);
	}
}
