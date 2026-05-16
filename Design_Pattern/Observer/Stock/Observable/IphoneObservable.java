package Design_Pattern.Observer.Stock.Observable;

import Design_Pattern.Observer.Stock.Observer.NotificationObserver;
import java.util.*;
public class IphoneObservable implements StockObservable {
    int stockCount = 0;
    List<NotificationObserver> notificationObserver = new ArrayList<>();
    public void add(NotificationObserver obs){
        notificationObserver.add(obs);
    }

    public void remove(NotificationObserver obs){
        notificationObserver.remove(obs);
    }

    public void notifyUser(){
        for(NotificationObserver observer : notificationObserver){
            observer.notifyUser();
        }
    }
    public void updateData(int data){
        if(stockCount == 0){
            notifyUser();
        }
        stockCount +=data;
    }
    public int getData(){
        return stockCount;
    }
}
