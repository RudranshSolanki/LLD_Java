# Pizza Problem Decorator Design Pattern


```java
class Pizza {
    String getDescription() { return "Plain Pizza"; }
    double getCost() { return 200.0; }
}

// 💥 Explosion of subclasses!
class PizzaWithCheese extends Pizza {
    String getDescription() { return "Plain Pizza + Cheese"; }
    double getCost() { return 250.0; }
}
class PizzaWithCheeseAndOlives extends Pizza {
    String getDescription() { return "Plain Pizza + Cheese + Olives"; }
    double getCost() { return 280.0; }
}
class PizzaWithCheeseAndOlivesAndMushrooms extends Pizza {
    String getDescription() { return "Plain Pizza + Cheese + Olives + Mushrooms"; }
    double getCost() { return 310.0; }
}
// imagine 20 more combinations... 😱
```