package com.strategy;

public class Main {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyWithWings());
        model.performFly();
    }
}
