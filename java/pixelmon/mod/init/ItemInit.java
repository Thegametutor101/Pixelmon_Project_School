package pixelmon.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import pixelmon.mod.objects.items.ItemMinerals;
import pixelmon.mod.objects.items.ItemPokeball;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Pokeballs
	public static final Item POKEBALL = new ItemPokeball("pokeball");
	public static final Item GREATBALL = new ItemPokeball("greatball");
	public static final Item ULTRABALL = new ItemPokeball("ultraball");
	
	//Pokeball lids (Hammered)
	public static final Item POKEBALL_LID = new ItemPokeball("pokeball_lid");
	
	//Pokeball bases (Hammered)
	public static final Item Standard_BASE = new ItemPokeball("standard_base");	
	
	//Pokeball lid discs (not Hammered)
	
	
	//Pokeball base discs (not Hammered)
	
	
	//Minerals
	public static final Item ALUMINIUM_INGOT = new ItemMinerals("aluminium_ingot");
	
	
	


}
