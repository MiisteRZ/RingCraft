package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class FlyingProcedure {
public static void execute(
Entity entity ) {
if (
entity == null ) return ;
if (new Object(){
public boolean checkGamemode(Entity _ent){
if(_ent instanceof ServerPlayer _serverPlayer) {
return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
} else if(_ent.level().isClientSide() && _ent instanceof Player _player) {
return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
}
return false;
}
}.checkGamemode(entity)||new Object(){
public boolean checkGamemode(Entity _ent){
if(_ent instanceof ServerPlayer _serverPlayer) {
return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
} else if(_ent.level().isClientSide() && _ent instanceof Player _player) {
return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
}
return false;
}
}.checkGamemode(entity)) {if(entity instanceof Player _player) {
_player.getAbilities().mayfly = ;
_player.onUpdateAbilities();
}}
}
}
