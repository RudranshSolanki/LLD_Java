package Design_Pattern.AbstractFactory.Notification;

public class IOSEmailNotification implements Email {
     public void sendEmail(String message) {
        System.out.println("[IOS Email] " + message);
    }
}
