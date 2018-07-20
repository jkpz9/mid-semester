package itus.course.qc2015.king.subject;
import itus.course.qc2015.king.dao.impl.SubjectDAO;
import itus.course.qc2015.king.model.Subject;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUpdation {
    private SubjectDAO subjectDAO;
    public TestUpdation() {
    }
    
    @Test
    public void testUpdate()
    {
        Subject sub = subjectDAO.getById("CTT4430");
        if (sub == null) return;
        sub.setRoom("C205");
        assertEquals(true, subjectDAO.update(sub));
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       subjectDAO = new  SubjectDAO();
    }
    
    @After
    public void tearDown() {
    }

}
