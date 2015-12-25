
package com.school.pojo;

/**
 *
 * @author toshiba
 */
import java.util.Date;
public class TeacherAttendence {

    private int attenendceID;
    private Date  attendenceDate;
    private int status;

    public int getAttenendceID() {
        return attenendceID;
    }

    public void setAttenendceID(int attenendceID) {
        this.attenendceID = attenendceID;
    }
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    

    public Date getAttendenceDate() {
        return attendenceDate;
    }

    public void setAttendenceDate(Date attendenceDate) {
        this.attendenceDate = attendenceDate;
    }


   
    
    
    
}

    
    

