package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.Entity;

public class FrostResistanceEffectOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen((int) (entity.getTicksFrozen() > 0 ? entity.getTicksFrozen() - 5 : entity.getTicksFrozen()));
	}
}
