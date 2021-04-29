package pixelmonMod.itemANDblock.items.armors.armorBases;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import pixelmonMod.MainPixelmon;
import pixelmonMod.itemANDblock.items.armors.Armors;
import pixelmonMod.util.IHasModel;

public class ArmorBaseBoots extends ItemArmor implements IHasModel{

	public ArmorBaseBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		Armors.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MainPixelmon.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
