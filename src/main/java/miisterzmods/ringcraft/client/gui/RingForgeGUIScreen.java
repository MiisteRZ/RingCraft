package miisterzmods.ringcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import miisterzmods.ringcraft.world.inventory.RingForgeGUIMenu;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress9DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress8DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress7DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress6DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress5DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress4DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress3DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress2DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress1DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress10DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmeltProgress0DisplayConditionProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RingForgeGUIScreen extends AbstractContainerScreen<RingForgeGUIMenu> {
	private final static HashMap<String, Object> guistate = RingForgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RingForgeGUIScreen(RingForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ringcraft:textures/screens/ring_forge_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (ForgeSmeltProgress0DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress0.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress1DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress1.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress2DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress2.png"), this.leftPos + -126, this.topPos + -35, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress3DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress3.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress4DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress4.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress5DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress5.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress6DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress6.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress7DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress7.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress8DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress8.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress9DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress9.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmeltProgress10DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress10.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.ring_forge_gui.label_ring_forge"), 60, 8, -13434829, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
