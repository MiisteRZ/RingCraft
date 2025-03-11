
package miisterzmods.ringcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.procedures.FrostResistanceEffectOnEffectActiveTickProcedure;
import miisterzmods.ringcraft.RingcraftMod;

public class FrostResistanceEffectMobEffect extends MobEffect {
	public FrostResistanceEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13789993);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.frost_resistance_effect_0"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		FrostResistanceEffectOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
