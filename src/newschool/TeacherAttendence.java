
package newschool;

/**
 *
 * @author toshiba
 */
import java.util.Date;
public class TeacherAttendence {

    private int attenence_ID;
    private Date  attendenceDate;
    private int status;
    private int teacher_ID;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAttenence_ID() {
        return attenence_ID;
    }

    public void setAttenence_ID(int attenence_ID) {
        this.attenence_ID = attenence_ID;
    }

    public Date getAttendenceDate() {
        return attendenceDate;
    }

    public void setAttendenceDate(Date attendenceDate) {
        this.attendenceDate = attendenceDate;
    }


    public int getTeacher_ID() {
        return teacher_ID;
    }

    public void setTeacher_ID(int teacher_ID) {
        this.teacher_ID = teacher_ID;
    }
    
    
    
    
    
    
}

    
    

