package pixelmonMod.itemANDblock.items.tools.toolBases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.util.IHasModel;

public class ToolBaseSword extends ItemSword implements IHasModel{

	public ToolBaseSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		Tools.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}
