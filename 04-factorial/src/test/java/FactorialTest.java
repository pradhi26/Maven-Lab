import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialTest {
    private final Factorial obj = new Factorial();
    @Test public void five() { assertEquals(120L, obj.factorial(5)); }
    @Test public void zero() { assertEquals(1L, obj.factorial(0)); }
    @Test public void one() { assertEquals(1L, obj.factorial(1)); }
    @Test(expected=IllegalArgumentException.class) public void negative() { obj.factorial(-2); }
}
