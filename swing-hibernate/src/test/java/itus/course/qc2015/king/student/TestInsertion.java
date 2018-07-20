package itus.course.qc2015.king.student;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;
import itus.course.qc2015.king.model.Student;

import java.text.ParseException;

public class TestInsertion {

	@Test
	public void test() throws ParseException {
                String hashedpassword = BCrypt.hashpw("hieupham", BCrypt.gensalt());
                Student student = new Student();
                student.setNumberId("1412167");
                student.setFullName("Phan Trung Hi?u");
                student.setCourse(2014);
                student.setMajor("Software Engineer");
                student.setUserName("hieupham");
                student.setEncrytedPassword(hashedpassword);
            
		StudentDAO stDAO = new StudentDAO();
		assertEquals(true, stDAO.add(student));	
	}

}
