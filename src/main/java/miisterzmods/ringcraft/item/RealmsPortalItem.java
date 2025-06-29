
package miisterzmods.ringcraft.item;

public class RealmsPortalItem extends Item {
	public RealmsPortalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		RealmsPortalRightclickedProcedure.execute();
		return ar;
	}
}