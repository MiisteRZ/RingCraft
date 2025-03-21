package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.GuardianSoulItem;

public class GuardianSoulItemModel extends GeoModel<GuardianSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(GuardianSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/guardian_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuardianSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/guardian_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuardianSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/guardian_soul.png");
	}
}
