import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseNumberTest {
    private final ReverseNumber obj = new ReverseNumber();
    @Test public void positive() { assertEquals(4321, obj.reverse(1234)); }
    @Test public void trailingZeros() { assertEquals(21, obj.reverse(1200)); }
    @Test public void negative() { assertEquals(-432, obj.reverse(-234)); }
    @Test public void zero() { assertEquals(0, obj.reverse(0)); }
}
