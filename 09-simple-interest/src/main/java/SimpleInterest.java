public class SimpleInterest {
    public double calculate(double p, double r, double t) {
        if (p < 0 || r < 0 || t < 0) throw new IllegalArgumentException("Inputs must be non-negative");
        return p * r * t / 100.0;
    }
    public static void main(String[] args) { System.out.println(new SimpleInterest().calculate(1000, 5, 2)); }
}
