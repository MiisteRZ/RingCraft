package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class FurnaceOnTickUpdateProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z ) {
if (==0&&new Object() {
public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).getCount();
}
return 0;
}
}.getAmount(world, BlockPos.containing(x,y,z), 1)>0&&new Object() {
public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).getCount();
}
return 0;
}
}.getAmount(world, BlockPos.containing(x,y,z), 0)>0&&(new Object() {
public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).copy();
}
return ItemStack.EMPTY;
}
}.getItemStack(world, BlockPos.containing(x,y,z), 0))
.is(ItemTags.create(ResourceLocation.parse("ringcraft:furnacefuel")))&&
MainRecipesProcedure.execute(world,x,y,z)
) {if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("Fuel", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}else if (==1) {
FurnaceSmeltingProcedureProcedure.execute(world,x,y,z)
;
}
}
}
