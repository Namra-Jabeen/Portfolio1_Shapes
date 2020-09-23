import java.awt.Point;
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(5,3),5.0);
        Rectangle rectangle = new Rectangle(0,0,30,50);
        Triangle triangle = new Triangle(new Point(2,3), new Point(6,5), new Point(6,1));

        //Testing circle
        System.out.println("Center of circle is: "+circle.center());
        System.out.println("Area of circle is: "+circle.area());
        System.out.println("Circumference of circle is: "+circle.circumference());

        //Testing rectangle
        System.out.println("Center of rectangle is: "+rectangle.center());
        System.out.println("Area of rectangle is: "+rectangle.area());
        System.out.println("Circumference of rectangle is: "+rectangle.circumference());

        //Testing Triangle
        //System.out.println("Center of triangle is: "+triangle.center());
        System.out.println("Area of triangle is: "+triangle.area());
        System.out.println("Circumference of triangle is: "+triangle.circumference());

    }
}
