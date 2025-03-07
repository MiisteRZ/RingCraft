
package miisterzmods.ringcraft.potion;

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
		FrostResistanceEffectOnEffectActiveTickProcedure.execute();
		return super.applyEffectTick(entity, amplifier);
	}
}