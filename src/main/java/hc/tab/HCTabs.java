package hc.tab;

import net.minecraft.creativetab.CreativeTabs;

public class HCTabs {

	public static CreativeTabs mainTab;
	
	public static void init() {
		mainTab = new TabHadronCraft();
	}
}
