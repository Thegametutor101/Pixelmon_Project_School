package pixelmonMod.entities.pokemonEntities.pokemon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;

public class P25Pikachu extends EntityCreature{

	public P25Pikachu(World worldIn) {
		super(worldIn);
		this.setSize(1f, 2.4f);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWanderAvoidWater(this, 1.8));
		this.tasks.addTask(2, new EntityAITempt(this, 1.5, Pokeballs.POKEBALL, false));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6f));
		//this.tasks.addTask(4, new EntityAIAvoidEntity<Entity>(this, EntityPlayer.class, 4f, 2.4, 2.4));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25);
	}
	
	@Override
	public float getEyeHeight() {
		return 2.2f;
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		dropItem(Pokeballs.POKEBALL, 1);
		this.isDead = true;
	}
	

}
