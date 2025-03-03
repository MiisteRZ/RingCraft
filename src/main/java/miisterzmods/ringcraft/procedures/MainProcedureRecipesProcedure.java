package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MainProcedureRecipesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return SmeltingResultConditionProcedure.execute(world, x, y, z) || CustomFurnaceRecipesProcedure.execute(world, x, y, z);
	}
}
