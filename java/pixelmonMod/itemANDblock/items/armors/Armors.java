package pixelmonMod.itemANDblock.items.armors;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import pixelmonMod.itemANDblock.items.armors.armorBases.ArmorBaseBoots;
import pixelmonMod.itemANDblock.items.armors.armorBases.RunningShoes;
import pixelmonMod.util.Reference;

public class Armors {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ArmorMaterial ARMOR_POKEBALL = EnumHelper.addArmorMaterial("material_pokeball", 
							(Reference.MOD_ID + ":pokeball"), 10000, new int[] {2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
		
	
	
	//Armor
	public static final Item Running_Shoes = new RunningShoes
			("running_shoes", ARMOR_POKEBALL, 1, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.SPEED, 3, 1, false, false));



}
