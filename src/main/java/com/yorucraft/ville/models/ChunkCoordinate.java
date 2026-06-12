package com.yorucraft.ville.models;

import org.bukkit.Chunk;

public record ChunkCoordinate(String world, int x, int z) {
    public static ChunkCoordinate from(Chunk chunk) {
        return new ChunkCoordinate(chunk.getWorld().getName(), chunk.getX(), chunk.getZ());
    }
}
