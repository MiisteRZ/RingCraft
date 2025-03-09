
package miisterzmods.ringcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ReinforcedIronBlockBlock extends Block {
	public ReinforcedIronBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(10f, 15f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}