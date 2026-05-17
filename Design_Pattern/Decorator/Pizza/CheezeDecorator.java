package Design_Pattern.Decorator.Pizza;

public class CheezeDecorator extends ToppingDecorator {
    BasePizza pizza;
    public CheezeDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost()+20;
    }
    public String getDescription(){
        return  pizza.getDescription() + " Cheeze";
    }

}
