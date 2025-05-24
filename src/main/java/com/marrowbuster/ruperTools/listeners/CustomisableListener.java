package com.marrowbuster.ruperTools.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class CustomisableListener implements Listener {
    public void onPlayerJoin(PlayerJoinEvent e) {
        // want to load this from a config...
        e.getPlayer().sendMessage(Component.text(""));
    }

    public void setJoinMessage(@NotNull CommandSender cs, @NotNull String s) {
        if (!(cs instanceof Player)) {
            cs.sendMessage(Component.text("Bots can't yet get their own greeting messages.").color(NamedTextColor.RED));
        }
    }

    public void getListenerConfig() {

    }
}