package pixelmonMod.itemANDblock.blocks.bases;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import pixelmonMod.itemANDblock.blocks.ModBlocks;

public class BlockOres extends BlockBase{
	
	public BlockOres(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);
	}
	
	//for custom drop:
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.ALUMINIUM_ORE);
	}
	
	@Override
	public int quantityDropped(Random random) {
		int max = 3;
		int min = 1;
		return random.nextInt(max) + min;
	}

}
