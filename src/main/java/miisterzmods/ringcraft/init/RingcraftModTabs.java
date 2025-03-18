
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RingcraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RING_CRAFT_CREATIVE_TAB = REGISTRY.register("ring_craft_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ringcraft.ring_craft_creative_tab")).icon(() -> new ItemStack(RingcraftModItems.REGULAR_RING_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_STONE_BLOCK.get().asItem());
				tabData.accept(RingcraftModItems.REGULAR_RING_ITEM.get());
				tabData.accept(RingcraftModItems.REINFORCED_IRON_INGOT.get());
				tabData.accept(RingcraftModBlocks.REINFORCED_FURNANCE.get().asItem());
				tabData.accept(RingcraftModItems.BLAZE_SOUL.get());
				tabData.accept(RingcraftModItems.GOLD_RING.get());
				tabData.accept(RingcraftModItems.REINFORCED_RAW_IRON.get());
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_DEEPSLATE_BLOCK.get().asItem());
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_BLOCK.get().asItem());
				tabData.accept(RingcraftModItems.FIRE_RING.get());
				tabData.accept(RingcraftModItems.ENDERMAN_SOUL.get());
				tabData.accept(RingcraftModBlocks.RING_FORGE_BLOCK.get().asItem());
				tabData.accept(RingcraftModItems.ICE_KING_ENTITY_SPAWN_EGG.get());
				tabData.accept(RingcraftModItems.FLIGHT_RING.get());
				tabData.accept(RingcraftModItems.VEX_SOUL.get());
				tabData.accept(RingcraftModItems.TELEPORTATION_RING.get());
				tabData.accept(RingcraftModItems.ICE_CRYSTAL.get());
				tabData.accept(RingcraftModItems.WATER_WALK_RING.get());
			}).build());
}
