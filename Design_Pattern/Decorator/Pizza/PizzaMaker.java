package Design_Pattern.Decorator.Pizza;

public class PizzaMaker {
    public static void main(String args[]){
        BasePizza pizza = new Margerita();
        BasePizza newPizza = new MushroomDecorator(new CheezeDecorator(pizza));
        System.out.println(newPizza.getDescription());
    }
}
