package miisterzmods.ringcraft.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

import miisterzmods.ringcraft.item.WaterWalkRingItem;
import miisterzmods.ringcraft.item.VexSoulItem;
import miisterzmods.ringcraft.item.IceCrystalItem;
import miisterzmods.ringcraft.item.GuardianSoulItem;
import miisterzmods.ringcraft.item.EndermanSoulItem;
import miisterzmods.ringcraft.item.BreezeSoulItem;
import miisterzmods.ringcraft.item.BlazeSoulItem;

@EventBusSubscriber
public class ItemAnimationFactory {
	@SubscribeEvent
	public static void animatedItems(PlayerTickEvent.Post event) {
		String animation = "";
		ItemStack mainhandItem = event.getEntity().getMainHandItem().copy();
		ItemStack offhandItem = event.getEntity().getOffhandItem().copy();
		if (mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem) {
			if (mainhandItem.getItem() instanceof BlazeSoulItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BlazeSoulItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof BlazeSoulItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BlazeSoulItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof EndermanSoulItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EndermanSoulItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof EndermanSoulItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EndermanSoulItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof VexSoulItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((VexSoulItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof VexSoulItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((VexSoulItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof IceCrystalItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((IceCrystalItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof IceCrystalItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((IceCrystalItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof WaterWalkRingItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((WaterWalkRingItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof WaterWalkRingItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((WaterWalkRingItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof BreezeSoulItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BreezeSoulItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof BreezeSoulItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BreezeSoulItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof GuardianSoulItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((GuardianSoulItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof GuardianSoulItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((GuardianSoulItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
		}
	}
}
