package pixelmonMod.itemANDblock.items.food;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class Food {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Food
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);
	
	//Food with effects duration 1 min = (60 * 20)
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60 * 20), 1, false, true));

}
