package Design_Pattern.Decorator.Pizza;

public class FarmHousePizza extends BasePizza{
    public String getDescription(){
        return "Farmhouse pizza";
    }
    public double getCost(){
        return 200;
    }
}
