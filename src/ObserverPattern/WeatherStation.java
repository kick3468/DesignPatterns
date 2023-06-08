package src.ObserverPattern;

import src.ObserverPattern.Display.CurrentConditionDisplay;
import src.ObserverPattern.Display.HeatIndex;
import src.ObserverPattern.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //observer creation, any new observer will register with subject
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndex heatIndex = new HeatIndex(weatherData);

        // any change in weather will result automatic notification of observers
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.3f);
    }
}
