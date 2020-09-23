import java.awt.Point;

public class Triangle extends Shape {
    Point A;
    Point B;
    Point C;
    double AB = Point.distance(A.x,A.y,B.x,B.y);
    double BC = Point.distance(C.x,C.y,B.x,B.y);
    double AC = Point.distance(A.x,A.y,C.x,C.y);


    //public Triangle() {
    //    AB = 1;
    //   BC = 1;
    //  AC = 1;
    //}

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    //Kind of unsure how to do this one. Help me
    @Override
    public String center() {
        return null;
    }

    @Override
    public double area() {
        double p = (AB+BC+AC)/2;
        return Math.sqrt(p*(p-AC)*(p-BC)*(p-AB));
    }

    @Override
    public double circumference() {
        return AB+BC+AC;
    }
}
