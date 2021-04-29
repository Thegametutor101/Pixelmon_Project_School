package pixelmonMod.entities.throwableEntities.throwableHandlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import pixelmonMod.entities.throwableEntities.pokeballEntities.renders.RenderThrowableGreatball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.renders.RenderThrowablePokeball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowableGreatball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowablePokeball;

public class ThrowableRenderHandler {
	
	public static void registerThrowableEntityRenders() {
		//must copy this for each throwable item:
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler
		(EntityThrowablePokeball.class, new IRenderFactory<EntityThrowablePokeball>() {
			
			@Override
			public Render<? super EntityThrowablePokeball> createRenderFor(RenderManager manager){
				return new RenderThrowablePokeball(manager);
			}
		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler
		(EntityThrowableGreatball.class, new IRenderFactory<EntityThrowableGreatball>() {
			
			@Override
			public Render<? super EntityThrowableGreatball> createRenderFor(RenderManager manager){
				return new RenderThrowableGreatball(manager);
			}
		});
		
		
		
		
	}

}
