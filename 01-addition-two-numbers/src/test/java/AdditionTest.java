import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AdditionTest {
    private final Addition obj = new Addition();
    @Test public void positive() { assertEquals(30, obj.add(10, 20)); }
    @Test public void negative() { assertEquals(-15, obj.add(-10, -5)); }
    @Test public void mixed() { assertEquals(5, obj.add(10, -5)); }
    @Test public void zero() { assertEquals(7, obj.add(7, 0)); }
}
