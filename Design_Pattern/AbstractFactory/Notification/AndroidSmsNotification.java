package Design_Pattern.AbstractFactory.Notification;

public class AndroidSmsNotification implements SMS {
     public void sendSMS(String message) {
        System.out.println("[Android SMS] " + message);
    }
}
