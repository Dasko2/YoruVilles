package com.yorucraft.ville.config;

import com.yorucraft.ville.VillePlugin;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;

public class LanguageManager {
    private static YamlConfiguration lang;

    public static void load() {
        File file = new File(VillePlugin.getInstance().getDataFolder(), "fr_FR.yml");
        if (!file.exists()) VillePlugin.getInstance().saveResource("fr_FR.yml", false);
        lang = YamlConfiguration.loadConfiguration(file);
    }

    public static String getMessage(String path) {
        return lang.getString("messages." + path, "&cMessage manquant: " + path);
    }
}
