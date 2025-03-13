// Test class for different shapes.
public class Problem3_Demo {
    public static void main(String[] args) {
        // Creating shape objects
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(5)
        };

        // Loop to print shape details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
