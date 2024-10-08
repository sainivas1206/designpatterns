package com.decorator;

public class Whip extends CondimentDecorator{


    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.22;
    }

}
