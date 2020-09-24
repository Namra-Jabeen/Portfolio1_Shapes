import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void centerTest(){
        Point A = new Point(1,1);
        Point B = new Point(5,1);
        Point C = new Point(1,5);
        Triangle testTriangle = new Triangle(A,B,C);
        assertEquals(new Point(2.33,2.33),testTriangle.center());
    }

    @Test
    void areaTest(){
        Point A = new Point(1,1);
        Point B = new Point(5,1);
        Point C = new Point(1,5);
        Triangle testTriangle = new Triangle(A,B,C);
        assertEquals(8,testTriangle.area());
    }

    @Test
    void circumferenceTest(){
        Point A = new Point(1,1);
        Point B = new Point(5,1);
        Point C = new Point(1,5);
        Triangle testTriangle = new Triangle(A,B,C);
        assertEquals(13.66,testTriangle.circumference());
    }

    @Test
    void isWithinTest(){
        Point A = new Point(1,1);
        Point B = new Point(5,1);
        Point C = new Point(1,5);
        Triangle testTriangle = new Triangle(A,B,C);
        Point D = new Point(2,3);
        assertEquals(true,testTriangle.isWithin(D));
    }
}
