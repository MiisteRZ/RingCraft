
package miisterzmods.ringcraft.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.procedures.FireproofEffectOnEffectActiveTickProcedure;
import miisterzmods.ringcraft.RingcraftMod;

import java.util.Set;

public class FireproofEffectMobEffect extends MobEffect {
	public FireproofEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -50688);
		this.addAttributeModifier(Attributes.BURNING_TIME, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_0"), -1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_1"), 50, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_2"), 2, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		FireproofEffectOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
