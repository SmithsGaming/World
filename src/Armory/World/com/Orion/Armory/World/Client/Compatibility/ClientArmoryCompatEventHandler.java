package com.Orion.Armory.World.Client.Compatibility;

import com.Orion.Armory.API.Events.Client.RegisterItemResourcesEvent;
import com.Orion.Armory.API.Events.Client.RegisterMaterialResourceEvent;
import com.Orion.Armory.Common.Item.ItemMetalChain;
import com.Orion.Armory.Common.Item.ItemMetalRing;
import com.Orion.Armory.Common.Item.ItemNugget;
import com.Orion.Armory.Common.Item.ItemPlate;
import com.Orion.Armory.Util.References;
import com.Orion.Armory.World.Util.Client.Textures;
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
            pEvent.iArmor.registerResource(Textures.Materials.Copper.tHelmetResource);
            pEvent.iArmor.registerResource(Textures.Materials.Tin.tHelmetResource);
            pEvent.iArmor.registerResource(Textures.Materials.Silver.tHelmetResource);
            pEvent.iArmor.registerResource(Textures.Materials.Lead.tHelmetResource);
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {
            pEvent.iArmor.registerResource(Textures.Materials.Copper.tChestplateResource);
            pEvent.iArmor.registerResource(Textures.Materials.Tin.tChestplateResource);
            pEvent.iArmor.registerResource(Textures.Materials.Silver.tChestplateResource);
            pEvent.iArmor.registerResource(Textures.Materials.Lead.tChestplateResource);
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {
            pEvent.iArmor.registerResource(Textures.Materials.Copper.tLegginsResource);
            pEvent.iArmor.registerResource(Textures.Materials.Tin.tLegginsResource);
            pEvent.iArmor.registerResource(Textures.Materials.Silver.tLegginsResource);
            pEvent.iArmor.registerResource(Textures.Materials.Lead.tLegginsResource);
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALSHOES))
        {
            pEvent.iArmor.registerResource(Textures.Materials.Copper.tShoesResource);
            pEvent.iArmor.registerResource(Textures.Materials.Tin.tShoesResource);
            pEvent.iArmor.registerResource(Textures.Materials.Silver.tShoesResource);
            pEvent.iArmor.registerResource(Textures.Materials.Lead.tShoesResource);
        }
    }

    @SubscribeEvent
    public void RegisterItemResourcesHandler(RegisterItemResourcesEvent pEvent)
    {
        if (pEvent.iContainer instanceof ItemMetalRing)
        {
            pEvent.iContainer.registerResource(Textures.Items.ItemRing.CopperResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemRing.TinResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemRing.SilverResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemRing.LeadResource);            
        }
        else if (pEvent.iContainer instanceof ItemMetalChain)
        {
            pEvent.iContainer.registerResource(Textures.Items.ItemChain.CopperResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemChain.TinResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemChain.SilverResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemChain.LeadResource);
        }
        else if (pEvent.iContainer instanceof ItemNugget)
        {
            pEvent.iContainer.registerResource(Textures.Items.ItemNugget.CopperResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemNugget.TinResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemNugget.SilverResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemNugget.LeadResource);
        }
        else if (pEvent.iContainer instanceof ItemPlate)
        {
            pEvent.iContainer.registerResource(Textures.Items.ItemPlate.CopperResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemPlate.TinResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemPlate.SilverResource);
            pEvent.iContainer.registerResource(Textures.Items.ItemPlate.LeadResource);
        }
    }
}
