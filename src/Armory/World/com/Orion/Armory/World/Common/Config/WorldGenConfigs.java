package com.Orion.Armory.World.Common.Config;

/**
 * Created by Marc on 6-6-2015.
 */
public class WorldGenConfigs
{

    public static Boolean doWorldGens = true;

    public static class CommonOres
    {
        public static final String SPAWNCHANCECONFIGCATEGORIE = "Spawn chances";
        public static float spawnChanceForCopper = 0.6F;
        public static float spawnChanceForTin = 0.7F;
        public static float spawnChanceForSilver = 0.2F;
        public static float spawnChanceForLead = 0.2F;

        public static final String CLUSTERSIZECONFIGCATEGORIE = "Cluster sizes";
        public static int clusterSizeCopper = 6;
        public static int clusterSizeTin = 4;
        public static int clusterSizeSilver = 4;
        public static int clusterSizeLead = 4;
    }
}
