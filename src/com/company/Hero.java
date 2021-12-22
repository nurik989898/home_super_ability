package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeSuperPower;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuperPower() {
        return typeSuperPower;
    }

    public void setTypeSuperPower(String typeSuperPower) {
        this.typeSuperPower = typeSuperPower;
    }
}