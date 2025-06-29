
package miisterzmods.ringcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RozaniLeavesBlock extends LeavesBlock {
	public RozaniLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRASS).strength(0.2f).noOcclusion().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
}