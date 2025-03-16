
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import miisterzmods.ringcraft.network.RingsMenuBindingMessage;
import miisterzmods.ringcraft.network.Ring3BindingMessage;
import miisterzmods.ringcraft.network.Ring2BindingMessage;
import miisterzmods.ringcraft.network.Ring1BindingMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RingcraftModKeyMappings {
	public static final KeyMapping RINGS_MENU_BINDING = new KeyMapping("key.ringcraft.rings_menu_binding", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new RingsMenuBindingMessage(0, 0));
				RingsMenuBindingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RING_2_BINDING = new KeyMapping("key.ringcraft.ring_2_binding", GLFW.GLFW_KEY_U, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new Ring2BindingMessage(0, 0));
				Ring2BindingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RING_1_BINDING = new KeyMapping("key.ringcraft.ring_1_binding", GLFW.GLFW_KEY_Y, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new Ring1BindingMessage(0, 0));
				Ring1BindingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RING_3_BINDING = new KeyMapping("key.ringcraft.ring_3_binding", GLFW.GLFW_KEY_I, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new Ring3BindingMessage(0, 0));
				Ring3BindingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RINGS_MENU_BINDING);
		event.register(RING_2_BINDING);
		event.register(RING_1_BINDING);
		event.register(RING_3_BINDING);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				RINGS_MENU_BINDING.consumeClick();
				RING_2_BINDING.consumeClick();
				RING_1_BINDING.consumeClick();
				RING_3_BINDING.consumeClick();
			}
		}
	}
}
