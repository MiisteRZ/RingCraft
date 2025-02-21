
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
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RingcraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<RingsGUIMenu>> RINGS_GUI = REGISTRY.register("rings_gui", () -> IMenuTypeExtension.create(RingsGUIMenu::new));
}
