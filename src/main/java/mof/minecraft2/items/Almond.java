package mof.minecraft2.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Almond extends Item {
	
	public void register() {
    this.setUnlocalizedName("almond");
	this.setTextureName("minecraft2:almond");
	GameRegistry.registerItem(this, "almond");
	}
	
}
