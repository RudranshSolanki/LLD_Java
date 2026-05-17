package Design_Pattern.AbstractFactory.Notification;

public interface NotificationFactory {
    public Email createEmailNotification();
    public SMS createSmsNotification();
}
