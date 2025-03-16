
package miisterzmods.ringcraft.network;

import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record Ring1BindingMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<Ring1BindingMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "key_ring_1_binding"));

	public static final StreamCodec<RegistryFriendlyByteBuf, Ring1BindingMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Ring1BindingMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new Ring1BindingMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Ring1BindingMessage> type() {
		return TYPE;
	}

	public static void handleData(final Ring1BindingMessage message, final IPayloadContext context) {
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

			RingPowerKeybindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RingcraftMod.addNetworkMessage(Ring1BindingMessage.TYPE, Ring1BindingMessage.STREAM_CODEC, Ring1BindingMessage::handleData);
	}

}
