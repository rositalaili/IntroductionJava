public class CircleX {

    private double radius;
    private String color;
    // Constructors (overloaded)

    /**
     * Constructs a CircleX instance with default radius and color
     */
    public CircleX() { // 1st Constructor (default
        constructor
        )
 radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a CircleX instance with the given radius and default
color
     */
    public CircleX(double r) { // 2nd Constructor
        radius = r;
        color = "red";
    }

    /**
     * Constructs a CircleX instance with the given radius and color
     */
    public CircleX(double r, String c) { // 3rd Constructor
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
