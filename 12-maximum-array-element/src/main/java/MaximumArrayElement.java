public class MaximumArrayElement {
    public int maximum(int[] a) {
        if (a == null || a.length == 0) throw new IllegalArgumentException("Array must not be empty");
        int max = a[0]; for (int n : a) if (n > max) max = n; return max;
    }
    public static void main(String[] args) { System.out.println(new MaximumArrayElement().maximum(new int[]{4,9,2,7})); }
}
