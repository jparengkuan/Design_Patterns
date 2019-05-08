package Decorator;

public class LargeSize extends SizeDecorator {
    public LargeSize(Pizza pizza) {
        super(pizza);
        System.out.println("Creating a large size Pizza");
    }

    public String getDescription() {
        return pizza.getDescription() + ", LargeSize";
    }

    public double getCost() {
        return pizza.getCost() + 10;
    }
}
