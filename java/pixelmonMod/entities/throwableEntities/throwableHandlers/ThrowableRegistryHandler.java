package pixelmonMod.entities.throwableEntities.throwableHandlers;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import pixelmonMod.MainPixelmon;
import pixelmonMod.entities.throwableEntities.pokeballEntities.renders.RenderThrowablePokeball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowableGreatball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowablePokeball;
import pixelmonMod.util.Reference;

public class ThrowableRegistryHandler {
	
	private static int throwableID = 0;
	
	public static void registerThrowableEntities() {
		//must copy this for each throwable item:		
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity
				(new ResourceLocation(Reference.MOD_ID + ":pokeball"), EntityThrowablePokeball.class, "throwable_pokeball", throwableID--,
				MainPixelmon.instance, 64, 1, true);
		
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity
		(/*TextureMap.LOCATION_BLOCKS_TEXTURE*/new ResourceLocation(Reference.MOD_ID + ":greatball"), EntityThrowableGreatball.class, "throwable_greatball", throwableID--,
		MainPixelmon.instance, 64, 1, true);
		
		
	}

}
