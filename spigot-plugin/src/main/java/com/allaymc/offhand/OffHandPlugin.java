package com.allaymc.offhand;

import org.bukkit.plugin.java.JavaPlugin;

public class OffHandPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("AllayMC OffHand Plugin enabled!");
        
        // Register event listener
        getServer().getPluginManager().registerEvents(new OffHandListener(), this);
        
        getLogger().info("OffHand event listener registered!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("AllayMC OffHand Plugin disabled!");
    }
}
