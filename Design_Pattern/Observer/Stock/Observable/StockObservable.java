package Design_Pattern.Observer.Stock.Observable;

import  Design_Pattern.Observer.Stock.Observer.NotificationObserver;

// basic Observable structure

// add Observer,remove observer, notify observer, update Data, getData
public interface StockObservable {
    public void add(NotificationObserver obs);
    public void remove(NotificationObserver obs);
    public void notifyUser();
    public void updateData(int data);
    public int getData();
}