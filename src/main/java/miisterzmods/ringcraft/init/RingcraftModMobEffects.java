
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import miisterzmods.ringcraft.potion.FrostResistanceMobEffect;
import miisterzmods.ringcraft.potion.FireproofEffectMobEffect;
import miisterzmods.ringcraft.potion.CursedEffectMobEffect;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, RingcraftMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FIREPROOF_EFFECT = REGISTRY.register("fireproof_effect", () -> new FireproofEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FROST_RESISTANCE = REGISTRY.register("frost_resistance", () -> new FrostResistanceMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CURSED_EFFECT = REGISTRY.register("cursed_effect", () -> new CursedEffectMobEffect());
}
