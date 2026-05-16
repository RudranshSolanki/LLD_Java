package Design_Pattern.Observer.WeatherStation.Observer;

import Design_Pattern.Observer.WeatherStation.Observable.WorkStationObservable;

public class WebDashboardObserver implements DisplayObserver {
    WorkStationObservable wo;
    public WebDashboardObserver(WorkStationObservable wo){
        this.wo = wo;
        wo.add(this);
    }

    public void show(double temperature,double humidity,double windSpeed){
        System.out.println("[Web] Temp: " + temperature + 
                           " Humidity: " + humidity + 
                           " Wind: " + windSpeed);
    }
}
