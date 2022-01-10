package com.company;

public class GameEntity {
    private int health;
    private int damage;

    public GameEntity (String who, int health, int damage){

        this.health = health;
        this.damage = damage;


    }

    public GameEntity(String boss) {

    }

    public String info (){
        return "Damage: " + getDamage() + " Health: " + getHealth();
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String setWeapons(){
        return "Weapon type: " + WeaponTypeEnum.values() ;

    }
}
