package pixelmonMod.itemANDblock.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pixelmonMod.itemANDblock.blocks.bases.BlockMinerals;
import pixelmonMod.itemANDblock.blocks.bases.BlockOres;
import pixelmonMod.itemANDblock.blocks.bases.BlockStones;
import pixelmonMod.itemANDblock.blocks.bases.PokeBlock;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Standard Blocks
	public static final Block POKE_BLOCK = new PokeBlock("poke_block", Material.IRON);
	public static final Block ROCK_BLOCK = new BlockStones("rock_block", Material.ROCK);
	public static final Block ALUMINIUM_BLOCK = new BlockMinerals("aluminium_block", Material.IRON);
	
	//Ores
	public static final Block ALUMINIUM_ORE = new BlockOres("aluminium_ore", Material.ROCK);


}
