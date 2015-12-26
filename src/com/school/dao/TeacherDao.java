
package com.school.dao;

import com.school.pojo.Teacher;
import java.util.List;


/**
 *
 * @author toshiba
 */
public interface TeacherDao {
    
    public  void addTeacher();
    public void updateTeacher();
   public void deleteTeacher(int teacherID);
  public Teacher getTeacher(int teacherId);  
  public List< Teacher> getAllTeacher();  
}
