
package miisterzmods.ringcraft.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import miisterzmods.ringcraft.entity.model.KingSandstormModel;
import miisterzmods.ringcraft.entity.layer.KingSandstormLayer;
import miisterzmods.ringcraft.entity.KingSandstormEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KingSandstormRenderer extends GeoEntityRenderer<KingSandstormEntity> {
	public KingSandstormRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new KingSandstormModel());
		this.shadowRadius = 0.3f;
		this.addRenderLayer(new KingSandstormLayer(this));
	}

	@Override
	public RenderType getRenderType(KingSandstormEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, KingSandstormEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1.8f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(KingSandstormEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
