package Decorator;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", TomatoSauce";
    }

    public double getCost() {
        return pizza.getCost() + 0.50;
    }
}
