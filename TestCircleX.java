
/**
 * A Test Driver for the "CircleX" class
 */
public class TestCircleX {

    public static void main(String[] args) {
        CircleX c1 = new CircleX(2.0, "blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());

        CircleX c2 = new CircleX(2.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());

        CircleX c3 = new CircleX();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());

    }
}
