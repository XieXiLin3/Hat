package cn.xiexilin.top.hat.hat;

import cn.xiexilin.top.hat.hat.commands.HatCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hat").setExecutor(new HatCommand());
        getLogger().info("Hat Plugin Enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Hat Plugin Disabled");
    }
}
