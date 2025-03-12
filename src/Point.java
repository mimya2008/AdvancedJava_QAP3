// Representation of a 2D point with x and y coordinates.
public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        // Default constructor, initializes x and y to 0.0f
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    // to String Method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

