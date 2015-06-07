package com.Orion.Armory.World.Client.Render;

import com.Orion.Armory.Util.Client.CustomResource;
import com.Orion.Armory.World.Common.Block.BlockCommonMineable;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

/**
 * Created by Marc on 6-6-2015.
 */
public class CommonMineableRenderHandler implements ISimpleBlockRenderingHandler {

    public static final int ID = RenderingRegistry.getNextAvailableRenderId();

    public void renderInventoryBlock(Block pBlock, int pMeta, int pId, RenderBlocks pRenderer) {
        if (pId != ID)
            return;

        if (!(pBlock instanceof BlockCommonMineable))
            return;

        BlockCommonMineable tMineable = (BlockCommonMineable) pBlock;

        for(int tRenderPass = 0; tRenderPass < tMineable.getRenderPassAmount(); tRenderPass++)
        {
            Tessellator tTess = Tessellator.instance;

            CustomResource tResource = getResource(tMineable, pMeta, 0, tRenderPass);

            GL11.glColor3f(tResource.getColor().getColorRedFloat(), tResource.getColor().getColorGreenFloat(), tResource.getColor().getColorBlueFloat());

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            tTess.startDrawingQuads();
            tTess.setNormal(0.0F, -1F, 0.0F);
            pRenderer.renderFaceYNeg(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            tTess.startDrawingQuads();
            tTess.setNormal(0.0F, 1.0F, 0.0F);
            pRenderer.renderFaceYPos(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            tTess.startDrawingQuads();
            tTess.setNormal(0.0F, 0.0F, -1F);
            pRenderer.renderFaceZNeg(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            tTess.startDrawingQuads();
            tTess.setNormal(0.0F, 0.0F, 1.0F);
            pRenderer.renderFaceZPos(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            tTess.startDrawingQuads();
            tTess.setNormal(-1F, 0.0F, 0.0F);
            pRenderer.renderFaceXNeg(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            tTess.startDrawingQuads();
            tTess.setNormal(1.0F, 0.0F, 0.0F);
            pRenderer.renderFaceXPos(pBlock, 0.0D, 0.0D, 0.0D, tResource.getIcon());
            tTess.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);

            GL11.glColor3f(0F, 0F, 0F);
        }
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess pWorld, int pX, int pY, int pZ, Block pBlock, int pId, RenderBlocks pRender) {
        if (pId != ID)
            return false;

        if (!(pBlock instanceof BlockCommonMineable))
            return false;

        BlockCommonMineable tMineable = (BlockCommonMineable) pBlock;

        for(int tRenderPass = 0; tRenderPass < tMineable.getRenderPassAmount(); tRenderPass++)
        {
            CustomResource tResource = getResource(tMineable, pWorld.getBlockMetadata(pX, pY, pZ), 0, tRenderPass);

            GL11.glColor3f(tResource.getColor().getColorRedFloat(), tResource.getColor().getColorGreenFloat(), tResource.getColor().getColorBlueFloat());
            pRender.setOverrideBlockTexture(tResource.getIcon());
            pRender.renderStandardBlock(pBlock, pX, pY, pZ);
            pRender.clearOverrideBlockTexture();
            GL11.glColor3f(1F, 1F, 1F);
        }

        return true;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    @Override
    public int getRenderId() {
        return ID;
    }

    public CustomResource getResource(BlockCommonMineable pBlock, int pMeta, int pSide, int pRenderPass)
    {
        CustomResource tResource = pBlock.getResource(pMeta, pSide, pRenderPass);

        return tResource;
    }
}