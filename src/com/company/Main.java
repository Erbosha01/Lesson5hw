package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfProtection("Kinetic");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getTypeOfProtection());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperAbility());
        }
    }
    public static Hero[] createHeroes() {
        Hero h1 = new Hero(300,25);
        Hero h2 = new Hero(300,25, "Kinetic");
        Hero h3 = new Hero(300,25);
        Hero[] heroes = {h1, h2, h3};
        return heroes;
    }

}
