package com.marrowbuster.ruperTools.listeners;

import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class CustomisableListener implements Listener {
    private final JavaPlugin jpl;
    public CustomisableListener(JavaPlugin jpl) {
        this.jpl = jpl;
    }
    public void onPlayerJoin(PlayerJoinEvent e) {
        // TODO: Have this load from somewhere other than wcfg
        // e.getPlayer().sendMessage(wcfg.getWelcome());
    }
}