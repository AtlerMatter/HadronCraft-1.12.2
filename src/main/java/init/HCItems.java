package init;

import hc.item.HCMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class HCItems {
	
	//Ingots
	public static final Item ingotCopper = new HCMaterial("ingot_copper");
	public static final Item ingotTin = new HCMaterial("ingot_tin");
	public static final Item ingotSilver = new HCMaterial("ingot_silver");
	public static final Item ingotAluminium = new HCMaterial("ingot_aluminium");
	public static final Item ingotTungsten = new HCMaterial("ingot_tungsten");
	public static final Item ingotLithium = new HCMaterial("ingot_lithium");
	public static final Item ingotBronze = new HCMaterial("ingot_bronze");
	public static final Item ingotSteel = new HCMaterial("ingot_steel");
	
	//Dusts
	public static final Item dustBronze = new HCMaterial("dust_bronze");
	public static final Item dustCopper = new HCMaterial("dust_copper");
	public static final Item dustTin = new HCMaterial("dust_tin");
	public static final Item dustSteel = new HCMaterial("dust_steel");
	
	//Tools
	
	//Armor
	
	//Array with every item, gets automatically taken and registered by the handler
	public static final Item[] items = {
		ingotCopper,
		ingotTin,
		ingotSilver,
		ingotAluminium,
		ingotTungsten,
		ingotLithium,
		ingotBronze,
		ingotSteel,
		dustBronze,
		dustCopper,
		dustTin,
		dustSteel
	};
	
	
	@SubscribeEvent
	public static void registerItems (final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(items);
		
		System.out.println("HadronCraft: Registering Items");
	}
	
	
}