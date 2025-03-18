//Asia M Chap4 Assignment2 2/7

public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        setRadius(1);
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}

