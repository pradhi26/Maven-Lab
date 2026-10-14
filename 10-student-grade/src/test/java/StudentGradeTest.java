import org.junit.Test;
import static org.junit.Assert.*;
public class StudentGradeTest {
    private final StudentGrade obj = new StudentGrade();
    @Test public void gradeA() { assertEquals("A", obj.calculateGrade(95)); }
    @Test public void gradeB() { assertEquals("B", obj.calculateGrade(85)); }
    @Test public void gradeC() { assertEquals("C", obj.calculateGrade(75)); }
    @Test public void gradeD() { assertEquals("D", obj.calculateGrade(65)); }
    @Test public void gradeF() { assertEquals("F", obj.calculateGrade(40)); }
    @Test(expected=IllegalArgumentException.class) public void over100() { obj.calculateGrade(101); }
}
