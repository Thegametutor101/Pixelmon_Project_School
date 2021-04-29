package pixelmonMod.itemANDblock.blocks.bases;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStones extends BlockBase{
	

	public BlockStones(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		
		setHardness(200F);
		
		setResistance(18000000F);
		
		setHarvestLevel("pickaxe", 3);
		
		setLightLevel(1.0F);
		
		//setLightOpacity(0);
		
		//setBlockUnbreakable();
		
	}
	
	
}
