
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import miisterzmods.ringcraft.item.RegularRingItemItem;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RingcraftMod.MODID);
	public static final DeferredItem<Item> REGULAR_RING_ITEM = REGISTRY.register("regular_ring_item", RegularRingItemItem::new);
	public static final DeferredItem<Item> REINFORCED_IRON_STONE_BLOCK = block(RingcraftModBlocks.REINFORCED_IRON_STONE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
