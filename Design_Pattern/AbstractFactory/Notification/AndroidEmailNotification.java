package Design_Pattern.AbstractFactory.Notification;

public class AndroidEmailNotification implements Email {
    public void sendEmail(String message) {
        System.out.println("[Android Email] " + message);
    }
}
