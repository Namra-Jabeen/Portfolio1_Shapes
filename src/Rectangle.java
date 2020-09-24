
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
    public Point center() {
        Point c = new Point();
        c.x = Math.round(this.x+0.5*width);
        c.y = Math.round(this.y+0.5*height);
        return c;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double circumference() {
        return 2*width+2*height;
    }

    public String inRectangle(Point point) {
            //in this if statement we check if the point is inside all corners of the rectangle
            if(point.x >= getX() && point.y >= getY() && //bottom left corner
                    point.x >= getX() && point.y <= (getY()+getHeight()) &&   //top left corner
                    point.x <= (getX()+getWidth()) && point.y >= getY() &&    //bottom right corner
                    point.x <= (getX()+getWidth()) && point.getY()<=(getY()+ getHeight()))  //top right corner
            {
                return "The point is inside the rectangle";
            }
            return "The point is not inside the rectangle";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
