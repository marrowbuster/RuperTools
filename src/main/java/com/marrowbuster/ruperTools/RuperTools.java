package com.marrowbuster.ruperTools;

import com.marrowbuster.ruperTools.listeners.CustomisableListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RuperTools extends JavaPlugin {

    private static RuperTools inst;

    @Override
    public void onEnable() {
        inst = this;
    }

    @Override
    public void onDisable() {
        inst = null;
    }

    public static RuperTools getInstance() {
        return inst;
    }
}
