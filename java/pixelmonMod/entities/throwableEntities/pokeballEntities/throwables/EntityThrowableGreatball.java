package pixelmonMod.entities.throwableEntities.pokeballEntities.throwables;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class EntityThrowableGreatball extends BaseEntityThrowablePokeball{
	
	private static final DataParameter<ItemStack> ITEM = EntityDataManager.<ItemStack>createKey(EntityItem.class, DataSerializers.ITEM_STACK);
	private int rand = (int )(Math. random() * 1 + 0);
	
	public EntityThrowableGreatball(World worldIn) {
		super(worldIn);
	}
	
	public EntityThrowableGreatball(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityThrowableGreatball(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
    public ItemStack getItem()
    {
        return (ItemStack)this.getDataManager().get(ITEM);
    }

	@Override
	protected void onImpact(RayTraceResult result) {
		EntityLivingBase thrower = this.getThrower();
		
		if(result.entityHit != null) {
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, thrower), 0f);
			result.entityHit.entityDropItem(new ItemStack(Pokeballs.GREATBALL, rand), 0.5f);
		}
	}


}
