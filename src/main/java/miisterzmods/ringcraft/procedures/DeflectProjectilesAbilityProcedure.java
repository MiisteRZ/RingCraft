package miisterzmods.ringcraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

public class DeflectProjectilesAbilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) && (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:arrows")))
						|| entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:impact_projectiles"))))) {
					entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, x, y, z, 3, 0, 0, 0, 1);
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, (y + 1), z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) && (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:arrows")))
						|| entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:impact_projectiles"))))) {
					entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, x, y, z, 3, 0, 0, 0, 1);
				}
			}
		}
	}
}
