package com.yorucraft.ville.data;

import com.yorucraft.ville.VillePlugin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection connection;

    public void connect() {
        try {
            String path = VillePlugin.getInstance().getDataFolder().getPath() + "/database.db";
            this.connection = DriverManager.getConnection("jdbc:sqlite:" + path);
            // Création des tables si inexistantes (villes, membres, claims)
        } catch (SQLException e) {
            VillePlugin.getInstance().getLogger().severe("Erreur BDD: " + e.getMessage());
        }
    }
}
