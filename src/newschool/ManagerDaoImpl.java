package newschool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDaoImpl {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Manager mm = managerDaoImpl.viewManagerScreen(1);//select data in table Manager
        managerDaoImpl.InsertDataMan(13);//insert data(man_id) in table Manager
        managerDaoImpl.removeDataMan(13);//delete data(man_id) in table Manager
        managerDaoImpl.editDataMan(13, "Mahmoud Mostafa");//update data(first_name) according to (man_id)in table Manager
        System.out.println("m.getFirstName() :" + mm.getFirstName());//select data(FirstName) in table Manager
    }

    private synchronized void InsertDataMan(Object manId) {
        DataBaseDaoImp dataBaseDaoImpl = new DataBaseDaoImp();
        Connection conn = dataBaseDaoImpl.openConnection();
        String sql = "insert into Manager (MAN_ID)values (" + manId + ")";
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
