package com.marrowbuster.ruperTools.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class CustomisableListener implements Listener {
    public void onPlayerJoin(PlayerJoinEvent e) {
        // want to load this from a config...
        e.getPlayer().sendMessage(Component.text(""));
    }
}
