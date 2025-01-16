package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    // Constructor
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    // Abstract method for attack (to be implemented in subclasses)
    public abstract double attack();
}
