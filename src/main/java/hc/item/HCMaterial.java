package hc.item;

import hc.GlobalRef;
import hc.tab.HCTabs;
import net.minecraft.item.Item;

public class HCMaterial extends Item {

	public HCMaterial(String name) {
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(GlobalRef.MODID + "." + name);
		this.setCreativeTab(HCTabs.mainTab);
	}

}
