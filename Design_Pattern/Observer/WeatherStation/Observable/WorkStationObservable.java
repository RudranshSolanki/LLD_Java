package Design_Pattern.Observer.WeatherStation.Observable;

import Design_Pattern.Observer.WeatherStation.Observer.DisplayObserver;

public interface WorkStationObservable {

    public void setWeatherData(double temperature, double humidity, double windSpeed);
    public void add(DisplayObserver obj);
    public void remove(DisplayObserver obj);
    public void show();
    public void getData();
} 
