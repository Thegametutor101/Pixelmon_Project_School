package pixelmonMod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.blocks.bases.PokeBlock;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class PokeballTab extends CreativeTabs{

	public PokeballTab(String label) {
		super(label);
		//must put ".png"
		this.setBackgroundImageName("pokeball_image_tab.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		//if Icon is Item:
		return new ItemStack(Pokeballs.POKEBALL);
		//if Icon is Block:
		//return new ItemStack(Item.getItemFromBlock(ModBlocks.POKE_BLOCK));
	}

}
