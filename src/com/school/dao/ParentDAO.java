package com.school.dao;

import com.school.pojo.Parent;

/**
 *
 * @author manal pc
 */
public interface ParentDAO {
    public void viewMarkaStudent(Parent parent);
    public void viewAttendanceStudent(Parent parent);
    public void viewReportStudent(Parent parent);
    public void viewScheduleExam(Parent parent);
    public void addDataParent(Parent parent);
    public void viewScheduleSubject(Parent parent);
    public void deleteDataParent(Parent parent);
    public void updateDataParent(Parent parent);
    
    
    
}
    

