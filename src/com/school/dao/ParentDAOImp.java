package com.school.dao;

import com.school.pojo.Parent;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author manal pc
 */


public class ParentDAOImp  extends DataBaseDaoImp implements ParentDAO{
  Connection conn = openConnection();
  /*
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
    public void viewScheduleSubject(Parent parent) {
    }
*/
  
  

    

    @Override
    public void deleteDataParent(int parentId) {
         String sql = "delete from parents where PARENT_ID = " + parentId;
         updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void updateDataParent(Parent parent) {
    }

    @Override
    public void insertDataParent(int parentId, String firstName, String lastName, String midName, String address, String gender, Object dateOfBirth, String Phone, int studentId) {
        String sql = "insert into Parents (PARENT_ID,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`STUD_ID`) "
                + " values (" + parentId + ",'" + firstName + "','" + midName + "','" + lastName+ "','" + address+ "','" + gender + "','" + dateOfBirth + "','" + Phone+ "','" + studentId + "')";
        updateQuery(sql, conn);
        closeConnection(conn);
        
    }

   

    
    
}
