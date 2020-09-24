import java.text.DecimalFormat;

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
        return Math.abs((A.x*(B.y-C.y)+B.x*(C.y-A.y)+C.x*(A.y-B.y))/2.0);
    }

    //We overload the the previous area method, which is used in our isWithin method
    public  double area(Point one, Point two, Point three) {
        return Math.abs((one.x*(two.y-three.y)+two.x*(three.y-one.y)+three.x*(one.y-two.y))/2.0);
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

    @Override
    public boolean isWithin(Point point) {
        //In order to find out whether a point is in the triangle,
        // we take the area of the triangle and
        // compare it to the areas of the point with two of the twos from the triangle
       double ans = area();
       double ans1 = area(point, B, C);
       double ans2 = area(A, point, C);
       double ans3 = area(A, B, point);
       if (ans == ans1+ans2+ans3){
           return true;
       } else return false;
    }
}
