package hc.tab;

import hc.GlobalRef;
import init.HCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabHadronCraft extends CreativeTabs {

	public TabHadronCraft() {
		super(GlobalRef.MODID + "." + "HadronCraft");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(HCBlocks.oreUranium);
	}
}
