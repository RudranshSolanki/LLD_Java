# Problem 1 — Dependency Inversion Principle (DIP)

# Given Code 1

```java
class MySQLDatabase {
    void saveData(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

class MongoDatabase {
    void saveData(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }
}

class UserService {
    MySQLDatabase database = new MySQLDatabase(); // 💥 tightly coupled!

    void saveUser(String user) {
        database.saveData(user); // ❌ what if we want MongoDB instead?
    }
}
```

# Refactor Code 1

```java
interface Database{
    void saveData(String data);
}

class MySQLDatabase implements Database{
    void saveData(String data){
        System.out.println("Saving data to MySQL");
    }
}

class MongoDatabase implements Database{
    void saveData(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }
}

class UserService{
    void saveData(String data,Database db){
        db.saveData(data);
    }
}

class Main {
    public static void main(String[] args) {
        UserService user = new UserService();
        Database db = new MongoDatabase();
        user.saveData("data", db);
    }
}
```


# Given Code 2

```java
class EmailNotification {
    void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSNotification {
    void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class CreditCardPayment {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}

class PaypalPayment {
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}

class OrderService {
    EmailNotification notification = new EmailNotification(); // 💥 hardcoded!
    CreditCardPayment payment = new CreditCardPayment();      // 💥 hardcoded!

    void placeOrder(String order, double amount) {
        payment.processPayment(amount);
        notification.sendNotification("Order placed: " + order);
    }
}
```


# Refactored Solution 2

```java
interface NotificationService{
    void sendNotification(String message);
}
class EmailNotification implements NotificationService{
    void sendNotification(String message){

    }
}
class SMSNotification implements NotificationService{
    void sendNotification(String message){

    }
}
interface Payment{
    void processPayment(double amount);
}
class CreditCardPayment implements Payment{
    void processPayment(double amount){

    }
}
class PaypalPayment implements Payment{
    void processPayment(double amount){

    }
}
class OrderService{
    NotificationService notification;
    Payment payment;
    OrderService(NotificationService notification,Payment payment){
        this.notification = notification;
        this.payment = payment;
    }
    void placeOrder(String order,double amount){
        payment.processPayment(amount);
        notification.sendNotification("Order Place: "+order);
    }
}

class Main{
    public static void main(String args[]){
        Payment payment = new CreditCardPayment();
        NotificationService notification = new EmailNotification();
        OrderService order = new OrderService(notification,payment);
        order.placeOrder("iphone",50000);
    }
}
```