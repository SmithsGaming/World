package com.Orion.Armory.World.Common;

import com.Orion.Armory.World.Common.Block.BlockCommonMineable;
import com.Orion.Armory.World.Common.Config.WorldGenConfigs;
import com.Orion.Armory.World.Common.Item.ItemBlock.ItemBlockCommonMineable;
import com.Orion.Armory.World.Common.Item.ItemCommonIngot;
import com.Orion.Armory.World.Common.WorldGen.WorldGenCommonOre;
import com.Orion.Armory.World.Event.ArmoryCompatEventHandler;
import com.Orion.Armory.World.Util.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:57
 * <p/>
 * Copyrighted according to Project specific license
 */
public class CommonProxy
{

    public void registerRenderers(){
    }

    public void registerResources(){}

    public void registerItems(){
        GameRegistry.registerItem(GeneralRegistry.tCommonIngots, References.InternalNames.Items.CommonIngot);
        GameRegistry.registerBlock(GeneralRegistry.tCommonOres, ItemBlockCommonMineable.class, References.InternalNames.Blocks.CommonBlock);
    }

    public void registerEventHandlers()
    {
        MinecraftForge.EVENT_BUS.register(new ArmoryCompatEventHandler());
    }

    public void preInit()
    {
        GeneralRegistry.tCommonIngots = new ItemCommonIngot();
        GeneralRegistry.tCommonOres = new BlockCommonMineable();

        registerEventHandlers();
    }

    public void init()
    {
        registerRenderers();
        registerResources();
        registerItems();

        OreDictionary.registerOre("oreCopper", new ItemStack(GeneralRegistry.tCommonOres, 1, 0));
        OreDictionary.registerOre("oreTin", new ItemStack(GeneralRegistry.tCommonOres, 1, 1));
        OreDictionary.registerOre("oreSilver", new ItemStack(GeneralRegistry.tCommonOres, 1, 2));
        OreDictionary.registerOre("oreLead", new ItemStack(GeneralRegistry.tCommonOres, 1, 3));

        OreDictionary.registerOre("ingotCopper", new ItemStack(GeneralRegistry.tCommonIngots, 1, 0));
        OreDictionary.registerOre("ingotTin", new ItemStack(GeneralRegistry.tCommonIngots, 1, 1));
        OreDictionary.registerOre("ingotSilver", new ItemStack(GeneralRegistry.tCommonIngots, 1, 2));
        OreDictionary.registerOre("ingotLead", new ItemStack(GeneralRegistry.tCommonIngots, 1, 3));

        GameRegistry.registerWorldGenerator(new WorldGenCommonOre(GeneralRegistry.tCommonOres, 0, WorldGenConfigs.CommonOres.clusterSizeCopper, 32, 64), 0);
        GameRegistry.registerWorldGenerator(new WorldGenCommonOre(GeneralRegistry.tCommonOres, 1, WorldGenConfigs.CommonOres.clusterSizeTin, 32, 54), 0);
        GameRegistry.registerWorldGenerator(new WorldGenCommonOre(GeneralRegistry.tCommonOres, 2, WorldGenConfigs.CommonOres.clusterSizeSilver, 16, 48), 0);
        GameRegistry.registerWorldGenerator(new WorldGenCommonOre(GeneralRegistry.tCommonOres, 3, WorldGenConfigs.CommonOres.clusterSizeLead, 12, 32), 0);

        GameRegistry.addSmelting(new ItemStack(GeneralRegistry.tCommonOres, 1,0), new ItemStack(GeneralRegistry.tCommonIngots, 1,0), 0F);
        GameRegistry.addSmelting(new ItemStack(GeneralRegistry.tCommonOres, 1,1), new ItemStack(GeneralRegistry.tCommonIngots, 1,1), 0F);
        GameRegistry.addSmelting(new ItemStack(GeneralRegistry.tCommonOres, 1,2), new ItemStack(GeneralRegistry.tCommonIngots, 1,2), 0F);
        GameRegistry.addSmelting(new ItemStack(GeneralRegistry.tCommonOres, 1,3), new ItemStack(GeneralRegistry.tCommonIngots, 1,3), 0F);
    }
}
