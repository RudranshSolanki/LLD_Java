# Problem 4 —   Interface Segregation Principle (ISP)


# Given Code 1

```java
interface Worker {
    void work();
    void eat();
    void sleep();
    void attendMeeting();
    void writeReport();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human working...");
    }
    public void eat() {
        System.out.println("Human eating...");
    }
    public void sleep() {
        System.out.println("Human sleeping...");
    }
    public void attendMeeting() {
        System.out.println("Human attending meeting...");
    }
    public void writeReport() {
        System.out.println("Human writing report...");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!"); // 💥
    }
    public void sleep() {
        throw new UnsupportedOperationException("Robots don't sleep!"); // 💥
    }
    public void attendMeeting() {
        System.out.println("Robot attending meeting...");
    }
    public void writeReport() {
        System.out.println("Robot writing report...");
    }
}
```


# Refactored Solution 1
```java
interface Workable{
    void work();
    void attendMeeting();
    void writeReport();
}
interface HumanNeeds{
    void eat();
    void sleep();
}
class HumanWorker implements Workable,HumanNeeds{
    void work(){}
    void attendMeeting(){}
    void writeReport(){}
    void eat(){}
    void sleep(){}
}
class RobotWorker implements Workable{
    void work(){}
    void attendMeeting(){}
    void writeReport(){}
}
```

# Given Code 2

```java
interface SmartDevice {
    void turnOn();
    void turnOff();
    void playMusic();
    void takePicture();
    void makePhoneCall();
    void browseInternet();
}

class SmartPhone implements SmartDevice {
    public void turnOn() { System.out.println("Phone turning on..."); }
    public void turnOff() { System.out.println("Phone turning off..."); }
    public void playMusic() { System.out.println("Phone playing music..."); }
    public void takePicture() { System.out.println("Phone taking picture..."); }
    public void makePhoneCall() { System.out.println("Phone making call..."); }
    public void browseInternet() { System.out.println("Phone browsing internet..."); }
}

class SmartSpeaker implements SmartDevice {
    public void turnOn() { System.out.println("Speaker turning on..."); }
    public void turnOff() { System.out.println("Speaker turning off..."); }
    public void playMusic() { System.out.println("Speaker playing music..."); }
    public void takePicture() {
        throw new UnsupportedOperationException("Speaker can't take pictures!"); // 💥
    }
    public void makePhoneCall() {
        throw new UnsupportedOperationException("Speaker can't make calls!"); // 💥
    }
    public void browseInternet() {
        throw new UnsupportedOperationException("Speaker can't browse!"); // 💥
    }
}
```

# Refactored Solution

```java
interface ElectronicDevice{
    void turnOn();
    void turnOff();
}

interface Phone{
    void playMusic();
    void takePicture();
    void makePhoneCall();
    void browseInternet();
}

interface Speaker{
    void playMusic();
}

class SmartPhone implements ElectronicDevice,Phone{
    void turnOn(){}
    void turnOff(){}
    void playMusic(){}
    void takePicture(){}
    void makePhoneCall(){}
    void browseInternet(){}
}

class SmartSpeaker implements ElectronicDevice,Speaker{
    void turnOn(){}
    void turnOff(){}
    void playMusic(){}
}

```

