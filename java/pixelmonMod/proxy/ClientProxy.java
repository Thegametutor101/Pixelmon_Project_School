package pixelmonMod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import pixelmonMod.pokemonEntities.pokemon.P25Pikachu;
import pixelmonMod.pokemonEntities.pokemonModel.P25ModelPikachu;
import pixelmonMod.pokemonEntities.pokemonRender.P25RenderPikachu;
import pixelmonMod.util.Reference;

public class ClientProxy extends CommonProxy{
	
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	



}
