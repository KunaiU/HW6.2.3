package com.company;

public enum WeaponEnum {
    GUN("Gun"), SWORD("Sword"), HALBERD("Halberd"), KNIFE("Knife"), SHURIKEN("Shuriken"),
    THROWING_AXE("Throwing axe"), RIFFLE("Riffle");
    WeaponEnum(){}
    public String weapon;
    WeaponEnum (String weapon){
        this.weapon = weapon;
    }



    public String getWeapon() {
        return weapon;
    }
}
