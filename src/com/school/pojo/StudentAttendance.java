/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.pojo;

import java.util.Date;

/**
 *
 * @author Noura
 */
public class StudentAttendance {
     private int attendanceId;
   private Date attendanceDate;
   private int status;
   private Student student;
   
    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

  

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the attendanceDate
     */
    public Date getAttendanceDate() {
        return attendanceDate;
    }

    /**
     * @param attendanceDate the attendanceDate to set
     */
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

  
   
}
