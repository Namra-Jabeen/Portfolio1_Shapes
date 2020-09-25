public class Circle extends Shape {
    Point center;
    double radius;

    //default circle constructor
    public Circle() {
        this.center = new Point(0, 0);
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
    public boolean isWithin(Point p) {
        if (p.x <= (center.x + radius) && p.x >= (center.x - radius)
                //here we check if the x of our point is inside the circle
                //so once add the radius to the x from the center and once subtract it, and check
                //if the x of the point is in between these two variables
                && p.y <= (center.y + radius) && p.y >= (center.y - radius)) {
            //here we check if the y of our point is inside the circle
            //so we once add the radius to the y from the center and once subtract it, and check
            //if the y of the point is in between these two variables
            return true;
        }
        return false;
    }
}
