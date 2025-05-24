package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.BreezeSoulItem;

public class BreezeSoulItemModel extends GeoModel<BreezeSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(BreezeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/breeze_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BreezeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/breeze_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BreezeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/soul_breeze.png");
	}
}
