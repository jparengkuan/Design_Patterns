package Decorator;

public class Mozarella extends ToppingDecorator {
    public Mozarella(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mozerella";
    }

    public double getCost() {
        return pizza.getCost() + 2;
    }
}
