package itus.course.qc2015.king.utilOperation;

import itus.course.qc2015.king.util.ValidationAttending;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Validation {
    
    public Validation() {
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
     public void hello() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        Date original = sdf.parse("2018-01-14");
        assertEquals(true, ValidationAttending.isValid(original, "12:30", "15:00", 13));
     }
}
