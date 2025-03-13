package miisterzmods.ringcraft.item.model;

public class VexSoulItemModel extends GeoModel<VexSoulItem> {
	@Override
	public ResourceLocation getAnimationResource(VexSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/vex_soul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VexSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/vex_soul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VexSoulItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/vex_soul.png");
	}
}