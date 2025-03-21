package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class FlightRingProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean facingPX = false;
		boolean facingPY = false;
		boolean facingPZ = false;
		boolean facingNX = false;
		boolean facingNY = false;
		boolean facingNZ = false;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown <= 0) {
			entity.push((entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.8), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 0.8), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.8));
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.cooldown = 40;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
