package com.factory;

public class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Cheese pizza :: preparing");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza :: bake");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza :: cut");
    }

    @Override
    public void box() {
        System.out.println("Cheese pizza :: box");
    }

}
