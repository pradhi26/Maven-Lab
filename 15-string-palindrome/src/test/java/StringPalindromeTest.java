import org.junit.Test;
import static org.junit.Assert.*;
public class StringPalindromeTest {
    private final StringPalindrome obj = new StringPalindrome();
    @Test public void palindrome() { assertTrue(obj.isPalindrome("madam")); }
    @Test public void notPalindrome() { assertFalse(obj.isPalindrome("hello")); }
    @Test public void mixedCase() { assertTrue(obj.isPalindrome("RaceCar")); }
    @Test public void ignoresPunctuation() { assertTrue(obj.isPalindrome("A man, a plan, a canal: Panama")); }
    @Test public void empty() { assertTrue(obj.isPalindrome("")); }
}
