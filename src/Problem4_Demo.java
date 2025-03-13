// Demo.java - Test class for different shapes
public class Problem4_Demo {
    public static void main(String[] args) {
        // Creating shape objects
        Scalable[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(5)
        };

        // Displaying shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale factor
        double scaleFactor = 2.0;
        scaleShapes(shapes, scaleFactor);

        // Displaying shapes after scaling
        System.out.println("\nShapes after scaling by factor " + scaleFactor + ":");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale an array of Scalable objects
    public static void scaleShapes(Scalable[] objects, double factor) {
        for (Scalable obj : objects) {
            obj.scale(factor);
        }
    }
}

