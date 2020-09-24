import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
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
