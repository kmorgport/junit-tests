import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort1;
    Cohort cohort2;
    Cohort cohort3;
    Student kole;
    Student john;

    @Before
    public void start(){
        cohort1 = new Cohort();
        cohort2 = new Cohort();
        cohort3 = new Cohort();
        kole = new Student(27589, "Kole");
        kole.addGrade(85);
        kole.addGrade(97);
        john = new Student(38491,"John");
        john.addGrade(80);
        john.addGrade(80);
        john.addGrade(80);
        cohort1.addStudent(kole);
        cohort1.addStudent(john);
        cohort2.addStudent(kole);
        cohort2.addStudent(john);
    }

    @Test
    public void testAdding(){
        cohort2.addStudent(new Student(4973, "Dan"));
        assertEquals("Dan",cohort2.getStudents().get(2).getName());
    }

    @Test
    public void getList(){
        assertEquals(2, cohort1.getStudents().size());
    }

    @Test
    public void testClassAverage(){
        assertEquals(85.5, cohort1.getCohortAverage(),0);
    }
}
