package itus.course.qc2015.king.model;

import java.util.Date;

public class Teacher {
private String Id;
private Date JoinDate;
private String UserName;
private String FullName;
private String EncrytedPassword;
public Teacher() { }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(Date JoinDate) {
        this.JoinDate = JoinDate;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String Fullname) {
        this.FullName = Fullname;
    }

    public String getEncrytedPassword() {
        return EncrytedPassword;
    }

    public void setEncrytedPassword(String EncrytedPassword) {
        this.EncrytedPassword = EncrytedPassword;
    }

}
