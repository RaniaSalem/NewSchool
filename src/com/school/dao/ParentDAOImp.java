package com.school.dao;

import com.school.pojo.Parent;
import java.sql.Connection;

/**
 *
 * @author manal pc
 */


public class ParentDAOImp  extends DataBaseDaoImp implements ParentDAO{
  Connection conn = openConnection();
    @Override
    public void viewMarkaStudent(Parent parent) {
    }

    @Override
    public void viewAttendanceStudent(Parent parent) {
    }

    @Override
    public void viewReportStudent(Parent parent) {
    }

    @Override
    public void viewScheduleExam(Parent parent) {
    }

    @Override
    public void addDataParent(Parent parent) {
    }

    @Override
    public void viewScheduleSubject(Parent parent) {
    }

    @Override
    public void deleteDataParent(int parentId) {
         String sql = "delete from parents where PARENT_ID = " + parentId;
         updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void updateDataParent(Parent parent) {
    }
    
}
