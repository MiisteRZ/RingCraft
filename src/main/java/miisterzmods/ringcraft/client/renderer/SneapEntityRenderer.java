
package miisterzmods.ringcraft.client.renderer;

public class SneapEntityRenderer extends MobRenderer<SneapEntityEntity, ModelSneap<SneapEntityEntity>> {
	public SneapEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSneap.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(SneapEntityEntity entity) {
		return ResourceLocation.parse("ringcraft:textures/entities/sneap.png");
	}

	private static final class AnimatedModel extends ModelSneap<SneapEntityEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SneapEntityEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SneapEntityEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(SneapAnimation.walk, limbSwing, limbSwingAmount, 1.5f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SneapEntityEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}