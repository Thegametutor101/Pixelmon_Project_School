package pixelmonMod.entities.pokemonEntities.pokemonRender;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import pixelmonMod.entities.pokemonEntities.pokemon.P25Pikachu;
import pixelmonMod.entities.pokemonEntities.pokemonModel.P25ModelPikachu;
import pixelmonMod.util.Reference;

public class P25RenderPikachu extends Render<P25Pikachu>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entities/pokemon/enderman.png");
	private P25ModelPikachu model = new P25ModelPikachu();
	
	@Override
	protected ResourceLocation getEntityTexture(P25Pikachu entity) {
		return TEXTURES;
	}
	
	public P25RenderPikachu(RenderManager renderManager) {
		super(renderManager);
	}
	
    @Override
    public void doRender(P25Pikachu entity, double x, double y, double z, float entityYaw, float partialTicks) {
    	GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(entity.rotationPitch, 1, 0, 0);
		GlStateManager.translate(0, -1.5, 0);
		this.bindEntityTexture(entity);
		this.model.render(entity, 0.0F, 0.0F, -0.1F, entity.rotationYaw, entity.rotationPitch, 0.0625F);
		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }



	
	
	

}
