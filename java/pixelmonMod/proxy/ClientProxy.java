package pixelmonMod.proxy;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.util.Reference;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		//OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
		//ModelBakery.registerItemVariants(Pokeballs.POKEBALL, new ResourceLocation(Reference.MOD_ID + ":" + "models/item/pokeball.obj"));
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

}
