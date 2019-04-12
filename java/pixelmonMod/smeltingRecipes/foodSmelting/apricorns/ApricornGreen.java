package pixelmonMod.smeltingRecipes.foodSmelting.apricorns;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;
public class ApricornGreen {
	public static void init() {
		GameRegistry.addSmelting(Apricorns.GREEN_APRICORNS, new ItemStack(CookedApricorns.COOKED_GREEN_APRICORNS, 1), 500F);
	}
}
