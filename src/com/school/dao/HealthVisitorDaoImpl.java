/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.HealthVisitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author eng doaa
 */
public class HealthVisitorDaoImpl extends DataBaseDaoImp implements HealthVisitorDao {

    @Override
    public void InsertDataHealthVisitor(HealthVisitor healthvisitorId, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor firstName, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into HealthVisitor (HEALTH_ID,`DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`)"
                + "values (" + healthvisitorId + ",'" + dateOfHire + "','" + qualification + "','" + postion + "','" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "')";
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    @Override
    public void removeDataHealthVisitor(HealthVisitor healthvisitorId) {
        Connection conn = openConnection();
        String sql = "delete from HealthVisitor where HEALTH_ID = " + healthvisitorId;
        updateQuery(sql, conn);
        closeConnection(conn);

    }

    @Override
    public void editDataHealthVisitor(HealthVisitor healthvisitorId, HealthVisitor firstName, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone) {

        Connection conn = openConnection();
        String sql = "update HealthVisitorset FIRST_NAME = '" + firstName + "' , `DATE_OF_HIRE`='" + dateOfHire + "' , `QUALIFICATION` = '" + qualification + "' , `POSITION`='" + "' , `MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `TYPE`='" + "'  where HEALTH_ID = " + healthvisitorId;
        System.out.println("newschool.HealthVisitorDaoImpl.editDataHealthVisitor():" + sql);
        updateQuery(sql, conn);
        closeConnection(conn);

    }
    

    @Override
    public HealthVisitor viewHealthVisitorScreen(int healthvisitorId) {

        Connection conn = openConnection();
       // String sql1 = "select FIRST_NAME from HealthVisitor where HEALTH_ID = " + healthvisitorId;
        String sql = "select `DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS` "
                + ",`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`HEALTH_ID` "
                + " from HealthVisitor where HEALTH_ID = " + healthvisitorId;
        ResultSet rs = excuteQuery(sql, conn);
        HealthVisitor hv = new HealthVisitor();
        try {
            while (rs.next()) {

                hv.setDateOfHire(rs.getDate(1));//DATE_OF_HIRE
                hv.setQualification(rs.getString(2));//QUALIFICATION

                hv.setFirstName(rs.getString(3));//FIRST_NAME
                hv.setMidName(rs.getString(4));//MID_NAME
                hv.setLastName(rs.getString(5));//LAST_NAME
                hv.setAddress(rs.getString(6));//ADDRESS
                hv.setGender(rs.getString(7));//GENDER
                hv.setDateOfBirth(rs.getDate(8));//DATE_OF_BIRTH
                hv.setPhone(rs.getString(9));//PHONE

                hv.setHealth_ID(rs.getInt(10));
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hv;

    }

   
}
