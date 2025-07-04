
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import miisterzmods.ringcraft.entity.SneapEntityEntity;
import miisterzmods.ringcraft.entity.SandBallEntity;
import miisterzmods.ringcraft.entity.KingSandstormEntity;
import miisterzmods.ringcraft.entity.IceKingEntityEntity;
import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RingcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RingcraftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<IceKingEntityEntity>> ICE_KING_ENTITY = register("ice_king_entity",
			EntityType.Builder.<IceKingEntityEntity>of(IceKingEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KingSandstormEntity>> KING_SANDSTORM = register("king_sandstorm",
			EntityType.Builder.<KingSandstormEntity>of(KingSandstormEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(84).setUpdateInterval(3).fireImmune().sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandBallEntity>> SAND_BALL = register("sand_ball",
			EntityType.Builder.<SandBallEntity>of(SandBallEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.31f, 0.31f));
	public static final DeferredHolder<EntityType<?>, EntityType<SneapEntityEntity>> SNEAP_ENTITY = register("sneap_entity",
			EntityType.Builder.<SneapEntityEntity>of(SneapEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(72).setUpdateInterval(3)

					.sized(0.6f, 0.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		IceKingEntityEntity.init(event);
		KingSandstormEntity.init(event);
		SneapEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ICE_KING_ENTITY.get(), IceKingEntityEntity.createAttributes().build());
		event.put(KING_SANDSTORM.get(), KingSandstormEntity.createAttributes().build());
		event.put(SNEAP_ENTITY.get(), SneapEntityEntity.createAttributes().build());
	}
}
