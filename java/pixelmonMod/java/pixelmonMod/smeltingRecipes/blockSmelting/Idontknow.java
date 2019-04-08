package pixelmonMod.smeltingRecipes.blockSmelting;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.items.ModItems;

public class Idontknow {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.POKE_BLOCK, new ItemStack(Blocks.BRICK_BLOCK, 1), 3.7F);
	}

}
