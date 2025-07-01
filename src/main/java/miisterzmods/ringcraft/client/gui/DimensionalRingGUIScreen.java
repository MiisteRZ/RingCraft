package miisterzmods.ringcraft.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import miisterzmods.ringcraft.world.inventory.DimensionalRingGUIMenu;
import miisterzmods.ringcraft.network.DimensionalRingGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DimensionalRingGUIScreen extends AbstractContainerScreen<DimensionalRingGUIMenu> {
	private final static HashMap<String, Object> guistate = DimensionalRingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_nether;
	Button button_overworld;
	Button button_end;
	Button button_the_secret_realms;
	Button button_plane_of_dooms;
	ImageButton imagebutton_x;

	public DimensionalRingGUIScreen(DimensionalRingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 128;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ringcraft:textures/screens/dimensional_ring_gui.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_nether = Button.builder(Component.translatable("gui.ringcraft.dimensional_ring_gui.button_nether"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(0, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 34, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_overworld = Button.builder(Component.translatable("gui.ringcraft.dimensional_ring_gui.button_overworld"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(1, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 7, 72, 20).build();
		guistate.put("button:button_overworld", button_overworld);
		this.addRenderableWidget(button_overworld);
		button_end = Button.builder(Component.translatable("gui.ringcraft.dimensional_ring_gui.button_end"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(2, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 41, this.topPos + 61, 40, 20).build();
		guistate.put("button:button_end", button_end);
		this.addRenderableWidget(button_end);
		button_the_secret_realms = Button.builder(Component.translatable("gui.ringcraft.dimensional_ring_gui.button_the_secret_realms"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(3, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 97, 113, 20).build();
		guistate.put("button:button_the_secret_realms", button_the_secret_realms);
		this.addRenderableWidget(button_the_secret_realms);
		button_plane_of_dooms = Button.builder(Component.translatable("gui.ringcraft.dimensional_ring_gui.button_plane_of_dooms"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(4, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 133, 98, 20).build();
		guistate.put("button:button_plane_of_dooms", button_plane_of_dooms);
		this.addRenderableWidget(button_plane_of_dooms);
		imagebutton_x = new ImageButton(this.leftPos + 113, this.topPos + -2, 16, 16, new WidgetSprites(ResourceLocation.parse("ringcraft:textures/screens/x.png"), ResourceLocation.parse("ringcraft:textures/screens/x.png")), e -> {
			if (true) {
				PacketDistributor.sendToServer(new DimensionalRingGUIButtonMessage(5, x, y, z));
				DimensionalRingGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_x", imagebutton_x);
		this.addRenderableWidget(imagebutton_x);
	}
}
