package Factory;

public class FactoryPatternDemo {

    public static void main(String args[]) {

        ShapeFactory factory = new ShapeFactory();

        Shape Circle = factory.createShape("Circle");

        Circle.draw();

    }
}
