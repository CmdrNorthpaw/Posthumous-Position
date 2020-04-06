package cmdrnorthpaw.posthumousposition.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class commandToggleMsg implements CommandExecutor {
    public static Set<String> noMsgSet = new HashSet<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!noMsgSet.contains(player.getName())) {
                noMsgSet.add(player.getName());
                player.sendMessage(ChatColor.RED + "You have disabled death messages");
                return true;
            }
            else {
                noMsgSet.remove(player.getName());
                player.sendMessage(ChatColor.GREEN + "Death messages have been enabled");
                return true;
            }


        }

        return false;
    }
}
