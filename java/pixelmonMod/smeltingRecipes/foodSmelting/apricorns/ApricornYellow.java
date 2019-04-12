package pixelmonMod.smeltingRecipes.foodSmelting.cooked_apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;


public class CookedYellowApricorns {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.YELLOW_APRICORNS, new ItemStack(CookedApricorns.COOKED_YELLOW_APRICORNS, 1), 500F);
	}
}
