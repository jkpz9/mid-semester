package itus.course.qc2015.king.student;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.model.Subject;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFetchById {
    public TestFetchById() {
    }
    
    @Test
    public void test()
    {
         StudentDAO stDAO = new StudentDAO();
        Student sv = stDAO.getById("1412183");
        assertEquals("Pham Quoc Hoang", sv.getFullName());
        assertEquals(1, sv.getSubjectz().size());
        System.out.println("DANH SACH MON HOC");
         Iterator<Subject> iter = sv.getSubjectz().iterator();
    
        while (iter.hasNext()) {
        Subject ss = iter.next();
         System.out.println(ss.getTitle());
         
       }
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //stDAO = new StudentDAO();
    }
    
    @After
    public void tearDown() {
    }
}
