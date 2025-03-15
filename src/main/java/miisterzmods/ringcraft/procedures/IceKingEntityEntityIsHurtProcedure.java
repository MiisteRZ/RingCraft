package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class IceKingEntityEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(1, 0, 0, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(0, 0, 1, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot((-1), 0, 0, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(0, 0, (-1), (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(1, 1, 0, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(0, 1, 1, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot((-1), 1, 0, (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getProjectile(Level level, Entity shooter) {
					Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
					entityToSpawn.setOwner(shooter);
					return entityToSpawn;
				}
			}.getProjectile(projectileLevel, entity);
			_entityToSpawn.setPos(x, (y + 3), z);
			_entityToSpawn.shoot(0, 1, (-1), (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		RingcraftMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(1, 0, 0, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(0, 0, 1, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot((-1), 0, 0, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(0, 0, (-1), (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(1, 1, 0, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(0, 1, 1, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot((-1), 1, 0, (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getProjectile(Level level, Entity shooter) {
						Projectile entityToSpawn = new Snowball(EntityType.SNOWBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getProjectile(projectileLevel, entity);
				_entityToSpawn.setPos(x, (y + 3), z);
				_entityToSpawn.shoot(0, 1, (-1), (float) 0.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
	}
}
