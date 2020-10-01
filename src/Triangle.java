public class Triangle extends Shape {
    public static Point A;
    public static Point B;
    public static Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public Point center() {
       Point c =  new Point();
        c.x = (A.x+B.x+C.x)/3;
        c.y = (A.y+B.y+C.y)/3;
        return c;
    }

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
    public  double area() {
        return Math.abs((A.x*(B.y-C.y)+B.x*(C.y - A.y)+C.x*(A.y-B.y))/2.0);
    }

    //We overload the previous area method, which is used in our isWithin method
    private  double area(Point one, Point two, Point three) {
        return Math.abs((one.x*(two.y-three.y)+two.x*(three.y - one.y)+three.x*(one.y-two.y))/2.0);

    }
    @Override
    public boolean isWithin(Point p) {
        //In order to find out whether a point is in the triangle,
        // we take the area of the triangle and
        // compare it to the areas of the point with two of the twos from the triangle
        double ans = area();
        double ans1=area(p,B,C);
        double ans2=area(p,A,B);
        double ans3=area(p,A,C);
        double newArea = ans1+ans2+ans3;

        //returns true if correct, else returns false
        return newArea == ans;
    }

}
