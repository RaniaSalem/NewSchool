package newschool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ManagerDaoImpl {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Manager mm = managerDaoImpl.viewManagerScreen(1);//select data in table Manager
        System.out.println("m.getFirstName() :" + mm.getFirstName());//select data(FirstName) in table Manager
        System.out.println("m.getAddress() :" + mm.getAddress());//select data(FirstName) in table Manager
        System.out.println("m.getGender() :" + mm.getGender());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getMidName() :" + mm.getMidName());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getPhone() :" + mm.getPhone());//select data(FirstName) in table Manager
        System.out.println("m.getPosition() :" + mm.getPosition());//select data(FirstName) in table Manager
        System.out.println("m.getQualification() :" + mm.getQualification());//select data(FirstName) in table Manager
        System.out.println("m.getType() :" + mm.getType());//select data(FirstName) in table Manager
        System.out.println("m.getDateOfBirth() :" + mm.getDateOfBirth());//select data(FirstName) in table Manager
        System.out.println("mm.getDateOfHire() :" + mm.getDateOfHire());//select data(FirstName) in table Manager
        System.out.println("mm.getManId() :" + mm.getManId());//select data(FirstName) in table Manager
        managerDaoImpl.InsertDataMan(5,"2015/12/1","high","Manager","Mahmoud","Mohamed","Mostafa","Sharqia","Male","1666/12/1","123456789","High Manager");//insert data(man_id) in table Manager
        managerDaoImpl.removeDataMan(13);//delete data(man_id) in table Manager
        managerDaoImpl.editDataMan(13, "Mahmoud Mostafa");//update data(first_name) according to (man_id)in table Manager
        
    }
    
    private synchronized void InsertDataMan(int manId , Object dateOfHire ,String qualification,String postion,String firstName, String midName,String lastName,String address,String gender,Object dateBirth,String phone,String type) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into Manager (MAN_ID,`DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`)"
                + "values (" + manId + ",'"+dateOfHire+"','"+qualification+"','"+postion+"','"+firstName+"','"+midName+"','"+lastName+"','"+address+"','"+gender+"','"+dateBirth+"','"+phone+"','"+type+"')";
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }
    
    private synchronized void removeDataMan(Object manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "delete from Manager where MAN_ID = " + manId;
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }
    
    private synchronized void editDataMan(Object manId, Object firstName) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "update Manager set FIRST_NAME = '" + firstName + "'  where MAN_ID = " + manId;
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }
    
    private Manager viewManagerScreen(int manId) {
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
