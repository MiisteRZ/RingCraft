
package miisterzmods.ringcraft.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class DoomedTwistingVinesBlock extends Block {
	public DoomedTwistingVinesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.05f, 0f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 25;
	}

	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}
}
