package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.IceCrystalItem;

public class IceCrystalItemModel extends GeoModel<IceCrystalItem> {
	@Override
	public ResourceLocation getAnimationResource(IceCrystalItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/icecrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCrystalItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/icecrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCrystalItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/icecrystaltexture.png");
	}
}
