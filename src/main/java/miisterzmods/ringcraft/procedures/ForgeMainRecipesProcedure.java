package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class ForgeMainRecipesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		return ForgeSmeltingResultConditionProcedure.execute(world, x, y, z) && ForgeTPRingRecipeProcedure.execute(world, x, y, z, itemstack);
	}
}
