
package miisterzmods.ringcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TotemRingItem extends Item {
	public TotemRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
