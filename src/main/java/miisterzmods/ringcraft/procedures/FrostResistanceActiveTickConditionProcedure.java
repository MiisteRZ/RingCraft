package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class FrostResistanceActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPercentFrozen() * 100 > 0 || entity.getTicksFrozen() > 0) {
			entity.setTicksFrozen(
					(int) (entity.getTicksFrozen() - 2 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.DELETED_MOD_ELEMENT) ? _livEnt.getEffect(RingcraftModMobEffects.DELETED_MOD_ELEMENT).getAmplifier() : 0)));
		}
	}
}
