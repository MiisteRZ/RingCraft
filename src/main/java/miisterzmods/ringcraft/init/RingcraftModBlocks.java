
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import miisterzmods.ringcraft.block.RozaniWoodBlock;
import miisterzmods.ringcraft.block.RozaniStairsBlock;
import miisterzmods.ringcraft.block.RozaniSlabBlock;
import miisterzmods.ringcraft.block.RozaniPressurePlateBlock;
import miisterzmods.ringcraft.block.RozaniPlanksBlock;
import miisterzmods.ringcraft.block.RozaniLogBlock;
import miisterzmods.ringcraft.block.RozaniLeavesBlock;
import miisterzmods.ringcraft.block.RozaniFenceGateBlock;
import miisterzmods.ringcraft.block.RozaniFenceBlock;
import miisterzmods.ringcraft.block.RozaniButtonBlock;
import miisterzmods.ringcraft.block.RingForgeBlockBlock;
import miisterzmods.ringcraft.block.RingAltarBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedIronStoneBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedIronDeepslateBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedIronBlockBlock;
import miisterzmods.ringcraft.block.ReinforcedFurnanceBlock;
import miisterzmods.ringcraft.block.MuckrootBlock;
import miisterzmods.ringcraft.block.MistrockBlock;
import miisterzmods.ringcraft.block.DoomedWoodBlock;
import miisterzmods.ringcraft.block.DoomedTreeLogBlock;
import miisterzmods.ringcraft.block.DoomedTreeLeavesBlock;
import miisterzmods.ringcraft.block.DoomedPlanksBlock;
import miisterzmods.ringcraft.block.DoomedPlankTrapdoorBlock;
import miisterzmods.ringcraft.block.DoomedPlankStairsBlock;
import miisterzmods.ringcraft.block.DoomedPlankSlabBlock;
import miisterzmods.ringcraft.block.DoomedPlankPressurePlateBlock;
import miisterzmods.ringcraft.block.DoomedPlankFenceGateBlock;
import miisterzmods.ringcraft.block.DoomedPlankFenceBlock;
import miisterzmods.ringcraft.block.DoomedPlankDoorBlock;
import miisterzmods.ringcraft.block.DoomedPlankButtonBlock;
import miisterzmods.ringcraft.RingcraftMod;

public class RingcraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RingcraftMod.MODID);
	public static final DeferredBlock<Block> REINFORCED_IRON_STONE_BLOCK = REGISTRY.register("reinforced_iron_stone_block", ReinforcedIronStoneBlockBlock::new);
	public static final DeferredBlock<Block> REINFORCED_FURNANCE = REGISTRY.register("reinforced_furnance", ReinforcedFurnanceBlock::new);
	public static final DeferredBlock<Block> REINFORCED_IRON_DEEPSLATE_BLOCK = REGISTRY.register("reinforced_iron_deepslate_block", ReinforcedIronDeepslateBlockBlock::new);
	public static final DeferredBlock<Block> REINFORCED_IRON_BLOCK = REGISTRY.register("reinforced_iron_block", ReinforcedIronBlockBlock::new);
	public static final DeferredBlock<Block> RING_FORGE_BLOCK = REGISTRY.register("ring_forge_block", RingForgeBlockBlock::new);
	public static final DeferredBlock<Block> RING_ALTAR_BLOCK = REGISTRY.register("ring_altar_block", RingAltarBlockBlock::new);
	public static final DeferredBlock<Block> ROZANI_STAIRS = REGISTRY.register("rozani_stairs", RozaniStairsBlock::new);
	public static final DeferredBlock<Block> ROZANI_LOG = REGISTRY.register("rozani_log", RozaniLogBlock::new);
	public static final DeferredBlock<Block> ROZANI_FENCE = REGISTRY.register("rozani_fence", RozaniFenceBlock::new);
	public static final DeferredBlock<Block> ROZANI_LEAVES = REGISTRY.register("rozani_leaves", RozaniLeavesBlock::new);
	public static final DeferredBlock<Block> ROZANI_PLANKS = REGISTRY.register("rozani_planks", RozaniPlanksBlock::new);
	public static final DeferredBlock<Block> ROZANI_PRESSURE_PLATE = REGISTRY.register("rozani_pressure_plate", RozaniPressurePlateBlock::new);
	public static final DeferredBlock<Block> ROZANI_BUTTON = REGISTRY.register("rozani_button", RozaniButtonBlock::new);
	public static final DeferredBlock<Block> ROZANI_WOOD = REGISTRY.register("rozani_wood", RozaniWoodBlock::new);
	public static final DeferredBlock<Block> MUCKROOT = REGISTRY.register("muckroot", MuckrootBlock::new);
	public static final DeferredBlock<Block> ROZANI_FENCE_GATE = REGISTRY.register("rozani_fence_gate", RozaniFenceGateBlock::new);
	public static final DeferredBlock<Block> ROZANI_SLAB = REGISTRY.register("rozani_slab", RozaniSlabBlock::new);
	public static final DeferredBlock<Block> MISTROCK = REGISTRY.register("mistrock", MistrockBlock::new);
	public static final DeferredBlock<Block> DOOMED_TREE_LOG = REGISTRY.register("doomed_tree_log", DoomedTreeLogBlock::new);
	public static final DeferredBlock<Block> DOOMED_TREE_LEAVES = REGISTRY.register("doomed_tree_leaves", DoomedTreeLeavesBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANKS = REGISTRY.register("doomed_planks", DoomedPlanksBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_STAIRS = REGISTRY.register("doomed_plank_stairs", DoomedPlankStairsBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_SLAB = REGISTRY.register("doomed_plank_slab", DoomedPlankSlabBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_FENCE = REGISTRY.register("doomed_plank_fence", DoomedPlankFenceBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_FENCE_GATE = REGISTRY.register("doomed_plank_fence_gate", DoomedPlankFenceGateBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_BUTTON = REGISTRY.register("doomed_plank_button", DoomedPlankButtonBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_PRESSURE_PLATE = REGISTRY.register("doomed_plank_pressure_plate", DoomedPlankPressurePlateBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_TRAPDOOR = REGISTRY.register("doomed_plank_trapdoor", DoomedPlankTrapdoorBlock::new);
	public static final DeferredBlock<Block> DOOMED_WOOD = REGISTRY.register("doomed_wood", DoomedWoodBlock::new);
	public static final DeferredBlock<Block> DOOMED_PLANK_DOOR = REGISTRY.register("doomed_plank_door", DoomedPlankDoorBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
