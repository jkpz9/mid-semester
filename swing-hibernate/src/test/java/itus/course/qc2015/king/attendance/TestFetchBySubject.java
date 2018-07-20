/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itus.course.qc2015.king.attendance;

import itus.course.qc2015.king.dao.impl.AttendanceDAO;
import itus.course.qc2015.king.model.Attendance;
import java.util.Iterator;
import java.util.List;
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
public class TestFetchBySubject {
    
    public TestFetchBySubject() {
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
          List<Attendance> list = new AttendanceDAO().getByForSubject("CTT2248");
         assertEquals(4, list.size());
        for (Attendance att : list) {
            System.out.println(new StringBuilder()
                    .append("mssv: ").append(att.getStudentId()).append("\n")
                    .append("mamon: ").append(att.getSubjectId()).append("\n")
                    .append("week: ").append(att.getWeek()).append("\n")
                    .append("presence: ").append(att.getPresence())
                    .toString());
        }
     }
}
