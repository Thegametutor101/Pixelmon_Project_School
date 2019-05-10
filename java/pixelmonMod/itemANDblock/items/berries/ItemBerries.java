package pixelmonMod.itemANDblock.items.berries;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.berries.Berries;
import pixelmonMod.itemANDblock.items.food.Food;
import pixelmonMod.util.IHasModel;

public class ItemBerries extends ItemFood implements IHasModel{
	
	public ItemBerries(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainPixelmon.NATURAL_TAB);
		
		Berries.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
