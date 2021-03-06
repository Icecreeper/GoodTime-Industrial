package goodtime.mod.Industrial.common.block;


import goodtime.mod.Industrial.common.core.CreativeTabGTI;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Ore extends Block {

	public static Block IR = new Ore(Material.rock)
	.setBlockName("iridiumore")
	.setHardness(10)
	.setCreativeTab(CreativeTabGTI.tab)
	.setBlockTextureName("gti:blockOreIR")
	.setResistance(20);
	
	public static ItemStack IRs;
	
	protected Ore(Material str) {
		super(str);
	}

    public static void preInit() {
    	GameRegistry.registerBlock(IR, "iridiumore");	 
	}

    static {//其他
    	IR.setHarvestLevel("pickaxe" , 3);
    }

	
}
