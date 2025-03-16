
package miisterzmods.ringcraft.network;

import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record Ring3BindingMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<Ring3BindingMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "key_ring_3_binding"));

	public static final StreamCodec<RegistryFriendlyByteBuf, Ring3BindingMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Ring3BindingMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new Ring3BindingMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Ring3BindingMessage> type() {
		return TYPE;
	}

	public static void handleData(final Ring3BindingMessage message, final IPayloadContext context) {
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

			RingPower3KeybindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RingcraftMod.addNetworkMessage(Ring3BindingMessage.TYPE, Ring3BindingMessage.STREAM_CODEC, Ring3BindingMessage::handleData);
	}

}
