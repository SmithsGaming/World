package com.Orion.Armory.World.Event;

import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.API.Events.Common.RegisterMaterialsEvent;
import com.Orion.Armory.World.Common.Compatibility.ArmoryMedieval;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 11:07
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ArmoryCompatEventHandler
{

    @SubscribeEvent
    public void RegisterMaterialsHandler(RegisterMaterialsEvent pEvent)
    {

    }

    @SubscribeEvent
    public void ActivateArmorAddonHandler(ActivateArmorAddonEvent pEvent)
    {
        if (!pEvent.iArmorMaterial.getType().equals(com.Orion.Armory.Util.References.InternalNames.Tiers.MEDIEVAL))
            return;

        if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.TOP))
        {
            ArmoryMedieval.HandleTopHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.RIGHT))
        {
            ArmoryMedieval.HandleRightSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.LEFT))
        {
            ArmoryMedieval.HandleLeftSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERLEFT))
        {
            ArmoryMedieval.HandleLeftShoulderPadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERRIGHT))
        {
            ArmoryMedieval.HandleRightShouldPadMaterialsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackLegginsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.LEFT))
        {
            ArmoryMedieval.HandleLeftShoesMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.RIGHT))
        {
            ArmoryMedieval.HandleRightShoesMaterials(pEvent);
        }
    }

    @SubscribeEvent
    public void ModifyMaterialHandler(ModifyMaterialEvent pEvent)
    {
        if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALHELMET))
        {
            ArmoryMedieval.ModifyMaterialForHelmet(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {
            ArmoryMedieval.ModifyMaterialForChestplate(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {
            ArmoryMedieval.ModifyMaterialForLeggings(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALSHOES))
        {
            ArmoryMedieval.ModifyMaterialForShoes(pEvent);
        }
        else
        {
            ArmoryMedieval.ModifyMaterialForOther(pEvent);
        }
    }

}
