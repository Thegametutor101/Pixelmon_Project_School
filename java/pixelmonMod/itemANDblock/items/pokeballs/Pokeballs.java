package pixelmonMod.itemANDblock.items.pokeballs;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
//import pixelmonMod.itemANDblock.items.ItemBase;

public class Pokeballs {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Pokeballs
	public static final Item POKEBALL = new ItemThrowablePokeball("pokeball");
	public static final Item GREATBALL = new ItemThrowablePokeball("greatball");
	public static final Item ULTRABALL = new ItemPokeball("ultraball");
	
	//Pokeball lids (Hammered)
	public static final Item POKEBALL_LID = new ItemPokeball("pokeball_lid");
	
	//Pokeball bases (Hammered)
	public static final Item Standard_BASE = new ItemPokeball("standard_base");	
	
	//Pokeball lid discs (not Hammered)
	
	
	//Pokeball base discs (not Hammered)

	
	
}
