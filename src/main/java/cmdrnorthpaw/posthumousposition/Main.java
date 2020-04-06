package cmdrnorthpaw.posthumousposition;

import cmdrnorthpaw.posthumousposition.listeners.deathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new deathListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
