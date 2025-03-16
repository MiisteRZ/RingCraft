package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
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
			} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FLIGHT_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.FLIGHT_RING.get()
					|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.FLIGHT_RING.get()) {
				WaterWalkRingProcedure.execute(world, x, y, z);
			}
		}
	}
}
