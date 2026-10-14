import org.junit.Test;
import static org.junit.Assert.*;
public class EvenOddTest {
    private final EvenOdd obj = new EvenOdd();
    @Test public void even() { assertTrue(obj.isEven(8)); }
    @Test public void odd() { assertFalse(obj.isEven(7)); }
    @Test public void zero() { assertTrue(obj.isEven(0)); }
    @Test public void negativeEven() { assertTrue(obj.isEven(-4)); }
}
