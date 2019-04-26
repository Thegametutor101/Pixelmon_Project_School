package pixelmonMod.itemANDblock.blocks.bases;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import pixelmonMod.MainPixelmon;
import pixelmonMod.util.IHasModel;

public class BlockMinerals extends BlockBase {
	
	public BlockMinerals(String name, Material materialIn) {
		super(name, materialIn);
		
		//walk over sound
		setSoundType(SoundType.METAL);
		
		//how long to break in float
		setHardness(20F);
		
		//type of tool to break and collect block, level of tool: 0=wood 1=stone 2=iron/gold 3=diamond
		setHarvestLevel("pickaxe", 2);
		
	}
	


}
