package Design_Pattern.Observer.WeatherStation.Observable;
import java.util.*;
import Design_Pattern.Observer.WeatherStation.Observer.DisplayObserver;
public class WeatherObservable implements WorkStationObservable{
    List<DisplayObserver> displayObs = new ArrayList<>();
    double temperature;
    double humidity;
    double windSpeed;
    public void add(DisplayObserver displayObserver)
    {
        displayObs.add(displayObserver);
    }
    public void remove(DisplayObserver displayObserver){
        displayObs.remove(displayObserver);
    }
    public void show(){
        for(DisplayObserver obj : displayObs){
            obj.show(this.temperature,this.humidity,this.windSpeed);
        }
    }
    public void getData(){
        // additional info
    }
    public void setWeatherData(double temp,double humidity,double windSpeed){
        if(this.temperature != temp || this.humidity != humidity || this.windSpeed != windSpeed){
            this.temperature = temp;
            this.humidity = humidity;
            this.windSpeed = windSpeed;
            show();
        }
    }
}
