package pixelmonMod.itemANDblock.items.tools;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import pixelmonMod.itemANDblock.items.tools.toolBases.*;

public class Tools {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
		public static final ToolMaterial MATERIAL_POKEBALL = EnumHelper.addToolMaterial("material_pokeball", 3, 1567, 10F, 6F, 10);
	
	//Tools
		public static final ItemSword POKEBALL_SWORD = new ToolBaseSword("pokeball_sword", MATERIAL_POKEBALL);
		public static final ItemSpade POKEBALL_SHOVEL = new ToolBaseSpade("pokeball_shovel", MATERIAL_POKEBALL);
		public static final ItemPickaxe POKEBALL_PICKAXE = new ToolBasePickaxe("pokeball_pickaxe", MATERIAL_POKEBALL);
		public static final ItemAxe POKEBALL_AXE = new ToolBaseAxe("pokeball_axe", MATERIAL_POKEBALL);
		public static final ItemHoe POKEBALL_HOE = new ToolBaseHoe("pokeball_hoe", MATERIAL_POKEBALL);
		
		
}
