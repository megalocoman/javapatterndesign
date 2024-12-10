package com.cfjofre.patterndesign.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    // private Subject weatherData;

    // public CurrentConditionsDisplay(Subject weatherData) {
    public CurrentConditionsDisplay(Observable observable) {
        // this.weatherData = weatherData;
        // weatherData.registerObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
      System.out.println("current conditions: " + temperature + " C and " + humidity +" % humidity.");
    }

    // @Override
    // public void update(float temperature, float humidity, float pressure) {
    //     this.humidity = humidity;
    //     this.temperature = temperature;
    //     display();
    // }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


}
