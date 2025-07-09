
package miisterzmods.ringcraft.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.world.inventory.DimensionalRingGUIMenu;
import miisterzmods.ringcraft.procedures.TeleportSecretRealmsProcedure;
import miisterzmods.ringcraft.procedures.TeleportPlaneDoomsProcedure;
import miisterzmods.ringcraft.procedures.TeleportOverworldProcedure;
import miisterzmods.ringcraft.procedures.TeleportNetherProcedure;
import miisterzmods.ringcraft.procedures.TeleportEndProcedure;
import miisterzmods.ringcraft.procedures.CloseCurrentGUIProcedure;
import miisterzmods.ringcraft.RingcraftMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record DimensionalRingGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<DimensionalRingGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "dimensional_ring_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, DimensionalRingGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, DimensionalRingGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new DimensionalRingGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<DimensionalRingGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final DimensionalRingGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = DimensionalRingGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TeleportNetherProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			TeleportOverworldProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TeleportEndProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			TeleportSecretRealmsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			TeleportPlaneDoomsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			CloseCurrentGUIProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RingcraftMod.addNetworkMessage(DimensionalRingGUIButtonMessage.TYPE, DimensionalRingGUIButtonMessage.STREAM_CODEC, DimensionalRingGUIButtonMessage::handleData);
	}
}
