package me.malverngroup.Test;

import java.util.logging.Logger;

import me.malverngroup.Test.Test;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Test plugin;
	public static String args2;

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("msg"))
		{
			if(sender instanceof Player)
			{
				if(args.length == 0)
				{	
					player.sendMessage(ChatColor.GREEN + "Type /msg <name> <message>");
				}
				else
				{
			
					args2 = args[1];
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.sendMessage(ChatColor.GREEN + "[" + player.getDisplayName() + "]" + " ---> " + args2);
					
				}
			}
			else
			{
				player.sendMessage(ChatColor.RED + "Sorry you needs to be player!");
			}
		}
		return false;
	}
	
}