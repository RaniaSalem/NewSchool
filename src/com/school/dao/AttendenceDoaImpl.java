/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.Student;
import com.school.pojo.StudentAttendance;
import java.sql.Connection;
import java.sql.ResultSet;



/**
 *
 * @author Nada
 */
public class AttendenceDoaImpl extends DataBaseDaoImp implements AttendenceDoa{
   Connection conn = openConnection();

    @Override
    public void TakeAttendence(Student StudentId, Student StudentFirstName, Student StudentMidName, Student StudentLastName, Student Level, StudentAttendance Statues) {
       String sql = "insert into Student (STUD_ID,`STUD_FIRST_NAME`,`STUD_MID_NAME`,`STUD_LAST_NAME`,`LEVEL_ID`) "
                + " values (" + StudentId + ",'" + StudentFirstName + "','" + StudentMidName + "','" + StudentLastName+ "','" + Level+ "')";
        updateQuery(sql, conn);
        String sql2 = "insert into attendance_student (STATUS) "
                + " values (" + Statues + "')";
        updateQuery(sql2, conn);
        closeConnection(conn); 
    }

    @Override
    public void updateStudentattendence(Student studentName,char Statues) {
        String sql = "update attendance_student set STATUS = '" + Statues  + "' where students.STUD_FIRST_NAME = " + studentName;
      
        updateQuery(sql, conn);
        closeConnection(conn);  }

    @Override
    public Student viewStudentAttendence(int studentId) {
        String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`a.STATUS` FROM students as s,attendance_student as a WHERE students.STUD_ID ="+studentId +"AND attendance_student.STUD_ID =students.STUD_ID"  ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
        StudentAttendance a=new StudentAttendance();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
            a.getStatus();
              

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public Student viewStudentAttendence(String name) {
        String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`a.STATUS` FROM students as s,attendance_student as a WHERE students.STUD_FIRST_NAME ="+name +"AND attendance_student.STUD_ID =students.STUD_ID"  ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
        StudentAttendance a=new StudentAttendance();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
            a.getStatus();
              

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;}
    @Override  
   public Student ViewAll()
   {
            String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`a.STATUS` FROM students as s,attendance_student as a WHERE  attendance_student.STUD_ID =students.STUD_ID"  ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
        StudentAttendance a=new StudentAttendance();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
            a.getStatus();
              

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
   }
}
