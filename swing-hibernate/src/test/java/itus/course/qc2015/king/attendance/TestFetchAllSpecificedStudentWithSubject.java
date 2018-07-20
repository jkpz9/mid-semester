package itus.course.qc2015.king.attendance;

import itus.course.qc2015.king.dao.impl.AttendanceDAO;
import itus.course.qc2015.king.model.Attendance;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFetchAllSpecificedStudentWithSubject {
    
    public TestFetchAllSpecificedStudentWithSubject() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         List<Attendance> list = new AttendanceDAO().getByForStudent("1712700", "CTT1000");
         assertEquals(15, list.size());
        for (Iterator<Attendance> it = list.iterator(); it.hasNext();) {
            Attendance att = it.next();
            System.out.println(new StringBuilder()
                                        .append("mssv: ").append(att.getStudentId()).append("\n")
                                        .append("mamon: ").append(att.getSubjectId()).append("\n")
                                        .append("week: ").append(att.getWeek()).append("\n")
                                        .append("presence: ").append(att.getPresence())
                                        .toString());
        }
     }
}
