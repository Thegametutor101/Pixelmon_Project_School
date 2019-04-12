package pixelmonMod.itemANDblock.items.aluminium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.util.IHasModel;

public class ItemAluminiumIngot extends Item implements IHasModel{
	
	public ItemAluminiumIngot(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		Aluminium.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
