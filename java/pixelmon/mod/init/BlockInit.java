package pixelmon.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pixelmon.mod.objects.blocks.BlockMinerals;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ALUMINIUM_BLOCK = new BlockMinerals("aluminium_block", Material.IRON);

}
