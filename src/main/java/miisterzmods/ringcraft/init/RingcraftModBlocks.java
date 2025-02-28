
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import miisterzmods.ringcraft.block.ReinforcedIronStoneBlockBlock;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RingcraftMod.MODID);
	public static final DeferredBlock<Block> REINFORCED_IRON_STONE_BLOCK = REGISTRY.register("reinforced_iron_stone_block", ReinforcedIronStoneBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
