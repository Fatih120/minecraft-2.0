package mof.minecraft2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import mof.minecraft2.blocks.AlmondBlock;
import mof.minecraft2.entities.EntityBabyCreeper;
import mof.minecraft2.items.Almond;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


@Mod(modid = Minecraft2.MODID, version = Minecraft2.VERSION)
public class Minecraft2
{
    @Mod.Instance
    public static Minecraft2 instance;
    public static final String MODID = "minecraft2";
    public static final String VERSION = "2.0.0";

    public static Item almond;
    public static Block AlmondBlock;

    @EventHandler //Stage1 Item/Block, Config
    public void preInit(FMLInitializationEvent event) {
        //Quick-apply variables. Unlocalized names are the same as internal names (ie x.name.x) for use with textures. Added entries are as if they are classes.
        almond = new Almond().setTextureName("minecraft2:almond").setUnlocalizedName("almond").setCreativeTab(CreativeTabs.tabFood);
        AlmondBlock = new AlmondBlock(Material.wood);
        //Register from variables. The former is the block class, latter is ID again.
        GameRegistry.registerBlock(AlmondBlock, "almond_block");
        GameRegistry.registerItem(almond, "almond");


        EntityRegistry.registerGlobalEntityID(EntityBabyCreeper.class, "BabyCreeper", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityBabyCreeper.class, "BabyCreeper", EntityRegistry.findGlobalUniqueEntityId(), Minecraft2.instance, 64, 3, false);

    }

    @EventHandler //World, proxy, entities, UI, Packet, etc
    public void init(FMLInitializationEvent e) {
    }

    @EventHandler //Checks, etc
    public void init(FMLPostInitializationEvent e) {

    }
}
