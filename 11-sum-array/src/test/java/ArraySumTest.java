import org.junit.Test;
import static org.junit.Assert.*;
public class ArraySumTest {
    private final ArraySum obj = new ArraySum();
    @Test public void positive() { assertEquals(15, obj.sum(new int[]{1,2,3,4,5})); }
    @Test public void negative() { assertEquals(-6, obj.sum(new int[]{-1,-2,-3})); }
    @Test public void empty() { assertEquals(0, obj.sum(new int[]{})); }
    @Test public void mixed() { assertEquals(4, obj.sum(new int[]{-2,5,1})); }
}
