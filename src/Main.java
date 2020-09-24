
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 5.0);
        Rectangle rectangle = new Rectangle(0, 0, 30, 50);
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

        System.out.println("The euclidean distance between triangle and rectangle is: " + triangle.computeEuclideanDistance(rectangle));
        System.out.println();
        System.out.println(inShape(triangle, new Point(2,2)));


    }

    //might be better to replace if statements with switch statement, but it did not work for now, so it was changed back
    public static String inShape(Shape shape, Point point) {
        //method to check whether a point is inside a given shape
        //for now it only checks one shape, based on their name
        //so if we use triangle as input, the method will check if the point is inside the triangle
        //but it won't change the other two methods
        //thought is was useful to make it work for each shape, and then we can try change it from there
                if(shape.shapeName().equals("Triangle")) {
                    if (shape.isInTriangle(point)) {
                        return "The point is inside the triangle";
                    }
                }

                else if(shape.shapeName().equals("Circle")) {
                    if (point.x <= (shape.getX() + shape.getRadius()) && point.x >= (shape.getX() - shape.getRadius())
                            //here we check if the x of our point is inside the circle
                            //so once add the radius to the x from the center and once subtract it, and check
                            //if the x of the point is in between these two variables
                            && point.y <= (shape.getY() + shape.getRadius()) && point.y >= (shape.getY() - shape.getRadius())) {
                            //here we check if the y of our point is inside the circle
                            //so we once add the radius to the y from the center and once subtract it, and check
                            //if the y of the point is in between these two variables
                        return "The point is inside the Circle";
                    }
                }

                else if(shape.shapeName().equals("Rectangle")) {
                                //in this if statement we check if the point is inside all corners of the rectangle
                    if(point.x >= shape.getX() && point.y >= shape.getY() && //bottom left corner
                            point.x >= shape.getX() && point.y <= (shape.getY()+shape.getHeight()) &&   //top left corner
                            point.x <= (shape.getX()+shape.getWidth()) && point.y >= shape.getY() &&    //bottom right corner
                            point.x <= (shape.getX()+shape.getWidth()) && point.getY()<=(shape.getY()+ shape.getHeight()))  //top right corner
                    {
                        return "The point is inside the Rectangle.";
                    }

            }
                return "The point is not inside any shape!";
    }
}

