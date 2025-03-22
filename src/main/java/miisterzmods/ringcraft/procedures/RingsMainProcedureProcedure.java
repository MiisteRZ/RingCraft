package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModMobEffects;
import miisterzmods.ringcraft.init.RingcraftModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RingsMainProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.is(ItemTags.create(ResourceLocation.parse("ringcraft:rings")))
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.is(ItemTags.create(ResourceLocation.parse("ringcraft:rings")))
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.is(ItemTags.create(ResourceLocation.parse("ringcraft:rings")))) {
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.FIRE_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.FIRE_RING.get()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RingcraftModMobEffects.FIREPROOF_EFFECT, 600, 1));
			}
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.WATER_WALK_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.WATER_WALK_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.WATER_WALK_RING.get()) {
				WaterWalkProcedureProcedure.execute(world, x, y, z, entity);
			}
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FLIGHT_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.FLIGHT_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.FLIGHT_RING.get()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false));
				entity.fallDistance = 0;
			}
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.SEA_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.SEA_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.SEA_RING.get()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 1, false, false));
				if (entity.isUnderWater()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, false, false));
				}
			}
			if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.SCULK_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.SCULK_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.SCULK_RING.get()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, false, false));
				if (entity.isShiftKeyDown()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false));
				}
			}
		}
	}
}
