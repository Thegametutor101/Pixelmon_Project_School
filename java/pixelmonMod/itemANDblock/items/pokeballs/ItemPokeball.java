package pixelmonMod.itemANDblock.items.pokeballs;

import net.minecraft.item.Item;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.ModItems;
import pixelmonMod.util.IHasModel;

public class ItemPokeball extends Item implements IHasModel{
	
	public ItemPokeball(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainPixelmon.POKEBALL_TAB);
		
		Pokeballs.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
