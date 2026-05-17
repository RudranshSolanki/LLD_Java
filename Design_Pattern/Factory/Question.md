# Notification class to Factory Pattern


```java
class NotificationService {
    void sendNotification(String type, String message) {
        if (type.equals("email")) {
            EmailNotification email = new EmailNotification(); // 💥 tight coupling!
            email.send(message);
        } else if (type.equals("sms")) {
            SMSNotification sms = new SMSNotification(); // 💥
            sms.send(message);
        } else if (type.equals("push")) {
            PushNotification push = new PushNotification(); // 💥
            push.send(message);
        }
    }
}

class EmailNotification {
    void send(String message) {
        System.out.println("Email: " + message);
    }
}
class SMSNotification {
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}
class PushNotification {
    void send(String message) {
        System.out.println("Push: " + message);
    }
}
```