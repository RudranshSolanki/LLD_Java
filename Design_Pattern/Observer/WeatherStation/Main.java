package Design_Pattern.Observer.WeatherStation;

import Design_Pattern.Observer.WeatherStation.Observable.WeatherObservable;
import Design_Pattern.Observer.WeatherStation.Observable.WorkStationObservable;
import Design_Pattern.Observer.WeatherStation.Observer.DisplayObserver;
import Design_Pattern.Observer.WeatherStation.Observer.PhoneDisplayObserver;
import Design_Pattern.Observer.WeatherStation.Observer.TVDisplayObserver;
import Design_Pattern.Observer.WeatherStation.Observer.WebDashboardObserver;

public class Main {
    public static void main(String args[]){
        WorkStationObservable workStationObj = new WeatherObservable();
        new PhoneDisplayObserver(workStationObj);
        new PhoneDisplayObserver(workStationObj);
        new WebDashboardObserver(workStationObj);
        new TVDisplayObserver(workStationObj);
        new TVDisplayObserver(workStationObj);

        

        workStationObj.setWeatherData(33, 55, 30);

    }
}
