
package net.mcreator.elderscrolls.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elderscrolls.item.LogoItem;
import net.mcreator.elderscrolls.ElderscrollsModElements;

@ElderscrollsModElements.ModElement.Tag
public class ElderScrollsItemGroup extends ElderscrollsModElements.ModElement {
	public ElderScrollsItemGroup(ElderscrollsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelder_scrolls") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LogoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
