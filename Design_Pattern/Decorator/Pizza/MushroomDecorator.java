package Design_Pattern.Decorator.Pizza;

public class MushroomDecorator extends ToppingDecorator {
    BasePizza pizza;
    public MushroomDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost()+50;
    }
    public String getDescription(){
        return  pizza.getDescription() + " Mushroom";
    }
}
