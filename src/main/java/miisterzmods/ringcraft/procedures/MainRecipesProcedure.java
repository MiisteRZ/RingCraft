package miisterzmods.ringcraft.procedures;

import net.neoforged.bus.api.Event;

public class MainRecipesProcedure {
public static boolean execute(
LevelAccessor world,
double x,
double y,
double z ) {
return
SmeltingResultConditionProcedure.execute(world,x,y,z)
||;
}
}
