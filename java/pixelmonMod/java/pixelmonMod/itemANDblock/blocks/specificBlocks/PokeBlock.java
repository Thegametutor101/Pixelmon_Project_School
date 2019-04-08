package pixelmonMod.itemANDblock.blocks.specificBlocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import pixelmonMod.itemANDblock.blocks.BlockBase;

public class PokeBlock extends BlockBase{

	public PokeBlock(String name, Material material) {
		super(name, material);
		
		//walk over sound
		setSoundType(SoundType.METAL);
		
		//how long to break in float
		setHardness(20F);
		
		//resistance to explosion
		setResistance(15F);
		
		//type of tool to break and collect block, level of tool: 0=wood 1=stone 2=iron/gold 3=diamond
		setHarvestLevel("pickaxe", 3);
		
		//light emission
		setLightLevel(2F);
		
		//light to pass trough windows
		//setLightOpacity(1);
		
		//block becomes unbreakable
		//setBlockUnbreakable();
	}
	
	

}
