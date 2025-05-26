package com.marrowbuster.ruperTools.configs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public record WelcomeConfig(JavaPlugin jpl) {
    public WelcomeConfig(JavaPlugin jpl) {
        this.jpl = jpl;
        jpl.saveDefaultConfig();
    }

    public String getWelcome() {
        String defaultString = "Looks like you don't have a greeting set!" +
                "Use /setwelcome <greeting> wherein you can use %player_name% as a" +
                "placeholder for your MC username.";
        return jpl.getConfig().getString("greeting", defaultString);
    }

    public void setWelcome(String welcome) {
        FileConfiguration fc = jpl.getConfig();
        fc.set("welcome", welcome);
        jpl.saveConfig();
    }
}
