// Tests the Point and MovablePoint classes.
public class Problem2_Demo {
    public static void main(String[] args) {
        // Creating a Point object
        Point p1 = new Point(3.5f, 4.5f);
        System.out.println("Point: " + p1);

        // Creating a MovablePoint object
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Before move: " + mp1);

        // Moving the MovablePoint
        mp1.move();
        System.out.println("After move: " + mp1);
    }
}

