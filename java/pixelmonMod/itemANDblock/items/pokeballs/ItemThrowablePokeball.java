package pixelmonMod.itemANDblock.items.pokeballs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowablePokeball;

public class ItemThrowablePokeball extends ItemPokeball{
	
	public ItemThrowablePokeball(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack stack = playerIn.getHeldItem(handIn);
		
		if(!playerIn.capabilities.isCreativeMode) {
			stack.shrink(1);
		}
		
		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));
		playerIn.getCooldownTracker().setCooldown(this, 1);//30 seconds = 600
		
		if(!worldIn.isRemote) {
			EntityThrowablePokeball pokeball = new EntityThrowablePokeball(worldIn, playerIn);
			pokeball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0f, 1.5f, 1f);
			worldIn.spawnEntity(pokeball);
		}
		
		playerIn.addStat(StatList.getObjectUseStats(this));
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	}

}
