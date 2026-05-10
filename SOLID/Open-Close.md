# Problem 2 — Open Closed Principle (OCP)


# Given Code 1

```java 
class AreaCalculator {
    double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            return 0.5 * t.base * t.height;
        }
        return 0;
    }
}
```

# Refactored Solution

```java
interface Shape{
    double calculareArea();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculareArea(){
        return Math.PI*radius*radius;
    }
}


class Rectangle implements Shape{
    double length;
    double widht;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double calculareArea(){
        return length*width;
    }
}

class Triangle implements Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double calculareArea(){
        return 1/2 * base*height;
    }
}
```

# Give Code 2

```java
class PaymentProcessor {
    void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of " + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of " + amount);
        } else if (paymentType.equals("Bitcoin")) {
            System.out.println("Processing Bitcoin payment of " + amount);
        }
    }
}
```

# Refactored Solution 2

```java
interface PaymentMethod{
    void processPayment(double amount);
}
class CreditCard implements PaymentMethod{
    void processPayment(double amount){
        System.out.println("Processing credit card payment of " + amount);
    }
}
class Paypal implements PaymentMethod{
    void processPayment(double amount){
        System.out.println("Processing PayPal payment of " + amount);
    }
}

class Bitcoin implements PaymentMehod{
    void processPayment(double amount){
        System.out.println("Processing Bitcoin payment of " + amount);
    }
}
```

# Give Code 3

```java
class DiscountCalculator {
    double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.05;
        } else if (customerType.equals("Premium")) {
            return price * 0.15;
        } else if (customerType.equals("Student")) {
            return price * 0.25;
        } else if (customerType.equals("Senior")) {
            return price * 0.30;
        }
        return 0;
    }
}
```

# Refactored Solution 3

```java
interface Customer{
    double getDiscount(int price);
}
class Regular implements Customer{
    double getDiscount(int prince){
        return price * 0.05;
    }
}
class Premium implements Customer{
    double getDiscount(int price){
        return price * 0.15;
    }

}
class Student implements Customer{
    double getDiscount(int prince){
        return price * 0.25;
    }
}
class Senior implements Customer{
    double getDiscount(int prince){
        return price * 0.30;
    }
}

class DiscountCalculator {
    double calculate(Customer customer, double price) {
        return customer.getDiscount(price);
    }
}
```