
public class Triangle extends Shape {
    public static Point A;
    public static Point B;
    public static Point C;

    //Constructor for Triangle object.
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }


    @Override
    public Point center() {
       Point c =  new Point();
        c.x = Math.round((A.x+B.x+C.x)/3);
        c.y = Math.round((A.y+B.y+C.y)/3);
        return c;
    }

    @Override
    public  double area() {

        try {
            double AB = Point.distance(A.x, A.y, B.x, B.y);
            double BC = Point.distance(C.x, C.y, B.x, B.y);
            double AC = Point.distance(A.x, A.y, C.x, C.y);
            double p = (AB+BC+AC)/2;
            return Math.sqrt(p*(p-AC)*(p-BC)*(p-AB));
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }

    }
    //Random comment
    @Override
    public double circumference() {
        try {
            double AB = Point.distance(A.x, A.y, B.x, B.y);
            double BC = Point.distance(C.x, C.y, B.x, B.y);
            double AC = Point.distance(A.x, A.y, C.x, C.y);
            return AB+BC+AC;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }

    }
}
