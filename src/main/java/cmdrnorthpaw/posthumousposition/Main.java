package cmdrnorthpaw.posthumousposition;

import cmdrnorthpaw.posthumousposition.commands.commandLocateDeath;
import cmdrnorthpaw.posthumousposition.commands.commandToggleMsg;
import cmdrnorthpaw.posthumousposition.listeners.deathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new deathListener(), this);
        this.getCommand("toggleDeathMsg").setExecutor(new commandToggleMsg());
        this.getCommand("locateDeath").setExecutor(new commandLocateDeath());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
