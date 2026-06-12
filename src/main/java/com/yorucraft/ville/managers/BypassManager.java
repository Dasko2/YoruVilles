package com.yorucraft.ville.managers;

import org.bukkit.entity.Player;
import java.util.*;

public class BypassManager {
    private final Set<UUID> bypass = new HashSet<>();
    public boolean isBypassing(Player p) { return bypass.contains(p.getUniqueId()) || p.hasPermission("ville.admin"); }
}
