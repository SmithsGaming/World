package com.Orion.Armory.World.Client;

import com.Orion.Armory.World.Client.Compatibility.ClientArmoryCompatEventHandler;
import com.Orion.Armory.World.Client.Render.CommonMineableRenderHandler;
import com.Orion.Armory.World.Common.CommonProxy;
import com.Orion.Armory.World.Common.GeneralRegistry;
import com.Orion.Armory.World.Util.Client.Textures;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 12:27
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void registerRenderers()
    {
        super.registerRenderers();
        RenderingRegistry.registerBlockHandler(new CommonMineableRenderHandler());
    }

    @Override
    public void registerResources() {
        super.registerResources();

        GeneralRegistry.tCommonIngots.addResource(Textures.Items.CommonIngot.Copper);
        GeneralRegistry.tCommonIngots.addResource(Textures.Items.CommonIngot.Tin);
        GeneralRegistry.tCommonIngots.addResource(Textures.Items.CommonIngot.Silver);
        GeneralRegistry.tCommonIngots.addResource(Textures.Items.CommonIngot.Lead);

        GeneralRegistry.tCommonOres.registerResource(0, 0, 0, Textures.Blocks.CommonOre.Base);
        GeneralRegistry.tCommonOres.registerResource(1, 0, 0, Textures.Blocks.CommonOre.Base);
        GeneralRegistry.tCommonOres.registerResource(2, 0, 0, Textures.Blocks.CommonOre.Base);
        GeneralRegistry.tCommonOres.registerResource(3, 0, 0, Textures.Blocks.CommonOre.Base);


        GeneralRegistry.tCommonOres.registerResource(0, 0, 1, Textures.Blocks.CommonOre.Copper);
        GeneralRegistry.tCommonOres.registerResource(1, 0, 1, Textures.Blocks.CommonOre.Tin);
        GeneralRegistry.tCommonOres.registerResource(2, 0, 1, Textures.Blocks.CommonOre.Silver);
        GeneralRegistry.tCommonOres.registerResource(3, 0, 1, Textures.Blocks.CommonOre.Lead);
    }

    @Override
    public void registerEventHandlers() {
        super.registerEventHandlers();
        MinecraftForge.EVENT_BUS.register(new ClientArmoryCompatEventHandler());
    }
}
