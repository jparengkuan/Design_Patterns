package Decorator;

public class DecoratorDemo {

    public static void main(String args[]) {

        //Always begin with the decorators
        Pizza mediumPizza = new MediumSize(new TomatoSauce(new Mozarella(new PlainPizza())));

        System.out.println("Ingredients: " + mediumPizza.getDescription());
        System.out.println("Cost: " + mediumPizza.getCost());


        Pizza largePizza = new LargeSize(new TomatoSauce(new Mozarella(new PlainPizza())));

        System.out.println("Ingredients: " + largePizza.getDescription());
        System.out.println("Cost: " + largePizza.getCost());
    }
}
