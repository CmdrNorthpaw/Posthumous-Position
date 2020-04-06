package cmdrnorthpaw.posthumousposition.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import cmdrnorthpaw.posthumousposition.commands.commandToggleMsg;
import java.util.HashMap;
import java.util.Map;

public class deathListener implements Listener {
    public static Map<String, String> playerDeaths = new HashMap<>();

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        int x = event.getEntity().getLocation().getBlockX();
        int y = event.getEntity().getLocation().getBlockY();
        int z = event.getEntity().getLocation().getBlockZ();
        String deathMsg = "You died at x:" + x + " y:" + y + " z:" + z;
        playerDeaths.put(event.getEntity().getName(), deathMsg);
        if (!commandToggleMsg.noMsgSet.contains(event.getEntity().getName())) {
            event.getEntity().sendMessage(deathMsg);
        }
    }
}
