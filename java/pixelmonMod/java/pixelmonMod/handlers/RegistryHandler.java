package pixelmonMod.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pixelmonMod.itemANDblock.blocks.ModBlocks;
import pixelmonMod.itemANDblock.items.ModItems;
import pixelmonMod.itemANDblock.items.apricorns.Apricorns;
import pixelmonMod.itemANDblock.items.apricorns.CookedApricorns;
import pixelmonMod.itemANDblock.items.pokeballs.Pokeballs;
import pixelmonMod.itemANDblock.items.tools.Tools;
import pixelmonMod.pokemonEntities.EntityInit;
import pixelmonMod.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(Pokeballs.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(Apricorns.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(CookedApricorns.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(Tools.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Item item : Pokeballs.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Item item : Apricorns.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Item item : CookedApricorns.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Item item : Tools.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() {
		
		EntityInit.registerEntities();
		
	}

}
