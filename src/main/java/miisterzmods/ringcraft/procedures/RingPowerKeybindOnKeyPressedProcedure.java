package miisterzmods.ringcraft.procedures;

import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModItems;

public class RingPowerKeybindOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.FIRE_RING.get()
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.FIRE_RING.get()) {
			FireRingShootProcedureProcedure.execute(entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FLIGHT_RING.get() || entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.FLIGHT_RING.get()
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.FLIGHT_RING.get()) {
			{
				RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
				_vars.flying = !entity.getData(RingcraftModVariables.PLAYER_VARIABLES).flying;
				_vars.syncPlayerVariables(entity);
			}
			FlyingProcedure.execute(entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()
				|| entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindOnKeyPressed:OtherRingProcedureHere
		}
	}
}
