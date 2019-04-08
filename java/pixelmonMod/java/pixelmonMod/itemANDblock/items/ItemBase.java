package pixelmonMod.itemANDblock.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainPixelmon.tabApricorns);
		
		ModItems.ITEMS.add(this);
		//Tools.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
