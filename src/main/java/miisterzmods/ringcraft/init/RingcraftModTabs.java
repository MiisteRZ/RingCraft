
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RingcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RingcraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RING_CRAFT_CREATIVE_TAB = REGISTRY.register("ring_craft_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ringcraft.ring_craft_creative_tab")).icon(() -> new ItemStack(RingcraftModItems.WATER_WALK_RING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_BLOCK.get().asItem());
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_DEEPSLATE_BLOCK.get().asItem());
				tabData.accept(RingcraftModBlocks.REINFORCED_IRON_STONE_BLOCK.get().asItem());
				tabData.accept(RingcraftModItems.REINFORCED_RAW_IRON.get());
				tabData.accept(RingcraftModItems.REINFORCED_IRON_INGOT.get());
				tabData.accept(RingcraftModItems.REGULAR_RING_ITEM.get());
				tabData.accept(RingcraftModItems.GOLD_RING.get());
				tabData.accept(RingcraftModBlocks.REINFORCED_FURNANCE.get().asItem());
				tabData.accept(RingcraftModBlocks.RING_FORGE_BLOCK.get().asItem());
				tabData.accept(RingcraftModItems.BLAZE_SOUL.get());
				tabData.accept(RingcraftModItems.VEX_SOUL.get());
				tabData.accept(RingcraftModItems.GUARDIAN_SOUL.get());
				tabData.accept(RingcraftModItems.BREEZE_SOUL.get());
				tabData.accept(RingcraftModItems.ENDERMAN_SOUL.get());
				tabData.accept(RingcraftModItems.WARDEN_SOUL.get());
				tabData.accept(RingcraftModItems.CURSED_SOUL.get());
				tabData.accept(RingcraftModItems.ICE_CRYSTAL.get());
				tabData.accept(RingcraftModItems.SAND_GEM.get());
				tabData.accept(RingcraftModItems.SEA_RING.get());
				tabData.accept(RingcraftModItems.SCULK_RING.get());
				tabData.accept(RingcraftModItems.WATER_WALK_RING.get());
				tabData.accept(RingcraftModItems.FIRE_RING.get());
				tabData.accept(RingcraftModItems.FLIGHT_RING.get());
				tabData.accept(RingcraftModItems.TELEPORTATION_RING.get());
				tabData.accept(RingcraftModItems.WIND_RING.get());
				tabData.accept(RingcraftModItems.SAND_RING.get());
				tabData.accept(RingcraftModItems.TOTEM_RING.get());
				tabData.accept(RingcraftModItems.CURSED_RING.get());
				tabData.accept(RingcraftModItems.ICE_KING_ENTITY_SPAWN_EGG.get());
				tabData.accept(RingcraftModItems.KING_SANDSTORM_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RingcraftModBlocks.ROZANI_WOOD.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_LOG.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_PLANKS.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_STAIRS.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_SLAB.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_FENCE.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_FENCE_GATE.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_PRESSURE_PLATE.get().asItem());
			tabData.accept(RingcraftModBlocks.ROZANI_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RingcraftModBlocks.ROZANI_LEAVES.get().asItem());
		}
	}
}
