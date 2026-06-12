package com.yorucraft.ville.listeners;

import com.yorucraft.ville.managers.ClaimManager;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockBreakEvent;

public class ProtectionListener implements Listener {
    private final ClaimManager claimManager;
    public ProtectionListener(ClaimManager cm) { this.claimManager = cm; }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if (claimManager.isClaimed(e.getBlock().getChunk())) {}
    }
}
