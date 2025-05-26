package com.marrowbuster.ruperTools.commands;

import com.marrowbuster.ruperTools.configs.WelcomeConfig;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class SetWelcomeCommand implements CommandExecutor {
    private final WelcomeConfig wcfg;

    public SetWelcomeCommand(WelcomeConfig wcfg) {
        this.wcfg = wcfg;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender cs, @NotNull Command c, @NotNull String s, @NotNull String @NotNull [] ss) {
        if (ss.length == 0) {
            cs.sendMessage("Usage: /setgreeting <message>");
            return false;
        }

        wcfg.setWelcome(String.join(" ", ss));
        cs.sendMessage("New welcome: \"" + wcfg.getWelcome() + "\"");
        return true;
    }
}
