package com.Orion.Armory.World.Common.WorldGen;

import com.Orion.Armory.World.Common.Config.WorldGenConfigs;
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
    int iMeta;

    int iMaxY;
    int iMinY;
    int iTriesPerChunk;

    public WorldGenCommonOre(Block pBlockToGen, int pMeta, int pBlocksPerCluster)
    {
        this(pBlockToGen, pMeta, pBlocksPerCluster,0, -1);
    }

    public WorldGenCommonOre(Block pBlockToGen, int pMeta, int pBlocksPerCluster, int pMinY, int pMaxY)
    {
        this(pBlockToGen, pMeta, pBlocksPerCluster, pMinY, pMaxY, 4);
    }

    public WorldGenCommonOre(Block pBlockToGen, int pMeta, int pBlocksPerCluster, int pMinY, int pMaxY, int pTriesPerChunk)
    {
        iMinable = new WorldGenMinable(pBlockToGen, pMeta, pBlocksPerCluster, Blocks.stone);
        iMeta = pMeta;
        iMaxY = pMaxY;
        iMinY = pMinY;
        iTriesPerChunk = pTriesPerChunk;
    }


    @Override
    public void generate(Random pRandom, int pChunkX, int pChunkZ, World pWorld, IChunkProvider pChunkGen, IChunkProvider pChunkProv) {
        if (!WorldGenConfigs.doWorldGens)
            return;

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
            Random tR = new Random();
            float tChance = tR.nextFloat() * 4F;

            switch (iMeta)
            {
                case 0:
                    if (tChance > WorldGenConfigs.CommonOres.spawnChanceForCopper)
                        return;
                case 1:
                    if (tChance > WorldGenConfigs.CommonOres.spawnChanceForTin)
                        return;
                case 2:
                    if (tChance > WorldGenConfigs.CommonOres.spawnChanceForSilver)
                        return;
                case 3:
                    if (tChance > WorldGenConfigs.CommonOres.spawnChanceForLead)
                        return;
            }

            int tX = (pChunkX * 16) + tR.nextInt(16);
            int tY = tLocalMinY + tR.nextInt(tLocalMaxY - tLocalMinY + 1);
            int tZ = (pChunkZ * 16) + tR.nextInt(16);

            iMinable.generate(pWorld, tR, tX ,tY, tZ);
        }
    }
}
