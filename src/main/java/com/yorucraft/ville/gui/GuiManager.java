package com.yorucraft.ville.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class GuiManager {
    public static Inventory createGui(String title, int size) {
        return Bukkit.createInventory(null, size, title);
    }
}
