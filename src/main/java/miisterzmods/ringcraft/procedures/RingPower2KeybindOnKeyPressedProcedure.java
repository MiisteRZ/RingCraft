package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class RingPower2KeybindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
			_vars.KeybindPressed = "2";
			_vars.syncPlayerVariables(entity);
		}
		RingPowerKeybindPressedProcedure.execute(world, x, y, z, entity);
	}
}
