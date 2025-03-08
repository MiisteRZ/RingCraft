
package miisterzmods.ringcraft.potion;

public class FireproofEffectMobEffect extends MobEffect {
	public FireproofEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52736);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_0"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_1"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BURNING_TIME, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_2"), -10, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RingcraftMod.MODID, "effect.fireproof_effect_3"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		FireproofEffectOnEffectActiveTickProcedure.execute();
		return super.applyEffectTick(entity, amplifier);
	}
}