package itus.course.qc2015.king.subject;

import itus.course.qc2015.king.dao.impl.SubjectDAO;
import itus.course.qc2015.king.model.Attendance;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.model.Subject;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFetchById {
    
    public TestFetchById() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void test()
    {
        Subject sub = new SubjectDAO().getById("CTT2248");
        assertNotEquals(null, sub);
        System.out.println(sub.getTitle());
//        if (sub == null) return;
        Iterator<Student> iter = sub.getStudents().iterator();
        System.out.println("STUDENT  ATTENDING");
        while(iter.hasNext())
        {
            Student s = (Student)iter.next();
            System.out.println(s.toString());
        }
//        List<Attendance> attend = sub.getAttendances();
//        System.out.println("\n\nATTENDANCES");
//        attend.forEach((att) -> {
//            Student s = att.getStudent();
//            System.out.println(s.toString());
//            System.out.println(att.toString());
//        });
    }
}
