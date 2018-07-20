package itus.course.qc2015.king.model;

public class Attendance {
    private int id;
    private int presence;
    private int Week;
    private String SubjectId;
    private String StudentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    
    public int getWeek() {
        return Week;
    }

    public void setWeek(int Week) {
        this.Week = Week;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    
    
    

}
