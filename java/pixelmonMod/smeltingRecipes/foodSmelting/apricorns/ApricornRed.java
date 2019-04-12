package pixelmonMod.smeltingRecipes.foodSmelting.cooked_apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;


public class CookedRedApricorns {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.RED_APRICORNS, new ItemStack(CookedApricorns.COOKED_RED_APRICORNS, 1), 500F);
	}
}