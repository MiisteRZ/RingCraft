
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import miisterzmods.ringcraft.client.gui.RingsGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RingcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RingcraftModMenus.RINGS_GUI.get(), RingsGUIScreen::new);
	}
}
