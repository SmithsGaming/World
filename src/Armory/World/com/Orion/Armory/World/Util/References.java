package com.Orion.Armory.World.Util;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:53
 * <p/>
 * Copyrighted according to Project specific license
 */
public class References {

    public class General {
        public static final String MOD_ID = "Armory-World";
        public static final String VERSION = "@VERSION@";
        public static final String MC_VERSION = "@MCVERSION";
    }

    public class InternalNames {
        public class Materials {

            public class Common {
                public static final String Copper = "Common.Copper";
                public static final String Tin = "Common.Tin";
                public static final String Silver = "Common.Silver";
                public static final String Lead = "Common.Lead";
            }
        }
        
        public class Configuration
        {
            public static final String doWorldGen = "DoWorldGen";

            public static final String spawnChanceForCopper = "Copper";
            public static final String spawnChanceForTin = "Tin";
            public static final String spawnChanceForSilver = "Silver";
            public static final String spawnChanceForLead = "Lead";

            public static final String clusterSizeCopper = "Copper";
            public static final String clusterSizeTin = "Tin";
            public static final String clusterSizeSilver = "Silver";
            public static final String clusterSizeLead = "Lead";
        }

        public class Items{
            public static final String CommonIngot = "CommonIngot";
        }

        public class Blocks{
            public static final String CommonBlock = "CommonBlock";
        }
    }
}
