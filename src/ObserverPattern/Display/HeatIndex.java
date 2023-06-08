package src.ObserverPattern.Display;

import src.ObserverPattern.Oberver.Observer;
import src.ObserverPattern.Subject.Subject;

public class HeatIndex implements Observer, DisplayElement {

    private float heatIndex;
    private Subject weatherData;


    public HeatIndex(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat Index: " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.heatIndex = temp * humidity;
        display();
    }
}
