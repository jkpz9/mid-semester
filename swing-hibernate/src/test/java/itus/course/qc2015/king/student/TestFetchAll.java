package itus.course.qc2015.king.student;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFetchAll {
     StudentDAO stDAO ;
    public TestFetchAll() {
    }
    
    @Test
    public void getALl()
    {
      
        assertEquals(2, stDAO.getAll().size());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          stDAO = new StudentDAO();
    }
    
    @After
    public void tearDown() {
    }
}

