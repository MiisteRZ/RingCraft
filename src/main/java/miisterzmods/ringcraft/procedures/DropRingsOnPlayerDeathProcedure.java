package miisterzmods.ringcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import miisterzmods.ringcraft.network.RingcraftModVariables;

public class DropRingsOnPlayerDeathProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (!(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getItem() == ItemStack.EMPTY.getItem())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0);
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (!(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getItem() == ItemStack.EMPTY.getItem())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1);
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (!(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getItem() == ItemStack.EMPTY.getItem())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2);
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
