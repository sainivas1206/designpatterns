package com.observable;

public class DispalyWeather implements Observer{

    private float temp;
    private float humidity;
    private float pressure;

    // private Subject weatherData;
    public DispalyWeather() {
        // this.weatherData = weatherData;
        // weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


    public void display() {
        System.out.println("Current conditions: " + temp + "°C, " + humidity + "%, " + pressure + " hPa");
    }

}
