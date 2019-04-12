package pixelmonMod.smeltingRecipes.foodSmelting.apricorns;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;
public class ApricornSkyblue {
	public static void init() {
		GameRegistry.addSmelting(Apricorns.SKYBLUE_APRICORNS, new ItemStack(CookedApricorns.COOKED_SKYBLUE_APRICORNS, 1), 500F);
	}
}
