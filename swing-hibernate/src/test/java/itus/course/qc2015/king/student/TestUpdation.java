package itus.course.qc2015.king.student;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import itus.course.qc2015.king.model.Student;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

public class TestUpdation {
    private StudentDAO stDAO;
    public TestUpdation() {
    }
    
    @Test
    public void testUpdate()
    {
        Student st = stDAO.getById("1612900");
        if (st == null) return;
        String hashedpassword = BCrypt.hashpw("1612900", BCrypt.gensalt());
        st.setEncrytedPassword(hashedpassword);
        assertEquals(true, stDAO.update(st));
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       stDAO = new  StudentDAO();
    }
    
    @After
    public void tearDown() {
    }

}
