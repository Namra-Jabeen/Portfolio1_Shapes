public class Point {
    double x;
    double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double x = (x1-x2)*(x1-x2);
        double y = (y1-y2)*(y1-y2);
        return Math.sqrt(x+y);
    }
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

    @Override
    public String toString() {
        return "("+ x +"," + y + ")";
    }
}
