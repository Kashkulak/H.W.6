package com.company;

public class Main {
    static Boss boss = new Boss();

    public static void main(String[] args) {
        boss.setHealth(200);
        boss.setDamage(70);
        boss.setWeapon("Magic", "Excalibur");
        printInfo();


    }

    public static void printInfo() {
        System.out.println("Boss health: " + boss.getHealth() + "\n" +
                "Boss damage: " + boss.getDamage() + "\n" +
                "Boss weapon: " + boss.getWeapon());
    }
}
