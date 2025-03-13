package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.init.RingcraftModMobEffects;

public class FrostResistanceActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPercentFrozen() * 100 > 0 || entity.getTicksFrozen() > 0) {
			entity.setTicksFrozen(
					(int) (entity.getTicksFrozen() - 2 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FROST_RESISTANCE) ? _livEnt.getEffect(RingcraftModMobEffects.FROST_RESISTANCE).getAmplifier() : 0)));
		}
	}
}
