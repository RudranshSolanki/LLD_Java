package Design_Pattern.AbstractFactory.Notification;

public class Main {
    public static void main(String args[])
    {
        AndroidFactory andriod = new AndroidFactory();
        andriod.createEmailNotification().sendEmail("Hey! I hope this email finds you well!");
        andriod.createSmsNotification().sendSMS("Hey, please recharge your phone");
        IOSFactory ios = new IOSFactory();
        ios.createEmailNotification().sendEmail("Hey!! I hope this emails find you well");
        ios.createSmsNotification().sendSMS("Please recharge your iphone");
    }
}
