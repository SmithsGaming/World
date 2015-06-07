package com.Orion.Armory.World.Common.WorldGen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by Marc on 6-6-2015.
 */
public class WorldGenCommonOre implements IWorldGenerator
{
    WorldGenMinable iMinable;

    int iMaxY;
    int iMinY;
    int iTriesPerChunk;

    public WorldGenCommonOre(Block pBlockToGen, int pBlocksPerCluster)
    {
        this(pBlockToGen, pBlocksPerCluster,0, -1);
    }

    public WorldGenCommonOre(Block pBlockToGen, int pBlocksPerCluster, int pMinY, int pMaxY)
    {
        this(pBlockToGen, pBlocksPerCluster, pMinY, pMaxY, 4);
    }

    public WorldGenCommonOre(Block pBlockToGen, int pBlocksPerCluster, int pMinY, int pMaxY, int pTriesPerChunk)
    {
        iMinable = new WorldGenMinable(pBlockToGen, pBlocksPerCluster, Blocks.stone);
        iMaxY = pMaxY;
        iMinY = pMinY;
        iTriesPerChunk = pTriesPerChunk;
    }


    @Override
    public void generate(Random pRandom, int pChunkX, int pChunkZ, World pWorld, IChunkProvider pChunkGen, IChunkProvider pChunkProv) {
        int tLocalMaxY = iMaxY;
        int tLocalMinY = iMinY;

        if (iMaxY == -1)
        {
            tLocalMaxY = pWorld.provider.getAverageGroundLevel() + 1;
        }

        if (tLocalMaxY < tLocalMinY)
        {
            return;
        }

        for (int tSpawnAttempt = 0; tSpawnAttempt < iTriesPerChunk; tSpawnAttempt ++)
        {

        }

    }
}
