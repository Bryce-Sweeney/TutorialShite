package me.CodeConduit.TutorialShite.listeners;

import me.CodeConduit.TutorialShite.Main;
import me.CodeConduit.TutorialShite.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    //Variables
    private Main plugin;

    //Constructor
    public JoinListener(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    //Event Handler
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(Utils.chat("&7[&e&l+&r&7] " + e.getPlayer().getDisplayName()));
    }
}
