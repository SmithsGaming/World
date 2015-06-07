package com.Orion.Armory.World.Common.Block;

import com.Orion.Armory.Util.Client.CustomResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import sun.dc.pr.PRError;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Marc on 6-6-2015.
 */
public class BlockCommonMineable extends Block {

    private HashMap<String, CustomResource> iResources = new HashMap<String, CustomResource>();
    
    public BlockCommonMineable() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public void getSubBlocks (Item pItem, CreativeTabs pTab, List pList) {
        pList.add(new ItemStack(pItem, 1, 0));
        pList.add(new ItemStack(pItem, 1, 1));
        pList.add(new ItemStack(pItem, 1, 2));
        pList.add(new ItemStack(pItem, 1, 3));
    }

    @Override
    public void registerBlockIcons(IIconRegister pRegistrar) {
        for(CustomResource tResource : iResources.values())
        {
            tResource.addIcon(pRegistrar.registerIcon(tResource.getPrimaryLocation()));
        }
    }

    @Override
    public int damageDropped (int metaData) {
        return metaData;
    }

    @Override
    public String getLocalizedName() {
        return super.getLocalizedName();
    }

    @Override
    public IIcon getIcon(int pSide, int pMeta) {
        return getResource(pMeta, 0, 0).getIcon();
    }

    public CustomResource getResource(int pMeta, int pSide, int pRenderPass)
    {
        if (!iResources.containsKey(pMeta + "-" + pSide + "-" + pRenderPass))
            return null;

        return iResources.get(pMeta + "-" + pSide + "-" + pRenderPass);
    }

    public void registerResource(int pMeta, int pSide, int pRenderPass, CustomResource pResource)
    {
        iResources.put(pMeta + "-" + pSide + "-" + pRenderPass, pResource);
    }
}
