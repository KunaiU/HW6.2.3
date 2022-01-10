package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Boss" , 666, 66);

        Skeleton skeleton2 = new Skeleton("Skeleton 2", 300, 40, 103);
        Skeleton skeleton1 = new Skeleton("Skeleton 1", 400, 50, 100);
        System.out.println("Skeleton 1: " + skeleton1.info());
        System.out.println("Skeleton 2: " + skeleton2.info());
        System.out.println("Boss: " + boss.info());



    }
}
