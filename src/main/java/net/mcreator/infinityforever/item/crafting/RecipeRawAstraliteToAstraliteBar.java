
package net.mcreator.infinityforever.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.infinityforever.item.ItemRawAstralite;
import net.mcreator.infinityforever.item.ItemAstraliteBar;
import net.mcreator.infinityforever.ElementsInfinityforeverMod;

@ElementsInfinityforeverMod.ModElement.Tag
public class RecipeRawAstraliteToAstraliteBar extends ElementsInfinityforeverMod.ModElement {
	public RecipeRawAstraliteToAstraliteBar(ElementsInfinityforeverMod instance) {
		super(instance, 10);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawAstralite.block, (int) (1)), new ItemStack(ItemAstraliteBar.block, (int) (1)), 50F);
	}
}
