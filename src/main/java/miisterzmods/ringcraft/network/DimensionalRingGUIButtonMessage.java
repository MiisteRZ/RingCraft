
package miisterzmods.ringcraft.network;

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

			TeleportNetherProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TeleportOverworldProcedure.execute(entity);
		}
		if (buttonID == 2) {

			TeleportEndProcedure.execute(entity);
		}
		if (buttonID == 3) {

			TeleportSecretRealmsProcedure.execute();
		}
		if (buttonID == 4) {

			TeleportPlaneDoomsProcedure.execute(entity);
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
