public class Factorial {
    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
    public static void main(String[] args) { System.out.println(new Factorial().factorial(5)); }
}
