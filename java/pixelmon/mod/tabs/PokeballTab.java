package pixelmon.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import pixelmon.mod.init.ItemInit;


public class PokeballTab extends CreativeTabs{

	public PokeballTab(String label) {
		super(label);
		//must put ".png"
		this.setBackgroundImageName("pokeball_image_tab.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		//if Icon is Item:
		return new ItemStack(ItemInit.POKEBALL);
		//if Icon is Block:
		//return new ItemStack(Item.getItemFromBlock(ModBlocks.POKE_BLOCK));
	}

}
