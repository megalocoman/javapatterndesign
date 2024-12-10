package com.cfjofre.patterndesign.observer;

// import java.util.ArrayList;
import java.util.Observable;

// public class WeatherData implements Subject {
    public class WeatherData extends Observable {

    // private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData( ) {
        // this.observers = new ArrayList<>();
    }

    // @Override
    // public void registerObserver(Observer o) {
    //     observers.add(o); 
    // }

    // @Override
    // public void removeObserver(Observer o) {
    //     int i = observers.indexOf(o);
    //     if(i >= 0){
    //         observers.remove(i);
    //     }
    // }

    // @Override
    // public void notifyObserver() {
    //     observers.forEach(observerItem -> {
    //         Observer observer = (Observer) observerItem;
    //         observer.update(temperature, humidity, pressure );
    //     });
      
    // }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
    
}
