package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.WardenSoulItem;

public class WardenSoulItemModel extends GeoModel<WardenSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(WardenSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/warden_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WardenSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/warden_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WardenSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/soul_warden.png");
	}
}
