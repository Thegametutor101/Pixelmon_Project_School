package pixelmonMod.pokemonEntities.pokemon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class P25Pikachu extends EntityCow{

	public P25Pikachu(World worldIn) {
		super(worldIn);
	}

	@Override
	protected void entityInit() {
		
	}
	
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) {
		return new P25Pikachu(world);
	}

	
	

}
