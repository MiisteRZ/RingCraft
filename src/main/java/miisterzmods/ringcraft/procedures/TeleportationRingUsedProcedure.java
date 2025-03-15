package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class TeleportationRingUsedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double LookY = 0;
		double LookX = 0;
		double LookZ = 0;
		LookX = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
		LookY = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
		LookZ = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(40)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
		if (world.getBlockState(BlockPos.containing(LookX, LookY, LookZ)).canOcclude()) {
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown <= 0) {
				{
					Entity _ent = entity;
					_ent.teleportTo(LookX, (LookY + 1), LookZ);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(LookX, (LookY + 1), LookZ, _ent.getYRot(), _ent.getXRot());
				}
				{
					RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
					_vars.cooldown = 20;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
