package me.boops.tnttag;

import org.bukkit.plugin.java.JavaPlugin;

import me.boops.tnttag.events.OnPlayerJoin;
import me.boops.tnttag.logger.Logger;

public class Main extends JavaPlugin {
	
	// Define the logger
	Logger log = new Logger();
	
	// Define the plugin
	public static Main plugin;
	
	// On start
	@Override
	public void onEnable(){
		
		// I am the plugin
		plugin = this;
		
		// Say hello
		log.Log("Hello Admin!");

		// Register commands

		// Register Events
		this.getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
	}
}
