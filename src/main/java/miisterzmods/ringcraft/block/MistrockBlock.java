
package miisterzmods.ringcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MistrockBlock extends Block {
	public MistrockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(0.75f, 6f).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 12;
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 0.1f;
	}
}