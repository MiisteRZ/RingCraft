package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class IceKingEntityPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setTicksFrozen(200);
	}
}
