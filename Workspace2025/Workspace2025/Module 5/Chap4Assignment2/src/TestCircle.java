
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Initial radius: " + circle.getRadius());
        System.out.println("Initial diameter: " + circle.getDiameter());
        System.out.println("Initial area: " + circle.getArea());

        circle.setRadius(5);

        System.out.println("Updated radius: " + circle.getRadius());
        System.out.println("Updated diameter: " + circle.getDiameter());
        System.out.println("Updated area: " + circle.getArea());
    }
}
