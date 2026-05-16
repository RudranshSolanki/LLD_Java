package Design_Pattern.Observer.Stock.Observer;

import Design_Pattern.Observer.Stock.Observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver {

    String emailId;
    StockObservable stockObservable;
    public EmailNotificationObserver(String email,StockObservable so){
        this.emailId = email;
        this.stockObservable = so;
    }
    public void notifyUser(){
        sendMail(emailId,"Hey product is in stock hurry up!!!!");
    }

    public void sendMail(String emailId,String msg){
        System.out.println("Email sent to: "+emailId );
        System.out.println(msg);
    }
}
