package pixelmonMod.itemANDblock.items.armors;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import pixelmonMod.itemANDblock.items.armors.armorBases.ArmorBaseBoots;
import pixelmonMod.util.Reference;

public class Armors {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ArmorMaterial ARMOR_POKEBALL = EnumHelper.addArmorMaterial("material_pokeball", 
							(Reference.MOD_ID + ":pokeball"), 13, new int[] {2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
		
	
	
	//Armor
	public static final Item POKEBALL_BOOTS = new ArmorBaseBoots("pokeball_boots", ARMOR_POKEBALL, 1, EntityEquipmentSlot.FEET);



}
