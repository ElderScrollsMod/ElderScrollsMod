
package net.mcreator.elderscrolls.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.elderscrolls.itemgroup.ElderScrollsItemGroup;
import net.mcreator.elderscrolls.ElderscrollsModElements;

@ElderscrollsModElements.ModElement.Tag
public class OblivionThemeItem extends ElderscrollsModElements.ModElement {
	@ObjectHolder("elderscrolls:oblivion_theme")
	public static final Item block = null;
	public OblivionThemeItem(ElderscrollsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ElderscrollsModElements.sounds.get(new ResourceLocation("elderscrolls:tes4title")),
					new Item.Properties().group(ElderScrollsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("oblivion_theme");
		}
	}
}
