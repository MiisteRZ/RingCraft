package miisterzmods.ringcraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class ReadGUIinfoProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.copy();
			_setstack.setCount(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getCount());
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.copy();
			_setstack.setCount(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getCount());
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.copy();
			_setstack.setCount(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getCount());
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
