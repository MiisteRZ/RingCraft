package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class AltarRecipeCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return ExampleRecipeProcedure.execute(world, x, y, z);
	}
}
