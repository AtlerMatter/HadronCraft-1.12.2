package init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@EventBusSubscriber
public class OreDictRegistry {

	@SubscribeEvent(priority = EventPriority.LOW)
	public static void registerOreDictionary (final RegistryEvent<Item> event) {
		System.out.println("HadronCraft: Registering Ore Dictionary");
		//Ores
		OreDictionary.registerOre("oreCopper", HCBlocks.oreCopper);
		OreDictionary.registerOre("oreTin", HCBlocks.oreTin);
		OreDictionary.registerOre("oreSilver", HCBlocks.oreSilver);
		OreDictionary.registerOre("oreUranium", HCBlocks.oreUranium);
		OreDictionary.registerOre("orePlutonium", HCBlocks.orePlutonium);
		
		//Wires
		OreDictionary.registerOre("wireCopper", HCBlocks.wireCopper);
		OreDictionary.registerOre("wireTin", HCBlocks.wireTin);
		OreDictionary.registerOre("wireSilver", HCBlocks.wireSilver);
		OreDictionary.registerOre("wireIron", HCBlocks.wireIron);
		OreDictionary.registerOre("wireAluminium", HCBlocks.wireAluminium);
		OreDictionary.registerOre("wireGold", HCBlocks.wireGold);
		OreDictionary.registerOre("wireLithium", HCBlocks.wireLithium);
		OreDictionary.registerOre("wireTungsten", HCBlocks.wireTungsten);
		
		//Ingots
		OreDictionary.registerOre("ingotCopper", HCItems.ingotCopper);
		OreDictionary.registerOre("ingotTin", HCItems.ingotTin);
		OreDictionary.registerOre("ingotSteel", HCItems.ingotSteel);
		OreDictionary.registerOre("ingotSilver", HCItems.ingotSilver);
		OreDictionary.registerOre("ingotBronze", HCItems.ingotBronze);
		OreDictionary.registerOre("ingotAluminium", HCItems.ingotAluminium);
		OreDictionary.registerOre("ingotLithium", HCItems.ingotLithium);
		OreDictionary.registerOre("ingotTungsten", HCItems.ingotTungsten);
		
		//Dust
		OreDictionary.registerOre("dustBronze", HCItems.dustBronze);
		OreDictionary.registerOre("dustCopper", HCItems.dustCopper);
		OreDictionary.registerOre("dustTin", HCItems.dustTin);
		OreDictionary.registerOre("dustSteel", HCItems.dustSteel);
	}
}
