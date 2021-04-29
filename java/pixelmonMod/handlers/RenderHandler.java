package pixelmonMod.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import pixelmonMod.entities.pokemonEntities.pokemon.P25Pikachu;
import pixelmonMod.entities.pokemonEntities.pokemonRender.P25RenderPikachu;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(P25Pikachu.class, new IRenderFactory<P25Pikachu>() {

			@Override
			public Render<? super P25Pikachu> createRenderFor(RenderManager manager) {
				return new P25RenderPikachu(manager);
			}
			
		});
	}

}
