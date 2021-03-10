
package net.mcreator.elderscrolls;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.elderscrolls.item.SkoomaItem;
import net.mcreator.elderscrolls.item.MoonSugarItem;

@ElderscrollsModElements.ModElement.Tag
public class SkoomaRecipeBrewingRecipe extends ElderscrollsModElements.ModElement {
	public SkoomaRecipeBrewingRecipe(ElderscrollsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(MoonSugarItem.block, (int) (1))), new ItemStack(SkoomaItem.block, (int) (1)));
	}
}
