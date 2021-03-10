package net.mcreator.elderscrolls.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.elderscrolls.ElderscrollsModElements;
import net.mcreator.elderscrolls.ElderscrollsMod;

import java.util.Map;

@ElderscrollsModElements.ModElement.Tag
public class MoonSugarFoodEatenProcedure extends ElderscrollsModElements.ModElement {
	public MoonSugarFoodEatenProcedure(ElderscrollsModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElderscrollsMod.LOGGER.warn("Failed to load dependency entity for procedure MoonSugarFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 200, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 1, (false), (false)));
	}
}
