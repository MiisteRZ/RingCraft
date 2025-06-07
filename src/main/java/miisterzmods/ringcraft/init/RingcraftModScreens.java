
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import miisterzmods.ringcraft.client.gui.RingsGUIScreen;
import miisterzmods.ringcraft.client.gui.RingForgeGUIScreen;
import miisterzmods.ringcraft.client.gui.RingAltarGUIScreen;
import miisterzmods.ringcraft.client.gui.ReinforcedFurnanceGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RingcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RingcraftModMenus.RINGS_GUI.get(), RingsGUIScreen::new);
		event.register(RingcraftModMenus.REINFORCED_FURNANCE_GUI.get(), ReinforcedFurnanceGUIScreen::new);
		event.register(RingcraftModMenus.RING_FORGE_GUI.get(), RingForgeGUIScreen::new);
		event.register(RingcraftModMenus.RING_ALTAR_GUI.get(), RingAltarGUIScreen::new);
	}
}
