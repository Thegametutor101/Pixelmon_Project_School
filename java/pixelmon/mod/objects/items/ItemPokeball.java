package pixelmon.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import pixelmon.mod.Main;
import pixelmon.mod.util.IHasModel;

public class ItemPokeball extends ItemBase implements IHasModel{

	public ItemPokeball(String name) {
		super(name);
		setCreativeTab(Main.POKEBALL_TAB);
	}
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
