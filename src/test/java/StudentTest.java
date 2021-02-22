import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudentConstructor(){
        Student kole = new Student(27589, "Kole");
        Student john = null;
        assertNotNull(kole);
        assertNull(john);
    }

    @Test
    public void testStudentsProperties(){
        Student kole = new Student(27589, "Kole");
        assertSame(27589, kole.getId());
        assertSame("Kole", kole.getName());
        assertSame(0,kole.getGrades().size());
    }

    @Test
    public void testGrades(){
        Student kole = new Student(27589, "Kole");
        kole.addGrade(85);
        kole.addGrade(97);
        assertEquals(91, kole.getGradeAverage(),0);
    }

}
