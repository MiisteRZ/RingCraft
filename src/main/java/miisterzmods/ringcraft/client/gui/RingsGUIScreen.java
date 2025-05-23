package miisterzmods.ringcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import miisterzmods.ringcraft.world.inventory.RingsGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RingsGUIScreen extends AbstractContainerScreen<RingsGUIMenu> {
	private final static HashMap<String, Object> guistate = RingsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RingsGUIScreen(RingsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 161;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ringcraft:textures/screens/rings_gui.png");

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

		guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/ring_gui_image.png"), this.leftPos + 6, this.topPos + 23, 0, 0, 48, 48, 48, 48);

		guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/ring_gui_image.png"), this.leftPos + 116, this.topPos + 23, 0, 0, 48, 48, 48, 48);

		guiGraphics.blit(ResourceLocation.parse("ringcraft:textures/screens/ring_gui_image.png"), this.leftPos + 60, this.topPos + 23, 0, 0, 48, 48, 48, 48);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.rings_gui.label_magic_rings"), 54, 3, -6750055, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.rings_gui.label_1"), 28, 12, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.rings_gui.label_2"), 138, 12, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ringcraft.rings_gui.label_3"), 80, 12, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
