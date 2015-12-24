package newschool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDaoImpl {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ManagerDaoImpl m = new ManagerDaoImpl();
        Manager mm = m.viewManagerScreen(1);
        m.InsertDataMan(13);
        System.out.println("m.getFirstName() :" + mm.getFirstName());
    }

    private synchronized void InsertDataMan(Object manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into Manager (MAN_ID)values (" + manId + ")";
        dataBaseDaoImpl.updateQuery(sql, conn);
        dataBaseDaoImpl.closeConnection(conn);
    }

    private Manager viewManagerScreen(int manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        ResultSet rs = dataBaseDaoImpl.excuteQuery(sql, conn);
        Manager m = new Manager();
        try {
            while (rs.next()) {

                String firstName = rs.getString(1);
                System.out.println("firstName:::" + firstName);
                m.setFirstName(firstName);
            }
            dataBaseDaoImpl.closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

}
