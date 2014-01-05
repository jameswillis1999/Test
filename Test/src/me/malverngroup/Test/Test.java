package me.malverngroup.Test;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Test plugin;
	public static String args1;
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +" Has Been Enabled!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("helloworld"))
		{
			if(args.length == 0)
			{
				player.sendMessage(ChatColor.GREEN + "Hello World!");
			}
			else if (args.length == 1)
			{
				args1 = args[0];
				player.sendMessage(ChatColor.RED + args1 + ChatColor.GREEN + " Hello Der!");
			}
			else
			{
				player.sendMessage(ChatColor.RED + "Too many Arguments!");
			}
		}
		return false;
	}
}
