
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import miisterzmods.ringcraft.block.RingForgeBlockBlock;
import miisterzmods.ringcraft.block.RingForgeBlock;
import miisterzmods.ringcraft.block.ReinforcedIronStoneBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedIronDeepslateBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedIronBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedFurnanceBlock;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RingcraftMod.MODID);
	public static final DeferredBlock<Block> REINFORCED_IRON_STONE_BLOCK = REGISTRY.register("reinforced_iron_stone_block", ReinforcedIronStoneBlockBlock::new);
	public static final DeferredBlock<Block> REINFORCED_FURNANCE = REGISTRY.register("reinforced_furnance", ReinforcedFurnanceBlock::new);
	public static final DeferredBlock<Block> RING_FORGE = REGISTRY.register("ring_forge", RingForgeBlock::new);
	public static final DeferredBlock<Block> REINFORCED_IRON_DEEPSLATE_BLOCK = REGISTRY.register("reinforced_iron_deepslate_block", ReinforcedIronDeepslateBlockBlock::new);
	public static final DeferredBlock<Block> REINFORCED_IRON_BLOCK = REGISTRY.register("reinforced_iron_block", ReinforcedIronBlockBlock::new);
	public static final DeferredBlock<Block> RING_FORGE_BLOCK = REGISTRY.register("ring_forge_block", RingForgeBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
