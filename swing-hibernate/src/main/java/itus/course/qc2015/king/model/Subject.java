package itus.course.qc2015.king.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Subject  implements Serializable {
private static final long serialVersionUID = 1L;
// props
    private String SubjID;
    private String Title;
    private Date BeginDate;
    private Date FinishDate;
    private String BeginPeriod;
    private String  FinishPeriod;
    private String Day;
    private String Room;
    
    private Set<Student> students = new HashSet<>(0);
    
//    private List<Attendance> attendances = new ArrayList<>();
//
//    public List<Attendance> getAttendances() {
//        return attendances;
//    }
//
//    public void setAttendances(List<Attendance> attendances) {
//        this.attendances = attendances;
//    }
    
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }



    public String getSubjID() {
        return SubjID;
    }

    public void setSubjID(String SubjID) {
        this.SubjID = SubjID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Date getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    public Date getFinishDate() {
        return FinishDate;
    }

    public void setFinishDate(Date FinishDate) {
        this.FinishDate = FinishDate;
    }

    public String getBeginPeriod() {
        return BeginPeriod;
    }

    public void setBeginPeriod(String BeginPeriod) {
        this.BeginPeriod = BeginPeriod;
    }

    public String getFinishPeriod() {
        return FinishPeriod;
    }

    public void setFinishPeriod(String FinishPeriod) {
        this.FinishPeriod = FinishPeriod;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }
            
}
