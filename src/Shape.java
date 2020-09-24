abstract class Shape {

    // A method that returns the center of the shape
    public abstract Point center();
    // A method that computes the area of the shape
    public abstract double area();
    // A method that returns the circumference of the shape
    public abstract double circumference();
    // A method that indicate whether a point is inside the shape or not (e.g. select the shape by mouse click)
    // A method that computes the Euclidean distance to another shape (center to center)
   // public double euclideanDistance(Shape shape) {
   // shape.center()
   // }
    public double computeEuclideanDistance(Shape shape) {
        Point point = new Point();
        return point.distance(shape.center().x,shape.center().y,center().x,center().y);
    }

    //all of the methods we had to add in order to make the insideShape stuff work
    //hopefully we can change it so that we can get rid of some
    public abstract String shapeName();
    public abstract double getX();
    public abstract double getY();
    public abstract double getWidth();
    public abstract double getHeight();
    public abstract double getRadius();
    public abstract boolean isInTriangle(Point p);


}
