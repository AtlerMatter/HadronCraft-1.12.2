package init;

import hc.block.HCMachine;
import hc.block.HCOre;
import hc.block.HCWire;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class HCBlocks {
	
	//Ores
	public static final Block oreCopper = new HCOre("ore_copper", 1f, 1);
	public static final Block oreTin = new HCOre("ore_tin", 0.5f, 1);
	public static final Block oreSilver = new HCOre("ore_silver", 0.7f, 2);
	public static final Block oreUranium = new HCOre("ore_uranium", 2f, 2);
	public static final Block orePlutonium = new HCOre("ore_plutonium", 2.5f, 2);
	
	//Ordered by quality ----> worst to best | commented on the right is the resistivity maybe for later use
	public static final Block wireTin = new HCWire("wire_tin");						//10.9*10^-8
	public static final Block wireIron = new HCWire("wire_iron");					//9.70*10^-8
	public static final Block wireLithium = new HCWire("wire_lithium");				//9.28*10^-8
	public static final Block wireTungsten = new HCWire("wire_tungsten");			//5.60*10^-8
	public static final Block wireAluminium = new HCWire("wire_aluminium");			//2.65*10^-8
	public static final Block wireGold = new HCWire("wire_gold");					//2.44*10^-8
	public static final Block wireCopper = new HCWire("wire_copper");				//1.68*10^-8
	public static final Block wireSilver = new HCWire("wire_silver");				//1.59*10^-8
	//public static Block wirePlasma; ????? Maybe add ????
	//later add superconductors
	
	//Generators
	public static final Block generatorCombustionIdle = new HCMachine("generator_combustion");
	/*public static final Block generatorCombustionActive = new HCMachine();
	public static final Block fissionController = new HCMachine();
	public static final Block fissionRod = new HCMachine();
	public static final Block nuclearTurbine = new HCMachine();
	*/
	
	//Energy Users	
	public static final Block electricSmelterIdle = new HCMachine("machine_electric_smelter");
	//public static final Block electricSmelterActive = new HCMachine();
	
	//Array with every block, gets automatically taken and registered by the handler
	public static final Block[] blocks = {
			oreCopper,
			oreTin,
			oreSilver,
			oreUranium,
			orePlutonium,
			wireTin,
			wireIron,
			wireLithium,
			wireTungsten,
			wireAluminium,
			wireGold,
			wireCopper,
			wireSilver,
			generatorCombustionIdle,
			electricSmelterIdle
	};
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		for (Block block : blocks) {
			Item item = new ItemBlock(block).setRegistryName(block.getRegistryName());
			event.getRegistry().register(item);
		}
		System.out.println("HadronCraft: Registering Blocks");
	}	
}
