/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itus.course.qc2015.king.attendance;

import itus.course.qc2015.king.dao.impl.AttendanceDAO;
import itus.course.qc2015.king.model.Attendance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TestAttendanceFetchById {
    
    public TestAttendanceFetchById() {
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
     public void hello() {
            Attendance att = new  AttendanceDAO().getByIdentifier("1412200", "CT2345", 2);
            assertNotEquals(null, att );
            
            System.out.println("PRESENCE: " +att.getPresence());    
     }
}
