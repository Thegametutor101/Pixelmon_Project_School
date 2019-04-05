package pixelmonMod.itemANDblock.items.aluminium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.util.IHasModel;

public class ItemAluminium extends Item implements IHasModel{
	
	public ItemAluminium(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		Pokeballs.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
