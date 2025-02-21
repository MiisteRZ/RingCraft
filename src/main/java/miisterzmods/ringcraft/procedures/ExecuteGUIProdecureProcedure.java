package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class ExecuteGUIProdecureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSaving) {
			for (int index0 = 0; index0 < 3; index0++) {
				ReadGUIinfoProcedureProcedure.execute(entity);
			}
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.ringSaving = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
