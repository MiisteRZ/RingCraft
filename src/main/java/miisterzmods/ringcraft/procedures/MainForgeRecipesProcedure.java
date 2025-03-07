package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MainForgeRecipesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return ForgeSmeltingResultConditionProcedure.execute(world, x, y, z);
	}
}
