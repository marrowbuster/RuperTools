package com.marrowbuster.ruperTools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WelcomeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender cs, @NotNull Command c, @NotNull String s, @NotNull String @NotNull [] ss) {
        if (!(cs instanceof Player)) {
            cs.sendMessage();
        }
        return true;
    }
}
