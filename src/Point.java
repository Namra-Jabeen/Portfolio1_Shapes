//Create a Point in a Cartesian plane that takes the x- and y-value as doubles.
public class Point {
    double x;
    double y;

    //Default constructor for Point object
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //Constructor for Point object
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Calculates the distance between two Points (x1,y1) and (x2,y2) and returns as a double.
    public static double distance(double x1, double y1, double x2, double y2) {
        double x = (x1-x2)*(x1-x2);
        double y = (y1-y2)*(y1-y2);
        return Math.sqrt(x+y);
    }
    //Getters and setters:
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //A toString method to display Points nicer.
    @Override
    public String toString() {
        return "("+ x +"," + y + ")";
    }
}
