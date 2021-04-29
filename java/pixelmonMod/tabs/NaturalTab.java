package pixelmonMod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class NaturalTab extends CreativeTabs{

	public NaturalTab(String label) {
		super(label);
		//must put ".png"
		this.setBackgroundImageName("red.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		//if Icon is Item:
		return new ItemStack(Apricorns.RED_APRICORN);
		//if Icon is Block:
		//return new ItemStack(Item.getItemFromBlock(ModBlocks.POKE_BLOCK));
	}

}
