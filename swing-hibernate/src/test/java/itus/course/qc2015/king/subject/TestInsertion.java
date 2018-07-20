package itus.course.qc2015.king.subject;

import itus.course.qc2015.king.dao.impl.SubjectDAO;

import org.junit.Test;
import itus.course.qc2015.king.model.Subject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.junit.Assert.assertEquals;

public class TestInsertion {

	@Test
	public void test() throws ParseException {
                                SubjectDAO subjDAO = new SubjectDAO();
                                Subject sbj = new Subject();
                                sbj.setSubjID("CTT5858");
                                sbj.setTitle("Mobile Development");
                                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
                               sbj.setBeginDate(myFormat.parse("2018-01-23"));
                               sbj.setFinishDate(myFormat.parse("2018-06-04"));
                               sbj.setDay("Wednesday");
                               sbj.setBeginPeriod("7:00");
                               sbj.setFinishPeriod("09:30");
                               sbj.setRoom("C302");
                                //sbj.setBeginDate("");
                            assertEquals(true, subjDAO.add(sbj));	
	}

}
