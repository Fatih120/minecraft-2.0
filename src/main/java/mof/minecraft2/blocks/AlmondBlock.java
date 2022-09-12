package mof.minecraft2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AlmondBlock extends Block {

	public AlmondBlock(Material material) {
	    super(Material.wood);
	    setCreativeTab(CreativeTabs.tabBlock);
	    setHardness(0.5F);
	    setResistance(10.0F);
	    setLightLevel(50.0f);
	    setStepSound(soundTypeWood);
	    setBlockTextureName("minecraft2:almondblock");
	    setBlockName("almond_block"); //Internal name.
	}
	

}
