package pixelmon.mod.objects.items;

import net.minecraft.item.Item;
import pixelmon.mod.Main;
import pixelmon.mod.init.ItemInit;
import pixelmon.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
