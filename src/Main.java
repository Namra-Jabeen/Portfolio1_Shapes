
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 5.0);
        Rectangle rectangle = new Rectangle(new Point(0,0), 30, 50);
        Triangle triangle = new Triangle(new Point(1, 4), new Point(7, 8), new Point(7, 2));

        //Testing circle
        System.out.println("Center of circle is: " + circle.center().toString());
        System.out.println("Area of circle is: " + circle.area());
        System.out.println("Circumference of circle is: " + circle.circumference());

        //Testing rectangle
        System.out.println("Center of rectangle is: " + rectangle.center().toString());
        System.out.println("Area of rectangle is: " + rectangle.area());
        System.out.println("Circumference of rectangle is: " + rectangle.circumference());

        //Testing Triangle
        System.out.println("Center of triangle is: " + triangle.center().toString());
        System.out.println("Area of triangle is: " + triangle.area());
        System.out.println("Circumference of triangle is: " + triangle.circumference());

        //Testing the euclidean distance
        System.out.println("The euclidean distance between triangle and rectangle is: " + triangle.euclideanDistance(rectangle));
        System.out.println();

        //Testing isWithin
        Point point = new Point(7,4);
        System.out.println("Check if point is inside circle, true or false: " + circle.isWithin(point));
    }
}

