package com.oakcentralnetwork.template;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.oakcentralnetwork.template.commands.ExampleCommand;

public class Template extends JavaPlugin {
	
	public final String name = "ExamplePlugin";
	
	public void onEnable() {
		initCommands();
		Bukkit.getServer().getLogger().info(name + " has been enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(name + " has been disabled!");
	}
	
	public void initCommands() {
		getCommand("examplecmd").setExecutor(new ExampleCommand());
	}

}
