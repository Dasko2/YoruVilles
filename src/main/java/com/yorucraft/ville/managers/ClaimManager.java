package com.yorucraft.ville.managers;

import com.yorucraft.ville.models.ChunkCoordinate;
import org.bukkit.Chunk;
import java.util.concurrent.ConcurrentHashMap;

public class ClaimManager {
    private final ConcurrentHashMap<ChunkCoordinate, String> claims = new ConcurrentHashMap<>();
    public boolean isClaimed(Chunk chunk) { return claims.containsKey(ChunkCoordinate.from(chunk)); }
}
