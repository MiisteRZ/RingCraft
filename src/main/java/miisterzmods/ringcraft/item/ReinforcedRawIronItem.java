
package miisterzmods.ringcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedRawIronItem extends Item {
	public ReinforcedRawIronItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
