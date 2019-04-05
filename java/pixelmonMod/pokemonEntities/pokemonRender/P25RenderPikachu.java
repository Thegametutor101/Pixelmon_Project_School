package pixelmonMod.pokemonEntities.pokemonRender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import pixelmonMod.pokemonEntities.pokemon.P25Pikachu;
import pixelmonMod.pokemonEntities.pokemonModel.P25ModelPikachu;
import pixelmonMod.util.Reference;

public class P25RenderPikachu extends RenderLiving<P25Pikachu>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/P25ModelPikachuTexture");


	public P25RenderPikachu(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new P25ModelPikachu(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(P25Pikachu entity) {
		return TEXTURES;
	}

	
	
	

}
