public class ArraySum {
    public int sum(int[] a) { int total = 0; for (int n : a) total += n; return total; }
    public static void main(String[] args) { System.out.println(new ArraySum().sum(new int[]{1,2,3,4,5})); }
}
