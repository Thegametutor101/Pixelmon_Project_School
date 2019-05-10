package pixelmonMod.entities.throwableEntities.pokeballEntities.renders;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import pixelmonMod.entities.throwableEntities.pokeballEntities.throwables.EntityThrowablePokeball;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.util.Reference;

public class RenderThrowablePokeball extends Render<EntityThrowablePokeball>{
	
	public ItemStack itemstack = new ItemStack(Pokeballs.POKEBALL);
	private final RenderItem itemRenderer;

	public RenderThrowablePokeball(RenderManager renderManager) {
		super(renderManager);
		itemRenderer = new RenderItem(null, null, null);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityThrowablePokeball entity) {
		return TextureMap.LOCATION_BLOCKS_TEXTURE;
	}
	
	@Override
	public void doRender(EntityThrowablePokeball entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindEntityTexture(entity);
		bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		GL11.glTranslated(x, y, z);
		//this.model.render(entity, 0.0F, 0.0F, -0.1F, entity.rotationYaw, entity.rotationPitch, 0.0625F);
		GL11.glPopMatrix();
		IBakedModel ibakedmodel = this.itemRenderer.getItemModelWithOverrides(itemstack, entity.world, (EntityLivingBase)null);
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

}
