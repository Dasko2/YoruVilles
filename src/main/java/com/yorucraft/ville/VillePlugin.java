package com.yorucraft.ville;

import com.yorucraft.ville.config.ConfigLoader;
import com.yorucraft.ville.managers.TownManager;
import com.yorucraft.ville.data.DatabaseManager;
import org.bukkit.plugin.java.JavaPlugin;

public class VillePlugin extends JavaPlugin {
    private static VillePlugin instance;
    private TownManager townManager;
    private DatabaseManager databaseManager;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        
        // Initialisation des composants
        this.databaseManager = new DatabaseManager();
        this.databaseManager.connect();
        
        ConfigLoader.load();
        this.townManager = new TownManager();

        // Enregistrement des commandes et listeners
        // getCommand("ville").setExecutor(new VilleCommand());
        
        getLogger().info("VillePlugin v1.0.0 activé - Architecture chargée.");
    }

    public static VillePlugin getInstance() { return instance; }
    public TownManager getTownManager() { return townManager; }
}
