package cmdrnorthpaw.posthumousposition.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        int x = event.getEntity().getLocation().getBlockX();
        int y = event.getEntity().getLocation().getBlockY();
        int z = event.getEntity().getLocation().getBlockZ();
        event.getEntity().sendMessage("You died at x:" + x + " y:" + y + " z:"+ z);
    }
}
