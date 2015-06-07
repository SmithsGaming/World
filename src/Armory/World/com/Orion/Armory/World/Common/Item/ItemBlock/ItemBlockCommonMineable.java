package com.Orion.Armory.World.Common.Item.ItemBlock;

import com.Orion.Armory.World.Common.Block.BlockCommonMineable;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IIcon;

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
}
