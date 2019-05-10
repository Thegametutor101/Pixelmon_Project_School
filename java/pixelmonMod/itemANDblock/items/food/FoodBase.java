package pixelmonMod.itemANDblock.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.food.Food;
import pixelmonMod.util.IHasModel;

public class FoodBase extends ItemFood implements IHasModel{
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		Food.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}
	


}
