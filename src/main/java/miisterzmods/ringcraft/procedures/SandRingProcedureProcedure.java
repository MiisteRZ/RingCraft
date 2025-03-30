package miisterzmods.ringcraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.network.RingcraftModVariables;

import java.util.List;
import java.util.Comparator;

public class SandRingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double lookX = 0;
		double lookY = 0;
		double lookZ = 0;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown <= 0) {
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 1, z), Blocks.SAND.defaultBlockState());
			lookX = entity.getLookAngle().x;
			lookY = entity.getLookAngle().y;
			lookZ = entity.getLookAngle().z;
			{
				final Vec3 _center = new Vec3(x, (y + 0.5), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof FallingBlockEntity) {
						entityiterator.setNoGravity(true);
						entityiterator.push((entityiterator.getDeltaMovement().x()), 1, (entityiterator.getDeltaMovement().z()));
						entityiterator.setDeltaMovement(new Vec3((lookX * 0.5), (lookY * 1.5), (lookZ * 0.5)));
						entityiterator.setDeltaMovement(new Vec3((lookX * 0.5), (lookY * 1.5), (lookZ * 0.5)));
					}
				}
			}
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.cooldown = 20;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
