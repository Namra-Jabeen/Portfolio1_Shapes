
public class Circle extends Shape {
    Point center;
    double radius;

    //default circle constructor
    public Circle() {
        this.center= new Point(0,0);
        this.radius = 1.0;
    }

    //Constructor of Circle object
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point center() { return center; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public boolean isWithin(Point point) {
        return false;
    }
}
