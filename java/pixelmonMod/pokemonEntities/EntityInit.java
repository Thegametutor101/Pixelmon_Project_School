package pixelmonMod.pokemonEntities;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import pixelmonMod.MainPixelmon;
import pixelmonMod.pokemonEntities.pokemon.P25Pikachu;
import pixelmonMod.util.Reference;

public class EntityInit {
	
	
public static void registerEntities() {
		
		registerEntity("Pikachu", P25Pikachu.class, Reference.ENTITY_PIKACHU, 50, 11437146, 000000 );
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name) , entity, name, id, MainPixelmon.instance, range, 1, true, color1, color2);
	}
	

}
