package itus.course.qc2015.king.student;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import itus.course.qc2015.king.model.Student;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDeletion {
    private StudentDAO stDAO;
    public TestDeletion() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stDAO =  new StudentDAO ();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test 
    public void testDeletion()
    {
        Student st = stDAO.getById("1513193");
        assertEquals(true, stDAO.delete(st));
    }
}
