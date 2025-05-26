package com.marrowbuster.ruperTools.commands;

import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WelcomeCommand implements CommandExecutor {
    private final WelcomeConfig wcfg;

    public WelcomeCommand(WelcomeConfig wcfg) {
        this.wcfg = wcfg;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender cs, @NotNull Command c, @NotNull String s, @NotNull String @NotNull [] ss) {
        if (!(cs instanceof Player)) {
            cs.sendMessage(Component.text("Bots can't yet get their own welcome messages.").color(NamedTextColor.RED));
            return false;
        }
        try {
            cs.sendMessage(wcfg.getWelcome().replace("%player_name%", ((Player) cs).getName()));
        } catch (ClassCastException cce) {
            cs.sendMessage(Component.text("A ClassCastException occurred. Weird.").color(NamedTextColor.GOLD));
            return false;
        }
        return true;
    }
}
