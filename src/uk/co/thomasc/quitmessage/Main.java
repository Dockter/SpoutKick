package uk.co.thomasc.quitmessage;

import org.getspout.spoutapi.event.spout.SpoutcraftFailedEvent;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onSpoutCraftFail(SpoutcraftFailedEvent event) {
		Bukkit.broadcastMessage(event.getPlayer().getDisplayName() + " was kicked from the server because they were not running Spoutcraft");
	}
	
}