package net.mcreator.elderscrolls.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import net.mcreator.elderscrolls.ElderscrollsModVariables;
import net.mcreator.elderscrolls.ElderscrollsModElements;
import net.mcreator.elderscrolls.ElderscrollsMod;

import java.util.Map;

@ElderscrollsModElements.ModElement.Tag
public class ReadAlcoholLevelProcedure extends ElderscrollsModElements.ModElement {
	public ReadAlcoholLevelProcedure(ElderscrollsModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElderscrollsMod.LOGGER.warn("Failed to load dependency entity for procedure ReadAlcoholLevel!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ElderscrollsMod.LOGGER.warn("Failed to load dependency world for procedure ReadAlcoholLevel!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		String alcoholLevel = "";
		alcoholLevel = (String) (new java.text.DecimalFormat("###")
				.format(((entity.getCapability(ElderscrollsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElderscrollsModVariables.PlayerVariables())).alcohol)));
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent((alcoholLevel)), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
