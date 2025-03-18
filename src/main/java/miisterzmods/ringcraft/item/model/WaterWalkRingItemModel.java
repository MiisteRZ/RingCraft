package miisterzmods.ringcraft.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.item.WaterWalkRingItem;

public class WaterWalkRingItemModel extends GeoModel<WaterWalkRingItem> {
	@Override
	public ResourceLocation getAnimationResource(WaterWalkRingItem animatable) {
		return ResourceLocation.parse("ringcraft:animations/water_walk_ring.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterWalkRingItem animatable) {
		return ResourceLocation.parse("ringcraft:geo/water_walk_ring.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterWalkRingItem animatable) {
		return ResourceLocation.parse("ringcraft:textures/item/waterwalk_ring_texture.png");
	}
}
