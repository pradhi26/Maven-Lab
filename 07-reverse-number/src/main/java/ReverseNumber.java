public class ReverseNumber {
    public int reverse(int n) {
        int sign = n < 0 ? -1 : 1;
        long v = Math.abs((long)n), r = 0;
        while (v > 0) { r = r * 10 + v % 10; v /= 10; }
        r *= sign;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) throw new ArithmeticException("Overflow");
        return (int)r;
    }
    public static void main(String[] args) { System.out.println(new ReverseNumber().reverse(1234)); }
}
