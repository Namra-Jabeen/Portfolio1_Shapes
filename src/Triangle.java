public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Kind of unsure how to do this one. Help me
    @Override
    public String center() {
        return null;
    }

    @Override
    public double area() {
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1	)*(p-side2)*(p-side3));
    }

    @Override
    public double circumference() {
        return side1+side2+side3;
    }
}
