package com.cronjoe.modtest.configuration;

import com.cronjoe.modtest.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration config = new Configuration(configFile);
        LogHelper.info("Start reading config");
        try
        {
            // Load config file
            config.load();

            // Read properties from config file
            boolean configValue = config.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            LogHelper.error("Something went wrong: " + e.getMessage());
        }
        finally
        {
            LogHelper.info("Saving config");
            // Save config
            config.save();
        }
    }
}
