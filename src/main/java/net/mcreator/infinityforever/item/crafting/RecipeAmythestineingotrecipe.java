
package net.mcreator.infinityforever.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.infinityforever.item.ItemAmythestineingot;
import net.mcreator.infinityforever.block.BlockAmythestineOre;
import net.mcreator.infinityforever.ElementsInfinityforeverMod;

@ElementsInfinityforeverMod.ModElement.Tag
public class RecipeAmythestineingotrecipe extends ElementsInfinityforeverMod.ModElement {
	public RecipeAmythestineingotrecipe(ElementsInfinityforeverMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAmythestineOre.block, (int) (1)), new ItemStack(ItemAmythestineingot.block, (int) (1)), 1F);
	}
}
