package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.breeze.Breeze;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import miisterzmods.ringcraft.init.RingcraftModItems;
import miisterzmods.ringcraft.entity.KingSandstormEntity;
import miisterzmods.ringcraft.entity.IceKingEntityEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SoulLootTablesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Blaze) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 50) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.BLAZE_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnderMan) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 40) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.ENDERMAN_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof Vex) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 30) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.VEX_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof IceKingEntityEntity) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 2) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.ICE_CRYSTAL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof Breeze) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 25) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.BREEZE_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof ElderGuardian) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 3) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.GUARDIAN_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof Warden) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 3) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.WARDEN_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof KingSandstormEntity) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 2) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.SAND_GEM.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof Phantom || ("dinnerbone").equals(entity.getDisplayName().getString()) || entity instanceof WitherSkeleton) {
			if (1 == Mth.nextInt(RandomSource.create(), 1, 40) ? true : false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RingcraftModItems.CURSED_SOUL.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
