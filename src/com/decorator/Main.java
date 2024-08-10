package com.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("beverage  "+beverage.getDescription()+"  "+beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println("beverage  "+beverage.getDescription()+"  "+beverage.cost());

        beverage = new Whip(beverage);
        System.out.println("beverage  "+beverage.getDescription()+"  "+beverage.cost());
    }
}
