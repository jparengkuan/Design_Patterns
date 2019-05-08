package Decorator;

public abstract class SizeDecorator implements Pizza {

    protected Pizza pizza;

    public SizeDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

