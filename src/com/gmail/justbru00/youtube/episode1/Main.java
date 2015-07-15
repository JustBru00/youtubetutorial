package com.gmail.justbru00.youtube.episode1;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	ConsoleCommandSender console = getServer().getConsoleSender();
	PluginDescriptionFile pluginYML;

	@Override
	public boolean onCommand(CommandSender sender, Command command,	String label, String[] args) {

		if (command.getName().equalsIgnoreCase("hello")) {
			 sender.sendMessage("Hello!");
			 return true;
		} else if (command.getName().equalsIgnoreCase("hello2")) {
			if (sender instanceof Player) {
				 Player p = (Player) sender;
				 
				 p.sendMessage("Hello There!");
			} else {
				sender.sendMessage("Sorry you can't use that command.");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void onDisable() {
		console.sendMessage(color("&c" + pluginYML.getName() + " Version: " + pluginYML.getVersion() + " has been DISABLED!"));
	}

	@Override
	public void onEnable() {
		
	pluginYML = getDescription();
	
	console.sendMessage(color("&a" + pluginYML.getName() + " Version: " + pluginYML.getVersion() + " has been ENABLED!"));
	
	}

	public String color(String uncolored){
		return ChatColor.translateAlternateColorCodes('&', uncolored);
	}
	
	
	
	
	
	
	
	
	
}
