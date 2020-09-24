import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void newRectangleNoInput(){
        Rectangle testRectangle = new Rectangle();
        assertEquals(1,testRectangle.width);
        assertEquals(1, testRectangle.height);
        assertEquals(0,testRectangle.x);
        assertEquals(0,testRectangle.y);
    }

    @Test
    void newRectangleWithInput(){
        Rectangle testRectangle = new Rectangle(4,4,4,4);
        assertEquals(4,testRectangle.width);
        assertEquals(4, testRectangle.height);
        assertEquals(4,testRectangle.x);
        assertEquals(4,testRectangle.y);
    }

    @Test
    void centerTest(){
        Rectangle testRectangle = new Rectangle(4,4,4,4);
        Point point = new Point(6.0,6.0);
        assertEquals(point,testRectangle.center());
    }

    @Test
    void areaTest(){
        Rectangle testRectangle = new Rectangle(4,4,4,4);
        assertEquals(16,testRectangle.area());
    }

    @Test
    void circumferenceTest(){
        Rectangle testRectangle = new Rectangle(4,4,4,4);
        assertEquals(16,testRectangle.circumference());
    }

    @Test
    void isWithinTest(){
        Rectangle testRectangle = new Rectangle(4,4,4,4);
        Point point = new Point(6,6);
        assertEquals(true,testRectangle.isWithin(point));
    }
}
