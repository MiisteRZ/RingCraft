
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import miisterzmods.ringcraft.item.WindRingItem;
import miisterzmods.ringcraft.item.WaterWalkRingItem;
import miisterzmods.ringcraft.item.WardenSoulItem;
import miisterzmods.ringcraft.item.VexSoulItem;
import miisterzmods.ringcraft.item.TeleportationRingItem;
import miisterzmods.ringcraft.item.SeaRingItem;
import miisterzmods.ringcraft.item.SculkRingItem;
import miisterzmods.ringcraft.item.SandRingItem;
import miisterzmods.ringcraft.item.SandGemItem;
import miisterzmods.ringcraft.item.ReinforcedRawIronItem;
import miisterzmods.ringcraft.item.ReinforcedIronIngotItem;
import miisterzmods.ringcraft.item.RegularRingItemItem;
import miisterzmods.ringcraft.item.IceCrystalItem;
import miisterzmods.ringcraft.item.GuardianSoulItem;
import miisterzmods.ringcraft.item.GoldRingItem;
import miisterzmods.ringcraft.item.FlightRingItem;
import miisterzmods.ringcraft.item.FireRingItem;
import miisterzmods.ringcraft.item.EndermanSoulItem;
import miisterzmods.ringcraft.item.BreezeSoulItem;
import miisterzmods.ringcraft.item.BlazeSoulItem;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RingcraftMod.MODID);
	public static final DeferredItem<Item> REGULAR_RING_ITEM = REGISTRY.register("regular_ring_item", RegularRingItemItem::new);
	public static final DeferredItem<Item> REINFORCED_IRON_STONE_BLOCK = block(RingcraftModBlocks.REINFORCED_IRON_STONE_BLOCK);
	public static final DeferredItem<Item> REINFORCED_IRON_INGOT = REGISTRY.register("reinforced_iron_ingot", ReinforcedIronIngotItem::new);
	public static final DeferredItem<Item> REINFORCED_FURNANCE = block(RingcraftModBlocks.REINFORCED_FURNANCE);
	public static final DeferredItem<Item> GOLD_RING = REGISTRY.register("gold_ring", GoldRingItem::new);
	public static final DeferredItem<Item> REINFORCED_RAW_IRON = REGISTRY.register("reinforced_raw_iron", ReinforcedRawIronItem::new);
	public static final DeferredItem<Item> REINFORCED_IRON_DEEPSLATE_BLOCK = block(RingcraftModBlocks.REINFORCED_IRON_DEEPSLATE_BLOCK);
	public static final DeferredItem<Item> BLAZE_SOUL = REGISTRY.register("blaze_soul", BlazeSoulItem::new);
	public static final DeferredItem<Item> REINFORCED_IRON_BLOCK = block(RingcraftModBlocks.REINFORCED_IRON_BLOCK);
	public static final DeferredItem<Item> FIRE_RING = REGISTRY.register("fire_ring", FireRingItem::new);
	public static final DeferredItem<Item> ENDERMAN_SOUL = REGISTRY.register("enderman_soul", EndermanSoulItem::new);
	public static final DeferredItem<Item> RING_FORGE_BLOCK = block(RingcraftModBlocks.RING_FORGE_BLOCK);
	public static final DeferredItem<Item> ICE_KING_ENTITY_SPAWN_EGG = REGISTRY.register("ice_king_entity_spawn_egg", () -> new DeferredSpawnEggItem(RingcraftModEntities.ICE_KING_ENTITY, -6684673, -1, new Item.Properties()));
	public static final DeferredItem<Item> FLIGHT_RING = REGISTRY.register("flight_ring", FlightRingItem::new);
	public static final DeferredItem<Item> VEX_SOUL = REGISTRY.register("vex_soul", VexSoulItem::new);
	public static final DeferredItem<Item> TELEPORTATION_RING = REGISTRY.register("teleportation_ring", TeleportationRingItem::new);
	public static final DeferredItem<Item> ICE_CRYSTAL = REGISTRY.register("ice_crystal", IceCrystalItem::new);
	public static final DeferredItem<Item> WATER_WALK_RING = REGISTRY.register("water_walk_ring", WaterWalkRingItem::new);
	public static final DeferredItem<Item> WIND_RING = REGISTRY.register("wind_ring", WindRingItem::new);
	public static final DeferredItem<Item> BREEZE_SOUL = REGISTRY.register("breeze_soul", BreezeSoulItem::new);
	public static final DeferredItem<Item> SEA_RING = REGISTRY.register("sea_ring", SeaRingItem::new);
	public static final DeferredItem<Item> GUARDIAN_SOUL = REGISTRY.register("guardian_soul", GuardianSoulItem::new);
	public static final DeferredItem<Item> SCULK_RING = REGISTRY.register("sculk_ring", SculkRingItem::new);
	public static final DeferredItem<Item> WARDEN_SOUL = REGISTRY.register("warden_soul", WardenSoulItem::new);
	public static final DeferredItem<Item> KING_SANDSTORM_SPAWN_EGG = REGISTRY.register("king_sandstorm_spawn_egg", () -> new DeferredSpawnEggItem(RingcraftModEntities.KING_SANDSTORM, -3368704, -13210, new Item.Properties()));
	public static final DeferredItem<Item> SAND_GEM = REGISTRY.register("sand_gem", SandGemItem::new);
	public static final DeferredItem<Item> SAND_RING = REGISTRY.register("sand_ring", SandRingItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
