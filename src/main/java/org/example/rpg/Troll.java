package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    // Constructor
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // Implement bleed method
    @Override
    public double bleed() {
        return getDamage() * 0.25; // 25% of base damage as bleed
    }

    // Implement poison method
    @Override
    public double poison() {
        return getDamage() * 0.3; // 30% of base damage as poison
    }

    // Implement attack method (damage + bleed + poison)
    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
