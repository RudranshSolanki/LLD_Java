package Design_Pattern.Observer.Stock.Observer;

import Design_Pattern.Observer.Stock.Observable.StockObservable;

public class PhoneNotificationObserver implements NotificationObserver{
    String phoneNumber;
    StockObservable stockObservable;
    public PhoneNotificationObserver(String phoneNumber,StockObservable stockObservable){
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }
    public void notifyUser(){
        sendSMS(phoneNumber, "Hey Product is in stock hurry up!!!");
    }
    public void sendSMS(String phoneNumber,String msg){
        System.out.println("SMS Sent to: "+phoneNumber);
        System.out.println(msg);
    }
}