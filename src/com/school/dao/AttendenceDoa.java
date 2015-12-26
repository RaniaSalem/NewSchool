/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;


import com.school.pojo.Student;
import com.school.pojo.StudentAttendance;
import com.school.pojo.Teacher;
/**
 *
 * @author Nada
 */
public interface AttendenceDoa {



  
    public void TakeAttendence(Student StudentId, Student StudentFirstName, Student StudentMidName, Student StudentLastName, Student Level, StudentAttendance Statues);
   public void updateStudentattendence(Student studentName,char Statues);
    public Student viewStudentAttendence(int studentId);



    /**
     *
     * @param name
     * @return
     */
    public Student viewStudentAttendence(String name);
    public Student ViewAll();
}
