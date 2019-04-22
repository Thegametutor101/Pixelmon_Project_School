package pixelmonMod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pixelmonMod.handlers.RenderHandler;
import pixelmonMod.pokemonEntities.EntityInit;
import pixelmonMod.util.Reference;

public class ClientProxy extends CommonProxy{
	
    @Override
    public void preInit(FMLPreInitializationEvent event) {
    }
    
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), id));
	}

    @Override
    public void init(FMLInitializationEvent event) {
    	
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

}
