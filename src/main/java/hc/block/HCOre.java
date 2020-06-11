package hc.block;

import hc.GlobalRef;
import hc.tab.HCTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HCOre extends Block {
	
	/**
	 * @param name The unlocalized name of the ore
	 * @param hardness Multiplier for strength of iron. E.g: 0.5 means it's 2x weaker than iron
	 * @param pickLevel Pickaxe level required to mine this ore (1-stone, 2-iron, 3-diamond)
	 * 
	 * @author AtlerMatter
	 */
	public HCOre(String name, float hardness, int pickLevel) {
		super(Material.ROCK);
		this.setUnlocalizedName(GlobalRef.MODID + "." + name);
		this.setRegistryName(name);
		this.setHardness(hardness * 3f);
		this.setHarvestLevel("pickaxe", pickLevel);
		this.setCreativeTab(HCTabs.mainTab);
	}

}