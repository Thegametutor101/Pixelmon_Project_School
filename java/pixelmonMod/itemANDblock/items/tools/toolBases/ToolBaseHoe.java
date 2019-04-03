package pixelmonMod.itemANDblock.items.tools.toolBases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.ModItems;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.util.IHasModel;

public class ToolBaseHoe extends ItemHoe implements IHasModel{
	
	
	public ToolBaseHoe(String name, ToolMaterial material) {
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
