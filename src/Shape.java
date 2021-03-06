//An abstract superclass
abstract class Shape {

    // A method that returns the center of the shape
    public abstract Point center();
    // A method that computes the area of the shape
    public abstract double area();
    // A method that returns the circumference of the shape
    public abstract double circumference();
    // A method that indicate whether a point is inside the shape or not (e.g. select the shape by mouse click)
    public abstract boolean isWithin(Point p);
    // A method that computes the Euclidean distance to another shape (center to center)
    public double euclideanDistance(Shape shape) {
        Point point = new Point();
        return point.distance(shape.center().x,shape.center().y,center().x,center().y);
    }




}
