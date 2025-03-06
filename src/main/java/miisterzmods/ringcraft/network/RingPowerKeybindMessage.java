
package miisterzmods.ringcraft.network;

import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record RingPowerKeybindMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<RingPowerKeybindMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "key_ring_power_keybind"));

	public static final StreamCodec<RegistryFriendlyByteBuf, RingPowerKeybindMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, RingPowerKeybindMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new RingPowerKeybindMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<RingPowerKeybindMessage> type() {
		return TYPE;
	}

	public static void handleData(final RingPowerKeybindMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			RingPowerKeybindOnKeyPressedProcedure.execute();
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RingcraftMod.addNetworkMessage(RingPowerKeybindMessage.TYPE, RingPowerKeybindMessage.STREAM_CODEC, RingPowerKeybindMessage::handleData);
	}

}
