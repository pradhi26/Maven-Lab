import org.junit.Test;
import static org.junit.Assert.*;
public class VowelCounterTest {
    private final VowelCounter obj = new VowelCounter();
    @Test public void normal() { assertEquals(3, obj.countVowels("Hello World")); }
    @Test public void uppercase() { assertEquals(5, obj.countVowels("AEIOU")); }
    @Test public void none() { assertEquals(0, obj.countVowels("rhythm")); }
    @Test public void empty() { assertEquals(0, obj.countVowels("")); }
}
