
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import miisterzmods.ringcraft.world.inventory.RingsGUIMenu;
import miisterzmods.ringcraft.world.inventory.RingForgeGUIMenu;
import miisterzmods.ringcraft.world.inventory.RingAltarGUIMenu;
import miisterzmods.ringcraft.world.inventory.ReinforcedFurnanceGUIMenu;
import miisterzmods.ringcraft.world.inventory.DimensionalRingGUIMenu;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RingcraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<RingsGUIMenu>> RINGS_GUI = REGISTRY.register("rings_gui", () -> IMenuTypeExtension.create(RingsGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ReinforcedFurnanceGUIMenu>> REINFORCED_FURNANCE_GUI = REGISTRY.register("reinforced_furnance_gui", () -> IMenuTypeExtension.create(ReinforcedFurnanceGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RingForgeGUIMenu>> RING_FORGE_GUI = REGISTRY.register("ring_forge_gui", () -> IMenuTypeExtension.create(RingForgeGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RingAltarGUIMenu>> RING_ALTAR_GUI = REGISTRY.register("ring_altar_gui", () -> IMenuTypeExtension.create(RingAltarGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DimensionalRingGUIMenu>> DIMENSIONAL_RING_GUI = REGISTRY.register("dimensional_ring_gui", () -> IMenuTypeExtension.create(DimensionalRingGUIMenu::new));
}
