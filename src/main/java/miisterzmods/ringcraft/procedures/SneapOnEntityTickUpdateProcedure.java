package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class SneapOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setInvisible(true);
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			entity.setInvisible(false);
		}
	}
}
