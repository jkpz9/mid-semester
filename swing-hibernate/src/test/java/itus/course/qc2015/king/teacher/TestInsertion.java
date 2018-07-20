package itus.course.qc2015.king.teacher;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

import itus.course.qc2015.king.dao.impl.TeacherDAO;
import itus.course.qc2015.king.model.Teacher;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestInsertion {

	@Test
	public void test() throws ParseException {
                                String hashedpassword = BCrypt.hashpw("anhtu", BCrypt.gensalt());
                                Teacher teacher = new Teacher();
                                teacher.setId("GV00002");
                               teacher.setFullName("Hoàng Anh Tú");
                               teacher.setUserName("anhtu");
                               SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
                               
                               teacher.setJoinDate(myFormat.parse("2006-08-21"));
                               teacher.setEncrytedPassword(hashedpassword);
		TeacherDAO tcDAO = new TeacherDAO();
		assertEquals(true, tcDAO.add(teacher));	
	}

}
