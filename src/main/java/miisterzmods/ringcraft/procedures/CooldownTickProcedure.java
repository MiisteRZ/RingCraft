package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class CooldownTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown > 0) {
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.cooldown = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
