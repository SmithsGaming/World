package com.Orion.Armory.World.Common.Config;

import com.Orion.Armory.World.Util.References;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Marc on 6-6-2015.
 */
public class ConfigurationHandler
{

    private static final String GLOBALCATEGORIE = "Global";
    private static Configuration iConfig;

    public static void init(File pConfigFile) {
        if (iConfig == null) {
            iConfig = new Configuration(pConfigFile, true);
            loadWorldGenConfiguration();
        }
    }

    private static void loadWorldGenConfiguration()
    {
        WorldGenConfigs.doWorldGens = iConfig.getBoolean(References.InternalNames.Configuration.doWorldGen, GLOBALCATEGORIE, WorldGenConfigs.doWorldGens, "If enabled spawns common ores in your worlds.");
        
        WorldGenConfigs.CommonOres.clusterSizeCopper = iConfig.getInt(References.InternalNames.Configuration.clusterSizeCopper, WorldGenConfigs.CommonOres.CLUSTERSIZECONFIGCATEGORIE, WorldGenConfigs.CommonOres.clusterSizeCopper, 4, 8, "Determines the maximum amount of ores in one chunk for Copper");
        WorldGenConfigs.CommonOres.clusterSizeTin = iConfig.getInt(References.InternalNames.Configuration.clusterSizeTin, WorldGenConfigs.CommonOres.CLUSTERSIZECONFIGCATEGORIE, WorldGenConfigs.CommonOres.clusterSizeTin, 2, 6, "Determines the maximum amount of ores in one chunk for Tin");
        WorldGenConfigs.CommonOres.clusterSizeSilver = iConfig.getInt(References.InternalNames.Configuration.clusterSizeSilver, WorldGenConfigs.CommonOres.CLUSTERSIZECONFIGCATEGORIE, WorldGenConfigs.CommonOres.clusterSizeSilver, 2, 6, "Determines the maximum amount of ores in one chunk for Silver");
        WorldGenConfigs.CommonOres.clusterSizeLead = iConfig.getInt(References.InternalNames.Configuration.clusterSizeLead, WorldGenConfigs.CommonOres.CLUSTERSIZECONFIGCATEGORIE, WorldGenConfigs.CommonOres.clusterSizeLead, 2, 6, "Determines the maximum amount of ores in one chunk for Lead");

        WorldGenConfigs.CommonOres.spawnChanceForCopper = iConfig.getFloat(References.InternalNames.Configuration.spawnChanceForCopper, WorldGenConfigs.CommonOres.SPAWNCHANCECONFIGCATEGORIE, WorldGenConfigs.CommonOres.spawnChanceForCopper, 0F, 4F, "A value that determines the chance between 0 and 4 of the amount of orechunks of Copper per chunk.");
        WorldGenConfigs.CommonOres.spawnChanceForTin = iConfig.getFloat(References.InternalNames.Configuration.spawnChanceForTin, WorldGenConfigs.CommonOres.SPAWNCHANCECONFIGCATEGORIE, WorldGenConfigs.CommonOres.spawnChanceForTin, 0F, 4F, "A value that determines the chance between 0 and 4 of the amount of orechunks of Tin per chunk.");
        WorldGenConfigs.CommonOres.spawnChanceForSilver = iConfig.getFloat(References.InternalNames.Configuration.spawnChanceForSilver, WorldGenConfigs.CommonOres.SPAWNCHANCECONFIGCATEGORIE, WorldGenConfigs.CommonOres.spawnChanceForSilver, 0F, 4F, "A value that determines the chance between 0 and 4 of the amount of orechunks of Silver per chunk.");
        WorldGenConfigs.CommonOres.spawnChanceForLead = iConfig.getFloat(References.InternalNames.Configuration.spawnChanceForLead, WorldGenConfigs.CommonOres.SPAWNCHANCECONFIGCATEGORIE, WorldGenConfigs.CommonOres.spawnChanceForLead, 0F, 4F, "A value that determines the chance between 0 and 4 of the amount of orechunks of Lead per chunk.");

        if (iConfig.hasChanged())
        {
            iConfig.save();
        }
    }
}
