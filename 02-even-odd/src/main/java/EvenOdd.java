public class EvenOdd {
    public boolean isEven(int number) { return number % 2 == 0; }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(n + (new EvenOdd().isEven(n) ? " is even" : " is odd"));
    }
}
