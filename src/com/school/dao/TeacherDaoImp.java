
package com.school.dao;

import com.school.pojo.Teacher;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author toshiba
 */
public class TeacherDaoImp extends DataBaseDaoImp implements TeacherDao{
Connection conn = openConnection();
    @Override
    public void addTeacher() {
        
    }

    @Override
    public void updateTeacher() {
        
    }

    @Override
    public void deleteTeacher(int teacherID) {
        String sql ="DELETE FROM Teacher WHERE TEACH_ID ="+ teacherID;
         System.out.println("done"+"    Delete Teacher With ID    "+ teacherID );
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public Teacher getTeacher(int teacherId) {
        Teacher teacher = new Teacher();
    try {
        String sql = "SELECT * FROM Teacher WHERE TEACH_ID=" + teacherId;
        ResultSet rs = excuteQuery(sql, conn);
        if (rs.next()) {
            teacher.setTeacherID(rs.getInt(1));
            teacher.setDateOfHire(rs.getDate("DATE_OF_HIRE"));
            teacher.setLastPosition(rs.getString("LAST_POSITION"));
            teacher.setQualification(rs.getString("QUALIFICATION"));
            teacher.setSpecialization(rs.getString("SPECIALIZATION"));
            teacher.setFirstName(rs.getString(6));
            teacher.setMidName(rs.getString(7));
            teacher.setLastName(rs.getString(8));
            teacher.setAddress(rs.getString("ADDRESS"));
            teacher.setGender(rs.getString("GENDER"));
            teacher.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));
            teacher.setPhone(rs.getString("PHONE"));
            teacher.setType(rs.getString("TYPE"));

        }
        closeConnection(conn);
} catch (SQLException ex) {
    
    }
        return teacher;
    
    }

    @Override
    public  List< Teacher> getAllTeacher() {
        List < Teacher> list =new ArrayList<>();
        String sql = "SELECT * FROM Teacher " ;
         Teacher teacher = null;
    try {         
        ResultSet rs = excuteQuery(sql, conn);
        
        while (rs.next()) {
            teacher = new Teacher();
            teacher.setTeacherID(rs.getInt(1));
            teacher.setDateOfHire(rs.getDate("DATE_OF_HIRE"));
            teacher.setLastPosition(rs.getString("LAST_POSITION"));
            teacher.setQualification(rs.getString("QUALIFICATION"));
            teacher.setSpecialization(rs.getString("SPECIALIZATION"));
            teacher.setFirstName(rs.getString(6));
            teacher.setMidName(rs.getString(7));
            teacher.setLastName(rs.getString(8));
            teacher.setAddress(rs.getString("ADDRESS"));
            teacher.setGender(rs.getString("GENDER"));
            teacher.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));
            teacher.setPhone(rs.getString("PHONE"));
            teacher.setType(rs.getString("TYPE"));
       list.add(teacher);
        }} catch (SQLException ex) {
       ex.printStackTrace();
    }
        closeConnection(conn);

        return list;
    }
    
}
