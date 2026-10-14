public class FibonacciSeries {
    public int[] generate(int n) {
        if (n < 0) throw new IllegalArgumentException("Terms must be non-negative");
        int[] a = new int[n];
        if (n > 0) a[0] = 0;
        if (n > 1) a[1] = 1;
        for (int i = 2; i < n; i++) a[i] = a[i-1] + a[i-2];
        return a;
    }
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(new FibonacciSeries().generate(7)));
    }
}
