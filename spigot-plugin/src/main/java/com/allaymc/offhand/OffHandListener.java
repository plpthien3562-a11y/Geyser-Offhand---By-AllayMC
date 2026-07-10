package com.allaymc.offhand;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class OffHandListener implements Listener {
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack offHandItem = player.getInventory().getItemInOffHand();
        
        if (offHandItem != null && !offHandItem.getType().isAir()) {
            // Handle offhand item interaction
            player.sendMessage("§aOffhand item: " + offHandItem.getType());
        }
    }
}
