package com.Orion.Armory.World;

import com.Orion.Armory.World.Common.CommonProxy;
import com.Orion.Armory.World.Common.Config.ConfigurationHandler;
import com.Orion.Armory.World.Util.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:52
 * <p/>
 * Copyrighted according to Project specific license
 */
@Mod(modid = References.General.MOD_ID, name = "Armory-World", version = References.General.VERSION,
        dependencies = "required-after:Forge@[10.13,);required-after:Armory@[1.1,)")
public class World
{
    // Instance of this mod use for internal and Forge references
    @Mod.Instance(References.General.MOD_ID)
    public static World instance;

    // Proxies used to register stuff client and server side.
    @SidedProxy(clientSide="com.Orion.Armory.World.Client.ClientProxy", serverSide="com.Orion.Armory.World.Common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        proxy.preInit();
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.init();
    }
}
