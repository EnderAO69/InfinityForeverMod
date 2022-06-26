package net.mcreator.infinityforever.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.infinityforever.block.BlockAmythestineOre;
import net.mcreator.infinityforever.ElementsInfinityforeverMod;

import java.util.Map;

@ElementsInfinityforeverMod.ModElement.Tag
public class ProcedureAmythestineOreBlockDestroyedByPlayer extends ElementsInfinityforeverMod.ModElement {
	public ProcedureAmythestineOreBlockDestroyedByPlayer(ElementsInfinityforeverMod instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AmythestineOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AmythestineOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AmythestineOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AmythestineOreBlockDestroyedByPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAmythestineOre.block.getDefaultState(), 3);
	}
}
