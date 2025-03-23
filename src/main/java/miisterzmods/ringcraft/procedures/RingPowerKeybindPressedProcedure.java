package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.init.RingcraftModItems;
import miisterzmods.ringcraft.RingcraftMod;

public class RingPowerKeybindPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Ring = ItemStack.EMPTY;
		if ((entity.getData(RingcraftModVariables.PLAYER_VARIABLES).KeybindPressed).equals("1")) {
			Ring = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.copy();
		} else if ((entity.getData(RingcraftModVariables.PLAYER_VARIABLES).KeybindPressed).equals("2")) {
			Ring = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.copy();
		} else if ((entity.getData(RingcraftModVariables.PLAYER_VARIABLES).KeybindPressed).equals("3")) {
			Ring = entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.copy();
		} else {
			RingcraftMod.LOGGER.error("Ring Keybind Error");
		}
		if (Ring.getItem() == RingcraftModItems.FIRE_RING.get()) {
			FireRingShootProcedureProcedure.execute(entity);
		} else if (Ring.getItem() == RingcraftModItems.FLIGHT_RING.get()) {
			FlightRingProcedureProcedure.execute(world, x, y, z, entity);
		} else if (Ring.getItem() == RingcraftModItems.TELEPORTATION_RING.get()) {
			TeleportationRingUsedProcedure.execute(world, x, y, z, entity);
		} else if (Ring.getItem() == RingcraftModItems.WIND_RING.get()) {
			WindRingProcedureProcedure.execute(world, x, y, z, entity);
		} else if (Ring.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindPressed:OtherRingProcedureHere
		} else if (Ring.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindPressed:OtherRingProcedureHere
		} else if (Ring.getItem() == RingcraftModItems.REINFORCED_IRON_INGOT.get()) {
			assert Boolean.TRUE; //#dbg:RingPowerKeybindPressed:OtherRingProcedureHere
		}
	}
}
