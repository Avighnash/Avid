package com.avighnash.cmdsystem;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by avigh on 8/19/2016.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Command(name = "hello",
            aliases = "",
            desc = "Test",
            isPlayerOnly = false,
            noPermission = "yo",
            usage = "/bleh")
    public void set(CommandSender sender, Command command, String[] args) {
        sender.sendMessage("Hello!");
    }

}
