
package miisterzmods.ringcraft.potion;

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
		FireproofEffectOnEffectActiveTickProcedure.execute();
		return super.applyEffectTick(entity, amplifier);
	}
}