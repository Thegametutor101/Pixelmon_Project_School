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
import pixelmonMod.handlers.RenderHandler;
import pixelmonMod.pokemonEntities.EntityInit;
import pixelmonMod.proxy.ClientProxy;
import pixelmonMod.smeltingRecipes.ModRecipes;
import pixelmonMod.smeltingRecipes.blockSmelting.Idontknow;
import pixelmonMod.tabs.PokeballTab;
import pixelmonMod.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class MainPixelmon {
	
	@Instance
	public static MainPixelmon instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static ClientProxy proxy;
	
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders(); 
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		Idontknow.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	
  	//Custom Mod Tabs
	public static final CreativeTabs POKEBALL_TAB = new PokeballTab("pokeball_tab");
	


	

}
