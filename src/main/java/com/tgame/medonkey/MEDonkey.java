package com.tgame.medonkey;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author tgame14
 * @since 12/08/2014
 */
@Mod(modid = Settings.ID, name = Settings.NAME, version = Settings.VERSION/*, dependencies = "required-after:appliedenergistics"*/)
public class MEDonkey
{
	@Mod.Instance(Settings.ID)
	public static MEDonkey INSTANCE;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
