import org.junit.Test;
import static org.junit.Assert.*;
public class MaximumArrayElementTest {
    private final MaximumArrayElement obj = new MaximumArrayElement();
    @Test public void middle() { assertEquals(9, obj.maximum(new int[]{4,9,2,7})); }
    @Test public void first() { assertEquals(10, obj.maximum(new int[]{10,3,2})); }
    @Test public void negative() { assertEquals(-1, obj.maximum(new int[]{-5,-1,-8})); }
    @Test(expected=IllegalArgumentException.class) public void empty() { obj.maximum(new int[]{}); }
}
