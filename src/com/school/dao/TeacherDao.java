/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.Teacher;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author toshiba
 */
public class TeacherDao extends DataBaseDaoImp {

    Connection conn = openConnection();

    public Teacher getTeacher(int teacherId) throws SQLException {
        Teacher teacher = new Teacher();
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

        return teacher;
    }
public void deleteTeacher(int teacherID){
    Connection conn = openConnection();
       String sql ="DELETE FROM Teacher WHERE TEACH_ID ="+ teacherID;
        updateQuery(sql, conn);
        closeConnection(conn);
}
    
    
    
}
