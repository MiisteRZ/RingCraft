package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.VexSoulItem;

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
		return ResourceLocation.parse("ringcraft:textures/item/soul_vex.png");
	}
}
