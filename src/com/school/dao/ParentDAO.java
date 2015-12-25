/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    

