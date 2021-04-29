package pixelmonMod.smeltingRecipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class ApricornSmelting {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.BLACK_APRICORN, new ItemStack(Apricorns.COOKED_BLACK_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.BLUE_APRICORN, new ItemStack(Apricorns.COOKED_BLUE_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.GREEN_APRICORN, new ItemStack(Apricorns.COOKED_GREEN_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.ORANGE_APRICORN, new ItemStack(Apricorns.COOKED_ORANGE_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.PINK_APRICORN, new ItemStack(Apricorns.COOKED_PINK_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.PURPLE_APRICORN, new ItemStack(Apricorns.COOKED_PURPLE_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.RED_APRICORN, new ItemStack(Apricorns.COOKED_RED_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.SKYBLUE_APRICORN, new ItemStack(Apricorns.COOKED_SKYBLUE_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.WHITE_APRICORN, new ItemStack(Apricorns.COOKED_WHITE_APRICORN, 1), 1F);
		GameRegistry.addSmelting(Apricorns.YELLOW_APRICORN, new ItemStack(Apricorns.COOKED_YELLOW_APRICORN, 1), 1F);
	}

}
