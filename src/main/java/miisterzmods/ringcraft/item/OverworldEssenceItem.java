
package miisterzmods.ringcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OverworldEssenceItem extends Item {
	public OverworldEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
