package com.Orion.Armory.World.Common.Item.ItemBlock;

import com.Orion.Armory.World.Common.Block.BlockCommonMineable;
import com.Orion.Armory.World.Util.Client.TranslationKeys;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * Created by Marc on 7-6-2015.
 */
public class ItemBlockCommonMineable extends ItemBlock {

    @Override
    public int getMetadata(int pItemStackMeta) {
        return pItemStackMeta;
    }

    public ItemBlockCommonMineable(Block pBlock) {
        super(pBlock);
    }

    @Override
    public String getUnlocalizedName(ItemStack pStack) {
        switch (pStack.getItemDamage())
        {
            case 0:
                return StatCollector.translateToLocal(TranslationKeys.Blocks.BlockCopperOre);
            case 1:
                return StatCollector.translateToLocal(TranslationKeys.Blocks.BlockTinOre);
            case 2:
                return StatCollector.translateToLocal(TranslationKeys.Blocks.BlockSilverOre);
            case 3:
                return StatCollector.translateToLocal(TranslationKeys.Blocks.BlockLeadOre);
        }
        return this.getUnlocalizedName();
    }

    @Override
    public boolean getHasSubtypes() {
        return true;
    }
}
