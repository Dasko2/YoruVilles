package com.yorucraft.ville.managers;

import com.yorucraft.ville.models.Town;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Optional;

public class TownManager {
    private final Map<String, Town> towns = new ConcurrentHashMap<>();
    public void registerTown(Town town) { towns.put(town.getName().toLowerCase(), town); }
    public Optional<Town> getTown(String name) { return Optional.ofNullable(towns.get(name.toLowerCase())); }
}
