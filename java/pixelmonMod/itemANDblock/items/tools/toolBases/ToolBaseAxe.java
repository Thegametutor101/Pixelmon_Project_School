package pixelmonMod.itemANDblock.items.tools.toolBases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.util.IHasModel;

public class ToolBaseAxe extends ItemAxe implements IHasModel{
	
	
	public ToolBaseAxe(String name, ToolMaterial material) {
		super(material, 9F, -1F);
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
