package Design_Pattern.AbstractFactory.Notification;

public class IOSFactory implements NotificationFactory {
    public Email createEmailNotification(){
        return new IOSEmailNotification();
    }
    public SMS createSmsNotification(){
        return new IOSSmsNotification();
    }
}
