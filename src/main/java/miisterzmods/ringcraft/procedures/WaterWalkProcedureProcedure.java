package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WaterWalkProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == Blocks.WATER.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y - 1, z))) == Blocks.WATER.defaultBlockState() && !entity.isPassenger()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
		}
	}
}
