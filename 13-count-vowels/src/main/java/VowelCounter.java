public class VowelCounter {
    public int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("Text must not be null");
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) if ("aeiou".indexOf(c) >= 0) count++;
        return count;
    }
    public static void main(String[] args) { System.out.println(new VowelCounter().countVowels("Hello World")); }
}
