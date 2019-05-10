package pixelmonMod.itemANDblock.items.armors.armorBases;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RunningShoes extends ArmorBaseBoots{
	
	PotionEffect effect;
	
	public RunningShoes(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, PotionEffect effect) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		this.effect = effect;
		
	}
	
	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		if (!player.isPotionActive(this.effect.getPotion())) { // If the Potion isn't currently active,
			player.addPotionEffect(new PotionEffect(this.effect)); // Apply a copy of the PotionEffect to the player
		}
		else
			player.removeActivePotionEffect(Potion.getPotionById(1));
}

}
