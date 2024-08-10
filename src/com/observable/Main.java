package com.observable;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer obj = new DispalyWeather();
        Observer obj2 = new DisplayTemperature();
        weatherData.registerObserver(obj);

        weatherData.setMeasurements(25.5f, 65.3f, 1012f);
        weatherData.setMeasurements(26.7f, 70.4f, 1015f);
        System.out.println("--------------------------------");
        weatherData.registerObserver(obj2);
        weatherData.setMeasurements(28.2f, 68.9f, 1010f);
    }
}
