package pixelmonMod.smeltingRecipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.items.minerals.Minerals;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class AluminiumSmelting {
	
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.ALUMINIUM_ORE, new ItemStack(Minerals.ALUMINIUM_INGOT, 1), 5F);
	}

}
