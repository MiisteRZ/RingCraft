package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MainRecipesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return SmeltingResultConditionProcedure.execute(world, x, y, z) || FurnaceCustomRecipeProcedure.execute(world, x, y, z);
	}
}
