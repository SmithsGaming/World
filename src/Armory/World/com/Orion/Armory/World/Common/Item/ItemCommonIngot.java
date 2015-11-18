package com.Orion.Armory.World.Common.Item;

import com.SmithsModding.Armory.Util.Client.CustomResource;
import com.Orion.Armory.World.Util.Client.TranslationKeys;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc on 7-6-2015.
 */
public class ItemCommonIngot extends Item {

    private ArrayList<CustomResource> iResources = new ArrayList<CustomResource>();

    public ItemCommonIngot()
    {
        super();
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    public IIcon getIconFromDamage(int pMeta) {
        return iResources.get(pMeta).getIcon();
    }

    @Override
    public void getSubItems(Item pItem, CreativeTabs pTab, List pList) {
        pList.add(new ItemStack(pItem, 1, 0));
        pList.add(new ItemStack(pItem, 1, 1));
        pList.add(new ItemStack(pItem, 1, 2));
        pList.add(new ItemStack(pItem, 1, 3));
    }

    @Override
    public boolean getHasSubtypes() {
        return true;
    }

    @Override
    public String getItemStackDisplayName(ItemStack pStack) {
         switch (pStack.getItemDamage())
         {
             case 0:
                 return StatCollector.translateToLocal(TranslationKeys.Items.ItemCopperIngot);
             case 1:
                 return StatCollector.translateToLocal(TranslationKeys.Items.ItemTinIngot);
             case 2:
                 return StatCollector.translateToLocal(TranslationKeys.Items.ItemSilverIngot);
             case 3:
                 return StatCollector.translateToLocal(TranslationKeys.Items.ItemLeadIngot);
         }
        return this.getUnlocalizedName();
    }

    @Override
    public void registerIcons(IIconRegister pRegistrar) {
        for(CustomResource tResource : iResources)
        {
            tResource.addIcon(pRegistrar.registerIcon(tResource.getPrimaryLocation()));
        }
    }

    public void addResource(CustomResource pResource)
    {
        iResources.add(pResource);
    }
}
