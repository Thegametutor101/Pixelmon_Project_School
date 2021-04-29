package pixelmonMod.entities.throwableEntities.pokeballEntities.renders;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import pixelmonMod.entities.pokemonEntities.pokemonModel.P25ModelPikachu;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowableGreatball;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowablePokeball;
import pixelmonMod.util.Reference;

public class RenderThrowableGreatball extends Render<EntityThrowableGreatball>{
	
	private static final ResourceLocation GREATBALL = new ResourceLocation(Reference.MOD_ID + ":textures/items/pokeballs/pokeball/greatball.png");
	//private P25ModelPikachu model = new P25ModelPikachu();

	public RenderThrowableGreatball(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityThrowableGreatball entity) {
		return GREATBALL;
	}
	
	@Override
	public void doRender(EntityThrowableGreatball entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindEntityTexture(entity);
		bindTexture(GREATBALL);
		GL11.glTranslated(x, y, z);
		//this.model.render(entity, 0.0F, 0.0F, -0.1F, entity.rotationYaw, entity.rotationPitch, 0.0625F);
		GL11.glPopMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

}
