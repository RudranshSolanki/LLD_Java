package Design_Pattern.Observer.Stock;

import Design_Pattern.Observer.Stock.Observable.IphoneObservable;
import Design_Pattern.Observer.Stock.Observable.StockObservable;
import Design_Pattern.Observer.Stock.Observer.EmailNotificationObserver;
import Design_Pattern.Observer.Stock.Observer.NotificationObserver;
import Design_Pattern.Observer.Stock.Observer.PhoneNotificationObserver;

public class Main {
    public static void main(String args[]){
        StockObservable iphone = new IphoneObservable(); // This is Observable meaning object that will be ovserver and accordingly call to Observer class to notify
        NotificationObserver user1 = new EmailNotificationObserver("singhshashi126@gmail.com", iphone); // Observer class with parameter to notify user with object of Observable so Notification Observer will know what it is Observing
        NotificationObserver user2 = new EmailNotificationObserver("rudransh.solanki@extramarks.com", iphone);
        NotificationObserver user3 = new PhoneNotificationObserver("8303410063", iphone);

        iphone.add(user1); // add observer to Observable list meaning these user will get notification 
        iphone.add(user2);
        iphone.add(user3);
        iphone.updateData(10);
    }
}
