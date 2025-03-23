package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class FlightRingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean facingPX = false;
		boolean facingPY = false;
		boolean facingPZ = false;
		boolean facingNX = false;
		boolean facingNY = false;
		boolean facingNZ = false;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown <= 0) {
			entity.push((entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.8), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.25), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.8));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.wind_burst")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.wind_burst")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.cooldown = 15;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
