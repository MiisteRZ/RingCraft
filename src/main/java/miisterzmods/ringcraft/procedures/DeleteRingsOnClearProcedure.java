package miisterzmods.ringcraft.procedures;

import net.neoforged.neoforge.event.CommandEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import miisterzmods.ringcraft.network.RingcraftModVariables;
import miisterzmods.ringcraft.RingcraftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DeleteRingsOnClearProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, entity.level(), entity, event.getParseResults().getReader().getString());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, String command) {
		execute(null, world, entity, command);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, String command) {
		if (entity == null || command == null)
			return;
		if ((command).equals("clear")) {
			RingcraftMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##").format(entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot0.getCount()
							+ entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot1.getCount() + entity.getData(RingcraftModVariables.PLAYER_VARIABLES).ringSlot2.getCount()) + " Rings Cleared")), false);
				{
					RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
					_vars.ringSlot0 = new ItemStack(Blocks.AIR).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
					_vars.ringSlot1 = new ItemStack(Blocks.AIR).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					RingcraftModVariables.PlayerVariables _vars = entity.getData(RingcraftModVariables.PLAYER_VARIABLES);
					_vars.ringSlot2 = new ItemStack(Blocks.AIR).copy();
					_vars.syncPlayerVariables(entity);
				}
			});
		}
	}
}
