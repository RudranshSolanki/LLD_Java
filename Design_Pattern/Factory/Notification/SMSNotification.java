package Design_Pattern.Factory.Notification;

public class SMSNotification implements Notification {
    public void sendNotification(String message){
        System.out.println("SMS: "+message);
    }
}
