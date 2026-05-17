package Design_Pattern.AbstractFactory.Notification;

public class IOSSmsNotification implements SMS {
     public void sendSMS(String message) {
        System.out.println("[IOS SMS] " + message);
    }
}
