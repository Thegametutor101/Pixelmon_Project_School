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

public class P25RenderPikachu extends Render<P25Pikachu>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/items/materials/aluminium_ingot.png");
	private P25ModelPikachu model = new P25ModelPikachu();
	
	public P25RenderPikachu(RenderManager renderManager) {
		super(renderManager);
	}
	
    @Override
    public void doRender(P25Pikachu entity, double x, double y, double z, float entityYaw, float partialTicks) {
        model.render(entity, 0F, 0F, 0F, 0F, 0F, 1F);
    }

	@Override
	protected ResourceLocation getEntityTexture(P25Pikachu entity) {
		return TEXTURES;
	}

	
	
	

}
