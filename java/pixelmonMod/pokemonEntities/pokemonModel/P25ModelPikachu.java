package pixelmonMod.pokemonEntities.pokemonModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelEnderman - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
	public class P25ModelPikachu extends ModelBase {
	    public ModelRenderer field_178721_j;
	    public ModelRenderer field_78116_c;
	    public ModelRenderer field_78115_e;
	    public ModelRenderer field_178722_k;
	    public ModelRenderer field_178720_f;

	    public P25ModelPikachu() {
	        this.textureWidth = 64;
	        this.textureHeight = 32;
	        this.field_78116_c = new ModelRenderer(this, 0, 0);
	        this.field_78116_c.setRotationPoint(0.0F, -13.0F, -0.0F);
	        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
	        this.field_178721_j = new ModelRenderer(this, 56, 0);
	        this.field_178721_j.setRotationPoint(-2.0F, -5.0F, 0.0F);
	        this.field_178721_j.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F);
	        this.field_178720_f = new ModelRenderer(this, 0, 16);
	        this.field_178720_f.setRotationPoint(0.0F, -13.0F, -0.0F);
	        this.field_178720_f.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
	        this.field_178722_k = new ModelRenderer(this, 56, 0);
	        this.field_178722_k.mirror = true;
	        this.field_178722_k.setRotationPoint(2.0F, -5.0F, 0.0F);
	        this.field_178722_k.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F);
	        this.field_78115_e = new ModelRenderer(this, 32, 16);
	        this.field_78115_e.setRotationPoint(0.0F, -14.0F, -0.0F);
	        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
	    }

	    @Override
	    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
	        this.field_78116_c.render(f5);
	        this.field_178721_j.render(f5);
	        this.field_178720_f.render(f5);
	        this.field_178722_k.render(f5);
	        this.field_78115_e.render(f5);
	    }

	    /**
	     * This is a helper function from Tabula to set the rotation of model parts
	     */
	    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
	        modelRenderer.rotateAngleX = x;
	        modelRenderer.rotateAngleY = y;
	        modelRenderer.rotateAngleZ = z;
	    }
	}

