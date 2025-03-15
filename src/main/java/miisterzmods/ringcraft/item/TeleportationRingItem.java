
package miisterzmods.ringcraft.item;

public class TeleportationRingItem extends Item {
	public TeleportationRingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.ringcraft.teleportation_ring.description_0"));
	}
}