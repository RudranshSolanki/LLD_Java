package Design_Pattern.Factory.Notification;

public class NotificationFactory {
    Notification createNotification(String type){
        if(type.equals("SMS"))
            return new SMSNotification();
        else if(type.equals(("Email")))
            return new EmailNotification();
        return new SMSNotification();
    }
}
