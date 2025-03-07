package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModMobEffects;
import miisterzmods.ringcraft.init.RingcraftModItems;

public class FireproofEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get()
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 2, false, false));
			entity.clearFire();
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0) >= 2) {
				if (entity.isOnFire() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60,
								(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0) * 1.5), false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RingcraftModMobEffects.FIREPROOF_EFFECT) ? _livEnt.getEffect(RingcraftModMobEffects.FIREPROOF_EFFECT).getAmplifier() : 0, false, false));
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.GLOWING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SPEED);
		}
	}
}
