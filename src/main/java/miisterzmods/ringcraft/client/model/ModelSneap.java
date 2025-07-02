package miisterzmods.ringcraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSneap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("ringcraft", "model_sneap"), "main");
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone6;

	public ModelSneap(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.bone3 = this.bone8.getChild("bone3");
		this.bone4 = this.bone8.getChild("bone4");
		this.bone5 = this.bone8.getChild("bone5");
		this.bone6 = this.bone8.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(20, 56).addBox(3.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 56).addBox(-5.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -6.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(20, 56).addBox(3.0F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 56).addBox(-5.0F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.5F, -5.6667F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 32)
				.addBox(-1.0F, -6.5F, 0.3333F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-1.0F, -7.5F, -3.6667F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.5F, -4.3333F));
		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 22.5F, 14.5F));
		PartDefinition bone3 = bone8.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -1.5F, -16.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
				.addBox(-1.0F, -1.5F, -11.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 26).addBox(-1.0F, -2.5F, -13.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4 = bone8.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(36, 33).addBox(-1.0F, -0.5F, -10.3333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 26)
				.addBox(-1.0F, -2.5F, -11.3333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 19).addBox(-3.0F, -1.5F, -15.3333F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.1667F));
		PartDefinition bone5 = bone8.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 19).addBox(-3.0F, -1.75F, -15.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 29).addBox(-1.0F, -2.75F, -10.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.75F, -6.5F));
		PartDefinition bone6 = bone8.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(24, 9).addBox(-2.0F, -3.25F, -14.25F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 32).addBox(-1.0F, -4.25F, -10.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.25F, -7.25F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
