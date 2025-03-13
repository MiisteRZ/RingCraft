
package miisterzmods.ringcraft.client.renderer;

public class IceKingEntityRenderer extends GeoEntityRenderer<IceKingEntityEntity> {
	public IceKingEntityRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new IceKingEntityModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(IceKingEntityEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, IceKingEntityEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 2.5f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

}