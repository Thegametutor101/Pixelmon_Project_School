package pixelmonMod.itemANDblock.items.minerals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.util.IHasModel;

public class ItemMinerals extends Item implements IHasModel{
	
	public ItemMinerals(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		Minerals.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
