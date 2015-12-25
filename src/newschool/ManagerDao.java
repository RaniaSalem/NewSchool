package newschool;

import java.sql.Connection;
import java.sql.ResultSet;

public class ManagerDao {

    public synchronized void InsertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into Manager (MAN_ID,`DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`)"
                + "values (" + manId + ",'" + dateOfHire + "','" + qualification + "','" + postion + "','" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "','" + type + "')";
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn); 
    }

    public synchronized void removeDataMan(Object manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "delete from Manager where MAN_ID = " + manId;
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    public synchronized void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "update Manager set FIRST_NAME = '" + firstName + "' , `DATE_OF_HIRE`='" + dateOfHire + "' , `QUALIFICATION` = '" + qualification + "' , `POSITION`='" + postion + "' , `MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `TYPE`='" + type + "'  where MAN_ID = " + manId;
        System.out.println("newschool.ManagerDaoImpl.editDataMan():" + sql);
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    public Manager viewManagerScreen(int manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
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
    }

}
