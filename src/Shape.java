// This Abstract class Shape - Represents a generic shape with a name, area, and perimeter.

public abstract class Shape implements Scalable {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods  for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }
}

