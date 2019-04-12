package pixelmonMod.smeltingRecipes.foodSmelting.apricorns;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;

public class ApricornWhite {
	public static void init() {
		GameRegistry.addSmelting(Apricorns.WHITE_APRICORNS, new ItemStack(CookedApricorns.COOKED_WHITE_APRICORNS, 1), 500F);
	}
}
