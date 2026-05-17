package Design_Pattern.Factory.Notification;

public class EmailNotification implements Notification {
    public void sendNotification(String message){
        System.out.println("Email "+message);
    }
}
