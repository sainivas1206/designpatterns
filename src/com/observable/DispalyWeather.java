package com.observable;

public class DispalyWeather implements Observer{

    private float temp, humidity, pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void display(){
        System.out.println("DispalyWeather: " + temp + "F degrees, " + humidity + "% humidity, " + pressure + " hPa");
    }

}
