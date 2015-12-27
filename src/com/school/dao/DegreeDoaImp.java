/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.Result;
import com.school.pojo.Student;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Nada
 */
public class DegreeDoaImp extends DataBaseDaoImp implements DegreeDoa {
 Connection conn = openConnection();
  @Override
    public void InsertDegreeDoa(Student StudentId,int degree) {
       
       
        String sql2 = "insert into reult (GRADE) "
                + " values (" + degree + "') WHERE STUD_ID= " +StudentId  ;
        updateQuery(sql2, conn);
      
        closeConnection(conn); 
    }

    @Override
    public void DelteDegreeDoa(Student StudentId, Student StudentFirstName) {
          String sql = "delete GRADE from result,students where students.STUD_ID = " + StudentId +"AND students.STUD_FIRST_NAME =" +StudentFirstName ;
        updateQuery(sql, conn);
        closeConnection(conn);
   }
 @Override
    public void EditDegreeDoa(Student StudentId,  int grade, Student StudentFirstName) {
     String sql = "update result set GRADE = '" + grade  + "' where students.STUD_FIRST_NAME = " + StudentFirstName +"AND students.STUD_ID =" +StudentId;
      
        updateQuery(sql, conn);
        closeConnection(conn); }

    @Override
    public Student ViewDegreeDoa(Student studentId) {
    String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`r.GRADE` FROM students as s,result as r WHERE students.STUD_ID ="+studentId +"AND r.STUD_ID=s.STUD_ID"   ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
      Result r=new Result();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
         
              r.getGrade();

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m; }

    @Override
    public Student ViewDegreeDoa() {
      String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`r.GRADE` FROM students as s,result as r WHERE  r.STUD_MID_NAME=s.STUD_MID_NAME"   ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
      Result r=new Result();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
         
              r.getGrade();

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m; }

    @Override
    public Student ViewDegreeDoa(String name) {
    String sql = "SELECT `s.STUD_FIRST_NAME`,`s.STUD_MID_NAME`,`s.LAST_NAME` ,`s.LEVEL_ID`,`r.GRADE` FROM students as s,result as r WHERE students.STUD_MID_NAME ="+name +"AND r.STUD_MID_NAME=s.STUD_MID_NAME"   ;
    ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
      Result r=new Result();
        try {
            while (rs.next()) {
                m.getStudentId();//STUD_ID                
              
                m.getFirstName();//STUD_FIRST_NAME
                m.getMidName();//STUD_MID_NAME
                m.getLastName();//LAST_NAME
                  m.getStudentLevel();//LEVEL_ID
         
              r.getGrade();

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m; }

    
}
