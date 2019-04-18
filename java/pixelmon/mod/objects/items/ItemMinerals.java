package pixelmon.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import pixelmon.mod.Main;
import pixelmon.mod.util.IHasModel;

public class ItemMinerals extends ItemBase implements IHasModel{

	public ItemMinerals(String name) {
		super(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
