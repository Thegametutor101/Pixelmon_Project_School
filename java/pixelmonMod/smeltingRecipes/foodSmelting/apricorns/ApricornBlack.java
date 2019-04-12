package pixelmonMod.smeltingRecipes.foodSmelting.cooked_apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;


public class CookedBlackApricorns {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.BLACK_APRICORNS, new ItemStack(CookedApricorns.COOKED_BLACK_APRICORNS, 1), 500F);
	}
}