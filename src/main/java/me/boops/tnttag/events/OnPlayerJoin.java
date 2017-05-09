package me.boops.tnttag.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.boops.tnttag.Main;

public class OnPlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		
		Inventory inv = player.getInventory();

		inv.clear();
		for (int i = 0; i<36; i++) {
			inv.setItem(i, new ItemStack(Material.TNT, 64));
		}

		//Dev code
		if(player.getDisplayName().toLowerCase().toString().equals("sir_boops")){
			Main.it = player.getUniqueId();
		}
		
	}
	
}
