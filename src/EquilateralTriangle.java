// A children of triangle with all sides equal.
public class EquilateralTriangle extends Triangle {
    private double side;

    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side); // Calls the Triangle constructor
        this.side = side;
        super.name = "Equilateral Triangle"; // Update name
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }
}

