package pixelmonMod.entities.throwableEntities.pokeballEntities.throwables;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class BaseEntityThrowablePokeball extends EntityThrowable{
	
	public BaseEntityThrowablePokeball(World worldIn) {
		super(worldIn);
	}
	
	public BaseEntityThrowablePokeball(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public BaseEntityThrowablePokeball(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	@Override
	protected void onImpact(RayTraceResult result) {
		EntityLivingBase thrower = this.getThrower();
		
		if(result.entityHit != null) {
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, thrower), 0f);
			
		}
	}
	
	@Override
	public void onUpdate() {
		EntityLivingBase thrower = this.getThrower();
		
		if(thrower != null && thrower instanceof EntityPlayer && !thrower.isEntityAlive()) {
			this.setDead();
			this.setDropItemsWhenDead(false);
		}
		else
			super.onUpdate();
	}


}
