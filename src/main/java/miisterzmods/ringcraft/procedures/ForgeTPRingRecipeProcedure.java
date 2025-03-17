package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import miisterzmods.ringcraft.init.RingcraftModItems;

public class ForgeTPRingRecipeProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		return (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
				if (_itemHandler != null)
					return _itemHandler.getStackInSlot(sltid).copy();
				return ItemStack.EMPTY;
			}
		}.getItemStack(1, itemstack)).getItem() == RingcraftModItems.ENDERMAN_SOUL.get() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).getCount();
				}
				return 0;
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 2) == 0 || (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
				if (_itemHandler != null)
					return _itemHandler.getStackInSlot(sltid).copy();
				return ItemStack.EMPTY;
			}
		}.getItemStack(2, itemstack)).getItem() == RingcraftModItems.TELEPORTATION_RING.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).getCount();
				}
				return 0;
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 2) == new ItemStack(RingcraftModItems.TELEPORTATION_RING.get()).getMaxStackSize());
	}
}
