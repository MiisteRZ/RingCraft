package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ForgeMainRecipesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return ForgeSmeltingResultConditionProcedure.execute(world, x, y, z) || ForgeTPRingRecipeProcedure.execute(world, x, y, z) || ForgeSandRingRecipeProcedure.execute(world, x, y, z) || ForgeWaterWalkRingRecipeProcedure.execute(world, x, y, z)
				|| ForgeFlightRingRecipeProcedure.execute(world, x, y, z) || ForgeSculkRingRecipeProcedure.execute(world, x, y, z) || ForgeSeaRingRecipeProcedure.execute(world, x, y, z) || ForgeCursedRingRecipeProcedure.execute(world, x, y, z)
				|| ForgeWindRingRecipeProcedure.execute(world, x, y, z);
	}
}
