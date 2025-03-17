package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WaterWalkRingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y - 1, z), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z + 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y - 1, z - 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y - 1, z - 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y - 1, z + 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y - 1, z + 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z + 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z - 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z - 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z + 2), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y - 1, z - 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 2, y - 1, z + 1), Blocks.FROSTED_ICE.defaultBlockState(), 3);
		}
	}
}
