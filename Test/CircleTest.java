import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void newCircleNoInput(){
     Circle testCircle = new Circle();
     assertEquals(new Point(0,0),testCircle.center);
     assertEquals(1,testCircle.radius);
    }

    @Test
    void newCircleWithInput() {
        Circle testCircle = new Circle(new Point(3,3),6);
        assertEquals(new Point(3,3),testCircle.center);
        assertEquals(6,testCircle.radius);
    }

    @Test
    void centerTest(){
        Circle testCircle = new Circle(new Point(3,3),6);
        assertEquals(new Point(3,3),testCircle.center());
    }

    @Test
    void areaTest(){
        Circle testCircle = new Circle(new Point(3,3),6);
        assertEquals(113.09733552923255,testCircle.area());
    }

    @Test
    void circumferenceTest(){
        Circle testCircle = new Circle(new Point(3,3),6);
        assertEquals(37.69911184307752,testCircle.circumference());
    }

    @Test
    void isWithinTest(){
        Circle testCircle = new Circle(new Point(3,3),6);
        Point point = new Point(3,3);
        assertEquals(true,testCircle.isWithin(point));
    }
}
