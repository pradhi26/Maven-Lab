public class StudentGrade {
    public String calculateGrade(double marks) {
        if (marks < 0 || marks > 100) throw new IllegalArgumentException("Marks must be 0 to 100");
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }
    public static void main(String[] args) { System.out.println(new StudentGrade().calculateGrade(85)); }
}
