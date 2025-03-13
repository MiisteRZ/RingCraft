
package miisterzmods.ringcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.procedures.FrostResistanceActiveTickConditionProcedure;
import miisterzmods.ringcraft.RingcraftMod;

public class FrostResistanceMobEffect extends MobEffect {
	public FrostResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711681);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.frost_resistance_0"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.frost_resistance_1"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.frost_resistance_2"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SUBMERGED_MINING_SPEED, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.frost_resistance_3"), 0.5, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		FrostResistanceActiveTickConditionProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
