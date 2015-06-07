package com.Orion.Armory.World.Client.Compatibility;

import com.Orion.Armory.API.Events.Client.RegisterItemResourcesEvent;
import com.Orion.Armory.API.Events.Client.RegisterMaterialResourceEvent;
import com.Orion.Armory.Common.Item.ItemMetalChain;
import com.Orion.Armory.Common.Item.ItemMetalRing;
import com.Orion.Armory.Common.Item.ItemNugget;
import com.Orion.Armory.Common.Item.ItemPlate;
import com.Orion.Armory.Util.References;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 12:26
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ClientArmoryCompatEventHandler
{

    @SubscribeEvent
    public void RegisterMaterialResourceHandler(RegisterMaterialResourceEvent pEvent)
    {
        if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALHELMET))
        {

        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {

        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {

        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALSHOES))
        {

        }
    }

    @SubscribeEvent
    public void RegisterItemResourcesHandler(RegisterItemResourcesEvent pEvent)
    {
        if (pEvent.iContainer instanceof ItemMetalRing)
        {

        }
        else if (pEvent.iContainer instanceof ItemMetalChain)
        {

        }
        else if (pEvent.iContainer instanceof ItemNugget)
        {

        }
        else if (pEvent.iContainer instanceof ItemPlate)
        {

        }
    }
}
