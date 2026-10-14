public class StringPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Text must not be null");
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return clean.contentEquals(new StringBuilder(clean).reverse());
    }
    public static void main(String[] args) { System.out.println(new StringPalindrome().isPalindrome("madam")); }
}
