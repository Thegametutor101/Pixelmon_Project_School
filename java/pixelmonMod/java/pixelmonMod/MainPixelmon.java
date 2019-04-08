package pixelmonMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pixelmonMod.itemANDblock.items.ModItems;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.proxy.CommonProxy;
import pixelmonMod.smeltingRecipes.ModRecipes;
import pixelmonMod.smeltingRecipes.blockSmelting.Idontknow;
import pixelmonMod.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.Version)
public class MainPixelmon {
	
	
	@Instance
	public static MainPixelmon instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		Idontknow.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabPokeball = new CreativeTabs("pokemon_items") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Pokeballs.POKEBALL);
		}
	};
	
	public static CreativeTabs tabApricorns = new CreativeTabs("Apricorns_Items") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Apricorns.RED_APRICORNS);
		}
	};

}
