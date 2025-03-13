package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class ForgeSmeltingProcedureProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z ) {
if (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getDouble(tag);
return -1;
}
}.getValue(world, BlockPos.containing(x,y,z), "Fuel")>-1&&
ForgeMainRecipesProcedure.execute()
) {if (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getDouble(tag);
return -1;
}
}.getValue(world, BlockPos.containing(x,y,z), "Smelting")==new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getDouble(tag);
return -1;
}
}.getValue(world, BlockPos.containing(x,y,z), "MaxSmelting")) {if () {if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x,y,z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
ItemStack _setstack = new ItemStack(RingcraftModItems.FIRE_RING.get()).copy();
_setstack.setCount((int)(new Object() {
public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).getCount();
}
return 0;
}
}.getAmount(world, BlockPos.containing(x,y,z), 2)+1));
_itemHandlerModifiable.setStackInSlot(2, _setstack);
}
}if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x,y,z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
ItemStack _setstack = (new Object() {
public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).copy();
}
return ItemStack.EMPTY;
}
}.getItemStack(world, BlockPos.containing(x,y,z), 1))
.copy();
_setstack.setCount((int)(new Object() {
public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
if (world instanceof ILevelExtension _ext) {
IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
if (_itemHandler != null)
return _itemHandler.getStackInSlot(slotid).getCount();
}
return 0;
}
}.getAmount(world, BlockPos.containing(x,y,z), 1)-1));
_itemHandlerModifiable.setStackInSlot(1, _setstack);
}
if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("Smelting", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}else{if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putDouble("Smelting", (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getDouble(tag);
return -1;
}
}.getValue(world, BlockPos.containing(x,y,z), "Smelting")+1));
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}}
}
}
