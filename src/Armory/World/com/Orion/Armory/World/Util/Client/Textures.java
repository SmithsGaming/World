package com.Orion.Armory.World.Util.Client;


import com.Orion.Armory.Util.Client.CustomResource;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 12:28
 * <p/>
 * Copyrighted according to Project specific license
 */
public class Textures
{
    public static class Materials {


    }

    public static class Items
    {
        public static class ItemRing
        {

        }

        public static class ItemChain
        {

        }

        public static class ItemNugget
        {

        }

        public static class ItemPlate
        {

        }

        public static class CommonIngot{
            private static final String INGOTLOCATION = "armory-world:CommonIngot";
            public static final CustomResource Copper = new CustomResource("World.CommonIngot.Copper", INGOTLOCATION, Colors.Metals.Copper);
            public static final CustomResource Tin = new CustomResource("World.CommonIngot.Tin", INGOTLOCATION, Colors.Metals.Tin);
            public static final CustomResource Silver = new CustomResource("World.CommonIngot.Silver", INGOTLOCATION, Colors.Metals.Silver);
            public static final CustomResource Lead = new CustomResource("World.CommonIngot.Lead", INGOTLOCATION, Colors.Metals.Lead);
        }
    }

    public static class Blocks
    {
        public static class CommonOre{
            private static final String BASELAYER = "armory-world:ore_mineable_layer1";
            private static final String ORELAYER = "armory-world:ore_mineable_layer2";

            public static final CustomResource Base = new CustomResource("World.CommonOre.Base", BASELAYER, 255,255,255);

            public static final CustomResource Copper = new CustomResource("World.CommonOre.Copper", ORELAYER, Colors.Metals.Copper);
            public static final CustomResource Tin = new CustomResource("World.CommonOre.Tin", ORELAYER, Colors.Metals.Tin);
            public static final CustomResource Silver = new CustomResource("World.CommonOre.Silver", ORELAYER, Colors.Metals.Silver);
            public static final CustomResource Lead = new CustomResource("World.CommonOre.Lead", ORELAYER, Colors.Metals.Lead);
        }
    }
}
