package miisterzmods.ringcraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.windcharge.WindCharge;
import net.minecraft.world.entity.projectile.windcharge.BreezeWindCharge;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import miisterzmods.ringcraft.network.RingcraftModVariables;

import java.util.List;
import java.util.Comparator;

public class WindRingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double lookX = 0;
		double lookY = 0;
		double lookZ = 0;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).cooldown <= 0) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @p at @s run summon wind_charge ~ ~1 ~ {Motion:[0.0,0.0,0.0]}");
				}
			}
			lookX = entity.getLookAngle().x;
			lookY = entity.getLookAngle().y;
			lookZ = entity.getLookAngle().z;
			{
				final Vec3 _center = new Vec3(x, (y + 0.5), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof WindCharge || entityiterator instanceof BreezeWindCharge) {
						entityiterator.setDeltaMovement(new Vec3((lookX * 0.5), (lookY * 0.5), (lookZ * 0.5)));
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
