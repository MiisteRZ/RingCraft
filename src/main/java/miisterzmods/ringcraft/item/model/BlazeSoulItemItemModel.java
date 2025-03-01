package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.BlazeSoulItemItem;

public class BlazeSoulItemItemModel extends GeoModel<BlazeSoulItemItem> {
	@Override
	public ResourceLocation getAnimationResource(BlazeSoulItemItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/blaze_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlazeSoulItemItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/blaze_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlazeSoulItemItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/blaze_soul.png");
	}
}
