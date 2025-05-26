package com.marrowbuster.ruperTools.listeners;

import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class CustomisableListener implements Listener {
    private final WelcomeConfig wcfg;
    private final JavaPlugin jpl;

    public CustomisableListener(@NotNull JavaPlugin jpl) {
        this.jpl = jpl;
        this.wcfg = new WelcomeConfig(jpl);
    }

    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().sendMessage(wcfg.getWelcome());
    }

    public JavaPlugin getJpl() {
        return jpl;
    }
}