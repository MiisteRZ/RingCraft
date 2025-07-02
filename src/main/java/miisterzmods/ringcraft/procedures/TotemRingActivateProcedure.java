package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.client.Minecraft;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModMobEffects;
import miisterzmods.ringcraft.init.RingcraftModItems;
import miisterzmods.ringcraft.RingcraftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TotemRingActivateProcedure {
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
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.TOTEM_RING.get()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(1);
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RingcraftModMobEffects.FROST_RESISTANCE, 400, 1));
			new Object() {
				void timedLoop(int current, int total, int ticks) {
					if (entity instanceof Player _player)
						_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 1));
					final int tick2 = ticks;
					RingcraftMod.queueServerWork(tick2, () -> {
						if (total > current + 1) {
							timedLoop(current + 1, total, tick2);
						}
					});
				}
			}.timedLoop(0, 5, 10);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.shrink(1);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.setCount(0);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.TOTEM_RING.get()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(1);
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RingcraftModMobEffects.FROST_RESISTANCE, 400, 1));
			new Object() {
				void timedLoop(int current, int total, int ticks) {
					if (entity instanceof Player _player)
						_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 1));
					final int tick2 = ticks;
					RingcraftMod.queueServerWork(tick2, () -> {
						if (total > current + 1) {
							timedLoop(current + 1, total, tick2);
						}
					});
				}
			}.timedLoop(0, 5, 10);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.shrink(1);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.setCount(0);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.TOTEM_RING.get()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(2);
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RingcraftModMobEffects.FROST_RESISTANCE, 400, 1));
			new Object() {
				void timedLoop(int current, int total, int ticks) {
					if (entity instanceof Player _player)
						_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 1));
					final int tick2 = ticks;
					RingcraftMod.queueServerWork(tick2, () -> {
						if (total > current + 1) {
							timedLoop(current + 1, total, tick2);
						}
					});
				}
			}.timedLoop(0, 5, 10);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.shrink(1);
			entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.setCount(0);
		} else {
			DropRingsOnPlayerDeathProcedure.execute(world, x, y, z, entity);
		}
	}
}
