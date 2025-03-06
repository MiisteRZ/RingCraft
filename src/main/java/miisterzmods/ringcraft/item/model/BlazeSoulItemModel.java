package miisterzmods.ringcraft.item.model;

public class BlazeSoulItemModel extends GeoModel<BlazeSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(BlazeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/blaze_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlazeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/blaze_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlazeSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/blaze_soul.png");
	}
}