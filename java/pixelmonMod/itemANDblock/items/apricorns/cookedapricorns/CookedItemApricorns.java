package pixelmonMod.itemANDblock.items.apricorns.cookedapricorns;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.*;
import pixelmonMod.util.IHasModel;

public class CookedItemApricorns extends Item implements IHasModel {
	
	public CookedItemApricorns(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainPixelmon.tabApricorns);
		
		CookedApricorns.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}
