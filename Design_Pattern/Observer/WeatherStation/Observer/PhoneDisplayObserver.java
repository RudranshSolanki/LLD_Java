package Design_Pattern.Observer.WeatherStation.Observer;

import Design_Pattern.Observer.WeatherStation.Observable.WorkStationObservable;

public class PhoneDisplayObserver implements DisplayObserver {
    WorkStationObservable wo;
    public PhoneDisplayObserver(WorkStationObservable wo){
        this.wo = wo;
        wo.add(this);
    }

    public void show(double temperature,double humidity,double windSpeed){
        System.out.println("[Phone] Temp: " + temperature + 
                           " Humidity: " + humidity + 
                           " Wind: " + windSpeed);
    }
}
