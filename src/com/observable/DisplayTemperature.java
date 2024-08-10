package com.observable;

public class DisplayTemperature implements Observer{

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Temperature "+temp);
    }

}
