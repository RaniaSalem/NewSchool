package com.school.dao;

import com.school.pojo.Manager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDaoImpl implements ManagerDao{

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        printManagerDetails(1);////select data in table Manager
//        ManagerDao managerDao = new ManagerDao(); 
//        managerDao.InsertDataMan(5, "2015/12/1", "high", "Manager", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "High Manager");//insert data(man_id) in table Manager
//        managerDao.removeDataMan(13);//delete data(man_id) in table Manager
//        managerDao.editDataMan(5, "Mahmouddddddd", "2015/12/1", "high", "Manager", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Manager");//update data(first_name) according to (man_id)in table Manager
//
//    }
    ////select data in table Manager
//    private static void printManagerDetails(int manId)
//    {
//        ManagerDao managerDao = new ManagerDao();
//        Manager mm = managerDao.viewManagerScreen(manId); 
//        System.out.println("m.getFirstName() :" + mm.getFirstName());//select data(FirstName) in table Manager
//        System.out.println("m.getAddress() :" + mm.getAddress());//select data(FirstName) in table Manager
//        System.out.println("m.getGender() :" + mm.getGender());//select data(FirstName) in table Manager
//        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
//        System.out.println("m.getMidName() :" + mm.getMidName());//select data(FirstName) in table Manager
//        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
//        System.out.println("m.getPhone() :" + mm.getPhone());//select data(FirstName) in table Manager
//        System.out.println("m.getPosition() :" + mm.getPosition());//select data(FirstName) in table Manager
//        System.out.println("m.getQualification() :" + mm.getQualification());//select data(FirstName) in table Manager
//        System.out.println("m.getType() :" + mm.getType());//select data(FirstName) in table Manager
//        System.out.println("m.getDateOfBirth() :" + mm.getDateOfBirth());//select data(FirstName) in table Manager
//        System.out.println("mm.getDateOfHire() :" + mm.getDateOfHire());//select data(FirstName) in table Manager
//        System.out.println("mm.getManId() :" + mm.getManId());//select data(FirstName) in table Manager   
//    }

    @Override
    public void InsertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
       DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into Manager (MAN_ID,`DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`)"
                + "values (" + manId + ",'" + dateOfHire + "','" + qualification + "','" + postion + "','" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "','" + type + "')";
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    @Override
    public void removeDataMan(Object manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "delete from Manager where MAN_ID = " + manId;
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    @Override
    public void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "update Manager set FIRST_NAME = '" + firstName + "' , `DATE_OF_HIRE`='" + dateOfHire + "' , `QUALIFICATION` = '" + qualification + "' , `POSITION`='" + postion + "' , `MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `TYPE`='" + type + "'  where MAN_ID = " + manId;
        System.out.println("newschool.ManagerDaoImpl.editDataMan():" + sql);
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    @Override
    public Manager viewManagerScreen(int manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "select `DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS` "
                + ",`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE` ,`MAN_ID` "
                + " from manager where MAN_ID = " + manId;
        ResultSet rs = dataBaseDaoImpl.excuteQuery(sql, conn);
        Manager m = new Manager();
        try {
            while (rs.next()) {
//                String firstName = rs.getString(1);
//                System.out.println("firstName:::" + firstName);
//                m.setFirstName(firstName);
                m.setDateOfHire(rs.getDate(1));//DATE_OF_HIRE
                m.setQualification(rs.getString(2));//QUALIFICATION
                m.setPosition(rs.getString(3));//POSITION
                m.setFirstName(rs.getString(4));//FIRST_NAME
                m.setMidName(rs.getString(5));//MID_NAME
                m.setLastName(rs.getString(6));//LAST_NAME
                m.setAddress(rs.getString(7));//ADDRESS
                m.setGender(rs.getString(8));//GENDER
                m.setDateOfBirth(rs.getDate(9));//DATE_OF_BIRTH
                m.setPhone(rs.getString(10));//PHONE
                m.setType(rs.getString(11));//TYPE
                m.setManId(rs.getInt(12));
            }
            dataBaseDaoImpl.closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
//    }
    }
}
