
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

    public String inCircle(Point point) {
        if (point.x <= (getX() + getRadius()) && point.x >= (getX() - getRadius())
                //here we check if the x of our point is inside the circle
                //so once add the radius to the x from the center and once subtract it, and check
                //if the x of the point is in between these two variables
                && point.y <= (getY() + getRadius()) && point.y >= (getY() - getRadius())) {
            //here we check if the y of our point is inside the circle
            //so we once add the radius to the y from the center and once subtract it, and check
            //if the y of the point is in between these two variables
            return "The point is inside the circle";
        }
        return "The point is not inside the circle";
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

    public double getX() {
        return center.x;
    }

    public double getY() {
    return center.y;
    }

    public double getRadius() {
        return radius;
    }

}
