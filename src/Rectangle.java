public class Rectangle extends Shape {
    Point coordinate;
    double width;
    double height;


    public Rectangle() {
        coordinate = new Point(0,0);
        width = 1;
        height = 1;
    }

    public Rectangle(Point coordinate, double width, double height) {
        //x and y are the coordinates to the lower left corner of the rectangle.
        this.coordinate = coordinate;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point center() {
        Point c = new Point();
        c.x = this.coordinate.x + 0.5 * width;
        c.y = this.coordinate.y + 0.5 * height;
        return c;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double circumference() {
        return 2 * width + 2 * height;
    }

    @Override
    public boolean isWithin(Point p) {
        if (p.x >= coordinate.x && p.y >= coordinate.y && //bottom left corner
                p.x >= coordinate.x && p.y <= (coordinate.y + height) &&   //top left corner
                p.x <= (coordinate.x + width) && p.y >= coordinate.y &&    //bottom right corner
                p.x <= (coordinate.x + width) && p.y <= (coordinate.y + height))  //top right corner
        {
            return true;
        }
        return false;
    }
}
