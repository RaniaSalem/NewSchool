/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.Student;

/**
 *
 * @author Nada
 */
public interface DegreeDoa {
      public void InsertDegreeDoa(Student StudentId,int degree);
      public void DelteDegreeDoa(Student StudentId, Student StudentFirstName);
     public void EditDegreeDoa(Student StudentId,  int grade, Student StudentFirstName);
            public Student ViewDegreeDoa(Student studentId);
      public Student ViewDegreeDoa();
      public Student ViewDegreeDoa(String name);
}
