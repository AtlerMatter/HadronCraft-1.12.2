package init;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class HCTiles extends TileEntity{

	
	public static final TileEntity[] tiles = {
		
	};
	
	@SubscribeEvent
	public static void registerTileEntities (RegistryEvent.Register<Block> event) {
		//GameRegistry.registerTileEntity(tileEntityClass, key);
	}
}
