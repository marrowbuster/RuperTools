package com.marrowbuster.ruperTools;

import com.marrowbuster.ruperTools.commands.SetWelcomeCommand;
import com.marrowbuster.ruperTools.listeners.CustomisableListener;
import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import com.marrowbuster.ruperTools.commands.WelcomeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class RuperTools extends JavaPlugin {

    private static RuperTools inst;
    private WelcomeConfig wcfg;
    private static CustomisableListener cl;

    @Override
    public void onEnable() {
        inst = this;
        wcfg = new WelcomeConfig(this);
        Bukkit.getPluginManager().registerEvents(cl = new CustomisableListener(this), this);
        Objects.requireNonNull(this.getCommand("welcome")).setExecutor(new WelcomeCommand(wcfg = new WelcomeConfig(this)));
        Objects.requireNonNull(this.getCommand("setwelcome")).setExecutor(new SetWelcomeCommand(wcfg));
    }

    @Override
    public void onDisable() {
        wcfg = null;
        inst = null;
        this.saveConfig();
    }

    public static RuperTools getInstance() {
        return inst;
    }

    public static CustomisableListener getListener() {
        return cl;
    }
}
