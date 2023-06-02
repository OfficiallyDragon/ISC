package dev.dragongames.increasedsmpcore;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class ISC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("ISC Has started!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info("ISC Has stopped.");

    }
}
