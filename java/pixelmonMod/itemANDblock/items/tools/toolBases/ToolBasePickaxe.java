package pixelmonMod.itemANDblock.items.tools.toolBases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.util.IHasModel;

public class ToolBasePickaxe extends ItemPickaxe implements IHasModel{

	
	public ToolBasePickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		Tools.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
