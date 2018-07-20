package itus.course.qc2015.king.teacher;

import itus.course.qc2015.king.dao.impl.TeacherDAO;
import itus.course.qc2015.king.model.Teacher;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

public class TestUpdation {
    private TeacherDAO tcDAO;
    public TestUpdation() {
    }
    
    @Test
    public void testUpdate()
    {
        Teacher tc = tcDAO.getById("GV00001");
        if (tc == null) return;
        String hashedpassword = BCrypt.hashpw("linhnice", BCrypt.gensalt());
        tc.setEncrytedPassword(hashedpassword);
        assertEquals(true, tcDAO.update(tc));
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       tcDAO = new  TeacherDAO();
    }
    
    @After
    public void tearDown() {
    }

}
