package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModItems;

public class RingPowerKeybindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FIRE_RING.get()) {
			FireRingShootProcedureProcedure.execute(entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.FLIGHT_RING.get()) {
			FlightRingProcedureProcedure.execute(entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.TELEPORTATION_RING.get()) {
			TeleportationRingUsedProcedure.execute(world, x, y, z, entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.WIND_RING.get()) {
			WindRingProcedureProcedure.execute(world, x, y, z, entity);
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindOnKeyPressed:OtherRingProcedureHere
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindOnKeyPressed:OtherRingProcedureHere
		} else if (entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindOnKeyPressed:OtherRingProcedureHere
		}
	}
}
