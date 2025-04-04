package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.CursedSoulItem;

public class CursedSoulItemModel extends GeoModel<CursedSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(CursedSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/cursed_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CursedSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/cursed_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CursedSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/cursed_soul.png");
	}
}
