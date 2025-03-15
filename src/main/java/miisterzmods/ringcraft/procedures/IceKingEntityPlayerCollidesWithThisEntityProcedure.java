package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.Entity;

public class IceKingEntityPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setTicksFrozen(200);
	}
}
