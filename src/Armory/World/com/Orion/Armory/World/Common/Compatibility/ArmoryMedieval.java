package com.Orion.Armory.World.Common.Compatibility;

import com.Orion.Armory.API.Armor.IArmorMaterial;
import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.World.Util.References;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 11:37
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ArmoryMedieval
{
    public static void HandleTopHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightSideHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

    }

    public static void HandleLeftSideHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftShoulderPadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightShouldPadMaterialsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftFrontChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightFrontChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftBackChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightBackChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftFrontLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightFrontLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftBackLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightBackLegginsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleLeftShoesMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;


    }

    public static void HandleRightShoesMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;
        

    }
    
    public static void ModifyMaterialForHelmet(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Copper)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.4F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 35);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Tin)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.1F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 25);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Silver)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.6F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 30);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Lead)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.8F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 45);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        }
    }

    public static void ModifyMaterialForChestplate(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Copper)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.8F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 38);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Tin)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.4F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 30);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Silver)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.2F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 58);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Lead)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 65);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        }
    }

    public static void ModifyMaterialForLeggings(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Copper)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.4F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 38);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Tin)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.1F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 30);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Silver)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.6F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 58);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Lead)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.8F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 65);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        }
    }

    public static void ModifyMaterialForShoes(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Copper)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.9F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 38);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Tin)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.6F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 30);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Silver)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.1F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 58);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Lead)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.3F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 65);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        }
    }
    
    public static void ModifyMaterialForOther(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Copper)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.9F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 38);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Tin)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.6F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 30);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Silver)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.1F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 58);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.Lead)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.3F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 65);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        }
    }


}
