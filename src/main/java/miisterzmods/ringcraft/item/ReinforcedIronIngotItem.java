
package miisterzmods.ringcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedIronIngotItem extends Item {
	public ReinforcedIronIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
