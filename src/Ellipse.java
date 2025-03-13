// Representing an ellipse with major and minor axes.
public class Ellipse extends Shape {
    private double a, b; // Major and minor axes

    // Constructor ensures a is the larger value
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * ((a * a) + (b * b)) - (((a - b) * (a - b)) / 2));
    }
}

