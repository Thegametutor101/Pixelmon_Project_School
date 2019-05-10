package pixelmonMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pixelmonMod.entities.pokemonEntities.EntityInit;
import pixelmonMod.entities.throwableEntities.throwableHandlers.ThrowableRegistryHandler;
import pixelmonMod.entities.throwableEntities.throwableHandlers.ThrowableRenderHandler;
import pixelmonMod.handlers.RenderHandler;
import pixelmonMod.proxy.CommonProxy;
import pixelmonMod.smeltingRecipes.AluminiumSmelting;
import pixelmonMod.smeltingRecipes.ApricornSmelting;
import pixelmonMod.smeltingRecipes.SmeltingExample;
import pixelmonMod.smeltingRecipes.blockSmelting.Idontknow;
import pixelmonMod.tabs.NaturalTab;
import pixelmonMod.tabs.PokeballTab;
import pixelmonMod.util.Reference;
import pixelmonMod.world.ModWorldGen;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class MainPixelmon {
	
	@Instance
	public static MainPixelmon instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		MainPixelmon.proxy.addOBJLoaderDomainIfOnClient();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders(); 
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ThrowableRegistryHandler.registerThrowableEntities();
		ThrowableRenderHandler.registerThrowableEntityRenders();
		
		ApricornSmelting.init();
		AluminiumSmelting.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	
  	//Custom Mod Tabs
	public static final CreativeTabs POKEBALL_TAB = new PokeballTab("pokeball_tab");
	public static final CreativeTabs NATURAL_TAB = new NaturalTab("natural_tab");


	

}
