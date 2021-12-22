package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("WArrior used superpower " + superAbilityType);
    }
}
