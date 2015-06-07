package com.Orion.Armory.World.Common.Item;

import com.Orion.Armory.Util.Client.CustomResource;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc on 7-6-2015.
 */
public class ItemCommonIngot extends Item {

    private ArrayList<CustomResource> iResources = new ArrayList<CustomResource>();

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
