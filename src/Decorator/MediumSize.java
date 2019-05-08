package Decorator;

public class MediumSize extends SizeDecorator {
    public MediumSize(Pizza pizza) {
        super(pizza);
        System.out.println("Creating a medium size Pizza");
    }

    public String getDescription() {
        return pizza.getDescription() + ", MediumSize";
    }

    public double getCost() {
        return pizza.getCost() + 5;
    }
}
