# Problem 3 —  Liskov Substitution Principle (LSP)

# Given Code 1

```java
class Bird {
    void fly() {
        System.out.println("Flying...");
    }

    void eat() {
        System.out.println("Eating...");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soaring high!");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!"); // 💥
    }
}

class BirdHandler {
    void makeBirdFly(Bird bird) {
        bird.fly(); // 💥 Crashes if bird is a Penguin
    }
}
```
# Refactored Solution 1

```java
interface Bird{
    void eat();
}
interface Flyable{
    void fly();
}
class FlyBird implements Bird,Flyable{
    void fly(){
        System.out.println("Flying...");
    }
    void eat(){
        System.out.println("Eating...");
    }
}

class NonFlyingBird implements Bird{
    void eat(){
       System.out.println("Eating..."); 
    }
}

class Eagle extends FlyBird{
    public void fly(){
        Sysem.out.println("Eagle Flying");
    }
}

class Penguin extends NonFlyingBird {
    public void eat(){
        system.out.println("Penguin Eating..");
    }
}
```


# Give Code 2

```java
class Employee {
    void work() {
        System.out.println("Working...");
    }

    void takeOvertime() {
        System.out.println("Taking overtime...");
    }

    void attendMeeting() {
        System.out.println("Attending meeting...");
    }
}

class JuniorEmployee extends Employee {
    @Override
    void work() {
        System.out.println("Junior working...");
    }

    @Override
    void takeOvertime() {
        System.out.println("Junior taking overtime...");
    }
}

class SeniorEmployee extends Employee {
    @Override
    void work() {
        System.out.println("Senior working...");
    }

    @Override
    void takeOvertime() {
        throw new UnsupportedOperationException("Senior can't take overtime!"); // 💥
    }
}
```


# Refactored Code 2

```java
interface Employee{
    void work();
    void attendMeeting();
}
interface EmployeeOvertime{
    void takeOverTime();
}

class JuniorEmployee implements Employee,EmployeeOvertime{
    void work(){
        System.out.println("Junior working...");
    }
    void attendMeeting() {
        System.out.println("Junior attending meeting...");
    }
    void takeOverTime(){
        System.out.println("Junior taking overtime...");
    }

}

class SeniorEmployee implements Employee{
    void work(){
        System.out.println("Senior working...");
    }
    void attendMeeting() {
        System.out.println("Junior attending meeting...");
    }
}
```


# Give Code 3

```java
class User {
    void login() {
        System.out.println("User logged in...");
    }

    void accessBasicContent() {
        System.out.println("Accessing basic content...");
    }

    void accessPremiumContent() {
        System.out.println("Accessing premium content...");
    }

    void downloadContent() {
        System.out.println("Downloading content...");
    }
}

class PremiumUser extends User {
    @Override
    void accessPremiumContent() {
        System.out.println("Premium user accessing premium content...");
    }

    @Override
    void downloadContent() {
        System.out.println("Premium user downloading content...");
    }
}

class FreeUser extends User {
    @Override
    void accessPremiumContent() {
        throw new UnsupportedOperationException("Free users can't access premium content!"); // 💥
    }

    @Override
    void downloadContent() {
        throw new UnsupportedOperationException("Free users can't download!"); // 💥
    }
}
```

# Refactored Code 3

```java
interface User{
    void login();
    void accessBasicContent();
}
interface PremiumUserAccess{
    void downloadContent();
    void accessPremiumContent();
}

class PremiumUser implements User,PremiumUserAccess{
    void login(){
        
    }
    void downloadContent(){

    }
    void accessBasicContent(){

    }
    void accessPremiumContent(){

    }
}
class FreeUser implements User{
    void login(){
        
    }
    void accessBasicContent(){

    }
}
```