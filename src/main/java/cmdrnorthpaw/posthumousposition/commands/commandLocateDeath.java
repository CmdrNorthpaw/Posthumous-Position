package cmdrnorthpaw.posthumousposition.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static cmdrnorthpaw.posthumousposition.listeners.deathListener.playerDeaths;

public class commandLocateDeath implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (playerDeaths.containsKey(player.getName())) {
                player.sendMessage(playerDeaths.get(player.getName()));
            }
            else {
                player.sendMessage(ChatColor.RED + "You haven't died yet on this server");
            }
            return true;
        }
        else {
            sender.sendMessage("This command must be run as a player!");
            return true;
        }
    }
}
