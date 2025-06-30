package miisterzmods.ringcraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import miisterzmods.ringcraft.entity.KingSandstormEntity;

public class KingSandstormModel extends GeoModel<KingSandstormEntity> {
	@Override
	public ResourceLocation getAnimationResource(KingSandstormEntity entity) {
		return ResourceLocation.parse("ringcraft:animations/king_sandstorm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KingSandstormEntity entity) {
		return ResourceLocation.parse("ringcraft:geo/king_sandstorm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KingSandstormEntity entity) {
		return ResourceLocation.parse("ringcraft:textures/entities/" + entity.getTexture() + ".png");
	}

}
