package com.yorucraft.ville.models;

import java.util.UUID;
import java.util.Map;
import java.util.HashMap;

public class Town {
    private final String name;
    private UUID owner;
    private double balance;
    private final Map<UUID, String> members; // UUID -> Rôle

    public Town(String name, UUID owner) {
        this.name = name;
        this.owner = owner;
        this.balance = 0.0;
        this.members = new HashMap<>();
    }

    public void addMember(UUID uuid, String role) { members.put(uuid, role); }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
