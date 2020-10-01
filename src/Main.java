import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 5.0);
        Rectangle rectangle = new Rectangle(new Point(0,0), 30, 50);
        Triangle triangle = new Triangle(new Point(1, 1), new Point(1, 2), new Point(1, 3));
        //In order for the println to print out only two decimals we use DecimalFormal
        DecimalFormat df = new DecimalFormat(".##");
        //Checking the functionality of circle
        System.out.println("Center of circle is: " + circle.center().toString());
        System.out.println("Area of circle is: " + df.format(circle.area()));
        System.out.println("Circumference of circle is: " + df.format(circle.circumference()));
        System.out.println("-----------------------------------------------------");

        //Checking the functionality of rectangle
        System.out.println("Center of rectangle is: " + rectangle.center().toString());
        System.out.println("Area of rectangle is: " + df.format(rectangle.area()));
        System.out.println("Circumference of rectangle is: " + df.format(rectangle.circumference()));
        System.out.println("-----------------------------------------------------");

        //Checking the functionality of triangle
        System.out.println("Center of triangle is: " + triangle.center().toString());
        System.out.println("Area of triangle is: " + df.format(triangle.area()));
        System.out.println("Circumference of triangle is: " + df.format(triangle.circumference()));
        System.out.println("-----------------------------------------------------");

        //Checking the functionality of the euclidean distance
        System.out.println("The euclidean distance between triangle and rectangle is: " + df.format(triangle.euclideanDistance(rectangle)));
        System.out.println("-----------------------------------------------------");

        //Checking the functionality of the isWithin method
        Point point = new Point(7,4);
        System.out.println("Check if point is inside circle, true or false: " + circle.isWithin(point));
    }
}

