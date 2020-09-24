
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
    public Point center() {
       return center;
        //return "("+center.x+","+center.y+")";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return Math.PI * 2 * radius;
    }


    @Override
    //shapeName is used to differ from the different shapes
    public String shapeName() {
        return "Circle";
    }
    @Override
    public double getX() {
        return center.x;
    }
    @Override
    public double getY() {
    return center.y;
    }
    @Override
    public double getRadius() {
        return radius;
    }

    //rest of methods not for use in this class
    @Override
    public double getWidth() {
        return 1;
    }
    @Override
    public double getHeight() {
        return 2;
    }

    @Override
    public boolean isInTriangle(Point p) {
        return false;
    }
}
