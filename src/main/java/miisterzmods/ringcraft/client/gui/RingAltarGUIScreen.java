package miisterzmods.ringcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import miisterzmods.ringcraft.world.inventory.RingAltarGUIMenu;
import miisterzmods.ringcraft.procedures.ForgeSmelting9DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting8DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting7DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting6DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting5DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting4DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting3DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting2DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting1DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting10DisplayConditionProcedure;
import miisterzmods.ringcraft.procedures.ForgeSmelting0DisplayConditionProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RingAltarGUIScreen extends AbstractContainerScreen<RingAltarGUIMenu> {
	private final static HashMap<String, Object> guistate = RingAltarGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RingAltarGUIScreen(RingAltarGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 201;
		this.imageHeight = 191;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ringcraft:textures/screens/ring_altar_gui.png");

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
		if (ForgeSmelting0DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress0.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting1DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress1.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting2DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress2.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting3DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress3.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting4DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress4.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting5DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress5.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting6DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress6.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting7DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress7.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting8DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress8.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting9DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress9.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}
		if (ForgeSmelting10DisplayConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/forgesmeltingprogress10.png"), this.leftPos + 91, this.topPos + 46, 0, 0, 16, 16, 16, 16);
		}

		guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/altar_element_1.png"), this.leftPos + 52, this.topPos + 10, 0, 0, 96, 96, 96, 96);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.ring_altar_gui.label_ring_forge"), 75, 1, -10092442, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
