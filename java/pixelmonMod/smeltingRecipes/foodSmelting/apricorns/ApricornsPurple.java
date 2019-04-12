package pixelmonMod.smeltingRecipes.foodSmelting.apricorns;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;
public class ApricornsPurple {
	public static void init() {
		GameRegistry.addSmelting(Apricorns.PURPLE_APRICORNS, new ItemStack(CookedApricorns.COOKED_PURPLE_APRICORNS, 1), 500F);
	}
}
