package me.boops.tnttag.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import me.boops.tnttag.Main;

public class OnPlayerHit implements Listener {
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		
		if( event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
			
			Player winner = (Player) event.getDamager();
			Player sucker = (Player) event.getEntity();
			
			if(winner.getUniqueId().equals(Main.it)) {
				
				winner.getInventory().clear();
				sucker.getInventory().clear();

				for (int i = 0; i<36; i++) {
					sucker.getInventory().setItem(i, new ItemStack(Material.TNT, 64));
				}

				Main.it = sucker.getUniqueId();
				
				sucker.sendMessage("You better run");
				
				
			}
			
		}
		
	}
	
}
