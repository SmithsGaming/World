package com.Orion.Armory.World.Common;

import com.Orion.Armory.World.Common.Block.BlockCommonMineable;
import com.Orion.Armory.World.Common.Item.ItemBlock.ItemBlockCommonMineable;
import com.Orion.Armory.World.Common.Item.ItemCommonIngot;
import com.Orion.Armory.World.Event.ArmoryCompatEventHandler;
import com.Orion.Armory.World.Util.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

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
        GeneralRegistry.tCommonOres = new BlockCommonMineable(2);

        registerEventHandlers();
    }

    public void init()
    {
        registerRenderers();
        registerResources();
        registerItems();
    }
}
