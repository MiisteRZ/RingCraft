package miisterzmods.ringcraft.item.model;

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
		return ResourceLocation.parse("ringcraft:textures/item/enderman_soul.png");
	}
}