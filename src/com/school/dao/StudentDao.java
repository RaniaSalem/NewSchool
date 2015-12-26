
package com.school.dao;

import com.school.pojo.Student;

/**
 *
 * @author toshiba
 */
public interface StudentDao {
      public void insertStudentData(Student student);
   public void updateStudentDtata(Student student,int studentId);
   public void  deleteStudentData(int studentId);
   public Student viewStudentData(int student);  
}
