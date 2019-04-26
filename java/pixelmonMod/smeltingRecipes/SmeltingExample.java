package pixelmonMod.smeltingRecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.items.ModItems;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.smeltingRecipes.blockSmelting.Idontknow;

public class SmeltingExample {
	
	public static void init() {
		GameRegistry.addSmelting(Pokeballs.POKEBALL, new ItemStack(ModBlocks.POKE_BLOCK, 4), 500F);
	}

}
