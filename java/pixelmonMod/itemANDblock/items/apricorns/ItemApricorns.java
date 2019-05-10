package pixelmonMod.itemANDblock.items.apricorns;

import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.*;
import pixelmonMod.util.IHasModel;

public class ItemApricorns extends Item implements IHasModel {
	
	public ItemApricorns(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainPixelmon.NATURAL_TAB);
		
		Apricorns.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}
