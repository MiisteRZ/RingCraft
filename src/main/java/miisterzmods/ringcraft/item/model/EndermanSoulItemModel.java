package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.EndermanSoulItem;

public class EndermanSoulItemModel extends GeoModel<EndermanSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(EndermanSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/enderman_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndermanSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/enderman_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndermanSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/soul_enderman.png");
	}
}
