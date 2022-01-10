package com.company;

public class Skeleton extends Boss{

    public int arrows;
    public Skeleton(String who, int health, int damage,int arrows) {
        super(who, health, damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public String info (){
        return  super.info() + " Arrows: " + getArrows();
    }
}
