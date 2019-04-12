package pixelmonMod.smeltingRecipes.foodSmelting.cooked_apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;


public class CookedOrangeApricorns {
	
	public static void init() {
		GameRegistry.addSmelting(Apricorns.ORANGE_APRICORNS, new ItemStack(CookedApricorns.COOKED_ORANGE_APRICORNS, 1), 500F);
	}
}