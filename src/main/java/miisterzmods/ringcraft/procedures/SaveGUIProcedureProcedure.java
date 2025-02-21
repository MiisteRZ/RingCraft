package miisterzmods.ringcraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class SaveGUIProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
			_vars.ringSlot0 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).copy();
			_vars.syncPlayerVariables(entity);
		}
		{
			RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
			_vars.ringSlot1 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).copy();
			_vars.syncPlayerVariables(entity);
		}
		{
			RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
			_vars.ringSlot2 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).copy();
			_vars.syncPlayerVariables(entity);
		}
		{
			RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
			_vars.ringSaving = true;
			_vars.syncPlayerVariables(entity);
		}
	}
}
