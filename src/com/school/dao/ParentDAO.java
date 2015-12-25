package com.school.dao;

import com.school.pojo.Parent;

/**
 *
 * @author manal pc
 */
public interface ParentDAO {
    /*
    public void viewMarkaStudent(Parent parent);
    public void viewAttendanceStudent(Parent parent);
    public void viewReportStudent(Parent parent);
    public void viewScheduleExam(Parent parent);
    public void viewScheduleSubject(Parent parent);
    */
    public void insertDataParent(int parentId , String firstName,String lastName,String midName,String address,String gender, Object dateOfBirth, String Phone ,int studentId);
    
    public void deleteDataParent(int parentId);
    public void updateDataParent(Parent parent);
    
    
    
}
    

