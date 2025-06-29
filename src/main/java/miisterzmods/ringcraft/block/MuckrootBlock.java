
package miisterzmods.ringcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MuckrootBlock extends Block {
	public MuckrootBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(0.5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}