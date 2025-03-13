
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

import miisterzmods.ringcraft.item.ReinforcedRawIronItem;
import miisterzmods.ringcraft.item.ReinforcedIronIngotItem;
import miisterzmods.ringcraft.item.RegularRingItemItem;
import miisterzmods.ringcraft.item.GoldRingItem;
import miisterzmods.ringcraft.item.FireRingItem;
import miisterzmods.ringcraft.item.EndermanSoulItem;
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

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
