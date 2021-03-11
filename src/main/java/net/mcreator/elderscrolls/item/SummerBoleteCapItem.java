
package net.mcreator.elderscrolls.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.elderscrolls.itemgroup.ElderScrollsItemGroup;
import net.mcreator.elderscrolls.ElderscrollsModElements;

@ElderscrollsModElements.ModElement.Tag
public class SummerBoleteCapItem extends ElderscrollsModElements.ModElement {
	@ObjectHolder("elderscrolls:summer_bolete_cap")
	public static final Item block = null;
	public SummerBoleteCapItem(ElderscrollsModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ElderScrollsItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("summer_bolete_cap");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 25;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
