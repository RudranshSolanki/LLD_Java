# Weather Station Design Pattern Question


```java
class WeatherStation {
    double temperature;
    double humidity;
    double windSpeed;

    void setWeatherData(double temperature, 
                        double humidity, 
                        double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;

        // manually calling everyone 💥
        PhoneDisplay phone = new PhoneDisplay();
        phone.show(temperature, humidity, windSpeed);

        TVDisplay tv = new TVDisplay();
        tv.show(temperature, humidity, windSpeed);

        WebDashboard web = new WebDashboard();
        web.show(temperature, humidity, windSpeed);

        WeatherLogger logger = new WeatherLogger();
        logger.log(temperature, humidity, windSpeed);
    }
}

class PhoneDisplay {
    void show(double temperature, double humidity, double windSpeed) {
        System.out.println("[Phone] Temp: " + temperature + 
                           " Humidity: " + humidity + 
                           " Wind: " + windSpeed);
    }
}

class TVDisplay {
    void show(double temperature, double humidity, double windSpeed) {
        System.out.println("[TV] Temp: " + temperature + 
                           " Humidity: " + humidity + 
                           " Wind: " + windSpeed);
    }
}

class WebDashboard {
    void show(double temperature, double humidity, double windSpeed) {
        System.out.println("[Web] Temp: " + temperature + 
                           " Humidity: " + humidity + 
                           " Wind: " + windSpeed);
    }
}

class WeatherLogger {
    void log(double temperature, double humidity, double windSpeed) {
        System.out.println("[Log] Recording weather data...");
    }
}
```