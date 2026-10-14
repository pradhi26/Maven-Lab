import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeNumberTest {
    private final PrimeNumber obj = new PrimeNumber();
    @Test public void prime() { assertTrue(obj.isPrime(17)); }
    @Test public void composite() { assertFalse(obj.isPrime(18)); }
    @Test public void one() { assertFalse(obj.isPrime(1)); }
    @Test public void negative() { assertFalse(obj.isPrime(-7)); }
    @Test public void two() { assertTrue(obj.isPrime(2)); }
}
