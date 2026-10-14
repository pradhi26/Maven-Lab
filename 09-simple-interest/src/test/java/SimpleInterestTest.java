import org.junit.Test;
import static org.junit.Assert.*;
public class SimpleInterestTest {
    private final SimpleInterest obj = new SimpleInterest();
    @Test public void normal() { assertEquals(100.0, obj.calculate(1000, 5, 2), 0.001); }
    @Test public void zeroRate() { assertEquals(0.0, obj.calculate(1000, 0, 2), 0.001); }
    @Test public void zeroTime() { assertEquals(0.0, obj.calculate(1000, 5, 0), 0.001); }
    @Test(expected=IllegalArgumentException.class) public void negative() { obj.calculate(-100, 5, 2); }
}
