package miisterzmods.ringcraft.entity.model;

import software.bernie.geckolib.animation.AnimationState;

public class IceKingEntityModel extends GeoModel<IceKingEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceKingEntityEntity entity) {
		return ResourceLocation.parse("ringcraft:animations/iceking.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceKingEntityEntity entity) {
		return ResourceLocation.parse("ringcraft:geo/iceking.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceKingEntityEntity entity) {
		return ResourceLocation.parse("ringcraft:textures/entities/" + entity.getTexture() + ".png");
	}

}