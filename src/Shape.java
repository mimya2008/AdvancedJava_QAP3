// This Abstract class Shape - Represents a generic shape with a name, area, and perimeter.
public abstract class Shape {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented in subclasses
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }
}

