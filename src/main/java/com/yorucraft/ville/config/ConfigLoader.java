package com.yorucraft.ville.config;

import com.yorucraft.ville.VillePlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigLoader {
    public static int REDSTONE_LIMIT;
    public static int MAX_CLAIMS;
    public static String CLAIM_WORLD;

    public static void load() {
        FileConfiguration config = VillePlugin.getInstance().getConfig();
        REDSTONE_LIMIT = config.getInt("performance.redstone-limit-per-chunk", 50);
        MAX_CLAIMS = config.getInt("settings.default-max-claims", 20);
        CLAIM_WORLD = config.getString("settings.claim-world", "world_survie");
    }
}
