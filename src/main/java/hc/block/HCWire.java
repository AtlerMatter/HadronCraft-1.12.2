package hc.block;

import hc.GlobalRef;
import hc.tab.HCTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HCWire extends Block{

	//TODO make the changes to have different wires and stuff
	public HCWire(String name) {
		super(Material.CLOTH);
		this.setHardness(1F);
		this.setUnlocalizedName(GlobalRef.MODID + "." + name);
		this.setRegistryName(name);
		this.setCreativeTab(HCTabs.mainTab);
	}
}