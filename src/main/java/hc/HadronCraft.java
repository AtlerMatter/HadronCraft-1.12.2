package hc;

import hc.proxy.CommonProxy;
import hc.tab.HCTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GlobalRef.MODID, name = GlobalRef.MODNAME, version = GlobalRef.MODVER, dependencies = GlobalRef.MODDEPEND, acceptedMinecraftVersions = "1.12.2")
public class HadronCraft {

	@Instance(GlobalRef.MODID)
	public static HadronCraft instance;
	
	@SidedProxy(clientSide = GlobalRef.HC_PROXY_CLIENT, serverSide = GlobalRef.HC_PROXY_COMMON)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		proxy.preInit(preEvent);
		//HCBlocks.init();
		HCTabs.init();
		
		//HCBlocks.registerBlocks();
		//HCBlocks.registerOres();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		proxy.postInit(postEvent);
	}
	
}
