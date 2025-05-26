package com.marrowbuster.ruperTools;

import com.marrowbuster.ruperTools.listeners.CustomisableListener;
import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import com.marrowbuster.ruperTools.commands.WelcomeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RuperTools extends JavaPlugin {

    private static RuperTools inst;
    private static WelcomeConfig wcfg;

    @Override
    public void onEnable() {
        wcfg = new WelcomeConfig(this);
        saveDefaultConfig();
        inst = this;
    }

    @Override
    public void onDisable() {
        wcfg = null;
        inst = null;
    }

    public static RuperTools getInstance() {
        return inst;
    }
}
