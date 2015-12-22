/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

/**
 *
 * @author Noura
 */
public class StudentAttendance {
     private int attendanceId;
   private int attendanceDate;
   private int status;
   private int studentId;
   
    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(int attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
   
}
