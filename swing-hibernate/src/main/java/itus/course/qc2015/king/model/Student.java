package itus.course.qc2015.king.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student  implements  Serializable {
	// props
	private static final long serialVersionUID = 1L;
	private String NumberId;
	private String FullName;
	private String Major;
	private int Course;
	private String UserName;
	private String EncrytedPassword;
           private int ToTalLoggedNumber;
    // one to many
           private Set<Subject> subjectz;

   

    public Student() {
        this.subjectz = new HashSet<>(0); 
    }

    public Set<Subject> getSubjectz() {
        return subjectz;
    }

    public void setSubjectz(Set<Subject> subjectz) {
        this.subjectz = subjectz;
    }
           
     
                                  
            public int getToTalLoggedNumber() {
                return ToTalLoggedNumber;
            }

            public void setToTalLoggedNumber(int ToTalLoggedNumber) {
                this.ToTalLoggedNumber = ToTalLoggedNumber;
            }
             
	public String getNumberId() {
		return NumberId;
	}
	public void setNumberId(String numberId) {
		NumberId = numberId;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public int getCourse() {
		return Course;
	}
	public void setCourse(int course) {
		Course = course;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEncrytedPassword() {
		return EncrytedPassword;
	}
	public void setEncrytedPassword(String encrytedPassword) {
		EncrytedPassword = encrytedPassword;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
                 return new StringBuilder()
                    .append("NumberID: ").append(this.NumberId).append(System.getProperty("line.separator"))
                    .append("FullName: ").append(this.FullName).append(System.getProperty("line.separator"))
                    .append("Major: ").append(this.Major).append(System.getProperty("line.separator"))
                    .append("Course: ").append(this.Course).append(System.getProperty("line.separator"))
                    .append("UserName: ").append(this.UserName).append(System.getProperty("line.separator"))
                    .append("Encrypted Password: ").append(this.EncrytedPassword).append(System.getProperty("line.separator"))
                    .toString();
	}
	
}
