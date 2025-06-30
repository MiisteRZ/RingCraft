
package miisterzmods.ringcraft.potion;

import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.RingcraftMod;

import java.util.Set;

public class CursedEffectMobEffect extends MobEffect {
	public CursedEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092442);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_0"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_1"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_2"), -2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_3"), -0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.LUCK, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_4"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FALL_DAMAGE_MULTIPLIER, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_5"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SCALE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.cursed_effect_6"), -0.2, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.PROTECTED_BY_TOTEM);
	}
}
