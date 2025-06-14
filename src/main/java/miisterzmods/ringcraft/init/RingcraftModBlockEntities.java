
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package miisterzmods.ringcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import miisterzmods.ringcraft.block.entity.RingForgeBlockBlockEntity;
import miisterzmods.ringcraft.block.entity.RingAltarBlockBlockEntity;
import miisterzmods.ringcraft.block.entity.ReinforcedFurnanceBlockEntity;
import miisterzmods.ringcraft.RingcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RingcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RingcraftMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> REINFORCED_FURNANCE = register("reinforced_furnance", RingcraftModBlocks.REINFORCED_FURNANCE, ReinforcedFurnanceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RING_FORGE_BLOCK = register("ring_forge_block", RingcraftModBlocks.RING_FORGE_BLOCK, RingForgeBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RING_ALTAR_BLOCK = register("ring_altar_block", RingcraftModBlocks.RING_ALTAR_BLOCK, RingAltarBlockBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REINFORCED_FURNANCE.get(), (blockEntity, side) -> ((ReinforcedFurnanceBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RING_FORGE_BLOCK.get(), (blockEntity, side) -> ((RingForgeBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RING_ALTAR_BLOCK.get(), (blockEntity, side) -> ((RingAltarBlockBlockEntity) blockEntity).getItemHandler());
	}
}
