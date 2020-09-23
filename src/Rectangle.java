import java.awt.Point;
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
        this.x= x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    @Override
    public String center() {
        double x = Math.round(this.x+0.5*width);
        double y = Math.round(this.y+0.5*height);
        return "("+x+","+y+")";
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double circumference() {
        return 2*width+2*height;
    }
}
