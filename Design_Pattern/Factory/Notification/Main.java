package Design_Pattern.Factory.Notification;

public class Main {
    public static void main(String args[]){
        NotificationFactory notificationCreator = new NotificationFactory();
        Notification emailNotification = notificationCreator.createNotification("Email");
        emailNotification.sendNotification("Hey! hope you find this email well");
        
    }
}
