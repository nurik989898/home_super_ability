package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.applySuperAbility("okoldovat");
        magic.setTypeSuperPower("okoldovat");
        magic.setHealth(100);
        magic.setDamage(15);
        Medic medic = new Medic();
        medic.applySuperAbility("lechit");
        Warrior warrior = new Warrior();
        warrior.applySuperAbility("udarit");

    }
}
