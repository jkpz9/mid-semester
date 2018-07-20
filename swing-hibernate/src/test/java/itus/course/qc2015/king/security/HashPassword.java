package itus.course.qc2015.king.security;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

import itus.course.qc2015.king.model.Student;

public class HashPassword {

	@Test
	public void cipher()
	{
		String hashedpassword = BCrypt.hashpw("KingHandsome", BCrypt.gensalt());
		Student student = new Student();
                                        student.setNumberId("1412183");
                                        student.setFullName( "Pham Quoc Hoang");
                                       student .setCourse(2014);
                                        student.setMajor("System Information ");
                                       student .setUserName("KingMaster");
                                       student.setEncrytedPassword(hashedpassword);
		assertEquals(true, BCrypt.checkpw("KingHandsome", student.getEncrytedPassword()));
		System.out.println(student.toString());
	}

}
