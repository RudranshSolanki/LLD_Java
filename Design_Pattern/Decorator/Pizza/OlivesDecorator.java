package Design_Pattern.Decorator.Pizza;

public class OlivesDecorator extends ToppingDecorator {
    BasePizza pizza;
    public OlivesDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost()+15;
    }
    public String getDescription(){
        return  pizza.getDescription() + " Olives";
    }
}
