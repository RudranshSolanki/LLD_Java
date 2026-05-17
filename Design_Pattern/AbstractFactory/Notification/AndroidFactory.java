package Design_Pattern.AbstractFactory.Notification;


public class AndroidFactory implements NotificationFactory {
    public Email createEmailNotification(){
        return new  AndroidEmailNotification();
    }
    public SMS createSmsNotification(){
        return new AndroidSmsNotification();
    }
}
