package Factory;

public class ShapeFactory {

    public Shape createShape(String type) {


        Shape shape;

        switch (type) {
            case "Square":
                shape = new Square();
                break;
            case "Circle":
                shape = new Circle();
                break;
            default:
                shape = null;
        }

        return shape;
    }
}
