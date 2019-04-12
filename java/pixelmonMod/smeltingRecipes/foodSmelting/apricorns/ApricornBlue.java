package pixelmonMod.smeltingRecipes.foodSmelting.cooked_apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;


public class CookedBlueApricorns {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.BLUE_APRICORNS, new ItemStack(CookedApricorns.COOKED_BLUE_APRICORNS, 1), 500F);
	}
}