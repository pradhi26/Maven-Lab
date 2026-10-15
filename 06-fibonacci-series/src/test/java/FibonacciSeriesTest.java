import org.junit.Test;
import static org.junit.Assert.*;
public class FibonacciSeriesTest {
    private final FibonacciSeries obj = new FibonacciSeries();
    @Test public void sevenTerms() { assertArrayEquals(new int[]{0,1,1,2,3,5,8}, obj.generate(7)); }
    @Test public void oneTerm() { assertArrayEquals(new int[]{0}, obj.generate(2)); }
    @Test public void zeroTerms() { assertArrayEquals(new int[]{}, obj.generate(0)); }
    @Test(expected=IllegalArgumentException.class) public void negative() { obj.generate(-1); }
}
