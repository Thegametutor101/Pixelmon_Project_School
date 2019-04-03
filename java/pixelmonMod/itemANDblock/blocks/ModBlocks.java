package pixelmonMod.itemANDblock.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pixelmonMod.itemANDblock.blocks.specificBlocks.PokeBlock;
import pixelmonMod.itemANDblock.blocks.specificBlocks.RockBlock;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block POKE_BLOCK = new PokeBlock("Poke_Block", Material.IRON);
	public static final Block ROCK_BLOCK = new RockBlock("Rock_Block", Material.ROCK);
	

}
