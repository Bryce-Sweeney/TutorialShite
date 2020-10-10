package me.CodeConduit.TutorialShite;

import me.CodeConduit.TutorialShite.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    //Enables when the plugin is started.
    public void onEnable() {
        new JoinListener(this);
    }
}
