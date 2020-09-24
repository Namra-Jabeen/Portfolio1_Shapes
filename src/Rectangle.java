
public class Rectangle extends Shape {
    int x;
    int y;
    double width;
    double height;


    public Rectangle() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public Rectangle(int x, int y, double width, double height) {
        //x and why are the coordinates to the lower left corner of the rectangle.
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point center() {
        Point c = new Point();
        c.x = Math.round(this.x + 0.5 * width);
        c.y = Math.round(this.y + 0.5 * height);
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
        if (p.x >= x && p.y >= y && //bottom left corner
                p.x >= x && p.y <= (y + height) &&   //top left corner
                p.x <= (x + width) && p.y >= y &&    //bottom right corner
                p.x <= (x + width) && p.y <= (y + height))  //top right corner
        {
            return true;
        }
        return false;
    }
}
