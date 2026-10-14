import org.junit.Test;
import static org.junit.Assert.*;
public class NumberPalindromeTest {
    private final NumberPalindrome obj = new NumberPalindrome();
    @Test public void palindrome() { assertTrue(obj.isPalindrome(121)); }
    @Test public void notPalindrome() { assertFalse(obj.isPalindrome(123)); }
    @Test public void oneDigit() { assertTrue(obj.isPalindrome(7)); }
    @Test public void negative() { assertFalse(obj.isPalindrome(-121)); }
    @Test public void zero() { assertTrue(obj.isPalindrome(0)); }
}
